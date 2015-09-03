package tanke;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Event_keyword extends JFrame{
	private My2 m = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event_keyword i = new Event_keyword();
		
	}	
	public Event_keyword(){
		this.m = new My2();
		this.add(this.m);
		this.setSize(400,400);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		this.addKeyListener(this.m);
	
	}
}
class My2 extends JPanel implements KeyListener{
	private int x = 100;
	private int y = 100;
	private int w = 20;
	private int h = 20;
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.blue);
		g.fillOval(this.x, this.y, this.w, this.h);
		
	}

	public My2(){
		this.setBackground(Color.black);
	}
	@Override
	//��������Դ�������ַ�����ȥ�ˡ�
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//ʲô���������ԣ�������ȥ�ˡ�
	public void keyPressed(KeyEvent e) {
		System.out.println(this.getWidth());
		// TODO Auto-generated method stub
		//38 ��
		//39 ��
		//40 ��
		//37 �� 
		//System.out.println(e.getKeyCode());
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			if(this.y > 0){this.y --;}
			;break;
		case KeyEvent.VK_RIGHT:
			 if(this.x < this.getWidth()-this.w){this.x ++;}
			;break;
		case KeyEvent.VK_DOWN:
			if(this.y < this.getHeight()-this.h){this.y ++;}
			;break;
		case KeyEvent.VK_LEFT:
			if(this.x > 0){this.x --;}
			;break;
		}
		//ʹ��repaint �ػ�
		this.repaint();
	}

	@Override
	//�ɿ���
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
