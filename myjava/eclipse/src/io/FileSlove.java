package io;
import java.io.*;
/**
 * �ļ�ϵͳ���Խ��������
 * �ļ�����ͨ���ֽ�����һ���ط�����������һ���ط�
 * ���������ͬʱ��
 * @author Administrator
 *
 */
public class FileSlove {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ƚ��ļ�д�뵽�ڴ棬Ȼ���ڻ�д
		//���������
		FileInputStream fis = null;
		//��������
		FileOutputStream fos = null;
		//ÿ�ζ�ȡ�Ĵ�С
		byte []bytes = new byte[1024];
		//ÿ�ζ�ȡ��λ��
		int n = 0;
		//��Դ·��
		String fromPath = "tp\\bz.png";
		//File fileForm = new File(fromPath);
		//��Ŀ¼
		String toPath = "d:\\bzs.png";
		//File fileTo = new File(toPath);

		
		try {
			//������
			fis = new FileInputStream(fromPath);
			//д��ָ���ĵط�ȥ
			fos = new FileOutputStream(toPath,true);
			try {
				//ȫ��������
				while( (n=fis.read(bytes)) != -1){
					fos.write(bytes);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		 
		
		
	}

}
