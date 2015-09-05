package tanke;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * 一个监听者被多个事件源绑定
 * 让一个类实现多个事件的接口，就可以实现监听多个事件
 * 让Mys知道鼠标按下的消息并且能知道坐标
 * 让Mys知道哪个建按下了
 * 拖拽MouseMotionListener
 * 关于事件多查查文档
 * 让panel知道窗口的变化
 * @author Administrator
 *
 */
public class Event_mouses extends JFrame{
	Mys m = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event_mouses init = new Event_mouses();
	}
	public Event_mouses(){
		this.m = new Mys();
		this.add(this.m);
		this.setSize(400,400);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		//加入鼠标的监听
		this.addMouseListener(this.m);
		//加入键盘事件
		this.addKeyListener(this.m);
		//拖住
		this.addMouseMotionListener(this.m);
		//窗口的时间
		this.addWindowListener(this.m);
		 	
	}
}
class Mys extends JPanel implements MouseListener,KeyListener,MouseMotionListener,WindowListener{
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.black);
		g.fillRect(0, 0, 400, 300);
	}

	@Override
	//鼠标点击 按下+松开
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("X=" + e.getX() + "Y=" + e.getY());
	}

	@Override
	//鼠标按下去没有松开	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//鼠标松开了
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//鼠标移动进来了
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//鼠标离开了
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//实时监控 只要一移动马上就监控相当于mouse move
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX());
	}

	@Override
	//窗口刚打开
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("窗口刚打开");
	}

	@Override
	//正在关闭
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("正在关了");
	}

	@Override
	//窗口关闭了
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		//这个不会输出应为已经关了
		System.out.println("关了");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//窗口最大化
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeactivated不激活，windowActivated激活");
	}

	@Override
	//最小化
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("最小化");
	}

	 
}
