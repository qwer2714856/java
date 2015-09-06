package xiancheng;

public class RunableInterFace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cats c = new Cats();
		Thread thread = new Thread(c);
		thread.start();
	}

}
class Cats implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(i++ < 10){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
}
