package io;
import java.io.*;
/**
 * ��
 * ��ʾFileInputStream
 * @author Administrator
 *
 */
public class Liu_input {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fs = new File("d:\\h5ide.rar");
		//��Ϊfileû�ж�д������������Ҫʹ��inputStream��
		//ʹ��FileInputStream��������ȡ��Դ
		FileInputStream fis = null;
		try {
			//��һ����
			fis = new FileInputStream(fs);
			//����һ���ֽ����飬����ļ��ܴ�û�취һ��ȫ�����ڴ����һ�¾ͱ��ˣ�Ҫһ����������һ�£��������ں�ˮһ�ڿںȲ���һ���Ӷ��ȵ���
			byte [] bytes = new byte[1024];
			//�õ�ʵ�ʶ�ȡ�����ֽ������ļ�1�ֽ���ô�ܶ�1024����n��ʵ�ʶ�ȡ�������ˡ�
			int n = 0;
			
			//ѭ����ȡ
			try {
				while((n = fis.read(bytes)) != -1){
					//���ֽ�תstring
					String s = new String(bytes, 0, n);
					System.out.println(s);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//�ر���
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
