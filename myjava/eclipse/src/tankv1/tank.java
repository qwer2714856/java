package tankv1;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import redio.AePlayWave;
/**
 * 坦克的需求文档
 * 1.画出坦克
 * 2.我的坦克可以上下左右运动
 * 3.可以发射子弹最多5发
 * 4.当我的坦克击中敌人的坦克，敌人的坦克就消失（要求有爆炸效果）
 * 5.我被击中有爆照效果
 * 6.防止敌人坦克重叠运动
 * 7.可以分关
 * 8.可以在玩游戏的时候暂停或开始
 * 9.可以记录玩家的分数
 * 10.java的声音操作
 * @author Administrator
 *
 */


public class tank extends JFrame implements ActionListener{
	public TankPanel tp = null;
	public MyPanelStart mps = null;
	//菜单
	private JMenuBar jmb = null;
	private JMenu jm = null;
	private JMenuItem jmt = null;
	private JMenuItem save = null;
	private JMenuItem read = null;
	private JMenuItem exit = null;
	//音频播放
	AePlayWave yp = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tank init = new tank();
	}
	

	public tank(){
		
		this.mps = new MyPanelStart();
		//菜单定义
		this.jmb = new JMenuBar();
		this.jm = new JMenu("开始游戏(O)");
		this.jm.setMnemonic('O');
		this.jmt = new JMenuItem("开始新游戏(G)");
		this.jmt.setMnemonic('G');
		//this.jmt.setIcon(new ImageIcon("a.jpg"));
		this.save = new JMenuItem("保存外围(s)");
		this.read = new JMenuItem("读取上一局(r)");
		this.exit = new JMenuItem("退出系统全部保存(e)");
		this.save.setMnemonic('s');
		this.read.setMnemonic('r');
		this.exit.setMnemonic('e');
		
		this.setJMenuBar(this.jmb);
		this.jmb.add(this.jm);
		this.jm.add(this.jmt);
		this.jm.add(this.read);
		this.jm.add(this.save);
		this.jm.add(this.exit);
		
		//绑定事件
		this.jmt.addActionListener(this);
		this.jmt.setActionCommand("0");
		//保存的绑定事件
		this.save.addActionListener(this);
		this.save.setActionCommand("1");
		//绑定读取的事件
		this.read.addActionListener(this);
		this.read.setActionCommand("2");
		//绑定退出系统事件
		this.exit.addActionListener(this);
		this.exit.setActionCommand("3");
		//现实关卡的panel
		Thread thread2 = new Thread(this.mps);
		thread2.start();
		this.add(this.mps);
				
		this.setTitle("丁陆超PK姜丽丽");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);

	}
	
	private void addTpInJFrame(){
		//加入之前要删除旧的
		if(this.mps != null){
			this.remove(this.mps);
			this.mps = null;
		}
		if(this.tp != null){
			//kill 面板里面的线程否则，连续新游戏有问题
			this.tp.setPanelThreadStatus(false);
			this.remove(this.tp);
			this.tp = null;
		}
		
		//启动音频
		if(this.yp == null){
			this.yp = new AePlayWave("tp\\love.wav");
		}else{
			this.yp.stop();
			this.yp = new AePlayWave("tp\\love.wav");
		}
		this.yp.start();
		
		this.tp = new TankPanel();
		//启动刷新线程
		Thread thread = new Thread(this.tp);
		thread.start();
		
		//作战的panel
		this.add(this.tp);
		
		//注册监听
		this.addKeyListener(this.tp);
		
		//显示即刷新JFrame
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//0 开始游戏
		//1是保存进度
		//2读取进度
		//3退出系统-同时要有保存的功能
		if(e.getActionCommand().equals("0")){
			//新游戏
			Recorder.setNews(true);
			//初始化数据
			Recorder.resetData();
			//读取总分
			Recorder.readScore();
			
			this.addTpInJFrame();

		}else{
			//保存退出
			if(e.getActionCommand().equals("1")){
				Recorder.save();
				//退出
				System.exit(0);
			}else{
				if(e.getActionCommand().equals("2")){
					//续上局
					Recorder.setNews(false);
					Recorder.readAll();//读进数据来
					this.addTpInJFrame();
				}else{
					if(e.getActionCommand().equals("3")){
						//保存一下
						Recorder.saveAll();
						//退出
						System.exit(0);
					}
				}
			}
		}
	}
}

/**
 * 坦克的面板
 * 因为要实现坦克动起来所以必须要这个TankPanel监听键盘的事件
 * @author Administrator
 *
 */
class TankPanel extends JPanel implements KeyListener,Runnable{
	
	/**
	 * 整个有戏都是生存在这个panel里面
	 */
	//定义我的坦克
	private GoodTanks myTank = null;
	//定义坏人坦克,线程机制使用Vector
	private Vector<BadTanks> badTanksList = new Vector<BadTanks>();
	//private BadTanks badTank = null;
	//panel线程的状态
	private Boolean panelThreadStatus = true;
	//定义爆炸的图片
	private Image image1 = null;
	private Image image2 = null;
	private Image image3 = null;
	//定义炸弹的向量
	Vector<Bomb> bombList = new Vector<Bomb>();
	
	//定义活动范围
	private int activityW = 400;
	private int activityH = 300;
	//定义初始化多少个敌人坦克
	private int numBadTank = Recorder.getBadTanKNum();
	
	public Boolean getPanelThreadStatus() {
		return panelThreadStatus;
	}

	public void setPanelThreadStatus(Boolean panelThreadStatus) {
		this.panelThreadStatus = panelThreadStatus;
	}
	
	public TankPanel(){
		//新游戏
		if(Recorder.getNews()){
			this.myTank = new GoodTanks(100,264);
			//this.badTank = new BadTanks(200,200); 
			//初始话敌人的坦克
			for(int i = 0; i < this.numBadTank; i++){
				BadTanks badTank = new BadTanks((i)*30,0);
				this.badTanksList.add(badTank);
				Thread thread = new Thread(badTank);
				thread.start();
	
				//给敌人加上武器子弹
				badTank.fire(this.activityW, this.activityH);
			}
		}else{
			//续上局
			//初始化好坦克
			this.myTank = new GoodTanks(Recorder.getGoodTankNode().getX(), Recorder.getGoodTankNode().getY(), Recorder.getGoodTankNode().getDir());
			//初始化坏人
			for(int i = 0; i < Recorder.getNdList().size();i++){
				Node nd = Recorder.getNdList().get(i);
				BadTanks badTank = new BadTanks(nd.getX(), nd.getY(), nd.getDir());
				this.badTanksList.add(badTank);
				Thread thread = new Thread(badTank);
				thread.start();
				badTank.fire(this.activityW, this.activityH);
			}
		}
		BadTanks.badTankList = this.badTanksList;
		Recorder.setBadTankList(this.badTanksList);
		Recorder.setGoodTank(this.myTank);
		//初始化爆炸图片--三张图片组合为一个炮炸效果
		/*this.image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/tp/bz.png"));
		this.image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/tp/bz2.png"));
		this.image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/tp/bz3.png"));*/
		try{
			//相对于test这层目录
			//先把图片调到内存里面里面来否则第一次会有问题，当然我用线程已然解决了这个问题。但是这也是个思路
			this.image1 = ImageIO.read(new File("tp\\bz.png"));
			this.image2 = ImageIO.read(new File("tp\\bz2.png"));
			this.image3 = ImageIO.read(new File("tp\\bz3.png"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void paint(Graphics g){
		//第一次调用的时候创建两个坦克，然后每次调用repaint的时候是在原对象基础上跑
		super.paint(g);
		
		//其实这个相当于一个动画每次都需要在画布上重新绘制这样看起来就像是动态的，每次重绘原来的就不存在了要重新绘制一次，这样看起来就像是在动。
		//repaint 相当于在画布上重新绘制图像，原来的都擦掉了。
		
		//设置JPanel的活动区域
		g.setColor(Color.gray);
		g.fillRect(0, 0, this.activityW, this.activityH);
		
		//分数的坦克,提示信息
		this.Recorder(g);
		
		//开始画自己坦克图片
		if(this.myTank.isLive){
			this.createTank(this.myTank.getX(), this.myTank.getY(), g, this.myTank.getDir(), this.myTank.getIdentity(), this.myTank, this.myTank.getColor());
		}else{
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, this.activityW, this.activityH);
			g.setColor(Color.RED);
			g.drawString("Game over", 150, 140);
			return ;
		}
		//敌人坦克
		for(int i = 0; i < this.badTanksList.size(); i++){
			BadTanks bt = this.badTanksList.get(i);
			if(bt.isLive){
				this.createTank(bt.getX(), bt.getY(), g, bt.getDir(), bt.getIdentity(), bt, bt.getColor());
				//绘制敌人坦克
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
				//从总队列里面删除
				Recorder.lessen();
				//增加杀死的坦克
				Recorder.addKillBadTanKNum();
			}
		}
		
		//自己的子弹
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
		
		 
		
		//开始绘制爆炸的图像
				for(int i = 0; i < this.bombList.size(); i++){
					Bomb b = this.bombList.get(i);
					if(b.getIsLive()){
						this.bombPlay(b, g);
					}else{
						//从队列删除
						this.bombList.remove(b);
					}
				}
	}
	
	//画出提示信息
	private void Recorder(Graphics g){
		//画出提示信息坦克（该坦克不参与战斗）
		this.createTank(10, 320, g, 1, 1, null, Color.yellow);
		this.createTank(200, 320, g, 1, 1, null, Color.red);
		//画出我方坦克，和敌人坦克的量
		g.setColor(Color.black);
		g.drawString("您的生命剩余："+Recorder.getMyLife(), 40, 340);
		g.drawString("敌人坦克剩余："+Recorder.getBadTanKNum(), 230, 340);
		//画出玩家的总成绩
		g.setFont(new Font("宋体",Font.BOLD,20));
		g.drawString("总分：" + Recorder.getKillBadTanKNum(), 450, 50);
		//画一个敌人的坦克
		this.createTank(420, 30, g, 1, 1, null, Color.RED);
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
		//定义方向 1上 2右 0下 3左
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
		//定义方向 1上 2右 0下 3左
		switch(tk.dir){
		case 0:
			//炮管
			tkPTMaxX = tk.getX() + 8 + 4;
			tkPTMinX = tk.getX() + 8;
			tkPTMaxY = tk.getY() + 5;
			tkPTMinY = tk.getY();
			//坦克
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
			
			//炮管
			tkPTMaxX = tk.getX() + 8 + 4;
			tkPTMinX = tk.getX() + 8;
			tkPTMaxY = tk.getY();
			tkPTMinY = tk.getY() - 5;
			//坦克
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
			
			//炮管
			tkPTMaxX = tk.getX() + 12 + 5;
			tkPTMinX = tk.getX() + 12;
			tkPTMaxY = tk.getY() + 8 + 4;
			tkPTMinY = tk.getY() + 8;
			//坦克
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
			
			//炮管
			tkPTMaxX = tk.getX() - 5 + 5;
			tkPTMinX = tk.getX() - 5;
			tkPTMaxY = tk.getY() + 8 + 4;
			tkPTMinY = tk.getY() + 8;
			//坦克
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
			//System.out.println("--");
			//算血量如果血量够就减去血不死
			int life = tk.getLife();
			if(life < 1){
				tk.isLive = false;
			}else{
				tk.setLife(--life);
			}
			
			b.isLive = false;
			//如果击中了坦克就创建一个炸弹。
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
			;break;//下
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
			;break;//上
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
			;break;//右
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
		if(tk != null && tk.getSizeH() == 0){
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
		case KeyEvent.VK_ESCAPE:
			if(Attribute.paused){
				Attribute.paused = false;
			}else{
				Attribute.paused = true;
			}
			;break;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE && this.myTank.bulletList.size() < this.myTank.getBulletNum()){
			//开火
			this.myTank.fire(this.activityW, this.activityH);
			dir = 4;
		}
		
		//点击的其他按键
		if(dir!=-1){
			this.repaint();
		}
	}
	//好人打坏人
	private void setIsLive(Vector<Bullet> b, Vector<BadTanks> tk){	
		for(int i = 0; i < b.size(); i++){
			for(int j = 0; j < tk.size(); j++){
				this.setTankAndBulleatStatus(b.get(i), tk.get(j));
			}
		}		
	}
	
	//坏人打好人
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
	//刷新线程
	public void run() {
		// TODO Auto-generated method stub
		while(panelThreadStatus){
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(Attribute.paused){
				continue;
			}
			
			//好人打坏人的子弹和坦克状态
			this.setIsLive(this.myTank.bulletList, this.badTanksList);
			//坏人干掉好人
			this.badKillGood(this.badTanksList, this.myTank);
			
			this.repaint();	

		}
	}
}


/**
 * 自定义关卡
 * @author Administrator
 *
 */
class MyPanelStart extends JPanel implements Runnable{
	//定义活动范围
	private int activityW = 400;
	private int activityH = 300;
	private int isShow = 1;
	public void paint(Graphics g){
		super.paint(g);
		g.fillRect(0, 0, this.activityW, this.activityH);
		//提示信息
		if(this.isShow == 1){
			g.setColor(Color.yellow);
			g.setFont(new Font("华文新魏", Font.BOLD, 30));
			g.drawString("stage: 1", 130, 150);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){			
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(this.isShow == 0){
				this.isShow = 1;
			}else{
				this.isShow = 0;
			}
			
			this.repaint();
		}
	}
}