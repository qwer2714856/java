package tank2_bak;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

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
 * @author Administrator
 *
 */
class TankPanel extends JPanel implements KeyListener{
	
	/**
	 * ������Ϸ�������������panel����
	 */
	//�����ҵ�̹��
	private GoodTanks myTank = null;
	//���廵��̹��
	private BadTanks badTank = null;
	//������Χ
	private int activityW = 400;
	private int activityH = 300;
	
	public TankPanel(){
		this.myTank = new GoodTanks(100,100);
		this.badTank = new BadTanks(200,200); 
	}
	
	public void paint(Graphics g){
		//��һ�ε��õ�ʱ�򴴽�����̹�ˣ�Ȼ��ÿ�ε���repaint��ʱ������ԭ�����������
		super.paint(g);
		//����JPanel�Ļ����
		g.setColor(Color.gray);
		g.fillRect(0, 0, this.activityW, this.activityH);
		//��ʼ���Լ�̹��ͼƬ
		this.createTank(this.myTank.getX(), this.myTank.getY(), g, this.myTank.getDir(), 0, this.myTank);
		//����̹��
		this.createTank(this.badTank.getX(), this.badTank.getY(), g, 0, 1, this.badTank);
		
	}
	private void createTank(int x, int y, Graphics g, int dir, int type, Tanks tk){
		//ɫ��
		Color color = null;
		if(type == 0){
			color = Color.cyan;
		}else{
			color = Color.yellow;
		}
			
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
		int x = this.myTank.getX();
		int y = this.myTank.getY();
		int speed = this.myTank.getSpeed();
		int dir = -1;
		//��С�߽����
		int cz = this.myTank.getSizeCz();
		//̹�˵ĳߴ�
		int tankH = this.myTank.getSizeH();
				 	
		//set tank position
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			dir = 1;
			if(y > cz){
				y -= speed;
				if(y < cz){
					y = cz;
				}
			}
			;break;
		case KeyEvent.VK_RIGHT:
			dir = 2;
			int rightX = this.activityW - tankH - 6;
			if(x < rightX){//���������Ϊʲô�ڼ�ȥһ��cz����Ϊ�㴴����400��ʵ�ʴﲻ��������JFrame���б߿��6�������ҡ�
				x += speed;
				if(x > rightX){
					x = rightX;
				}
			}
			;break;
		case KeyEvent.VK_DOWN:
			dir = 0;
			int bottomY = this.activityH - tankH;
			if(y < bottomY){
				y += speed;
				if(y > bottomY){
					y = bottomY;
				}
			}
			;break;
		case KeyEvent.VK_LEFT:
			dir = 3;
			if(x > cz){
				x -= speed;
				if(x < cz){
					x = cz;
				}
			}
			;break;
		}
		//�������������
		if(dir!=-1){
			this.myTank.setDir(dir);
			this.myTank.setX(x);
			this.myTank.setY(y);
			this.repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

/**
 * ������̹��
 * @author Administrator
 *
 */
abstract class Tanks{
	
	//����λ��
	private int x = 0;
	private int y = 0;
	//�����ٶ�
	private int speed = 20;
	//���巽��
	private int dir = 0;
	//�����С�� ����̹�˺��ʼ��
	private int sizeH = 0;
	private int sizeCz = 0;
	
	public int getSizeCz() {
		return sizeCz;
	}
	public void setSizeCz(int sizeCz) {
		this.sizeCz = sizeCz;
	}
	 
	public int getSizeH() {
		return sizeH;
	}
	public void setSizeH(int sizeH) {
		this.sizeH = sizeH;
	}
	public int getDir() {
		return dir;
	}
	public void setDir(int dir) {
		this.dir = dir;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Tanks(int x, int y){
	    this.x = x;
	    this.y = y;
	}
}
/**
 * ��̹��
 * @author Administrator
 *
 */
class GoodTanks extends Tanks{
	public GoodTanks(int x, int y){
		super(x, y);
	}	 
}
/**
 * ��̹��
 * @author Administrator
 *
 */
class BadTanks extends Tanks{
	public BadTanks(int x, int y){
		super(x, y);
	}
	
}