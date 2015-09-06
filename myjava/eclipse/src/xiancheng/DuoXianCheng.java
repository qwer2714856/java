package xiancheng;
/**
 * 多线程
 * 两个线程同时跑
 * 线程交替跑程序员是控制不住的，先后顺序。
 * 就好像我是主线程我让A去买苹果，让B去买肉，但是他们的完成时间我无法控制。
 * @author Administrator
 *
 */
public class DuoXianCheng {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Catx c =new Catx(100);
		Thread thread = new Thread(c);
		thread.start();
		
		//dog
		Dogx d = new Dogx();
		Thread t = new Thread(d);
		t.start();
		
	}

}
class Catx implements Runnable{
	//算数学题
	int n = 0;
	int sum = 0;
	int time = 0;
	public void run(){
		while(true){
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int i = 0; i < n; i++){
				sum += i;
			}
			System.out.println(sum);
			sum = 0;
			if(time++ > 10){
				break;
			}
		}
	}
	public Catx(int n){
		this.n = n;
	}
}
class Dogx implements Runnable{
	public void run(){
		int time = 0;
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Dog said"+time);
			if(time++ > 10){
				break;
			}
		}
	}
}
