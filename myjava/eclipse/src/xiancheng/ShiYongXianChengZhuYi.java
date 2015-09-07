package xiancheng;
/**
 * 使用线程的注意事项
 * 1.线程对象只能启动一个线程
 * Catz cat = new Catz();
 * Thread thread1 = new Thread(cat);
 * thread1.start();
 * thread1.start();
 * 如果启动两次直接报错  
 * Dogz dog = new Dogz();
 * Thread thread2 = new Thread(dog);
 * Thread thread3 = new Thread(dog);
 * thread2.start();
 * thread3.start();
 * 这样写就没有问题,因为启动了两个线程跑一个类，但是一个线程只能跑一次所以上面的用例是错误的。
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