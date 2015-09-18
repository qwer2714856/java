package array;

import java.util.Calendar;

public class 排序联系 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义数据源
		int len = 5;
		double [] data = new double[len];
		for(int i = 0; i < len; i++){
			 data[i] = Math.random();
		}
		
		MyselfPxLx a = new MyselfPxLx();
		//冒泡排序
		Calendar c = Calendar.getInstance();
		long l = c.getTimeInMillis();
		//a.mp(data);
		a.xz(data);
		//a.quick(data, 0, data.length - 1);
		//a.insertPx(data);
		a.printArray(data);
		Calendar c1 = Calendar.getInstance();
		long l2 = c1.getTimeInMillis();
		System.out.println(l2 - l);
	}

}
class MyselfPxLx{
	public void mp(double [] a){
		int len = a.length;
		for(int i = 0; i < len - 1; i++){
			for(int j = 0; j < len - 1 - i; j++){
				if(a[j]>a[j+1]){
					double tmp = a[j];
					a[j] = a[j+1]; 
					a[j+1] = tmp;
				}
			}
		}
		
		
	}
	public void xz(double []a){
		int len = a.length;
		double d = 0.0d;
		int idex = 0;
		for(int i = 0; i < len - 1; i++){
			d = a[i];
			idex = i;
			for(int j = i+1; j < len; j++){
				if(d < a[j]){
					d = a[j];
					idex = j;
				}
			}
			//交换
			if(idex != i){
				double tmp = a[i];
				a[i] = a[idex];
				a[idex] = tmp;
			}
		}
	}
	
	public void quick(double [] a, int min, int max){
		int i = min;
		int j = max;
		double m = a[(int)((i+j)/2)];
		while(i < j){
			//从左向右找比中间值小的
			while(a[i] < m)i++;
			while(a[j] > m)j--;
			if(i >= j)break;
			double tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		}
		if(i == j){
			i++;
			j--;
		}
		if(min < j){
			quick(a, min, j);
		}
		if(i < max){
			quick(a, i, max);
		}
	}
	
	
	public void insertPx(double []a){
		int len = a.length;
		double insertNode = 0d;
		for(int i = 1; i < len; i++){
			int prev = i - 1;
			insertNode = a[i];
			while(prev >=0 && insertNode > a[prev]){
				a[prev+1] = a[prev];
				prev--;
			}
			a[prev + 1] = insertNode;
		}
	}
	
	public void printArray(double []a){
		int len = a.length;
		for(int i = 0; i < len; i++){
			System.out.println(a[i]);
		}
	}
}