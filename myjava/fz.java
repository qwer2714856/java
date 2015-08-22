/**
 * 静态代码块
 * 封装
 * 多态
 * 继承
 * 抽象
 *
 */
public class fz{
    public static void main(String []args){
        jt l = new jt();
	l.getInfo();
    }
}
class jt{
    static int i = 0;//第一次执行
    static{//同上
	i++;
    }
    private int a = 1;
    public void getInfo(){
        System.out.println(this.a);
    }

}
