package array;

public class ÅÅÐò¶ÔÏó²âÊÔ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N []list = new N[100];
		for(int i = 99; i >= 0; i--){
			list[i] = new N(i, Math.random());
		}
		MPx a = new MPx();
		a.px(list);
	}

}
class N{
	int i = 0;
	double d = 0d;
	public N(int i, double d){
		this.i = i;
		this.d = d;
	}
}
class MPx{
	public void px(N[] a){
		for(int i = 1; i < a.length; i++){
			N insertNode = a[i];
			int prev = i - 1;
			while(prev >= 0 && insertNode.d > a[prev].d){
				a[prev+1] = a[prev];
				prev --;
			}
			a[prev+1] = insertNode;
		}
		for(int i = 1; i < a.length; i++){
			System.out.println(a[i].i+"--"+a[i].d);
		}
		
	}
}