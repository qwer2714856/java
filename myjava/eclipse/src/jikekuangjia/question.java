package jikekuangjia;
import java.util.*;
public class question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组是定长的，所以无法的伸缩他的大小。
		Yg yg[] = new Yg[10];//现在就是这个问题定小了不够用大了浪费
		yg[0] = new Yg("ding.luchao", 28, 85.2F);
		
		//用集合类就OK了
		//如果集合类也满足不了就带用链表了，强烈建议学链表。
		//--------------List结构------------
		//ArrayList
		//LinkedList
		//Vector
		//Stack
		//---------------Map结构------------
		//HashMap
		//HashTable
		//---------------Set结构------------
		//HashSet
		//TreeSet
		//---------------Queue结构集合
		//Queue
		//集合类的增删改查
		
		//定义ArrayList 对象
		ArrayList a = new ArrayList();
		//向ArrayList 添加一个数据，类型是object,可以是任何的object类型。
		//创建一个职员
		Yg firstYg = new Yg("ding.luchao", 29, 38.5F);
		//将firstYg 加入到a中去 关于add去看文档，默认查到尾部
		a.add(firstYg);
		//这里有个概念说明下，a.add(firstYg)并不是在a的队列里面重新开辟了一块存放firstYg大小的区域，而是存放了指向firstYg的引用地址。
		
		//如何访问ArrayList的数据
		Yg as = (Yg)a.get(0);//因为返回的是Object所以需要强转一下	
		System.out.println(as.getName());
		
		//可不可以放入同样的对象，是可以的
		
		//删除一个对象
		a.remove(0);
		
		//显示大小 显示长度
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
