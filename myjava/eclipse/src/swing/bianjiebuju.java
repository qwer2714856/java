package swing;
import java.awt.*;
import javax.swing.*;
public class bianjiebuju extends JFrame{
	//需要的swing组件定义在，在构造函数创建
	private JButton jb1,jb2,jb3,jb4,jb5;
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bianjiebuju g = new bianjiebuju();
	}
	public bianjiebuju(){
		//初始化组件
		//创建一个button按钮这个widgets组里面的，也是容器类的。		
		jb1 =  new JButton("东");
		jb2 =  new JButton("南");
		jb3 =  new JButton("西");
		jb4 =  new JButton("北");
		jb5 =  new JButton("中");
		
		//顶层容器
		//jFrame 是一个顶层容器类，可以添加其它swing组件的类
		//因为这个类继承了JFrame所以可以直接用this
		//JFrame jf = new JFrame();
		//添加按钮,默认占据整个窗口,JFrame默认是边界布局所以会占据整个窗口
		//1.不是五个部分都必须添加
		//2.中间的组件会自动调整大小(注意少了中间会自动调整)
		//3.JFrame JDialog默认布局管理器就是BorderLayout
		this.add(jb4, BorderLayout.NORTH);//北
		this.add(jb2, BorderLayout.SOUTH);//南
		this.add(jb3, BorderLayout.WEST);//西
		this.add(jb1, BorderLayout.EAST);//东
		this.add(jb5, BorderLayout.CENTER);//中间
		//设置标题
		this.setTitle("hi");
		//设置大小按照像素计算
		this.setSize(400,400);
		//设置初始位置
		this.setLocation(100,200);
		//退出的时候就关闭，保证系统中的jvm也退出
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//显示这个容器 默认弹出是屏幕左上角
		this.setVisible(true);			
	}
}
