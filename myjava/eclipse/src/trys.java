import java.io.*;
import java.net.*;
public class trys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������쳣������ǳ���Ĵ���Ϊ������������ͨ���ļ��򲻿��ȵ�
		//���ܿ�����Զ�̵��޸ĵȵ�
		//��һ�������ڵ��ļ�
		//�������ܴ�����������������Ҳ�������ļ���ô�죬������Ҫ���㴦������Ҳ������쳣��
		//���־��Ǽ�����쳣�������ھͱ����ˡ�
		//FileReader fr = new FileReader("d:\a.txt");
		//����IP
		//����Ϊ�����д����������Ҫ����
		//Socket sock = new Socket("127.0.0.1", 80);
		//���������ڿ���Ԥ�����쳣
		
		
		
		//�����쳣--ֻ�������е�ʱ�����֪�� ���봦��
		//��������Խ�磬0����
		//int a = 4 / 0;//����û�д����������ͱ�����
		/*Exception in thread "main" java.lang.ArithmeticException: / by zero
	at trys.main(trys.java:25)*/
		//int [] as = new int[10];//����Խ��
		//System.out.println(as[100]);
		/*
		 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100
	at trys.main(trys.java:29)
		  */
		
		
		//�����Ĵ���Դ�ڳ����BUG���ܳ���ľ��ˡ�
		//����������򣬵��ڴ����ʱ���ڴ�ľ���
		//��õ��ģ��еĸ������кܴ��ϵ�������������еı��ⲿ����������ɱ������ȵȡ�
		
		
		
		//�����쳣 �Ľ������
		//���������ĵ㿪ʼ�ж�
		//���
		//1.try catch
		//2.ʹ�� throw�Ӹ�������
		//��󲶻񣬲���ʲô����඼��Exception�����񣬳��ã�
		/*try{
			FileReader fr = new FileReader("d:/a.txt");
		}catch(Exception e){//���Ǹ���󲶻�,����ʲô�쳣ͳͳ��catch����
			//����쳣��Ϣ�������Ŵ�
			//e.getMessage ���������Ϣ ��ҪSystem.out.println
			//e.printStackTrace() ֱ�Ӿ����������Ϣ
			
		}*/
		
		//��С����,���ô�Exception�����ö�Ӧ�Ĵ��󲶻�,��ʲô�쳣�Ͳ���ʲû�쳣��	
		/*try {
			FileReader fr = new FileReader("d:/a.txt");
			Socket sock = new Socket("127.0.0.1", 80);
		} catch (FileNotFoundException e) {//��С�������һ�ִ���������滹�������������ֲ����ǲ�����
			// TODO: handle exception
			e.printStackTrace();
		} catch(IOException e){//���ִ������Ҫ����С�ľ�ȷ���񣬾���Ҫʹ�ö��catch���ֱ𲶻�
			e.printStackTrace();
		}*/
	
		//���鲻�÷���ôϸ��,ֱ����Exception�������еġ�

		//finally
		FileReader fr = null;
		try {
			fr = new FileReader("d:/a.txt");
		} catch (Exception e) {
			// TODO: handle exception
		} finally{//�����ǲ��ǳ������쳣ͳͳ�������������ú��Զ��׼���һ��˵����Ҫ�رյ���Դ�����ļ����ڴ棬���ݿ�ȵȡ���
			 if(fr != null){
				 try{
					 fr.close();//�ر���Դ�Ǳ���Ĳ����Ƿ�ɹ�
				 }catch(Exception e){
					 
				 }
			 }
		}
		
		//try catch finally ��һ��Ҫ���߶��������
		//һ�����������һ�����
		
		//���¼������finally ��һ����ִ��
		//finally ���з������쳣
		//�������ڵ��߳�����
		//�ڴ�����ʹ��Systen.exit(Number)
		//�ر�cpu
		
		
		
		
		
	}
}
class test{
		//�׸������� -- throws Exception
		//˭����test���hi������˭��Ҫ��������
	    //��������߶����������쳣�ͽ����������
		public void hi() throws Exception
		{
			FileReader fr = new FileReader("d:/a.txt");
		}
}

//��� printStackTrace()�����˺ܶ����ע���һ����ʼ�����λ�ã���Ϊ�����ܿ����ǵ��������˴���
