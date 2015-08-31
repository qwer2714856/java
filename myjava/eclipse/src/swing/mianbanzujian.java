package swing;
/**
 * JPanel
 * 多种布局管理器的使用
 * 默认布局是流布局
 * 一个界面只有一个JFrame窗体组件，但可以有多个JPanel面板组件，而JPanel
 * 上也可以使用FlowLayout BorderLayout GridLayout 等布局管理
 * 这样可以组合使用达到较为复杂的布局效果。
 * 总结一下JPanel
 * 1.JPanel 是 JComponent的子类。
 * 2.属于容器组件，可以加入别的组件。
 * 3.默认布局管理器是，流式布局。
 * @author ding.luchao
 *
 */
import java.awt.*;
import javax.swing.*;

public class mianbanzujian extends JFrame {
	private JPanel jp1,jp2;
	private JButton [] jb = null;
	private int size = 6;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mianbanzujian init = new mianbanzujian();
	}
	public mianbanzujian(){
		//初始化创建按钮
		jb = new JButton[this.size];
		for(int i = 0; i < this.size; i++){
			jb[i] = new JButton(String.valueOf(i));
		}
		//创建JPanel
		this.jp1 = new JPanel();
		this.jp2 = new JPanel();
		//设置布局管理器
		//因为JFrame默认是边界布局所以不用设置了
		
		//jp1的布局
		jp1.add(jb[0]);
		jp1.add(jb[1]);
		jp1.add(jb[2]);
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
		//jp2的布局
		jp2.add(jb[4]);
		jp2.add(jb[5]);
		jp2.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//添加这个是整个JFrame的布局
		this.add(jp1, BorderLayout.NORTH);
		this.add(jb[3], BorderLayout.CENTER);
		this.add(jp2, BorderLayout.SOUTH);
		
		//禁止拖拽
		this.setResizable(false);
		//设置title
		this.setTitle("JPanel");
		//设置大小
		this.setSize(200,200);
		//设置位置
		this.setLocation(100,100);
		//设置关闭后消除进程
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//显示
		this.setVisible(true);
		
	}
}
