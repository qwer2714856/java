package tankv1;
import java.awt.*;
import java.util.*;
import java.io.*;

//记录点
class Node{
	int x = 0;
	int y = 0;
	int dir = 0;
	public Node(int x, int y, int dir){
		this.x = x;
		this.y = y;
		this.dir = dir;
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
	public int getDir() {
		return dir;
	}
	public void setDir(int dir) {
		this.dir = dir;
	}
}


/**
 * 抽象类坦克
 * @author Administrator
 *
 */
abstract class Tanks{
	//定义血
	int life = 9;
	//定义位置
	int x = 0;
	int y = 0;
	//定义速度
	int speed = 20;
	//定义方向 1上 2右 0下 3左
	int dir = 0;
	//定义大小的 构建坦克后初始化
	int sizeH = 0;
	int sizeCz = 0;
	//记录步长
	int saveStep = 20;

	//身份 0 自己的坦克人1 坏人
	int identity = 0;
	//颜色
	Color color = null;
	//是否活着
	Boolean isLive = true;
	//子弹
	//限制一次可以发多少子弹
	private int bulletNum = 5;
	//Bullet bullet = null;
	Vector<Bullet> bulletList = new Vector<Bullet>();
	//clear BulletList
	public void clearBulletList(Bullet bullet){
		this.bulletList.remove(bullet);
	}
	public int getBulletNum() {
		return bulletNum;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public Boolean getIsLive() {
		return isLive;
	}
	public void setIsLive(Boolean isLive) {
		this.isLive = isLive;
	}
	public void setBulletNum(int bulletNum) {
		this.bulletNum = bulletNum;
	} 
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getSaveStep() {
		return saveStep;
	}
	public void setSaveStep(int saveStep) {
		this.saveStep = saveStep;
	}
	public int getIdentity() {
		return identity;
	}
	public void setIdentity(int identity) {
		this.identity = identity;
	}
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
	//向上移动
	public void moveTop(){
		if(y > sizeCz){
			y -= speed;
			if(y < sizeCz){
				y = sizeCz;
			}
		}
		dir = 1;
	}
	public void moveRight(int border){
		int rightX = border - this.getSizeH() - 6;
		if(x < rightX){//这里解释下为什么在减去一个cz是因为你创建的400宽实际达不到弹出的JFrame是有边框的6像素左右。
			x += speed;
			if(x > rightX){
				x = rightX;
			}
		}
		dir = 2;
	}
	public void moveDown(int border){
		int bottomY = border - this.getSizeH();
		if(y < bottomY){
			y += speed;
			if(y > bottomY){
				y = bottomY;
			}
		}
		dir = 0;
	}
	public void moveLeft(){
		if(x > sizeCz){
			x -= speed;
			if(x < sizeCz){
				x = sizeCz;
			}
		}
		dir = 3;
	}
	//开火
	public void fire(int borderX, int borderY){
		int x = 0;
		int y = 0;
		//定义方向 1上 2右 0下 3左
		switch(this.dir){
		case 0:
			x = this.x + 7;
			y = this.y + 36;
			;break;
		case 1:
			x = this.x + 7;
			y = this.y - 11;
			;break;
		case 2:
			x = this.x + 36;
			y = this.y + 7;
			;break;
		case 3:
			x = this.x -11;
			y = this.y + 8;
			;break;
		}
		//启动子弹线程
		Bullet s = new Bullet(x, y, this.dir, borderX, borderY);
		this.bulletList.add(s);
		Thread thread = new Thread(s);
		thread.start();
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
		this.life = Recorder.getMyLife();
		this.setIdentity(0);
		this.setDir(1);
		this.setColor(Color.yellow);	
	}
	public GoodTanks(int x, int y, int dir){
		super(x, y);
		this.life = Recorder.getMyLife();
		this.setIdentity(0);
		this.setDir(dir);
		this.setColor(Color.yellow);	
	}
	public void setLife(int life) {
		//System.out.println(life);
		this.life = life;
		Recorder.setMyLife(life);
	}
}
/**
 * 坏坦克
 * @author Administrator
 *
 */
class BadTanks extends Tanks implements Runnable{
	public static Vector<BadTanks> badTankList = new Vector<BadTanks>();
	
	public BadTanks(int x, int y){
		super(x, y);
		this.setIdentity(1);
		this.setColor(Color.red);
		this.setSpeed(1);
		this.setLife(1);
	}
	public BadTanks(int x, int y, int dir){
		super(x, y);
		this.setIdentity(1);
		this.setColor(Color.red);
		this.setSpeed(1);
		this.setLife(1);
		this.setDir(dir);
	}
	public boolean isTouchOtherBadTank(){
		Boolean b = false;
		//过去本对象的边界和方向
		int x = this.getX();
		int y = this.getY();
		int dir = this.getDir();
		int pLx = 0;
		int pLy = 0;
		int pRx = 0;
		int pRy = 0;
		int inLx = 0;
		int inLy = 0;
		int inRx = 0;
		int inRy = 0;
		//定义方向 1上 2右 0下 3左
		switch(dir){
		case 1:
			//获取炮头的横截面
			pLx = x;
			pLy = y - 5;
			pRx = x + 5 + 10 + 5;
			pRy = y - 5;
			
			for(int i = 0; i < BadTanks.badTankList.size(); i++){
				BadTanks otherBadTank = BadTanks.badTankList.get(i);
				if(otherBadTank != this){
					switch(otherBadTank.getDir()){
					 case 1:
						 inLx = otherBadTank.getX();
						 inLy = otherBadTank.getY() + 30;
						 inRx = otherBadTank.getX() + 5 + 10 + 5;
						 inRy = otherBadTank.getY() + 30;
						 break;
					 case 2:
						 inLx = otherBadTank.getX();
						 inLy = otherBadTank.getY() + 5 + 10 + 5;
						 inRx = otherBadTank.getX() + 12 + 23;
						 inRy = otherBadTank.getY() + 5 + 10 + 5;
						 break;
					 case 0:
						 inLx = otherBadTank.getX();
						 inLy = otherBadTank.getY() + 12 + 23;
						 inRx = otherBadTank.getX() + 5 + 10 + 5;
						 inRy = otherBadTank.getY() + 12 + 23;
						 break;
					 case 3:
						 inLx = otherBadTank.getX() - 5;
						 inLy = otherBadTank.getY() + 5 + 10 + 5;
						 inRx = otherBadTank.getX() + 30;
						 inRy = otherBadTank.getY() + 5 + 10 + 5;
						 break;
					 }
					if(pLx >= inLx && pLx <= inRx && (pRy - this.speed) <= inRy && (y + 30) > inRy || 
					   pRx <= inRx && pRx >= inLx && (pRy - this.speed) <= inRy && (y + 30) > inRy
					){
					    b = true;
					    break;
					}
				}
			}
			
			
			
			break;
		case 2:
			//获取炮头的横截面
			pLx = x + 12 + 23;
			pLy = y;
			pRx = x + 23 + 12;
			pRy = y + 5 + 10 + 5;
			
			for(int i = 0; i < BadTanks.badTankList.size(); i++){
				BadTanks otherBadTank = BadTanks.badTankList.get(i);
				if(otherBadTank != this){
					switch(otherBadTank.getDir()){
					case 1:
						 inLx = otherBadTank.getX();
						 inLy = otherBadTank.getY() - 5;
						 inRx = otherBadTank.getX();
						 inRy = otherBadTank.getY() + 30;
						 break;
					 case 2:
						 inLx = otherBadTank.getX();
						 inLy = otherBadTank.getY();
						 inRx = otherBadTank.getX();
						 inRy = otherBadTank.getY() + 5 + 10 + 5;
						 break;
					 case 0:
						 inLx = otherBadTank.getX();
						 inLy = otherBadTank.getY();
						 inRx = otherBadTank.getX();
						 inRy = otherBadTank.getY() + 12 + 23;
						 break;
					 case 3:
						 inLx = otherBadTank.getX() - 5;
						 inLy = otherBadTank.getY();
						 inRx = otherBadTank.getX() - 5;
						 inRy = otherBadTank.getY() + 5 + 10 + 5;
						 break;
					 }
					if(pLy >= inLy && pLy <= inRy && (pRx + this.speed) >= inRx && x < inRx || 
					   pRy >= inLy && pRy <= inRy && (pRx + this.speed) >= inRx && x < inRx 
					 ){
					    b = true;  
					    break;
							
					}
				}
				
			}
			
			
			break;
		case 0:
			//获取炮头的横截面
			pLx = x;
			pLy = y + 12 + 23;
			pRx = x + 5 + 10 + 5;
			pRy = y + 12 + 23;
			int bkI = 0;
			for(int i = 0; i < BadTanks.badTankList.size(); i++){
				BadTanks otherBadTank = BadTanks.badTankList.get(i);
				//System.out.println("判断========="+(otherBadTank != this));
				
				if(otherBadTank == this){
					bkI = i;
				}
				if(otherBadTank != this){
					switch(otherBadTank.getDir()){
					case 1:
						 inLx = otherBadTank.getX();
						 inLy = otherBadTank.getY() - 5;
						 inRx = otherBadTank.getX() + 5 + 10 + 5;
						 inRy = otherBadTank.getY() - 5;
						 break;
					 case 2:
						 inLx = otherBadTank.getX();
						 inLy = otherBadTank.getY();
						 inRx = otherBadTank.getX() + 12 + 23;
						 inRy = otherBadTank.getY();
						 break;
					 case 0:
						 inLx = otherBadTank.getX();
						 inLy = otherBadTank.getY();
						 inRx = otherBadTank.getX() + 5 + 10 + 5;
						 inRy = otherBadTank.getY();
						 break;
					 case 3:
						 inLx = otherBadTank.getX() - 5;
						 inLy = otherBadTank.getY();
						 inRx = otherBadTank.getX() + 30;
						 inRy = otherBadTank.getY();
						 break;
					 }
				
				if(pLx >= inLx && pLx <= inRx && (pRy + this.speed) >= inRy && y < inRy || 
				   pRx <= inRx && pRx >= inLx && (pRy + this.speed) >= inRy && y < inRy
				){
				    b = true;
				    //System.out.println("pRy + this.speed="+(pRy + this.speed)+",inRy="+inRy+",参照坦克="+i+",我是"+bkI);
				    break;
				}
				
				}
				//System.out.println("pRy + this.speed="+(pRy + this.speed)+",inRy="+inRy+",b="+b);
			}
			
			break;
		case 3:
			//获取炮头的横截面
			pLx = x - 5;
			pLy = y;
			pRx = x - 5;
			pRy = y + 5 + 10 + 5;
			
			for(int i = 0; i < BadTanks.badTankList.size(); i++){
				BadTanks otherBadTank = BadTanks.badTankList.get(i);
				if(otherBadTank != this){
					switch(otherBadTank.getDir()){
					case 1:
						 inLx = otherBadTank.getX() + 5 + 10 + 5;
						 inLy = otherBadTank.getY() - 5;
						 inRx = otherBadTank.getX() + 5 + 10 + 5;
						 inRy = otherBadTank.getY() + 30;
						 break;
					 case 2:
						 inLx = otherBadTank.getX() + 12 + 23;
						 inLy = otherBadTank.getY();
						 inRx = otherBadTank.getX() + 12 + 23;
						 inRy = otherBadTank.getY() + 5 + 10 + 5;
						 break;
					 case 0:
						 inLx = otherBadTank.getX() + 5 + 10 + 5;
						 inLy = otherBadTank.getY();
						 inRx = otherBadTank.getX() + 5 + 10 + 5;
						 inRy = otherBadTank.getY() + 12 + 23;
						 break;
					 case 3:
						 inLx = otherBadTank.getX() + 30;
						 inLy = otherBadTank.getY();
						 inRx = otherBadTank.getX() + 30;
						 inRy = otherBadTank.getY() + 5 + 10 + 5;
						 break;
					 }
				
				if(pLy >= inLy && pLy <= inRy && (pRx - this.speed) <= inRx && (x + 30) > inRx || 
				   pRy <= inRy && pRy >= inLy && (pRx - this.speed) <= inRx && (x + 30) > inRx
				){
				   b = true;
				   break;
				}
				}
			}
			
			break;
		}
		
		
		//System.out.println(b);
		
		return b;
	}
	@Override
	//坦克的线程
	public void run() {
		int count = 50;
		int flg = count;
		int flg2 = count;
		// TODO Auto-generated method stub
		while(true){
			//暂停了
			if(Attribute.paused){
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				continue;
			}
			for(int i = 0; i < 10; i++){
				//定义方向 1上 2右 0下 3左
				if(!this.isTouchOtherBadTank()){
					switch(this.dir){
					case 0:
						this.moveDown(300);
						break;
					case 1:
						this.moveTop();
						break;
					case 2:
						this.moveRight(400);
						break;
					case 3:
						this.moveLeft();
						break;
					}
				}else{
					break;
				}
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					

			}
			 
		
				//动态修改随机的方向
				//double rmd = Math.random();
				/*if(--flg > (int)count/2){
					if(rmd >= 0.5 && rmd <= 0.55 || rmd >= 0.80 && rmd <= 0.85){
						rmd = 0;
					}
				}else{
					if(rmd >= 0.5 && rmd <= 0.55 || rmd >= 0.80 && rmd <= 0.85){
						rmd = 0.3;
					}
					
				}
				
				if(--flg2 > (int)count/2){
					if(rmd >= 0.5 && rmd <= 0.66 || rmd >= 0.85 && rmd <= 0.96){
						rmd = 0.55;
					}
				}else{
					if(rmd >= 0.56 && rmd <= 0.66 || rmd >= 0.86 && rmd <= 0.96){
						rmd = 0.9;
					}
				}
				//System.out.println(flg2);
				
				
				if(flg <= 0){
					flg = count;
				}
				if(flg2 <= 0){
					flg2 = count;
				}*/
				
				//System.out.println(flg);

				this.dir = (int)(Math.random() * 4);
				
				while(true){
					if(this.isTouchOtherBadTank()){

						this.dir = (int)(Math.random() * 4);
						
						//System.out.println("dir="+this.dir+",id="+Thread.currentThread().getId()+",status="+this.isTouchOtherBadTank());
						/*for(int i = 0; i < BadTanks.badTankList.size(); i++){
							if(this == BadTanks.badTankList.get(i)){
								System.out.println(i);
							}
						}*/
						
					}else{
						//System.out.println("--");
						break;
					}
				}
				

			
			if(!this.isLive){
				break;
			}
			
			//子弹达到一定量就不发了
			if(this.bulletList.size() < this.getBulletNum()){
				this.fire(400, 300);
			}
			//System.out.println(this.isTouchOtherBadTank());
			//break;
		}
	}
}
/**
* 子弹
* 具有线程类
*/
class Bullet implements Runnable{
	Color color = null;
	int speed = 2;
	int saveStep = 2;
	int x = 0;
	int y = 0;
	int dir = 0;
	//子弹的尺寸
	int width = 5;
	int height = 5;
	//边界
	int borderX = 0;
	int borderY = 0;
	//子弹是否还活着
	Boolean isLive = true;
	
	public int getSaveStep() {
		return saveStep;
	}
	public void setSaveStep(int saveStep) {
		this.saveStep = saveStep;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getBorderX() {
		return borderX;
	}
	public void setBorderX(int borderX) {
		this.borderX = borderX;
	}
	public int getBorderY() {
		return borderY;
	}
	public void setBorderY(int borderY) {
		this.borderY = borderY;
	}
	public Boolean getIsLive() {
		return isLive;
	}
	public void setIsLive(Boolean isLive) {
		this.isLive = isLive;
	}	
	public int getDir() {
		return dir;
	}
	public void setDir(int dir) {
		this.dir = dir;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
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

	public Bullet(int x, int y, int dir, int borderX, int borderY){
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.color = Color.black;
		this.borderX = borderX;
		this.borderY = borderY;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//max x max y min x min y
		int maxX = this.borderX - this.width - 6; //减去6个像素的边框
		int maxY = this.borderY - this.height;
		int minX = 0;
		int minY = 0;
		while(true){
			if(Attribute.paused){
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				continue;
			}
			//定义方向 1上 2右 0下 3左
			switch(this.dir){
				case 0:
					if(this.y + this.speed < maxY){
						this.y += this.speed;
					}else{
						this.y = maxY;
					}
					;break;
				case 1:
					if(this.y > minY){
						this.y -= this.speed;
					}else{
						this.y = minY;
					}
					;break;
				case 2:
					if(this.x + this.speed < maxX){
						this.x += this.speed;
					}else{
						this.x = maxX;
					}
					;break;
				case 3:
					if(this.x > minX){
						this.x -= this.speed;
					}else{
						this.x = minX;
					}
					;break;
			}
			 
			//子弹何时死亡
			if(x == minX || x == maxX || y == minY || y == maxY){
				this.isLive = false;
				
				break;
			}
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}

class Bomb implements Runnable{	
 private int x = 0;
 private int y = 0;
 //炸弹的生命
 private int life = 9;
 private Boolean isLive = true;
 public Bomb(int x, int y){
	 this.x = x;
	 this.y = y;
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
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public Boolean getIsLive() {
		return isLive;
	}
	public void setIsLive(Boolean isLive) {
		this.isLive = isLive;
	}
 
 //减少生命
 public void LifeDown(){
	 if(this.life > 0){
		 this.life --;
	 }else{
		 this.isLive = false;
	 }
 }

@Override
public void run() {
	// TODO Auto-generated method stub
	while(true){
		if(Attribute.paused){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			continue;
		}
		if(this.isLive){
			this.LifeDown();
		}else{
			break;
		}
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
/**
 * 保存或者读取玩家的一些记录
 * @author Administrator
 *
 */
class Recorder {
	//标志位代表新游戏或者是读取上一局
	private static Boolean news = true;
	//保存的文件路径
	private static String path = "d:\\save.txt";
	//记录每一关有多少敌人
	private static int badTanKNum = 7;
	//设置我有多少条命
	private static int myLife = 20;
	//记录总共杀死多少坦克
	private static int killBadTanKNum = 0;
	//读取的时候坏人坦克的队列
	private static Vector<Node> ndList = null;
	//读取好人坦克的队列
	private static Node goodTankNode = null;
	
	//坏人坦克
	private static Vector<BadTanks> badTankList = null;
	//好人坦克
	private static GoodTanks goodTank = null;
	
	
	public static Vector<BadTanks> getBadTankList() {
		return badTankList;
	}
	public static void setBadTankList(Vector<BadTanks> badTankList) {
		Recorder.badTankList = badTankList;
	}
	public static GoodTanks getGoodTank() {
		return goodTank;
	}
	public static void setGoodTank(GoodTanks goodTank) {
		Recorder.goodTank = goodTank;
	}
	//初始化数据
	public static void resetData(){
		Recorder.badTanKNum = 7;
		Recorder.killBadTanKNum = 0;
		Recorder.myLife = 20;
	}
	//杀死坦克自增
	public static void addKillBadTanKNum(){
		Recorder.killBadTanKNum ++;
	}
	public static int getKillBadTanKNum() {
		return killBadTanKNum;
	}
	public static void setKillBadTanKNum(int killBadTanKNum) {
		Recorder.killBadTanKNum = killBadTanKNum;
	}
	public static int getBadTanKNum() {
		return badTanKNum;
	}
	public static void setBadTanKNum(int badTanKNum) {
		Recorder.badTanKNum = badTanKNum;
	}
	public static int getMyLife() {
		return myLife;
	}
	public static void setMyLife(int myLife) {
		Recorder.myLife = myLife;
	}
	public static Vector<Node> getNdList() {
		return ndList;
	}
	public static void addNodeToList(Node nd){
		Recorder.ndList.add(nd);
	}
	public static void setNdList(Vector<Node> ndList) {
		Recorder.ndList = ndList;
	}
	public static void lessen(){
		Recorder.badTanKNum --;
	}
	public static Node getGoodTankNode() {
		return goodTankNode;
	}
	public static Boolean getNews() {
		return news;
	}
	public static void setNews(Boolean news) {
		Recorder.news = news;
	}
	public static void setGoodTankNode(Node goodTankNode) {
		Recorder.goodTankNode = goodTankNode;
	}
	//存档的完整性检查
	//如果0只检查info的完整性
	//如果1检查所有的完整性
	private static boolean checkFileInfo(int i, String tmp){
		
		Boolean exit = false;
		if(i == 0){
			if(tmp == null){
				exit = true;
			}else{
				String []tmp2 = tmp.split("info:");
				if(tmp2.length < 2){
					exit = true;
				}else{
					if(tmp2[1].split("-").length < 3){
						exit = true;
					}else{
						String []t = tmp2[1].split("-");
						int len = t.length;
						for(int j = 0; j < len; j++){
							try {
								Integer.parseInt(t[j]);
							} catch (NumberFormatException e) {
								// TODO Auto-generated catch block
								exit = true;
							}
						}
						
					}
				}
			}
		}else{
			if(i == 1){
				//readAll没有做验证
			}
		}
		
		return exit;
	}
	
	//读取存档中的所有内容包括坦克坐标等等
	public static void readAll(){
		//初始化点的队列
		Recorder.ndList = new Vector<Node>();
		FileReader fd = null;
		BufferedReader br = null;
		try {
			fd = new FileReader(Recorder.path);
			br = new BufferedReader(fd);
			String data = "";
			try {
				while((data=br.readLine()) != null){
					String []name = data.split(":");
					if(name[0].equals("info")){
						String []datas = name[1].split("-");
						Recorder.killBadTanKNum = Integer.parseInt(datas[0]);
						Recorder.myLife = Integer.parseInt(datas[1]);
						Recorder.badTanKNum = Integer.parseInt(datas[2]);
					}
					if(name[0].equals("badtk")){
						String []dataNode = name[1].split("-");
						Node nd = new Node(Integer.parseInt(dataNode[0]), Integer.parseInt(dataNode[1]), Integer.parseInt(dataNode[2]));
						Recorder.addNodeToList(nd);
					}
					if(name[0].equals("goodtk")){
						String []dataNode = name[1].split("-");
						Recorder.goodTankNode = new Node(Integer.parseInt(dataNode[0]), Integer.parseInt(dataNode[1]), Integer.parseInt(dataNode[2]));
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.exit(0);
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//如果文件没有找到直接退出
			System.exit(0);
			e.printStackTrace();
		}finally{
			try {
				br.close();
				fd.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//读取总分
	public static void readScore(){
		File f = new File(Recorder.path);
		if(!f.exists()){
			return;
		}
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(Recorder.path);
			br = new BufferedReader(fr);
			try {
				
				String tmp = br.readLine();
				
				//检查数据的完整性 检查失败就不用继续下面的内容了
				if(Recorder.checkFileInfo(0, tmp)){
					return;
				}
				
				String []data = tmp.split(":");
				String []dataTmp = data[1].split("-");
				Recorder.killBadTanKNum = Integer.parseInt(dataTmp[0]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.exit(0);
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//保存所有记录包括坦克的相关的详细信息
	//外围信息的分割符info:
	//坏人坦克分割符号badtk:x-y-dir
	//好人坦克分割符号goodtk:x-y-dir
	public static void saveAll(){
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(Recorder.path);
			bw = new BufferedWriter(fw);
			String saveInfo = "";
			//外围的相关信息
			saveInfo += "info:" + Recorder.killBadTanKNum + "-" + Recorder.myLife+"-" + Recorder.badTanKNum + "\r\n";
			//参战坦克的详细信息
			//敌人的坐标
			for(int i = 0; i < Recorder.badTankList.size(); i++){
				BadTanks bt = Recorder.badTankList.get(i);
				if(bt.isLive){
					saveInfo += "badtk:" + bt.getX() + "-" + bt.getY() + "-" + bt.getDir() + "\r\n";
				}
			}
			
			//我的坐标
			GoodTanks gt = Recorder.getGoodTank();
			if(gt.isLive){
				saveInfo += "goodtk:" + gt.getX() + "-" + gt.getY() + "-" + gt.getDir() + "\r\n";
			}
			 
			//写入文件
			bw.write(saveInfo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	//保存存档
	public static void save(){
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(Recorder.path);
			bw = new BufferedWriter(fw);
			bw.write("info:" + Recorder.killBadTanKNum + "-" + Recorder.myLife+"-" + Recorder.badTanKNum + "\r\n");
			
			//记录坦克的位置
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


