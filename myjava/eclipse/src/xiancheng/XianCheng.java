package xiancheng;
/**
 * 进程
 * 进程是运行中的应用程序。操作系统会为独立的进程分配内存空间。 
 * 进程之间是不可以相互访问的，如果出现相互访问就是木马。
 * 线程 
 * 线程是寄生在进程中的。
 * 线程的三大状态
 * 就绪，阻塞，运行
 * 线程轻量级的进程
 * 线程没有独立的地址空间和内存空间
 * 线程是进程创建的
 * 进程可以有多个线程
 * 当增加线程的时候进程的大小空间会自动调整
 * 64位机器和32的机器是cpu读取数据的量，寻址范围越大。
 * 状态
 * 新建状态
 * 就绪状态（系统会去检查cpu 内存是否够用如果够用就进入到运行状态）
 * 运行状态 （如果说你在运行一个文件别人也在用它就会进入阻塞状态）
 * 阻塞状态（在阻塞的时候系统会去不停的监听系统资源，如果达到了可以运行的状态，就让他就绪（注意是就绪不是运行）就绪后会在进入运行状态）
 * 死亡状态（运行结束后就自己死亡了）
 * 一个通俗的解释这五种状态
 * 1.一个人被生出来就是（创建状态）
 * 2.出生后他还不能干活需要学习技能（就绪状态）
 * 3.当满足可以干活的技能条件开始干活（运行）
 * 4.如果干活的时候生病生病了就不能干活了，养病好了（阻塞）
 * 5.养病样的好了（在进入就绪状态）
 * 6.又开始工作循环4、5
 * 7.最后工作完了干不动了就自然死亡了
 * 
 * 在java中一个类要当作线程来使用有两种方法
 * 继承Thread类，并重写run函数
 * 实现Runnable接口，并重新run函数
 * java中任何一个类都可以当作一个线程
 * 
 * new 新建状态
 * start 可运行状态
 * 调度着操作系统
 * 进入运行状态
 * sleep休眠进入阻塞状态，阻塞时间结束后进入Runnable状态调度进入run状态。然后循环，知道break
 * 死亡
 * 在开发的时候尽量用接口的方式实现线程
 * 
 * 
 * Thread 和 Runnable 的区别
 * 从java的设计来看本质上是没有任何却别的，都是那五个状态，只不过接口的需要在调用start的时候创建一个Thread然后把对象传进去，然后在调用start即可。
 * Thread类本身就实现了Runnable接口
 * 尽可能使用Runnable的方式创建线程
 * Thread 启动的时候可以直接用start
 * Runnable
 * Catx c =new Catx(100);
   Thread thread = new Thread(c);
   thread.start();
 * @author Administrator
 *
 */
public class XianCheng {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread t = new thread();//new的时候就创建了线程
		//启动线程，导致run函数的运行，这个时候进入了就绪状态
		t.start();//start的时候进入可运行状态(就绪状态，但是start也不一定马上运行，检测是否否和可以运行的条件)，进而进入运行状状态，而进入运行状态的这个调度者是操作系统。
	}

}


/**
* 继承Thread 开发线程
*/
class thread extends Thread{
	//重新 run
	public void run(){
		//开始进入运行状态,运行状态和就绪状态间隔很短（前提是符合运行条件）。
		int i = 0;
		while(true){
			//休眠一秒,当线程看到休眠他就会进入阻塞状态(blocked)，当进入到阻塞状态就会释放自己占用的cpu和内存的资源，按照毫秒计算
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(i++ > 1){
				 break;//当跳出循环线程就死亡了
			}
			System.out.println("hi");
		}
		//当跳出循环线程就死亡了
		System.out.println("线程死亡");
	}
}