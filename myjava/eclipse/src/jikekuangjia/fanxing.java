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
		//���뵽������
		dogList.add(dog1);
		//ȡע�������и�ǿת�Ķ���,�����ǿת�ͱ�����,�����и���ȫ������
		Dog tmp = (Dog)dogList.get(0);
		//ע�⿴�����ȫ����
		/*Exception in thread "main" java.lang.ClassCastException: jikekuangjia.Dog cannot be cast to jikekuangjia.Cat
	at jikekuangjia.fanxing.main(fanxing.java:17)*/
		//�����ʱ��֪���ŵ���ʲô�����������оͱ�����
		Cat cat1 = (Cat)dogList.get(0);//��������û������ģ�����������лᱨ������ת��ʧ�ܣ�Ϊʲô����Ϊ��ǿתè��
		
		//��������������÷���
		//���������Ϊ ArrayList<Dog> dogList = new ArrayList<Dog>();
		//��ôCat cat1 = (Cat)dogList.get(0);�ͻᱨ��
		//��<����>�� ������Ƿ���
		//Dog tmp = dogList.get(0); ����Ҳ����(Dog)ǿת�ˡ�
		
		
		
		
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