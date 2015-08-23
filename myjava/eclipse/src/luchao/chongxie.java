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
		System.out.println("На");
	}
	
}
//УЈУЈНа
class Cat extends Animal{
	public void jiao(){
		System.out.println("пїпї");
	}
	
}
//ЭєЭєНа
class Dog extends Animal{
	public void jiao(){
		System.out.println("ЭњЭњ");
	}
}
 
