package xiancheng;
/**
 * ʹ���̵߳�ע������
 * 1.�̶߳���ֻ������һ���߳�
 * Catz cat = new Catz();
 * Thread thread1 = new Thread(cat);
 * thread1.start();
 * thread1.start();
 * �����������ֱ�ӱ���  
 * Dogz dog = new Dogz();
 * Thread thread2 = new Thread(dog);
 * Thread thread3 = new Thread(dog);
 * thread2.start();
 * thread3.start();
 * ����д��û������,��Ϊ�����������߳���һ���࣬����һ���߳�ֻ����һ����������������Ǵ���ġ�
 * 
 * @author Administrator
 *
 */
public class ShiYongXianChengZhuYi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Catz cat = new Catz();
		Thread thread1 = new Thread(cat);
		thread1.start();
		//thread1.start();
		
		Dogz dog = new Dogz();
		Thread thread2 = new Thread(dog);
		Thread thread3 = new Thread(dog);
		thread2.start();
		thread3.start();
	}

}
class Catz implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("m");
	}
	
}
class Dogz implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("w");
	}
}