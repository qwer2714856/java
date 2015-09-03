package tankv1;
import java.awt.*;

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
	}

}

/**
 * ̹�˵����
 * @author Administrator
 *
 */
class TankPanel extends JPanel{
	
	/**
	 * ������Ϸ�������������panel����
	 */
	//�����ҵ�̹��
	private GoodTanks myTank = null;
	//���廵��̹��
	private BadTanks badTank = null;
	
	public TankPanel(){
		this.myTank = new GoodTanks(100,100);
		this.badTank = new BadTanks(200,200); 
	}
	
	public void paint(Graphics g){
		super.paint(g);
		//����JPanel�Ļ����
		g.setColor(Color.gray);
		g.fillRect(0, 0, 400, 300);
		//��ʼ���Լ�̹��ͼƬ
		this.createTank(this.myTank.getX(), this.myTank.getY(), g, 2, 0);
		
		this.createTank(this.badTank.getX(), this.badTank.getY(), g, 0, 1);
		
	}
	private void createTank(int x, int y, Graphics g, int dir, int type){
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
		
		
	}
}

/**
 * ������̹��
 * @author Administrator
 *
 */
abstract class Tanks{
	
	private int x = 0;
	private int y = 0;
	private int speed = 0;
	
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