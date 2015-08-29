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
	  
		//将emp1放入hashMap里面
		//key value
		//value就是emp1对象
		hm.put(emp1.getName(), emp1);
		//注意这个有点是要说明的arraylist如果放入相同的内容是不会覆盖的，而HashMap如果放入相同的key 是回发生覆盖的
		//key是唯一的
		hm.put(emp1.getName(), emp1);
		//查找ding.luchao的数据
		if(hm.containsKey(emp1.getName())){
			System.out.println("exists");
			//取出数据
			Emp getEmp = (Emp)hm.get(emp1.getName());
			System.out.println(getEmp.getAge()+"--"+hm.size());
		}
		//遍历HashMap
		//迭代器 
		Iterator it = hm.keySet().iterator();
		//是否存在下一个
		while(it.hasNext()){
			//取出key
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