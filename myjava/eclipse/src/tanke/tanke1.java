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
		//一般情况不用图片画坦克因为资源浪费的大，所以囊采用画图的形式
		//先画两个矩形，代表轮子
		//在画一个圆代表炮底座，矩形链接轮子和底座
		//最后再画炮筒，还是个矩形
		//这样装一起就OKEY了 
		//至于什么时候用图片，就用那种爆炸效果，特别难画的用图片。
		//Image img = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/a.jpg"));
		//g.drawImage(img, 0, 0, 50, 50, this);
		
		//色彩
		Color blue = Color.blue;
		Color black = Color.black;
		//左边轮子
		g.setColor(blue);
		g.fill3DRect(50, 40, 10, 40, true);
		
		//右边轮子
		g.fill3DRect(80, 40, 10, 40, true);
		
		//座
		g.fill3DRect(60, 50, 20, 20, true);
		g.setColor(black);
		g.fillOval(65, 55, 10, 10);
		
		//爆筒子
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
		//色彩
		Color blue = Color.blue;
		Color black = Color.black;
		//左边轮子
		g.setColor(blue);
		g.fill3DRect(50, 40, 10, 40, true);
						
		//右边轮子
		g.fill3DRect(80, 40, 10, 40, true);
						
		//座
		g.fill3DRect(60, 50, 20, 20, true);
		g.setColor(black);
		g.fillOval(65, 55, 10, 10);
						
		//爆筒子
		g.fill3DRect(68, 35, 5, 30, true);
	}
}