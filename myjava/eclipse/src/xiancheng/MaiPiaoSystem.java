package xiancheng;
/**
 * 多线程卖票系统
 * 调试信息查看哪条线程在工作
 * Thread.currentThread().getName()查看哪条线程在工作,获取当前运行线程的名字。
 * 什么是线程安全
 * 同一个票被多个窗口同时售出
 * 解决问题的关键
 * 解决问题的关键就是要保证容易出问题的代码的原子性
 * 什么是原子性
 * 当A线程执行某段代码的时候别的线程必须等到其他线程完成后才执行。
 * 就和排队上茅房一样。
 * java处理线程同步的方法提供了
 * synchronized(Object) 对象锁{你要同步的代码} 《线程锁》
 * 排队的线程会呆在等待线程池子里面，线程池中的代码是不占系统资源的它们都是阻塞状态所以不占系统资源。等到synchronized的代码执行完毕后，在从线程池子里面拿下一个线程进来，排队的线程相对队列，先进先出的排在线程等待池中，但是也不是完全的，线程这个有优先级，会破坏这个链条，如果优先级一样没的说就是队列走法，否则就按照优先级，高的线进（就像上茅房有个比较重要的任务来了，可能要他先上，也可能让正在执行的中断进入进程池，让这个优先级高的先运行）。
 * 对象锁默认的标志位是1，代表没有人在使用资源，如果是0代表有人在使用，当没有任何线程使用为1，如果有线程操控就为0
 * 当进来了就把标志重置为0，用完了空闲在重置1（必须用完要重置回否则是死锁），当等待线程池里有线程，下一个线程来就会直接排到线程等待池的队列中，而不是在去问线程锁是不是打开的状态。如果空池要去问线程锁的状态的。
 * 死锁，用完后没有重置回原来的开锁状态。
 * 死锁是有可能的在执行的时候程序异常，但是没有解锁就完了，两个对象互斥，你读我我读你就成死锁了，尽量避免并发的线程相互访问。
 * 1.互斥条件：所谓互斥就是进程在某一时间内独占资源。
 * 2.请求与保持条件：一个进程因请求资源而阻塞时，对已获得的资源保持不放。
 * 3.不剥夺条件:进程已获得资源，在末使用完之前，不能强行剥夺。
 * 4.循环等待条件:若干进程之间形成一种头尾相接的循环等待资源关系。
 * 
 * 理解就是
 * 
 *  synchronized (obj1) {
                System.out.println("我已经锁定obj1，休息0.5秒后锁定obj2去！");   
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj2) {
                    System.out.println("1");
                }
            }
            
      synchronized (obj2) {
                System.out.println("我已经锁定obj2，休息0.5秒后锁定obj1去！");   
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj1) {
                    System.out.println("0");
                }
            }
 * 锁：
 * 文件锁，对象锁，数据库锁，行锁，表锁（数据库的锁是自动执行的）。
 * @author Administrator
 *
 */
public class MaiPiaoSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShouPiaoChuangKou s = new ShouPiaoChuangKou();
		
		//定义三个售票窗口,三个线程跑同一个对象。
		Thread thread1 = new Thread(s);
		Thread thread2 = new Thread(s);
		Thread thread3 = new Thread(s);
		//相对于对一个事情启动了多条线程在同时操作。
		//线程号谁先动谁是0号
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
class ShouPiaoChuangKou implements Runnable{
	private int allPNum = 2000;
	private Dog myDog = new Dog();//用来看着同步锁，想进来看看锁
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		String str = "";
		while(true){
			//认为这个要保证原子性,同步代码块,this就是对象锁，代表本对象。
			//这里的这个对可以是任意对象只要有个对象看着就行
			synchronized(this.myDog){//可以用this 可以用其他对象，要有个对象看着这个锁
				if(this.allPNum >0){
					this.allPNum--;
					str = "剩余" + this.allPNum;
					if(this.allPNum == 0){
						str = "没了";
					}
				}else{
					break; 
				}
				System.out.println(Thread.currentThread().getName()+str);
				//处理并发，共享数据
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
//看着进程锁
class Dog{
	
}
