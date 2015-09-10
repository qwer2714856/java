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
			//每写都会覆盖 回车符号
			String str = bf.readLine() + "\r\n";
			
			File fs = new File("d:\\admin.txt");
			//加一个true表示追加写入而不是覆盖写入
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
