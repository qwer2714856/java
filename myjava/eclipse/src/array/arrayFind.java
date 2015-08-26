package array;

public class arrayFind {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ef e = new Ef();
		e.ef();
	}

}
class Ef{
	public void ef(){
		
		int rs;
		int ay [] = {1,2,3,4,5,8};
		rs = this.find(0, ay.length - 1, ay, 2);
		System.out.println(rs);
	}
	private int find(int l, int r, int arr [], int val){
		 
		 
		int m = (l+r)/2;
		int rs = -1;
		int rs2 = val - arr[m];
				
		 
		if(rs2 > 0 && r != m){
			rs = this.find(++m, r, arr, val);
		}else{
			if(rs2 < 0 && l != m){
				rs = this.find(l, m, arr, val);
			}
		}
	
		 
		if(rs2 == 0){
			rs = m;
		}
		
		
		return rs;
	}
}