package tank4_bak;
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
			this.createTank(bt.getX(), bt.getY(), g, bt.getDir(), bt.getIdentity(), bt, bt.getColor());
		}
		
		//�Լ����ӵ�
		if(this.myTank.bullet != null && this.myTank.bullet.isLive == true){
			this.createBulleat(this.myTank.bullet.getX(),this.myTank.bullet.getY(), g, this.myTank.bullet.getColor(), this.myTank.bullet.getWidth(), this.myTank.bullet.getHeight());
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
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE){
			//����
			this.myTank.fire(this.activityW, this.activityH);
			dir = 4;
		}
		
		//�������������
		if(dir!=-1){
			this.repaint();
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
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.repaint();
		}
	}
}
