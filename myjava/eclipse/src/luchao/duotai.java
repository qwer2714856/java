package luchao;
/**
 * ��̬
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
		//��̬
		//Animals�����ô���Cat2��ʵ��
		//an ���һ����èһ���ǹ����Ǹ��ݸ�������ʵ�������ġ� 
		//�̳���Animals�����඼���Ը�д���෽��ͨ�����������ʵ������������������ǡ�
		Animals an = new Cat2();
		an.say();//���ʱ��ʵ���ϵ��õ���è�ķ���
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
		System.out.println("��֪����ô��");
	}
}

class Cat2 extends Animals{
	public void say(){
		System.out.println("è��");
	}
}

class Dog2 extends Animals{
	public void say(){
		System.out.println("����");
	}
}