package luchao;
/**
 * ��̬���ۺ�����
 * @author ding.luchao
 *
 */
public class duotai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master m = new Master();
		m.w(new Dog4(), new gt());
	}

}
class Animals3{
	String name;
	int age;
	public void eat(Food zl){
		System.out.println("�ҳ�"+zl.getZl());
	}
}

class Cat4 extends Animals3{
	public void eat(Food zl){
		System.out.println("è��"+zl.getZl());
	}
}
class Dog4 extends Animals3{
	public void eat(Food zl){
		System.out.println("����"+zl.getZl());
	}
}


class Food{
	String name;
	public String getZl(){
		return "";
	}
}

class fash extends Food{
	public String getZl(){
		return "����";
	}
}
class gt extends Food{
	public String getZl(){
		return "��ͷ��";
	}
}


class Master{
	public void w(Animals3 a, Food b){
		a.eat(b);
	}
}