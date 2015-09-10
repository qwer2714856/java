package io;
import java.io.*;
/**
 * 文件对象的使用
 * 1.file类的基本用法
 * @author Administrator
 *
 */
public class UseFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//路径 \\ 或者 /
		//文件对象--如果文件不存在不会有异常
		File f = new File("a.jpg");
		//得到文件的路径
		System.out.println("文件全路径："+f.getAbsolutePath());
		//文件大小 字节为单位
		System.out.println("文件大小："+f.length());
		//文件的读写执行 的权限，如果符合就返回true
		//文件的权限 读
		System.out.println("文件的权限："+f.canRead());
		//文件的权限 写
	    System.out.println("文件的权限："+f.canWrite());
		//文件的权限 执行
		System.out.println("文件的权限："+f.canExecute());
		
		//文件和文件夹的创建
		//创建文件
		//filePath
		String filePath = "d:\\fileSystem.txt";
		/*String [] a = filePath.split("\\\\");
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		System.exit(0);*/
		
		/*File fs = new File(filePath);
		//判断文件是否存在
		if(!fs.exists()){
			//创建
			try {
				fs.createNewFile();//直接就创建了你上面构造方法里面的那个
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//创建文件夹
		File fsDir = new File("d:\\fileSystem");
		if(!fsDir.isDirectory()){
			fsDir.mkdir();
		}*/
		
		
		//列出一个文件夹下面的所有文件
		File fs2 = new File("D:\\java_android");
		if(fs2.isDirectory()){
			File [] list = fs2.listFiles();
			UseFile.showListFile(list);
		}
	}
	
	static void showListFile(File [] list){
		
		 for(int i = 0; i < list.length; i++){
			 if(list[i].isDirectory()){
				 System.out.println("======="+list[i].listFiles().length+"========");
				 UseFile.showListFile(list[i].listFiles());
			 }else{
				 System.out.println(list[i]);
			 }
		 }
		
	}

}
