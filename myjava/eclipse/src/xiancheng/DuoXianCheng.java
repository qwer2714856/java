package xiancheng;
/**
 * ���߳�
 * �����߳�ͬʱ��
 * �߳̽����ܳ���Ա�ǿ��Ʋ�ס�ģ��Ⱥ�˳��
 * �ͺ����������߳�����Aȥ��ƻ������Bȥ���⣬�������ǵ����ʱ�����޷����ơ�
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
	//����ѧ��
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
