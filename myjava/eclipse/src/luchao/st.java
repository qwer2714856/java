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

//������������ȡ����
class student{//����
	protected String name;
	protected int age;
	protected float fee;
	int l;
	protected String getName(){
		return this.name;
	}
}

//Сѧ��
class xiaoxuesheng extends student{
    public void pay(float fee){
    	this.fee = fee;
    }
}
//��ѧ��
class zhongxuesheng extends student{
    public void pay(float fee){
    	this.fee = fee * 0.8F;
    }
}
//��ѧ��
class daxuesheng extends student{
    public void pay(float fee){
    	this.fee = fee * 0.5F;
    }
}
