package io;
import java.io.*;
/**
 * ʹ���ַ��������ļ�
 * FileReader
 * FileWriter
 * @author Administrator
 *
 */
public class Liu_zifu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fromPath = "test.txt";
		String toPath = "d:\\test.txt";
		
		FileReader fd = null;
		FileWriter fw = null;
		
		try {
			fd = new FileReader(fromPath);
			fw = new FileWriter(toPath);
			//һ�ζ�ʮ��--�����и�����������ﶨ��ĺܴ���ļ���С�ͻ���ֶ�ȡ�������������ַ���ȱ��
			char []c = new char[10];
			int n = 0;
			while((n = fd.read(c)) != -1){
				fw.write(c);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fd.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
	}

}
