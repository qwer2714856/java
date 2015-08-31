package swing;
import java.awt.*;
import javax.swing.*;
public class liushibuju extends JFrame{
	//需要的swing组件定义在，在构造函数创建
	private JButton jb1,jb2,jb3,jb4,jb5;
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		liushibuju g = new liushibuju();
	}
	public liushibuju(){
		//初始化组件
		//创建一个button按钮这个widgets组里面的，也是容器类的。		
		jb1 =  new JButton("1");
		jb2 =  new JButton("2");
		jb3 =  new JButton("3");
		jb4 =  new JButton("4");
		jb5 =  new JButton("5");
		
		//流式布局FlowLayout 一行显示显示不开就换行
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		 
		//设置布局管理器,流式布局默认是剧中布局的，在对象参数中加入参数控制方向
		//这个方向是先排版好了为一个整体，以后然后控制左右对齐方向
		//如果将组件放入了布局管理器中，组件的大小将不受程序员的控制，而是由布局管理管理。
		//如果非要这么做就必须将this.setLayout(null);这样就不使用布局了，可以自由控制按钮大小。
		//当容器缩放的时候，组件的位置可能发生改变，但组件的大小不可以变。
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		//禁止用户改变窗体大小
		this.setResizable(false);
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
