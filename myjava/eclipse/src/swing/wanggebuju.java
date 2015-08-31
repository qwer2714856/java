package swing;
import java.awt.*;
import javax.swing.*;
public class wanggebuju extends JFrame{
	//需要的swing组件定义在，在构造函数创建
	private JButton [] jb = null;
	private int size = 9;
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wanggebuju g = new wanggebuju();
	}
	public wanggebuju(){
		//初始化组件
		//创建一个button按钮这个widgets组里面的，也是容器类的。
		jb = new JButton[size];
		for(int i = 0; i < size; i++){
			jb[i] = new JButton(String.valueOf(i));
		}
		
	   	
		
		/*GridLayout 布局，将容器分割为多行多列，
		 * 组件被填充到每个网格中，添加到容器中的组件首先在左上角的网格中，
		 * 然后从左到右放置其它组件，当占满该行的所有网格后，下行继续从左向右。
		 */
		//添加组件
		//设置网格布局器,第一个参数行数，第二个参数列数,第三个第四个是参数是控制按钮和按钮边界的。
		//组件的相对位置不随容器的缩放而变化，但大小会变化
		//所有组件的大小相同
		//可以通过GridLayout(int rows, int cols, int hgap, int wgap);来指定行列，间距的x y的距离
		this.setLayout(new GridLayout(3,3,10,10));
		for(int i = 0; i < size; i++){
			this.add(jb[i]);
		}
		 
		
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
