package io;
import java.io.*;
/**
 * 缓冲字符流
 * BufferedReader 
 * BufferedWriter
 * 它们两个是缓冲区，所以必须借助其它的File对象
 * 直接操作string
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
			//先创建FileReader,FileWriter
			br = new BufferedReader(new FileReader("test.txt"));
			bw = new BufferedWriter(new FileWriter("d:\\test.txt"));
			
			String s = "";
			//不读换行符号直接就读一行因为它不认识换行符所以需要在默认补上一个换行符号
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
