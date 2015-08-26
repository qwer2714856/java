package array;
import java.util.*;
public class arrayObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个对象数组
		Dog [] a = new Dog[10];
		Dog b [] = {new  Dog()};

		a[0] = new Dog();
		//System.out.println("aa" + (1+1));
		//System.out.println("aa".equals("aa"));
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("aa");
		list.remove(0);
		System.out.println();
		
		 
	}
	
}
class Dog{
	private String name;
	private float tzL;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getTzL() {
		return tzL;
	}
	public void setTzL(float tzL) {
		this.tzL = tzL;
	}
}