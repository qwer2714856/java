package luchao;
/**
 * ������ı�Ҫ��
 * @author ding.luchao
 *
 */

public class abstracts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A s = new Cats6();
		s.say();
	}

}
//����һ����ȷ��������
abstract class A{
	String name;
	int age;
	//��ȷ���ķ���,���һֱ�����ã����ิд����
	abstract public void say();
}

class Cats6 extends A{
	public void say(){
		System.out.println("--");
	}
}
class Dogs6 extends A{
	public void say(){
		
	}
}
