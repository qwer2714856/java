package tankv1;
import java.awt.*;
/**
 * ������̹��
 * @author Administrator
 *
 */
abstract class Tanks{
	
	//����λ��
	int x = 0;
	int y = 0;
	//�����ٶ�
	int speed = 20;
	//���巽�� 1�� 2�� 0�� 3��
	int dir = 0;
	//�����С�� ����̹�˺��ʼ��
	int sizeH = 0;
	int sizeCz = 0;
	//��� 0 �Լ���̹����1 ����
	int identity = 0;
	//��ɫ
	Color color = null;
	//�ӵ�
	Bullet bullet = null;
	
	public Bullet getBullet() {
		return bullet;
	}
	public void setBullet(Bullet bullet) {
		this.bullet = bullet;
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
	//�����ƶ�
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
		if(x < rightX){//���������Ϊʲô�ڼ�ȥһ��cz����Ϊ�㴴����400��ʵ�ʴﲻ��������JFrame���б߿��6�������ҡ�
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
	//����
	abstract public void fire(int borderX, int borderY);
}
/**
 * ��̹��
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
		//���巽�� 1�� 2�� 0�� 3��
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
		//�����ӵ��߳�
		this.bullet = new Bullet(x, y, this.dir, borderX, borderY);
		Thread thread = new Thread(this.bullet);
		thread.start();
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
		this.setIdentity(1);
		this.setColor(Color.red);
	}
	public void fire(int borderX, int borderY){
		
	}
}
/**
* �ӵ�
* �����߳���
*/
class Bullet implements Runnable{
	Color color = null;
	int speed = 10;
	int x = 0;
	int y = 0;
	int dir = 0;
	//�ӵ��ĳߴ�
	int width = 5;
	int height = 5;
	//�߽�
	int borderX = 0;
	int borderY = 0;
	//�ӵ��Ƿ񻹻���
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
		int maxX = this.borderX - this.width - 6; //��ȥ6�����صı߿�
		int maxY = this.borderY - this.height;
		int minX = 0;
		int minY = 0;
		while(true){
			//���巽�� 1�� 2�� 0�� 3��
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
			 
			//�ӵ���ʱ����
			if(x == minX || x == maxX || y == minY || y == maxY){
				this.isLive = false;
				break;
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}