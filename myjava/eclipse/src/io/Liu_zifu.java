package io;
import java.io.*;
/**
 * 使用字符流拷贝文件
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
			//一次读十个--这里有个问题如果这里定义的很大而文件很小就会出现读取的内容有其它字符补缺。
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
