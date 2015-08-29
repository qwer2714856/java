package jikekuangjia;
import java.util.*;
public class other {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*LinkedList a = new LinkedList();
		a.addFirst(new t());
		System.out.println(a.size());*/		
		//Vector vc = new Vector();
		t t1 = new t();
		t1.a = 11;
		t t2 = new t();
		t2.a = 22;
		
		Stack s = new Stack();
		s.add(t1);
		s.add(t2);
		s.remove(1);
		System.out.println(((t)s.get(0)).a);
		
	}

}
class t{
	public int a=1;
}