/**
 * �˷���
 * ding.luchao
 * 20150822
 */
public class chengfabiao{
    public static void main(String []args){
	Cfb c = new Cfb();
	c.printCf();
    }
}

class Cfb{
    int printCount = 9;
    public void printCf(){
	String str = "";
	String space = " ";
	for(int i = 1; i <= this.printCount; i++){
	    for(int j = 1; j <= i; j++){
	        if(i < 5 && j == 2){
	            space += " ";
		}
                str += i + "*" + j + "=" + (i * j) + space;
		space = " ";
	    }
	    
	    System.out.println(str);
	    str = "";
	}

	System.out.println("====");
	int [][]a = new int[3][3];
	int [][]b = new int[3][3];
	for(int i = 0; i < 3; i++){
	    for(int j = 0; j < 3; j++){
		a[i][j] = 3 * i + j + 1;
		//System.out.println(a[i][j]);
	    }
	}
	for(int i = 0; i < 3; i++){
	    for(int j = 0; j < 3; j++){
		b[i][j] = a[j][i];
		System.out.println(b[i][j]);
	    }
	}
    }
}