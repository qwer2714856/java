package tank6_bak;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

import javax.swing.*;
public class tank extends JFrame{
	public TankPanel tp = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tank init = new tank();
	}
	
	public tank(){
		this.tp = new TankPanel();
		//����ˢ���߳�
		Thread thread = new Thread(this.tp);
		thread.start();
		this.add(tp);
		this.setTitle("��½��PK������");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.addKeyListener(this.tp);
	}

}

/**
 * ̹�˵����
 * ��ΪҪʵ��̹�˶��������Ա���Ҫ���TankPanel�������̵��¼�
 * @author Administrator
 *
 */
class TankPanel extends JPanel implements KeyListener,Runnable{
	
	/**
	 * ������Ϸ�������������panel����
	 */
	//�����ҵ�̹��
	private GoodTanks myTank = null;
	//���廵��̹��,�̻߳���ʹ��Vector
	private Vector<BadTanks> badTanksList = new Vector<BadTanks>();
	//private BadTanks badTank = null;
	
	//���屬ը��ͼƬ
	private Image image1 = null;
	private Image image2 = null;
	private Image image3 = null;
	//����ը��������
	Vector<Bomb> bombList = new Vector<Bomb>();
	
	//������Χ
	private int activityW = 400;
	private int activityH = 300;
	//�����ʼ�����ٸ�����̹��
	private int numBadTank = 5;
	
	
	public TankPanel(){
		this.myTank = new GoodTanks(100,264);
		//this.badTank = new BadTanks(200,200); 
		//��ʼ�����˵�̹��
		for(int i = 0; i < this.numBadTank; i++){
			this.badTanksList.add(new BadTanks((i+1)*60,0));
		}
		
		//��ʼ����ըͼƬ--����ͼƬ���Ϊһ����ըЧ��
		this.image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/tp/bz.png"));
		this.image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/tp/bz2.png"));
		this.image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/tp/bz3.png"));
	}
	
	public void paint(Graphics g){
		//��һ�ε��õ�ʱ�򴴽�����̹�ˣ�Ȼ��ÿ�ε���repaint��ʱ������ԭ�����������
		super.paint(g);
		
		//��ʵ����൱��һ������ÿ�ζ���Ҫ�ڻ��������»������������������Ƕ�̬�ģ�ÿ���ػ�ԭ���ľͲ�������Ҫ���»���һ�Σ������������������ڶ���
		//repaint �൱���ڻ��������»���ͼ��ԭ���Ķ������ˡ�
		
		//����JPanel�Ļ����
		g.setColor(Color.gray);
		g.fillRect(0, 0, this.activityW, this.activityH);
		
		//��ʼ���Լ�̹��ͼƬ
		this.createTank(this.myTank.getX(), this.myTank.getY(), g, this.myTank.getDir(), this.myTank.getIdentity(), this.myTank, this.myTank.getColor());
		//����̹��
		for(int i = 0; i < this.badTanksList.size(); i++){
			BadTanks bt = this.badTanksList.get(i);
			if(bt.isLive){
				this.createTank(bt.getX(), bt.getY(), g, bt.getDir(), bt.getIdentity(), bt, bt.getColor());
			}else{
				this.badTanksList.remove(bt);
			}
		}
		
		//�Լ����ӵ�
		for(int i = 0; i < this.myTank.bulletList.size(); i++){
			Bullet bullet = this.myTank.bulletList.get(i);
			if(bullet.isLive == true){
				this.createBulleat(bullet.getX(),bullet.getY(), g, bullet.getColor(), bullet.getWidth(), bullet.getHeight());
			}else{
				if(bullet != null){
					this.myTank.clearBulletList(bullet);	
				}
				
			}
		}
		
		//��ʼ���Ʊ�ը��ͼ��
				for(int i = 0; i < this.bombList.size(); i++){
					Bomb b = this.bombList.get(i);
					if(b.getIsLive()){
						this.bombPlay(b, g);
					}else{
						//�Ӷ���ɾ��
						this.bombList.remove(b);
					}
				}
	}
	private void bombPlay(Bomb b, Graphics g){
		int bs = (int)Math.ceil((double)b.getLife() / 3);
		switch(bs){
		case 3:
			g.drawImage(this.image1, b.getX(), b.getY(), 30, 30, this);
			break;
		case 2:
			g.drawImage(this.image2, b.getX(), b.getY(), 30, 30, this);
			break;
		case 1:
			g.drawImage(this.image3, b.getX(), b.getY(), 30, 30, this);
			break;
		}		 
	}
	private void setTankAndBulleatStatus(Bullet b, Tanks tk){
		//���巽�� 1�� 2�� 0�� 3��
		Boolean isHit = false;
		int btMaxX = b.getX() + b.getWidth();
		int btMaxY = b.getY() + b.getHeight();
		int btMinX = b.getX();
		int btMinY = b.getY();
		
		int tkPTMaxX = 0;
		int tkPTMaxY = 0;
		int tkPTMinX = 0;
		int tkPTMinY = 0;
		int tkMaxX = 0;
		int tkMaxY = 0;
		int tkMinX = 0;
		int tkMinY = 0;
		//���巽�� 1�� 2�� 0�� 3��
		switch(tk.dir){
		case 0:
			//�ڹ�
			tkPTMaxX = tk.getX() + 8 + 4;
			tkPTMinX = tk.getX() + 8;
			tkPTMaxY = tk.getY() + 5;
			tkPTMinY = tk.getY();
			//̹��
			tkMaxX = tk.getX() + 20;
			tkMinX = tk.getX();
			tkMaxY = tk.getY() + 30;
			tkMinY = tk.getY();
			if((btMinX < tkPTMaxX && btMinX > tkPTMinX && btMinY < tkPTMaxY && btMinY > tkPTMinY) 
			|| 
			(btMaxX < tkPTMaxX && btMaxX > tkPTMinX && btMaxY < tkPTMaxY && btMaxY > tkPTMinY)
			||
			(btMinX < tkMaxX && btMinX > tkMinX && btMinY < tkMaxY && btMinY > tkMinY)
			||
			(btMaxX < tkMaxX && btMaxX > tkMinX && btMaxY < tkMaxY && btMaxY > tkMinY)
			){
				isHit = true;
			}
			
			
			;break;
		case 1:
			
			//�ڹ�
			tkPTMaxX = tk.getX() + 8 + 4;
			tkPTMinX = tk.getX() + 8;
			tkPTMaxY = tk.getY();
			tkPTMinY = tk.getY() - 5;
			//̹��
			tkMaxX = tk.getX() + 20;
			tkMinX = tk.getX();
			tkMaxY = tk.getY() + 30;
			tkMinY = tk.getY();
			if((btMinX < tkPTMaxX && btMinX > tkPTMinX && btMinY < tkPTMaxY && btMinY > tkPTMinY) 
			|| 
			(btMaxX < tkPTMaxX && btMaxX > tkPTMinX && btMaxY < tkPTMaxY && btMaxY > tkPTMinY)
			||
			(btMinX < tkMaxX && btMinX > tkMinX && btMinY < tkMaxY && btMinY > tkMinY)
			||
			(btMaxX < tkMaxX && btMaxX > tkMinX && btMaxY < tkMaxY && btMaxY > tkMinY)
			){
				isHit = true;
			}
			
			;break;
		case 2:
			
			//�ڹ�
			tkPTMaxX = tk.getX() + 12 + 5;
			tkPTMinX = tk.getX() + 12;
			tkPTMaxY = tk.getY() + 8 + 4;
			tkPTMinY = tk.getY() + 8;
			//̹��
			tkMaxX = tk.getX() + 20;
			tkMinX = tk.getX();
			tkMaxY = tk.getY() + 30;
			tkMinY = tk.getY();
			if((btMinX < tkPTMaxX && btMinX > tkPTMinX && btMinY < tkPTMaxY && btMinY > tkPTMinY) 
			|| 
			(btMaxX < tkPTMaxX && btMaxX > tkPTMinX && btMaxY < tkPTMaxY && btMaxY > tkPTMinY)
			||
			(btMinX < tkMaxX && btMinX > tkMinX && btMinY < tkMaxY && btMinY > tkMinY)
			||
			(btMaxX < tkMaxX && btMaxX > tkMinX && btMaxY < tkMaxY && btMaxY > tkMinY)
			){
				isHit = true;
			}
			
			;break;
		case 3:
			
			//�ڹ�
			tkPTMaxX = tk.getX() - 5 + 5;
			tkPTMinX = tk.getX() - 5;
			tkPTMaxY = tk.getY() + 8 + 4;
			tkPTMinY = tk.getY() + 8;
			//̹��
			tkMaxX = tk.getX() + 20;
			tkMinX = tk.getX();
			tkMaxY = tk.getY() + 30;
			tkMinY = tk.getY();
			if((btMinX < tkPTMaxX && btMinX > tkPTMinX && btMinY < tkPTMaxY && btMinY > tkPTMinY) 
			|| 
			(btMaxX < tkPTMaxX && btMaxX > tkPTMinX && btMaxY < tkPTMaxY && btMaxY > tkPTMinY)
			||
			(btMinX < tkMaxX && btMinX > tkMinX && btMinY < tkMaxY && btMinY > tkMinY)
			||
			(btMaxX < tkMaxX && btMaxX > tkMinX && btMaxY < tkMaxY && btMaxY > tkMinY)
			){
				isHit = true;
			}
			
			;break;
		}
		
		if(isHit){
			tk.isLive = false;
			b.isLive = false;
			//���������̹�˾ʹ���һ��ը����
			Bomb bob = new Bomb(tk.getX(),tk.getY());
			Thread thread = new Thread(bob);
			thread.start();
			this.bombList.add(bob);
		}
	}
	
	private void createBulleat(int x, int y, Graphics g, Color color, int width, int height){
		g.setColor(color);
		g.fill3DRect(x, y, width, height, false);
	}
	private void createTank(int x, int y, Graphics g, int dir, int type, Tanks tk, Color color){
		//ɫ��
		/*Color color = color;
		if(type == 0){
			color = Color.cyan;
		}else{
			color = Color.yellow;
		}*/
		
			
		switch(dir){
		case 0:
			//�������
			g.setColor(color);
			g.fill3DRect(x, y, 5, 30, false);
							
			//�ұ�����
			g.fill3DRect(x+15, y, 5, 30, false);
									
			//��
			g.fill3DRect(x+5, y+5, 10, 20,false);
			g.fillOval(x+5, y+10, 9, 8);
									
			//��Ͳ��
			g.fillRect(x+8, y+12, 4, 23);
			;break;//��
		case 1:
			//�������
			g.setColor(color);
			g.fill3DRect(x, y, 5, 30, false);
							
			//�ұ�����
			g.fill3DRect(x+15, y, 5, 30, false);
									
			//��
			g.fill3DRect(x+5, y+5, 10, 20,false);
			g.fillOval(x+5, y+10, 9, 8);
									
			//��Ͳ��
			g.fillRect(x+8, y-5, 4, 23);
			;break;//��
		case 2:
			//�������
			g.setColor(color);
			g.fill3DRect(x, y, 30, 5, false);
							
			//�ұ�����
			g.fill3DRect(x, y+15, 30, 5, false);
									
			//��
			g.fill3DRect(x+5, y+5, 20, 10,false);
			g.fillOval(x+10, y+5, 8, 9);
									
			//��Ͳ��
			g.fillRect(x+12, y+8, 23, 4);
			;break;//��
		case 3:
			//�������
			g.setColor(color);
			g.fill3DRect(x, y, 30, 5, false);
							
			//�ұ�����
			g.fill3DRect(x, y+15, 30, 5, false);
									
			//��
			g.fill3DRect(x+5, y+5, 20, 10,false);
			g.fillOval(x+10, y+5, 8, 9);
									
			//��Ͳ��
			g.fillRect(x-5, y+8, 23, 4);
			;break;//��
		}
		
		//��һ�γ�ʼ��̹���ǵĳߴ� �����������ļ���ó�
		if(tk.getSizeH() == 0){
			tk.setSizeH(36);
			tk.setSizeCz(6);
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//�ж��ǲ��Ƿ����
		int dir = -1;
		//set tank position
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			this.myTank.moveTop();
			dir = 1;
			;break;
		case KeyEvent.VK_RIGHT:
			dir = 2;
			this.myTank.moveRight(this.activityW);
			;break;
		case KeyEvent.VK_DOWN:
			dir = 0;
			this.myTank.moveDown(this.activityH);
			;break;
		case KeyEvent.VK_LEFT:
			dir = 3;
			this.myTank.moveLeft();
			;break;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE && this.myTank.bulletList.size() < this.myTank.getBulletNum()){
			//����
			this.myTank.fire(this.activityW, this.activityH);
			dir = 4;
		}
		
		//�������������
		if(dir!=-1){
			this.repaint();
		}
	}
	//���˴���
	private void setIsLive(Vector<Bullet> b, Vector<BadTanks> tk){	
		int len = b.size();
		int badTkLen = tk.size();
		for(int i = 0; i < len; i++){
			for(int j = 0; j < badTkLen; j++){
				this.setTankAndBulleatStatus(b.get(i), tk.get(j));
			}
		}		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//ˢ���߳�
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//���˴��˵��ӵ���̹��״̬
			this.setIsLive(this.myTank.bulletList, this.badTanksList);
			
			
			this.repaint();
		}
	}
}