package io;
import java.io.*;
public class Myselfwriteliu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("d:\\history.txt");
		//创建一个助手帮着读取
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			//创建一个容器一次读入的容器，否则一下子读进内存就爆了。
			byte []bytes = new byte[1024];//一下子进1024字节
			//创建一个实际读取的量
			int n = 0;
			try {
				while( (n=fis.read(bytes)) != -1  ){
					//输出
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
			//关闭文件流必须放这
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
