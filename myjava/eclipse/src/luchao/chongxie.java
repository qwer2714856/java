package luchao;

public class chongxie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat l = new Cat();
		l.jiao();
	}

}
class Animal{
	int age;
	String name;
	//jiao 
	public void jiao(){
		System.out.println("��");
	}
	
}
//èè��
class Cat extends Animal{
	public void jiao(){
		System.out.println("����");
	}
	
}
//������
class Dog extends Animal{
	public void jiao(){
		System.out.println("����");
	}
}
 
