package tank6_bak;
import java.awt.*;
import java.util.*;
/**
 * 抽象类坦克
 * @author Administrator
 *
 */
abstract class Tanks{
	
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
	abstract public void fire(int borderX, int borderY);
}
/**
 * 好坦克
 * @author Administrator
 *
 */
class GoodTanks extends Tanks{
	public GoodTanks(int x, int y){
		super(x, y);
		this.setIdentity(0);
		this.setDir(1);
		this.setColor(Color.yellow);	
	}	
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
 * 坏坦克
 * @author Administrator
 *
 */
class BadTanks extends Tanks{
	public BadTanks(int x, int y){
		super(x, y);
		this.setIdentity(1);
		this.setColor(Color.red);
	}
	public void fire(int borderX, int borderY){
		
	}
}
/**
* 子弹
* 具有线程类
*/
class Bullet implements Runnable{
	Color color = null;
	int speed = 2;
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