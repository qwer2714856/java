package swing;
import java.awt.*;
import javax.swing.*;
public class gui extends JFrame{
	//需要的swing组件定义在，在构造函数创建
	private JButton jb1 = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gui g = new gui();
	}
	/**
	 * 使用构造函数初始化界面
	 */
	public gui(){
		//初始化组件
		//创建一个button按钮这个widgets组里面的，也是容器类的。	
		jb1 =  new JButton("我是一个按钮");
		
		//顶层容器
		//jFrame 是一个顶层容器类，可以添加其它swing组件的类
		//因为这个类继承了JFrame所以可以直接用this
		//JFrame jf = new JFrame();
		//添加按钮,默认占据整个窗口,JFrame默认是边界布局所以会占据整个窗口
		this.add(jb1);
		//设置标题
		this.setTitle("hi");
		//设置大小按照像素计算
		this.setSize(100,100);
		//设置初始位置
		this.setLocation(100,200);
		//退出的时候就关闭，保证系统中的jvm也退出
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//显示这个容器 默认弹出是屏幕左上角
		this.setVisible(true);		
	}
}
