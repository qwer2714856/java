/*
 * class
 */
//定义一个类
//一定明确一个问题是我认为一个对象抽象成类要有什么，全世界可能有多个人抽象类，所以说是我认为。 


class Cat{
    //类的成员属性
    int age;
    String name;
    String color;
    //类成员方法
    public void count(){
        int result = 0;
	for(int i = 1; i <= 1000; i++){
	    //System.out.println(result);
            result += i;
	}

	System.out.println(result);
    }
    public int count(int a){
	return 1;
    }
    public float add3(int a, float b){
	return a + b;
    }
}

public class object{
    public static void main(String []args){
	//对象是一个数据类型是复合数据类型
	Cat cat1 = new Cat();
        cat1.age = 3;
	cat1.name = "小花";
	cat1.color = "白色";
	
	//创建第二只猫
	Cat cat2 = new Cat();
	cat2.age = 100;
	cat2.name = "aa";
	cat2.color = "red";
        
	cat1.count();
	float s = cat1.add3(1,1.1F);
	
    }
}
