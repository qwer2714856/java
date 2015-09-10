package io;
import java.io.*;
/**
 * 文件系统可以解决的问题
 * 文件拷贝通过字节流从一个地方拷贝到另外一个地方
 * 输入输出流同时用
 * @author Administrator
 *
 */
public class FileSlove {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//先将文件写入到内存，然后在回写
		//输入流句柄
		FileInputStream fis = null;
		//输出流句柄
		FileOutputStream fos = null;
		//每次读取的大小
		byte []bytes = new byte[1024];
		//每次读取的位置
		int n = 0;
		//来源路径
		String fromPath = "tp\\bz.png";
		//File fileForm = new File(fromPath);
		//到目录
		String toPath = "d:\\bzs.png";
		//File fileTo = new File(toPath);

		
		try {
			//读出来
			fis = new FileInputStream(fromPath);
			//写到指定的地方去
			fos = new FileOutputStream(toPath,true);
			try {
				//全部读出来
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
