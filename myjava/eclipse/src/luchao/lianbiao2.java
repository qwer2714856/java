package luchao;
/**
 * 链表2
 * @author ding.luchao
 *
 */
public class lianbiao2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link link = new Link(5);
		
		link.play(2,2);
		//link.printCircle();
	}

}
class Childs{
	int no;
	Childs nextChild = null;
	Childs prevChild = null;
	public Childs(int i){
		this.no = i;
	}
}
class Link{
	Childs firstChild = null;
	Childs temp = null;
	Childs lastChild = null;
	int len = 0;
	public Link(int len){
		this.len = len;
		for(int i = 1; i <= len; i++){
			Childs c = new Childs(i);
			if(i == 1){
				this.firstChild = this.temp = c;
				c.prevChild = this.lastChild;
			}else{
				c.prevChild = this.temp;
				this.temp = this.temp.nextChild = c;	
				if(i == len){
					this.lastChild = this.temp;
					this.temp = this.firstChild;
				}
			}
		}
	}
	public void printCircle(){
		do{
			System.out.println(this.temp.no);
			this.temp = this.temp.nextChild;
		}while(this.temp != this.firstChild);
	}
	
	
	
	public void play(int k, int m){
		Childs tmp = this.firstChild; 
		Childs tmp2 = null;
		
		//先找到开始数数的人
		if( k > 1){
			for(int i = 1; i < k; i++){
				tmp = tmp.nextChild;
			}
		}
		
		while(this.len > 1){
			 
			System.out.println("--");
			for(int j = 1; j < m; j++){
				tmp = tmp.nextChild;
			}
		
			tmp2 = tmp.prevChild;			
			//tmp2.nextChild = tmp.nextChild;
			//指向下一个小孩
			//tmp = tmp.nextChild;
			this.len--;
			 
		}
		System.out.print("aa");
	}
	
}