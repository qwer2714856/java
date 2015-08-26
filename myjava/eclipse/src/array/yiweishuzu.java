/**
 * 数组的必要性
 */
package array;

public class yiweishuzu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a[] = new float[6];
		float c[] = {1};	
		for(int i = 0; i < 6; i++){
			a[i] = i;
		}
		float sum = 0;
		for(int i = 0; i < 6; i++){
			sum += a[i];
		}
		System.out.println("sum=" + sum + "avg=" + sum/6 + "length=" + a.length);
	}

}
