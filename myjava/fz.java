/**
 * ��̬�����
 * ��װ
 * ��̬
 * �̳�
 * ����
 *
 */
public class fz{
    public static void main(String []args){
        jt l = new jt();
	l.getInfo();
    }
}
class jt{
    static int i = 0;//��һ��ִ��
    static{//ͬ��
	i++;
    }
    private int a = 1;
    public void getInfo(){
        System.out.println(this.a);
    }

}
