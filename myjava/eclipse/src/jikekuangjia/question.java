package jikekuangjia;
import java.util.*;
public class question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����Ƕ����ģ������޷����������Ĵ�С��
		Yg yg[] = new Yg[10];//���ھ���������ⶨС�˲����ô����˷�
		yg[0] = new Yg("ding.luchao", 28, 85.2F);
		
		//�ü������OK��
		//���������Ҳ���㲻�˾ʹ��������ˣ�ǿ�ҽ���ѧ����
		//--------------List�ṹ------------
		//ArrayList
		//LinkedList
		//Vector
		//Stack
		//---------------Map�ṹ------------
		//HashMap
		//HashTable
		//---------------Set�ṹ------------
		//HashSet
		//TreeSet
		//---------------Queue�ṹ����
		//Queue
		//���������ɾ�Ĳ�
		
		//����ArrayList ����
		ArrayList a = new ArrayList();
		//��ArrayList ���һ�����ݣ�������object,�������κε�object���͡�
		//����һ��ְԱ
		Yg firstYg = new Yg("ding.luchao", 29, 38.5F);
		//��firstYg ���뵽a��ȥ ����addȥ���ĵ���Ĭ�ϲ鵽β��
		a.add(firstYg);
		//�����и�����˵���£�a.add(firstYg)��������a�Ķ����������¿�����һ����firstYg��С�����򣬶��Ǵ����ָ��firstYg�����õ�ַ��
		
		//��η���ArrayList������
		Yg as = (Yg)a.get(0);//��Ϊ���ص���Object������Ҫǿתһ��	
		System.out.println(as.getName());
		
		//�ɲ����Է���ͬ���Ķ����ǿ��Ե�
		
		//ɾ��һ������
		a.remove(0);
		
		//��ʾ��С ��ʾ����
		System.out.println(a.size());
	}

}

class Yg{
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

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	private int age;
	private float sal;
	
	public Yg(String name, int age, float sal){
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
}
