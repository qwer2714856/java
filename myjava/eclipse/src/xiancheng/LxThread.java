package xiancheng;

public class LxThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����״̬");
		Cat threadCat = new Cat();
		System.out.println("start ����״̬�ȴ�����ϵͳ����,����������Ŷ�");
		threadCat.start();
	}

}
class Cat extends Thread{
	public void run(){
		System.out.println("ϵͳ�����˽�������״̬");
		int i = 0;
		while(i++ < 10){
			try {
				Thread.sleep(1000);//���ʱ���������״̬
				System.out.println("����״̬����");
				System.out.println("����״̬�ȴ�������ϵͳ����,����������Ŷ�");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("����");
	}
}