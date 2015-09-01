package swing;
/**
 * 登录框实例
 * 复杂布局
 * @author Administrator
 *
 */
import javax.swing.*;
import java.awt.*;
public class denglukuang extends JFrame{
	private JPanel jp1,jp2,jp3;
	private JLabel lb1,lb2;
	private JButton jb1,jb2;
	private JTextField text;
	private JPasswordField password;
	/**
	 * 常用的组件
	 * 除了JTextField,JPasswordField
	 * JCheckbox
	 * JRadioButton
	 * 特别说明一点
	 *   同一组单选按钮必须创建ButtonGroup然后把单选框组件放入到ButtonGroup中
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		denglukuang init = new denglukuang();
	}
	public denglukuang(){
		//init JPanel
		this.jp1 = new JPanel();
		this.jp2 = new JPanel();
		this.jp3 = new JPanel();
		//init JLabel
		lb1 = new JLabel("用户名");
		lb2 = new JLabel("    密码");
		//init JButton
		jb1 = new JButton("确认");
		jb2 = new JButton("取消");
		//init Text 传入int数值代表宽度
		text = new JTextField(10);
		password = new JPasswordField(10);
		
		//add to JFrame Layout is GridLayout
		this.setLayout(new GridLayout(3,1));
		
		//设置加入JPanel布局
		jp1.add(lb1);
		jp1.add(text);
		
		jp2.add(lb2);
		jp2.add(password);
			
		jp3.add(jb1);
		jp3.add(jb2);
		
		//设置加入JFrame的布局
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);

		
		
		//设置窗体
		this.setTitle("Login");
		this.setSize(400,150);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
}
