package io;
import java.io.*;
public class Myselfwriteliu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("d:\\history.txt");
		//����һ�����ְ��Ŷ�ȡ
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			//����һ������һ�ζ��������������һ���Ӷ����ڴ�ͱ��ˡ�
			byte []bytes = new byte[1024];//һ���ӽ�1024�ֽ�
			//����һ��ʵ�ʶ�ȡ����
			int n = 0;
			try {
				while( (n=fis.read(bytes)) != -1  ){
					//���
					String s = new String(bytes, 0, n);
					System.out.println(s);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//�ر��ļ����������
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
