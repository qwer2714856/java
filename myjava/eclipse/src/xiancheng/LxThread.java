package xiancheng;

public class LxThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("创建状态");
		Cat threadCat = new Cat();
		System.out.println("start 就绪状态等待操作系统调用,可以理解是排队");
		threadCat.start();
	}

}
class Cat extends Thread{
	public void run(){
		System.out.println("系统调用了进入运行状态");
		int i = 0;
		while(i++ < 10){
			try {
				Thread.sleep(1000);//这段时候就是阻塞状态
				System.out.println("阻塞状态结束");
				System.out.println("就绪状态等待被操作系统调用,可以理解是排队");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("死亡");
	}
}