/*
 * jzt
 */
public class jzt{
    public static void main(String []args){
       String str = "";
       int count = 2 * 5 + 1;
       int e;
       String space = "";
       int l = 11,r = 11;
       l = (int)(Math.ceil((float)l/2));
       //System.out.print(l);
       int y = r - l;

       for(int i = 0; i < l; i++){
           e = 2 * i + 1;
           if(i != y){
		for(int j=0;j<l-i-1;j++){
                    space += " ";
		}
	   }
	   for(int k = 0; k < e; k++){
	       if(k == 0 || k == e-1){
                   str += "*";
	       }else{
	           str += " ";
	       }
	              
	   }
	   System.out.println(space+str);
	   space = "";
	   str = "";
       }
     
       int fs = 1;
       while(y-- > 0){
          e = 2 * y + 1;         
	  for(int i1=e;i1>0;i1--){
              if(i1==e || i1 == 1){
              str += "*";
	      }else{
		str += " ";
	      }
	  }
	  
	  for(int g=0;g<fs;g++){
              space += " ";
	  }
	  fs++;
	  System.out.println(space + str);
       str = "";
       space = "";
       }
       
    }
}
