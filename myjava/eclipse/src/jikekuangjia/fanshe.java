package jikekuangjia;
import java.lang.reflect.Method;
import java.util.*;
public class fanshe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Float> ay = new ArrayList<Float>();
		Gen<Integer> gen = new Gen<Integer>(2);
		gen.getC();
	
	}

}
//定义个一个类  <T>是个类型，但是不知道具体是个什么类型
class Gen<T>{
	private T c;
	public Gen(T str){
		this.c = str;
	}
	//得到T类型的名称
	public void getC(){
		System.out.println(this.c.getClass().getName());
		//得到的是一个Integer类里面的方法
		Method [] a = this.getClass().getMethods();
		//打印
		for(int i=0; i<a.length; i++){
			System.out.println("方法"+a[i].getName());
		}
	}
}