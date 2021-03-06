package tank3_bak;
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
 * 因为要实现坦克动起来所以必须要这个TankPanel监听键盘的事件
 * @author Administrator
 *
 */
class TankPanel extends JPanel implements KeyListener{
	
	/**
	 * 整个有戏都是生存在这个panel里面
	 */
	//定义我的坦克
	private GoodTanks myTank = null;
	//定义坏人坦克,线程机制使用Vector
	private Vector<BadTanks> badTanksList = new Vector<BadTanks>();
	//private BadTanks badTank = null;
	//定义活动范围
	private int activityW = 400;
	private int activityH = 300;
	//定义初始化多少个敌人坦克
	private int numBadTank = 5;
	
	
	public TankPanel(){
		this.myTank = new GoodTanks(100,264);
		//this.badTank = new BadTanks(200,200); 
		//初始话敌人的坦克
		for(int i = 0; i < this.numBadTank; i++){
			this.badTanksList.add(new BadTanks((i+1)*60,0));
		}
	}
	
	public void paint(Graphics g){
		//第一次调用的时候创建两个坦克，然后每次调用repaint的时候是在原对象基础上跑
		super.paint(g);
		//设置JPanel的活动区域
		g.setColor(Color.gray);
		g.fillRect(0, 0, this.activityW, this.activityH);
		//开始画自己坦克图片
		this.createTank(this.myTank.getX(), this.myTank.getY(), g, this.myTank.getDir(), this.myTank.getIdentity(), this.myTank, this.myTank.getColor());
		//敌人坦克
		for(int i = 0; i < this.badTanksList.size(); i++){
			BadTanks bt = this.badTanksList.get(i);
			this.createTank(bt.getX(), bt.getY(), g, bt.getDir(), bt.getIdentity(), bt, bt.getColor());
		}
	}
	private void createTank(int x, int y, Graphics g, int dir, int type, Tanks tk, Color color){
		//色彩
		/*Color color = color;
		if(type == 0){
			color = Color.cyan;
		}else{
			color = Color.yellow;
		}*/
		
			
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
		
		//第一次初始化坦克们的尺寸 结果根据下面的计算得出
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
		//判断是不是方向键
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
		//点击的其他按键
		if(dir!=-1){
			this.repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
