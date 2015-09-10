package io;
import java.io.*;
/**
 * 流
 * 演示FileInputStream
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
		//因为file没有读写的能力所以需要使用inputStream流
		//使用FileInputStream来帮助读取资源
		FileInputStream fis = null;
		try {
			//打开一个流
			fis = new FileInputStream(fs);
			//定义一个字节数组，如果文件很大，没办法一下全部进内存否则一下就爆了，要一点点进来，缓一下，就像是在喝水一口口喝不能一下子都喝掉。
			byte [] bytes = new byte[1024];
			//得到实际读取到的字节数，文件1字节怎么能读1024所以n是实际读取的数量了。
			int n = 0;
			
			//循环读取
			try {
				while((n = fis.read(bytes)) != -1){
					//把字节转string
					String s = new String(bytes, 0, n);
					System.out.println(s);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//关闭流
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
