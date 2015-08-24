package test1;

public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface fash{
	public void swing();
}

interface Bird{
	public void fly();
}

class mk{
	int name;
	public void jump(){
		System.out.println("mk jump");
	}
	
}
class SmallMk extends mk implements fash,Bird{

	@Override
	public void swing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	 
	 
}
