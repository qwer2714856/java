/*
 * 判断两个数是否可以整出
 * ding.luchao
 * 20150821
 */
//导入包
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.String;

public class qumo{
    public static void main(String []args){
        int a = 2;
	int b = 2;
	int x = 1;
	if(a % b == 0){
            System.out.println("ok");
	}else{
	    System.out.println("bad");
	}
	int q = (x--);
	System.out.println(q);

	try{
            //输入流，从键盘接收数 System.in代表标准输入键盘
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);

	    //给出提示
	    System.out.println("请输入第一个数");
	    //从控制台读取一行数据
	    String al = br.readLine();
	    System.out.println("请输入第二个数");
	    String a2 = br.readLine();

	    //把String->float
	    float d = Float.parseFloat(al);
	    float d1 = Float.parseFloat(a2);
	    System.out.println(d+d1);

	}catch(Exception e){
           e.printStackTrace();
	}
    }
}
