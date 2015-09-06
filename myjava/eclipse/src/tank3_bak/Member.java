package tank3_bak;
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
	
}
