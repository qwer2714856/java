/*
 * class
 */
//����һ����
//һ����ȷһ������������Ϊһ������������Ҫ��ʲô��ȫ��������ж���˳����࣬����˵������Ϊ�� 


class Cat{
    //��ĳ�Ա����
    int age;
    String name;
    String color;
    //���Ա����
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
	//������һ�����������Ǹ�����������
	Cat cat1 = new Cat();
        cat1.age = 3;
	cat1.name = "С��";
	cat1.color = "��ɫ";
	
	//�����ڶ�ֻè
	Cat cat2 = new Cat();
	cat2.age = 100;
	cat2.name = "aa";
	cat2.color = "red";
        
	cat1.count();
	float s = cat1.add3(1,1.1F);
	
    }
}
