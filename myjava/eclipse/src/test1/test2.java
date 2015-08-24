package test1;
import java.io.*;
public class test2 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader s = new BufferedReader(a);
		String str = s.readLine();
		System.out.println(str);
		}
		catch(Exception e){
			System.out.println(e.getStackTrace());
		}
	}

}

class hi{
	final int a = 1;
	final public void say(){
		
	}
}
class his extends hi{
	 
}