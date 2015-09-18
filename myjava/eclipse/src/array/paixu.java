package array;
import java.util.*;
public class paixu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Px p = new Px();
		//获取时间
		//单实例
		//获取时间
		Calendar c1 = Calendar.getInstance();
		long c1s = c1.getTimeInMillis();
		p.Ks(100000);
		//p.Cr(100000);
		//p.mp(100000);
		//p.ks(100000);
		//获取时间
		Calendar c2 = Calendar.getInstance();
		long c2s = c2.getTimeInMillis();
		System.out.println("time="+(c2s-c1s));
	}

}

class Px{
	 double array [];
	//冒泡排序 效率最低
	public void mp(int count){
		double a [] = new double[count];
		for(int i = 0; i < a.length; i++){
			a[i] = i * Math.random();
		}
		double tmp = 0.0;
		for(int i = 0; i < a.length - 1; i++){
			for(int j = 0; j < a.length - 1 -i; j++){
				
				if(a[j] > a[j+1]){
					tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	
	
	//选择排序 效率比冒泡高
	public void ks(int count){
		double a [] = new double[count];
		for(int i = 0; i < a.length; i++){
			a[i] = i * Math.random();
		}
		double tmp = 0.0;
		for(int i = 0; i < a.length-1; i++){
			double temp = a[i];
			int idx = i;
			for(int j = i+1; j < a.length; j++){
				
				if(temp < a[j]){
					temp = a[j];
					idx = j;
				}
			}
			if(idx != i){
				tmp = a[i];
				a[i] = a[idx];
				a[idx] = tmp;
			}
		}
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	//插入排序
	public void Cr(int count){
		double a [] = new double[count];
		for(int i = 0; i < a.length; i++){
			a[i] = i * Math.random();
		}
				
		//插入排序思想就是拿本身和前面的那写进行比较
		for(int i = 1; i < a.length; i++){
			double insertNode = a[i];
			int prev = i - 1;
			while(prev >= 0 && insertNode < a[prev]){
				a[prev + 1] = a[prev];
				prev --;
			}
			a[prev+1] = insertNode;
		}
		 
		
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		
	}
	//getArray
	public double [] getArray(){
		return this.array;
	}
	//快速排序
	public void Ks(int count){
		double a [] = new double[count];
		for(int i = 0; i < a.length; i++){
			a[i] = i * Math.random();
		}
		
		//核心思想就是取中间数左右两边，然后在取中间数左右两边。
		this._ks(0, a.length-1,a);
		this.array = a;
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	/**
	 * 
	 * @param left 左边下标
	 * @param right 右边下标
	 * @param arr 数组
	 */
	private void _ks(int left, int right, double arr []){
		 int l =left;
		 int r = right;
		 double md = arr[(int)((l+r)/2)];
		 double tmp;
		 while(l < r){
			 while(arr[l] < md)l++;
			 while(arr[r] > md)r--;
			 if(l >= r)break;
			 tmp = arr[l];
			 arr[l] = arr[r];
			 arr[r] = tmp;
		 }
		if(l == r){
			l++;
			r--;
		}
		if(left < r) this._ks(left, r, arr);
		if(right > l) this._ks(l, right, arr);
	}
	
}
