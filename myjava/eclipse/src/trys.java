import java.io.*;
import java.net.*;
public class trys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//检查性异常这个不是程序的错，因为例如网络连不通，文件打不开等等
		//而很可能是远程的修改等等
		//打开一个不存在的文件
		//编译器很聪明，它在想它如果找不到这个文件怎么办，所以它要求你处理如果找不到的异常。
		//这种就是检查性异常，编译期就报错了。
		//FileReader fr = new FileReader("d:\a.txt");
		//连接IP
		//他认为你可能写错了所以你要处理
		//Socket sock = new Socket("127.0.0.1", 80);
		//编译器先期可以预见的异常
		
		
		
		//运行异常--只有在运行的时候才能知道 必须处理
		//例如数组越界，0被除
		//int a = 4 / 0;//代码没有错运行起来就报错了
		/*Exception in thread "main" java.lang.ArithmeticException: / by zero
	at trys.main(trys.java:25)*/
		//int [] as = new int[10];//数组越界
		//System.out.println(as[100]);
		/*
		 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100
	at trys.main(trys.java:29)
		  */
		
		
		//真正的错误，源于程序的BUG可能程序耗尽了。
		//例如程序排序，调内存这个时候内存耗尽。
		//最不好调的，有的跟环境有很大关系，死活起不来，有的被外部环境挡死，杀毒软件等等。
		
		
		
		//捕获异常 的解决方案
		//当程序错误的点开始中断
		//解决
		//1.try catch
		//2.使用 throw扔给调用者
		try{
			
		}catch(Exception e){
			
		}

	}

}
