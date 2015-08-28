package jikekuangjia;
import java.util.*;
import java.io.*;
public class yuangongxitong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		String input = "";
		 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(!input.equals("q")){//是否要退出
			try{
				System.out.println("请输入员工编号");
				String n = in.readLine();
				System.out.println("请输入员工姓名");
				String name = in.readLine();
				System.out.println("请输入员工工资");
				String pay = in.readLine();
				System.out.println("请输入员工年龄");
				String age = in.readLine();
				
				 list.add(new Worker(Integer.parseInt(n), name, Integer.parseInt(age), Float.parseFloat(pay)));
				
				 System.out.println("员工数量："+list.size());
				 
				 System.out.println("如果想退出输入q");
			     input = in.readLine();
			     
			}catch(Exception e){
				System.out.println(e.getStackTrace());
			}
			
		}
		
		System.out.println("成功退出系统!!!");
		
		int len = list.size();
		for(int i=0; i<len; i++){
			Worker result = (Worker)list.get(i);
			System.out.println(result.getAge()+result.getName());
			list.remove(i);
		}
		System.out.println("清除后员工数量："+list.size());
		
		
	}

}
class Worker{
	private String name;
	private int age;
	private float pay;
	private int num;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
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
	
	public Worker(int num, String name, int age, float pay){
		this.num = num;
		this.name = name;
		this.age = age;
		this.pay = pay;
	}
	
}