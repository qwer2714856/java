package io;
import java.io.*;
public class Liuoutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fos = null;
		try {
			//ÿд���Ḳ�� �س�����
			String str = bf.readLine() + "\r\n";
			
			File fs = new File("d:\\admin.txt");
			//��һ��true��ʾ׷��д������Ǹ���д��
			fos = new FileOutputStream(fs,true);
			 
			fos.write(str.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bf.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
