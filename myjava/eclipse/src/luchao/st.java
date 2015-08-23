package luchao;

public class st {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xiaoxuesheng x = new xiaoxuesheng();
		System.out.println(x.getName()+x.l);
	}

}

//抽象共有属性提取出来
class student{//父类
	protected String name;
	protected int age;
	protected float fee;
	int l;
	protected String getName(){
		return this.name;
	}
}

//小学生
class xiaoxuesheng extends student{
    public void pay(float fee){
    	this.fee = fee;
    }
}
//中学生
class zhongxuesheng extends student{
    public void pay(float fee){
    	this.fee = fee * 0.8F;
    }
}
//大学生
class daxuesheng extends student{
    public void pay(float fee){
    	this.fee = fee * 0.5F;
    }
}
