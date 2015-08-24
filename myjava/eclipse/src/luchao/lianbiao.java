
package luchao;

public class lianbiao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleLink CircleLinks = new CircleLink(5);
		CircleLinks.createLink();
		CircleLinks.show();
	}

}
class Child{
	
	private int no;
	private Child nextChild = null;
	
	public Child(int no){
		this.no = no;
	}
	
	public void setNextChild(Child nextChild){
		this.nextChild = nextChild;
	}
	public Child getNextChild(){
		return this.nextChild;
	}
	public int getNo(){
		return this.no;
	}
}
class CircleLink{
	private Child firstChild = null;
	private Child tmp = null;
	private int len = 0;
	public CircleLink(int len){
		this.len = len;
	}
	public void createLink(){
		for(int i = 1; i <= this.len; i++){
			
			 Child c = new Child(i);
			 
			 if(i == 1){
			     this.firstChild = this.tmp = c;
			 }else{
				 tmp.setNextChild(c);
				 tmp = c;
				 //最后的一个小孩
				 if(i == len){
					 tmp.setNextChild(this.firstChild); 
				 }
			 }
			 
		}
	}
	
	public void show(){
		Child temp = this.firstChild;
		do{
			System.out.println(temp.getNo());
			temp = temp.getNextChild();
		}while(temp != this.firstChild);
	}
}