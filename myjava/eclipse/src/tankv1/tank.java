package tankv1;
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
		this.setTitle("丁陆超PK姜丽丽");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.addKeyListener(this.tp);
	}

}

/**
 * 坦克的面板
 * @author Administrator
 *
 */
class TankPanel extends JPanel implements KeyListener{
	
	/**
	 * 整个有戏都是生存在这个panel里面
	 */
	//定义我的坦克
	private GoodTanks myTank = null;
	//定义坏人坦克
	private BadTanks badTank = null;
	
	public TankPanel(){
		this.myTank = new GoodTanks(100,100);
		this.badTank = new BadTanks(200,200); 
	}
	
	public void paint(Graphics g){
		//第一次调用的时候创建两个坦克，然后每次调用repaint的时候是在原对象基础上跑
		super.paint(g);
		//设置JPanel的活动区域
		g.setColor(Color.gray);
		g.fillRect(0, 0, 400, 300);
		//开始画自己坦克图片
		this.createTank(this.myTank.getX(), this.myTank.getY(), g, this.myTank.getDir(), 0);
		//敌人坦克
		this.createTank(this.badTank.getX(), this.badTank.getY(), g, 0, 1);
		
	}
	private void createTank(int x, int y, Graphics g, int dir, int type){
		//色彩
		Color color = null;
		if(type == 0){
			color = Color.cyan;
		}else{
			color = Color.yellow;
		}
			
		switch(dir){
		case 0:
			//左边轮子
			g.setColor(color);
			g.fill3DRect(x, y, 5, 30, false);
							
			//右边轮子
			g.fill3DRect(x+15, y, 5, 30, false);
									
			//座
			g.fill3DRect(x+5, y+5, 10, 20,false);
			g.fillOval(x+5, y+10, 9, 8);
									
			//爆筒子
			g.fillRect(x+8, y+12, 4, 23);
			;break;//上
		case 1:
			//左边轮子
			g.setColor(color);
			g.fill3DRect(x, y, 5, 30, false);
							
			//右边轮子
			g.fill3DRect(x+15, y, 5, 30, false);
									
			//座
			g.fill3DRect(x+5, y+5, 10, 20,false);
			g.fillOval(x+5, y+10, 9, 8);
									
			//爆筒子
			g.fillRect(x+8, y-5, 4, 23);
			;break;//右
		case 2:
			//左边轮子
			g.setColor(color);
			g.fill3DRect(x, y, 30, 5, false);
							
			//右边轮子
			g.fill3DRect(x, y+15, 30, 5, false);
									
			//座
			g.fill3DRect(x+5, y+5, 20, 10,false);
			g.fillOval(x+10, y+5, 8, 9);
									
			//爆筒子
			g.fillRect(x+12, y+8, 23, 4);
			;break;//下
		case 3:
			//左边轮子
			g.setColor(color);
			g.fill3DRect(x, y, 30, 5, false);
							
			//右边轮子
			g.fill3DRect(x, y+15, 30, 5, false);
									
			//座
			g.fill3DRect(x+5, y+5, 20, 10,false);
			g.fillOval(x+10, y+5, 8, 9);
									
			//爆筒子
			g.fillRect(x-5, y+8, 23, 4);
			;break;//左
		}
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int maxHeight = this.getHeight();
		int maxWidth = this.getWidth();
		int x = this.myTank.getX();
		int y = this.myTank.getY();
		int speed = this.myTank.getSpeed();
		int dir = -1;
		//set tank position
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			dir = 1;
			if(y > 0){y -= speed;}
			;break;
		case KeyEvent.VK_RIGHT:
			dir = 2;
			if(x < maxWidth){x += speed;}
			;break;
		case KeyEvent.VK_DOWN:
			dir = 0;
			if(y < maxHeight){y += speed;}
			;break;
		case KeyEvent.VK_LEFT:
			dir = 3;
			if(x > 0){x -= speed;}
			;break;
		}
		//点击的其他按键
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
 * 抽象类坦克
 * @author Administrator
 *
 */
abstract class Tanks{
	
	//定义位置
	private int x = 0;
	private int y = 0;
	//定义速度
	private int speed = 1;
	//定义方向
	private int dir = 0;
	//定义大小的 构建坦克后初始化
	private int sizeW = 0;
	private int sizeH = 0;
	private int sizeCz = 0;
	
	public int getSizeCz() {
		return sizeCz;
	}
	public void setSizeCz(int sizeCz) {
		this.sizeCz = sizeCz;
	}
	public int getSizeW() {
		return sizeW;
	}
	public void setSizeW(int sizeW) {
		this.sizeW = sizeW;
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
 * 好坦克
 * @author Administrator
 *
 */
class GoodTanks extends Tanks{
	public GoodTanks(int x, int y){
		super(x, y);
	}	 
}
/**
 * 坏坦克
 * @author Administrator
 *
 */
class BadTanks extends Tanks{
	public BadTanks(int x, int y){
		super(x, y);
	}
	
}