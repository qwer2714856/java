package luchao;

public class lianbiao3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked ln = new Linked(5);
		//ln.printForword();
		//ln.printBackWord();
		ln.play(2,2);
	}

}

/**
* Childed
*/
class Childed{
	int no;
	Childed nextChild;
	Childed prevChild;
	
	public Childed(int i){
		this.no = i;
	}
}
/**
* Link
*/
class Linked{
	Childed firstChild;
	Childed lastChild;
	Childed temp;
	Childed temp2;
	int len;
	//double linked list
	public Linked(int len){
		this.len = len;
		for(int i = 1; i <= len; i++){
			Childed c = new Childed(i);
			if(i == 1){
				//firstChild
				this.firstChild = this.temp = c;
			}else{
				this.temp2 = this.temp;
				this.temp.nextChild = c;
				this.temp = c;
				this.temp.prevChild = this.temp2;
				//lastChild
				if(i==len){
					this.lastChild = this.temp;
					this.temp.nextChild = this.firstChild;
					this.firstChild.prevChild = this.temp;
				}
			}
		}
	}
	public void printForword(){
		Childed tmp = this.firstChild;
		do{
			System.out.println(tmp.no);
			tmp = tmp.nextChild;
		}while(tmp != this.firstChild);
	}
	public void printBackWord(){
		Childed tmp = this.firstChild;
		do{
			System.out.println(tmp.no);
			tmp = tmp.prevChild;
		}while(tmp != this.firstChild);
	}
	
	public void play(int k, int m){
		Childed playTemp = this.firstChild;
		Childed deleteChild = null;
		//从k个人开始，数m下
		if(k > 1){
			for(int i = 1; i < k; i++){
				playTemp = playTemp.nextChild;
			}
		}
		
		
		while(this.len > 1){
			if(m > 1){
				for(int i = 1; i < m; i++){
					playTemp = playTemp.nextChild;
				}
			}
			
			playTemp.prevChild.nextChild = playTemp.nextChild;
			playTemp.nextChild.prevChild = playTemp.prevChild;
			deleteChild = playTemp;
			playTemp = playTemp.nextChild;
			
			System.out.println(deleteChild.no);
			
			this.len --;
		}
		System.out.println("==============");
		System.out.println("last out:" + playTemp.no);
		
	}
}