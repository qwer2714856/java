package jikekuangjia;
import java.util.*;
public class fanxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList dogList = new ArrayList();
		Dog dog1 = new Dog();
		//放入到集合中
		dogList.add(dog1);
		//取注意这里有个强转的动作,如果不强转就报错了,这里有个安全隐患。
		Dog tmp = (Dog)dogList.get(0);
		//注意看这个安全隐患
		/*Exception in thread "main" java.lang.ClassCastException: jikekuangjia.Dog cannot be cast to jikekuangjia.Cat
	at jikekuangjia.fanxing.main(fanxing.java:17)*/
		//编译的时候不知道放的是什么玩意所以运行就报错了
		Cat cat1 = (Cat)dogList.get(0);//这样看是没有问题的，但是如果运行会报出类型转换失败，为什么，因为狗强转猫。
		
		//解决这个问题可以用泛型
		//如果声明改为 ArrayList<Dog> dogList = new ArrayList<Dog>();
		//那么Cat cat1 = (Cat)dogList.get(0);就会报错
		//“<类型>” 这个就是泛型
		//Dog tmp = dogList.get(0); 这里也不用(Dog)强转了。
		
		
		
		
	}

}
class Cat{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	private String color;
}
class Dog{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	
}