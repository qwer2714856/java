package luchao;
/**
 * 抽象类的必要性
 * @author ding.luchao
 *
 */

public class abstracts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A s = new Cats6();
		s.say();
	}

}
//存在一个不确定性因素
abstract class A{
	String name;
	int age;
	//不确定的方法,这个一直不会用，子类复写它。
	abstract public void say();
}

class Cats6 extends A{
	public void say(){
		System.out.println("--");
	}
}
class Dogs6 extends A{
	public void say(){
		
	}
}
