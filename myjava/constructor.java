/**
 * 构造函数
 * this
 * 类变量
 * 类方法
 * 多态
 * 继承
 * 封装
 * 抽象
 * ding.luchao
 * 20150822
 */
public class constructor{
    public static void main(String []args){
	Parse a = new Parse(1,1.1F);
	System.out.print(Parse.total);
    }
}
class Parse{
    public static int total = 0;
    public Parse(int a){
	
	System.out.println("a");
    }
    public Parse(int a, float b){
	Parse.total++;

	System.out.println("b");
    }
}
