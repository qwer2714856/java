package jikekuangjia;
import java.lang.reflect.Method;
import java.util.*;
public class fanshe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Float> ay = new ArrayList<Float>();
		Gen<Integer> gen = new Gen<Integer>(2);
		gen.getC();
	
	}

}
//�����һ����  <T>�Ǹ����ͣ����ǲ�֪�������Ǹ�ʲô����
class Gen<T>{
	private T c;
	public Gen(T str){
		this.c = str;
	}
	//�õ�T���͵�����
	public void getC(){
		System.out.println(this.c.getClass().getName());
		//�õ�����һ��Integer������ķ���
		Method [] a = this.getClass().getMethods();
		//��ӡ
		for(int i=0; i<a.length; i++){
			System.out.println("����"+a[i].getName());
		}
	}
}