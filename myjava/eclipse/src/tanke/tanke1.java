package tanke;
import java.awt.*;

import javax.swing.*;
public class tanke1 extends JFrame{
	private Tank m = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tanke1 init = new tanke1();
	}
	public tanke1(){
		this.m = new Tank();
		this.add(this.m);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

}

/*class MyPanel2 extends JPanel{
	public void paint(Graphics g){
		super.paint(g);
		//һ���������ͼƬ��̹����Ϊ��Դ�˷ѵĴ������Ҳ��û�ͼ����ʽ
		//�Ȼ��������Σ���������
		//�ڻ�һ��Բ�����ڵ����������������Ӻ͵���
		//����ٻ���Ͳ�����Ǹ�����
		//����װһ���OKEY�� 
		//����ʲôʱ����ͼƬ���������ֱ�ըЧ�����ر��ѻ�����ͼƬ��
		//Image img = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/a.jpg"));
		//g.drawImage(img, 0, 0, 50, 50, this);
		
		//ɫ��
		Color blue = Color.blue;
		Color black = Color.black;
		//�������
		g.setColor(blue);
		g.fill3DRect(50, 40, 10, 40, true);
		
		//�ұ�����
		g.fill3DRect(80, 40, 10, 40, true);
		
		//��
		g.fill3DRect(60, 50, 20, 20, true);
		g.setColor(black);
		g.fillOval(65, 55, 10, 10);
		
		//��Ͳ��
		g.fill3DRect(68, 35, 5, 30, true);
		
	}
}*/

class Tank extends JPanel{
	private Color color = null;
	private Graphics g = null;
	
	//drawTank
	public void paint(Graphics g){
		super.paint(g);
		this.drawTank(g);
	}
	
	/**
	 * drawTank
	 * @param g
	 */
	private void drawTank(Graphics g){
		//ɫ��
		Color blue = Color.blue;
		Color black = Color.black;
		//�������
		g.setColor(blue);
		g.fill3DRect(50, 40, 10, 40, true);
						
		//�ұ�����
		g.fill3DRect(80, 40, 10, 40, true);
						
		//��
		g.fill3DRect(60, 50, 20, 20, true);
		g.setColor(black);
		g.fillOval(65, 55, 10, 10);
						
		//��Ͳ��
		g.fill3DRect(68, 35, 5, 30, true);
	}
}