package tankv1;
import java.awt.*;
import java.util.*;
/**
 * ������̹��
 * @author Administrator
 *
 */
abstract class Tanks{
	//����Ѫ
	int life = 9;
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
	//��¼����
	int saveStep = 20;

	//��� 0 �Լ���̹����1 ����
	int identity = 0;
	//��ɫ
	Color color = null;
	//�Ƿ����
	Boolean isLive = true;
	//�ӵ�
	//����һ�ο��Է������ӵ�
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
		Bullet s = new Bullet(x, y, this.dir, borderX, borderY);
		this.bulletList.add(s);
		Thread thread = new Thread(s);
		thread.start();
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
		this.life = Recorder.getMyLife();
		this.setIdentity(0);
		this.setDir(1);
		this.setColor(Color.yellow);	
	}
	public void setLife(int life) {
		this.life = life;
		Recorder.setMyLife(life);
	}
}
/**
 * ��̹��
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
	public boolean isTouchOtherBadTank(){
		Boolean b = false;
		//��ȥ������ı߽�ͷ���
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
		//���巽�� 1�� 2�� 0�� 3��
		switch(dir){
		case 1:
			//��ȡ��ͷ�ĺ����
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
			//��ȡ��ͷ�ĺ����
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
			//��ȡ��ͷ�ĺ����
			pLx = x;
			pLy = y + 12 + 23;
			pRx = x + 5 + 10 + 5;
			pRy = y + 12 + 23;
			int bkI = 0;
			for(int i = 0; i < BadTanks.badTankList.size(); i++){
				BadTanks otherBadTank = BadTanks.badTankList.get(i);
				//System.out.println("�ж�========="+(otherBadTank != this));
				
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
				    //System.out.println("pRy + this.speed="+(pRy + this.speed)+",inRy="+inRy+",����̹��="+i+",����"+bkI);
				    break;
				}
				
				}
				//System.out.println("pRy + this.speed="+(pRy + this.speed)+",inRy="+inRy+",b="+b);
			}
			
			break;
		case 3:
			//��ȡ��ͷ�ĺ����
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
	//̹�˵��߳�
	public void run() {
		int count = 50;
		int flg = count;
		int flg2 = count;
		// TODO Auto-generated method stub
		while(true){
			//��ͣ��
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
				//���巽�� 1�� 2�� 0�� 3��
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
			 
		
				//��̬�޸�����ķ���
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
			
			//�ӵ��ﵽһ�����Ͳ�����
			if(this.bulletList.size() < this.getBulletNum()){
				this.fire(400, 300);
			}
			//System.out.println(this.isTouchOtherBadTank());
			//break;
		}
	}
}
/**
* �ӵ�
* �����߳���
*/
class Bullet implements Runnable{
	Color color = null;
	int speed = 2;
	int saveStep = 2;
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
		int maxX = this.borderX - this.width - 6; //��ȥ6�����صı߿�
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
 //ը��������
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
 
 //��������
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
 * ������߶�ȡ��ҵ�һЩ��¼
 * @author Administrator
 *
 */
class Recorder {
	//��¼ÿһ���ж��ٵ���
	private static int badTanKNum = 7;
	//�������ж�������
	private static int myLife = 2;
	//��¼�ܹ�ɱ������̹��
	private static int killBadTanKNum = 0;
	
	//ɱ��̹������
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

	public static void lessen(){
		Recorder.badTanKNum --;
	}
}
