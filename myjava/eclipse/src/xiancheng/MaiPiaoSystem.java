package xiancheng;
/**
 * ���߳���Ʊϵͳ
 * ������Ϣ�鿴�����߳��ڹ���
 * Thread.currentThread().getName()�鿴�����߳��ڹ���,��ȡ��ǰ�����̵߳����֡�
 * ʲô���̰߳�ȫ
 * ͬһ��Ʊ���������ͬʱ�۳�
 * �������Ĺؼ�
 * �������Ĺؼ�����Ҫ��֤���׳�����Ĵ����ԭ����
 * ʲô��ԭ����
 * ��A�߳�ִ��ĳ�δ����ʱ�����̱߳���ȵ������߳���ɺ��ִ�С�
 * �ͺ��Ŷ���é��һ����
 * java�����߳�ͬ���ķ����ṩ��
 * synchronized(Object) ������{��Ҫͬ���Ĵ���} ���߳�����
 * �Ŷӵ��̻߳���ڵȴ��̳߳������棬�̳߳��еĴ����ǲ�ռϵͳ��Դ�����Ƕ�������״̬���Բ�ռϵͳ��Դ���ȵ�synchronized�Ĵ���ִ����Ϻ��ڴ��̳߳�����������һ���߳̽������Ŷӵ��߳���Զ��У��Ƚ��ȳ��������̵߳ȴ����У�����Ҳ������ȫ�ģ��߳���������ȼ������ƻ����������������ȼ�һ��û��˵���Ƕ����߷�������Ͱ������ȼ����ߵ��߽���������é���и��Ƚ���Ҫ���������ˣ�����Ҫ�����ϣ�Ҳ����������ִ�е��жϽ�����̳أ���������ȼ��ߵ������У���
 * ������Ĭ�ϵı�־λ��1������û������ʹ����Դ�������0����������ʹ�ã���û���κ��߳�ʹ��Ϊ1��������̲߳ٿؾ�Ϊ0
 * �������˾Ͱѱ�־����Ϊ0�������˿���������1����������Ҫ���ûط����������������ȴ��̳߳������̣߳���һ���߳����ͻ�ֱ���ŵ��̵߳ȴ��صĶ����У���������ȥ���߳����ǲ��Ǵ򿪵�״̬������ճ�Ҫȥ���߳�����״̬�ġ�
 * �����������û�����û�ԭ���Ŀ���״̬��
 * �������п��ܵ���ִ�е�ʱ������쳣������û�н��������ˣ��������󻥳⣬������Ҷ���ͳ������ˣ��������Ⲣ�����߳��໥���ʡ�
 * 1.������������ν������ǽ�����ĳһʱ���ڶ�ռ��Դ��
 * 2.�����뱣��������һ��������������Դ������ʱ�����ѻ�õ���Դ���ֲ��š�
 * 3.����������:�����ѻ����Դ����ĩʹ����֮ǰ������ǿ�а��ᡣ
 * 4.ѭ���ȴ�����:���ɽ���֮���γ�һ��ͷβ��ӵ�ѭ���ȴ���Դ��ϵ��
 * 
 * ������
 * 
 *  synchronized (obj1) {
                System.out.println("���Ѿ�����obj1����Ϣ0.5�������obj2ȥ��");   
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
                System.out.println("���Ѿ�����obj2����Ϣ0.5�������obj1ȥ��");   
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj1) {
                    System.out.println("0");
                }
            }
 * ����
 * �ļ����������������ݿ��������������������ݿ�������Զ�ִ�еģ���
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
		
		//����������Ʊ����,�����߳���ͬһ������
		Thread thread1 = new Thread(s);
		Thread thread2 = new Thread(s);
		Thread thread3 = new Thread(s);
		//����ڶ�һ�����������˶����߳���ͬʱ������
		//�̺߳�˭�ȶ�˭��0��
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
class ShouPiaoChuangKou implements Runnable{
	private int allPNum = 2000;
	private Dog myDog = new Dog();//��������ͬ�����������������
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		String str = "";
		while(true){
			//��Ϊ���Ҫ��֤ԭ����,ͬ�������,this���Ƕ���������������
			//���������Կ������������ֻҪ�и������ž���
			synchronized(this.myDog){//������this ��������������Ҫ�и������������
				if(this.allPNum >0){
					this.allPNum--;
					str = "ʣ��" + this.allPNum;
					if(this.allPNum == 0){
						str = "û��";
					}
				}else{
					break; 
				}
				System.out.println(Thread.currentThread().getName()+str);
				//����������������
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
//���Ž�����
class Dog{
	
}
