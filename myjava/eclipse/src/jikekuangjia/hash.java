package jikekuangjia;
import java.util.*;
public class hash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap();
		
		Emp emp1 = new Emp("ding.luchao",26,22.5f,001);
	  
		//��emp1����hashMap����
		//key value
		//value����emp1����
		hm.put(emp1.getName(), emp1);
		//ע������е���Ҫ˵����arraylist���������ͬ�������ǲ��Ḳ�ǵģ���HashMap���������ͬ��key �ǻط������ǵ�
		//key��Ψһ��
		hm.put(emp1.getName(), emp1);
		//����ding.luchao������
		if(hm.containsKey(emp1.getName())){
			System.out.println("exists");
			//ȡ������
			Emp getEmp = (Emp)hm.get(emp1.getName());
			System.out.println(getEmp.getAge()+"--"+hm.size());
		}
		//����HashMap
		//������ 
		Iterator it = hm.keySet().iterator();
		//�Ƿ������һ��
		while(it.hasNext()){
			//ȡ��key
			String key = it.next().toString();
			Emp tmp = (Emp)hm.get(key);
			System.out.println(tmp.getAge());
		}
	}
}
class Emp{
	private String name;
	private int age;
	private float pay;
	private int num;
	
	public Emp(String name, int age, float pay, int num){
		this.name = name;
		this.age = age;
		this.pay = pay;
		this.num = num;
	}
	
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
	public float getPay() {
		return pay;
	}
	public void setPay(float pay) {
		this.pay = pay;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}