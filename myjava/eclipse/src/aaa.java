
public class aaa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child a = new child();
		System.out.println(a.a);
	}

}
class parent{
	int a = 1;
	public parent(int a){
		this.a = a;
	}
}
class child extends parent{
	public child(){
		super(10);
	}
}