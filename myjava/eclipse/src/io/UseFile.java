package io;
import java.io.*;
/**
 * �ļ������ʹ��
 * 1.file��Ļ����÷�
 * @author Administrator
 *
 */
public class UseFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//·�� \\ ���� /
		//�ļ�����--����ļ������ڲ������쳣
		File f = new File("a.jpg");
		//�õ��ļ���·��
		System.out.println("�ļ�ȫ·����"+f.getAbsolutePath());
		//�ļ���С �ֽ�Ϊ��λ
		System.out.println("�ļ���С��"+f.length());
		//�ļ��Ķ�дִ�� ��Ȩ�ޣ�������Ͼͷ���true
		//�ļ���Ȩ�� ��
		System.out.println("�ļ���Ȩ�ޣ�"+f.canRead());
		//�ļ���Ȩ�� д
	    System.out.println("�ļ���Ȩ�ޣ�"+f.canWrite());
		//�ļ���Ȩ�� ִ��
		System.out.println("�ļ���Ȩ�ޣ�"+f.canExecute());
		
		//�ļ����ļ��еĴ���
		//�����ļ�
		//filePath
		String filePath = "d:\\fileSystem.txt";
		/*String [] a = filePath.split("\\\\");
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		System.exit(0);*/
		
		/*File fs = new File(filePath);
		//�ж��ļ��Ƿ����
		if(!fs.exists()){
			//����
			try {
				fs.createNewFile();//ֱ�Ӿʹ����������湹�췽��������Ǹ�
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//�����ļ���
		File fsDir = new File("d:\\fileSystem");
		if(!fsDir.isDirectory()){
			fsDir.mkdir();
		}*/
		
		
		//�г�һ���ļ�������������ļ�
		File fs2 = new File("D:\\java_android");
		if(fs2.isDirectory()){
			File [] list = fs2.listFiles();
			UseFile.showListFile(list);
		}
	}
	
	static void showListFile(File [] list){
		
		 for(int i = 0; i < list.length; i++){
			 if(list[i].isDirectory()){
				 System.out.println("======="+list[i].listFiles().length+"========");
				 UseFile.showListFile(list[i].listFiles());
			 }else{
				 System.out.println(list[i]);
			 }
		 }
		
	}

}
