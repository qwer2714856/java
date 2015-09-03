package tanke;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * event 事件处理机制 委派事件模型
 * @author Administrator
 *
 */
public class event_mouse extends JFrame implements ActionListener{
	private Mp m = null;
	private JButton jb = null;
	private JButton jb2 = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		event_mouse e = new event_mouse();
	}
	public event_mouse(){
		this.m = new Mp();
		this.jb = new JButton("红色");
		this.jb2 = new JButton("黑色");
		this.add(this.jb,BorderLayout.NORTH);
		this.add(this.m);
		this.add(this.jb2,BorderLayout.SOUTH);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		//注册监听 addActionListener(ag) ag就是监听哪个对象实例
		jb.addActionListener(this);
		jb.addActionListener(new Cat());//绑定Cat类
		//如何知道谁点的
		jb.setActionCommand("红色");//传值区分点的谁,传给事件处理着
		jb2.addActionListener(this);
		jb2.addActionListener(new Cat());//绑定Cat类
		jb2.setActionCommand("黑色");//传值区分点的谁,传给事件处理着
		
		
	}
	
	
	@Override
	//对事件处理的方法 ,可以添加多个时间监听
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//判断是哪个按钮被点击
		if(e.getActionCommand().equals("红色")){
			System.out.println("红色");
			Graphics a = this.m.getGraphics();
			a.setColor(Color.red);
			a.fillRect(0, 0, 400, 400);
		}else{
			System.out.println("黑色");
			Graphics a = this.m.getGraphics();
			a.setColor(Color.black);
			a.fillRect(0, 0, 400, 400);
		}
			
		
	}
}

class Cat implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}
	
}

class Mp extends JPanel{
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.black);
		g.fillRect(0, 0, 400, 400);
	}
}