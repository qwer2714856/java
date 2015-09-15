package tankv1;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;
/**
 * ̹�˵������ĵ�
 * 1.����̹��
 * 2.�ҵ�̹�˿������������˶�
 * 3.���Է����ӵ����5��
 * 4.���ҵ�̹�˻��е��˵�̹�ˣ����˵�̹�˾���ʧ��Ҫ���б�ըЧ����
 * 5.�ұ������б���Ч��
 * 6.��ֹ����̹���ص��˶�
 * 7.���Էֹ�
 * 8.����������Ϸ��ʱ����ͣ��ʼ
 * 9.���Լ�¼��ҵķ���
 * 10.java����������
 * @author Administrator
 *
 */


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
	private int numBadTank = 3;
	
	
	public TankPanel(){
		this.myTank = new GoodTanks(100,264);
		//this.badTank = new BadTanks(200,200); 
		//��ʼ�����˵�̹��
		for(int i = 0; i < this.numBadTank; i++){
			BadTanks badTank = new BadTanks((i)*140,0);
			this.badTanksList.add(badTank);
			Thread thread = new Thread(badTank);
			thread.start();

			//�����˼��������ӵ�
			badTank.fire(this.activityW, this.activityH);
		}
		BadTanks.badTankList = this.badTanksList;
		
		//��ʼ����ըͼƬ--����ͼƬ���Ϊһ����ըЧ��
		/*this.image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/tp/bz.png"));
		this.image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/tp/bz2.png"));
		this.image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/tp/bz3.png"));*/
		try{
			//�����test���Ŀ¼
			//�Ȱ�ͼƬ�����ڴ����������������һ�λ������⣬��Ȼ�����߳���Ȼ�����������⡣������Ҳ�Ǹ�˼·
			this.image1 = ImageIO.read(new File("tp\\bz.png"));
			this.image2 = ImageIO.read(new File("tp\\bz2.png"));
			this.image3 = ImageIO.read(new File("tp\\bz3.png"));
		}catch(Exception e){
			e.printStackTrace();
		}
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
		if(this.myTank.isLive){
			this.createTank(this.myTank.getX(), this.myTank.getY(), g, this.myTank.getDir(), this.myTank.getIdentity(), this.myTank, this.myTank.getColor());
		}else{
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, this.activityW, this.activityH);
			g.setColor(Color.RED);
			g.drawString("Game over", 150, 140);
			return ;
		}
		//����̹��
		for(int i = 0; i < this.badTanksList.size(); i++){
			BadTanks bt = this.badTanksList.get(i);
			if(bt.isLive){
				this.createTank(bt.getX(), bt.getY(), g, bt.getDir(), bt.getIdentity(), bt, bt.getColor());
				//���Ƶ���̹��
				for(int j = 0; j < bt.bulletList.size(); j++){
					Bullet bullet = bt.bulletList.get(j);
					if(bullet.isLive){
						this.createBulleat(bullet.getX(),bullet.getY(), g, bullet.getColor(), bullet.getWidth(), bullet.getHeight());
					}else{
						bt.bulletList.remove(bullet);
					}
				}
			}else{
				this.badTanksList.remove(bt); 
				BadTanks.badTankList.remove(bt);
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
			//��Ѫ�����Ѫ�����ͼ�ȥѪ����
			int life = tk.getLife();
			if(life < 1){
				tk.isLive = false;
			}else{
				tk.setLife(--life);
			}
			
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
	
	//���˴����
	private void badKillGood(Vector<BadTanks> badList, GoodTanks tk){	
	    for(int i = 0; i < badList.size(); i++){
	    	BadTanks badTk = badList.get(i);
	    	for(int j = 0; j < badTk.bulletList.size(); j++){
	    		 this.setTankAndBulleatStatus(badTk.bulletList.get(j), tk);
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
			//���˸ɵ�����
			this.badKillGood(this.badTanksList, this.myTank);
			
			
			this.repaint();
		}
	}
}
