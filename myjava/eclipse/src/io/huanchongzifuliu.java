package io;
import java.io.*;
/**
 * �����ַ���
 * BufferedReader 
 * BufferedWriter
 * ���������ǻ����������Ա������������File����
 * ֱ�Ӳ���string
 * @author Administrator
 *
 */
public class huanchongzifuliu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			//�ȴ���FileReader,FileWriter
			br = new BufferedReader(new FileReader("test.txt"));
			bw = new BufferedWriter(new FileWriter("d:\\test.txt"));
			
			String s = "";
			//�������з���ֱ�ӾͶ�һ����Ϊ������ʶ���з�������Ҫ��Ĭ�ϲ���һ�����з���
			while((s=br.readLine()) != null){
				bw.write(s+"\r\n");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
