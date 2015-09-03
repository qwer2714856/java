package tanke;
import java.awt.*;
import javax.swing.*;
/**
 * 绘图流程
 * 1.class MyPane extends JPanel
 * 2.重写父类JPanel的方法 paint(Graphics g)
 * 3.一个比较重要的点 调用父类的super.paint(g);
 * 4.主函数创建一个panel 放到JFrame里面去
 * 
 * 绘图原理
 * Component 类提供了两个和绘图相关的最重要的类。
 * 1.paint (Graphics g)绘制组件的外观
 * 2.repaint() 刷新组件的外观，为什么坦克可以动就是因为在不停的刷新外观，坦克的位置变了就会发出一个repaint动作，重绘
 * 3.当组件第一次在屏幕上显示的时候，程序就会自动的调用paint()方法来绘制图像，除了第一次调用还会在其它时候自动调用，1窗口最大化最小化，2窗口发生改变，3repaint.
 * Graphics 这个画笔需要掌握的方法
 * drawLine 画直线
 * drawOval 画圆
 * drawRect 画矩形
 * fillRect 填充矩形
 * fillOval 填充圆
 * drawImage 画图片
 * drawString画字符串
 * setFont 设置画笔字体
 * setColor 设置画笔颜色
 * drawArc 画弧形
 * 补充一点fill 和 draw是彼此独立的不是画完就填充，当然可以在填充外边套个边框。
 * Color c = new Color(0,255,255);
 * g.setColor(c);
 * @author ding.luchao
 *
 */
public class huitu extends JFrame{
	private MyPane pl = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		huitu a = new huitu();
	}
	public huitu(){
		this.pl = new MyPane();
		this.add(this.pl);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

//定义一个MyPane,用于绘图和显示绘图的一个区域
class MyPane extends JPanel{
	//重写父类的方法，paint方法
	//Graphics 是绘图的重要类,可以把他理解成一只画笔
	public void paint(Graphics g){//这个并没有手动调用，第一次的时候是自动调用。
		//调用父类的构造函数完成初始化,这句话不能少.
		super.paint(g);
		System.out.println("测试是否被自动调用");
		//先画一个圆圈
		g.drawOval(10, 10, 30, 30);
		g.drawLine(0, 0, 20, 20);
		g.drawRect(0, 0, 100, 100);
		//设置背景颜色
		Color c = new Color(0,255,255);
		g.setColor(c);
		//g.draw3DRect(100, 100, 100, 100, false);//凹进去
		//g.fill3DRect(100, 100, 100, 100, true);//凸出来
		
		//矩形 x y 中心点
		//矩形宽高
		//左边走弧度
		//右边走弧度
		g.drawArc(200, 100, 190, 100, 100, -200);

		
	}
}