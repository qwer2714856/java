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
		//最大捕获，不关什么错误多都让Exception来捕获，常用！
		/*try{
			FileReader fr = new FileReader("d:/a.txt");
		}catch(Exception e){//这是个最大捕获,不关什么异常统统让catch捕获
			//输出异常信息，易于排错
			//e.getMessage 输出错误信息 需要System.out.println
			//e.printStackTrace() 直接就输出错误信息
			
		}*/
		
		//最小捕获,不用大Exception而是用对应的错误捕获,有什么异常就捕获什没异常。	
		/*try {
			FileReader fr = new FileReader("d:/a.txt");
			Socket sock = new Socket("127.0.0.1", 80);
		} catch (FileNotFoundException e) {//最小捕获针对一种错误如果里面还有其他错误，这种捕获是不够的
			// TODO: handle exception
			e.printStackTrace();
		} catch(IOException e){//多种错误如果要用最小的精确捕获，就需要使用多个catch来分别捕获。
			e.printStackTrace();
		}*/
	
		//建议不用分着么细致,直接用Exception捕获所有的。

		//finally
		FileReader fr = null;
		try {
			fr = new FileReader("d:/a.txt");
		} catch (Exception e) {
			// TODO: handle exception
		} finally{//不关是不是出现了异常统统走这个，这个作用很显而易见，一般说把需要关闭的资源，【文件，内存，数据库等等】。
			 if(fr != null){
				 try{
					 fr.close();//关闭资源是必须的不关是否成功
				 }catch(Exception e){
					 
				 }
			 }
		}
		
		//try catch finally 不一定要三者都必须出现
		//一般必须这三者一起出现
		
		//以下几个情况finally 不一定被执行
		//finally 块中发生了异常
		//程序所在的线程死亡
		//在代码中使用Systen.exit(Number)
		//关闭cpu
		
		
		
		
		
	}
}
class test{
		//抛给调用者 -- throws Exception
		//谁调用test类的hi方法，谁就要负责解决它
	    //如果调用者都不想关这个异常就交给虚拟机了
		public void hi() throws Exception
		{
			FileReader fr = new FileReader("d:/a.txt");
		}
}

//如果 printStackTrace()报出了很多错误注意第一个开始报错的位置，因为其他很可能是调用它出了错误
