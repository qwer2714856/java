package luchao;
/**
 * 多态
 * @author ding.luchao
 *
 */
public class duotai {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Cat2 cat = new Cat2();
		cat.say();
		Dog2 dog = new Dog2();
		dog.say();*/
		//多态
		//Animals的引用创建Cat2的实例
		//an 这个一会是猫一会是狗，是根据赋予它的实例决定的。 
		//继承了Animals的子类都可以复写父类方法通过父类的引用实例化子类进而调用它们。
		Animals an = new Cat2();
		an.say();//这个时候实际上调用的是猫的方法
		an = new Dog2();
		an.say();
	}

}
class Animals{
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
	private String name;
	private int age;
	
	public void say(){
		System.out.println("不知道怎么叫");
	}
}

class Cat2 extends Animals{
	public void say(){
		System.out.println("猫叫");
	}
}

class Dog2 extends Animals{
	public void say(){
		System.out.println("狗叫");
	}
}