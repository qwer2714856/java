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
	private JPanel jp1,jp2,jp3,jp4,jp5,jp6,jp7,jp8;
	private JLabel lb1,lb2;
	private JButton jb1,jb2;
	private JTextField text;
	private JPasswordField password;
	private ButtonGroup btgoup;
	private JCheckBox jcb;
	private JRadioButton jbt1,jbt2;
	private JComboBox jcbox;
	private JList jlist,jlist2;
	private JScrollPane jsp;
	/**
	 * 常用的组件
	 * 除了JTextField,JPasswordField
	 * JCheckbox
	 * JRadioButton
	 * 特别说明一点
	 *   同一组单选按钮必须创建ButtonGroup然后把单选框组件放入到ButtonGroup中
	 * JComboBox
	 * JList
	 * JScrollPane
	 * 总结：
	 * 了解到了常用组件JFrame,JButton,JPanel,JLabel,JTextField,JPasswordField
	 * JCheckBox,JRadioButton,ButtonGroup,JComboBox,JList,JScrollPane
	 * 三大布局
	 * BorderLayout（边界布局）JFrame 默认
	 * FlowLayout（流式布局） JPanel 默认
	 * GridLayout（网格布局）
	 * 这几个要活用
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
		this.jp4 = new JPanel();
		this.jp5 = new JPanel();
		this.jp6 = new JPanel();
		this.jp7 = new JPanel();
		this.jp8 = new JPanel();
		//init JLabel
		this.lb1 = new JLabel("用户名");
		this.lb2 = new JLabel("    密码");
		//init JButton
		this.jb1 = new JButton("确认");
		this.jb2 = new JButton("取消");
		//init Text 传入int数值代表宽度
		this.text = new JTextField(10);
		this.password = new JPasswordField(10);
		//init JRadioButton 参数就是label显示在后面什么字，一定把两个单选按钮放入组中 ButtonGroup
		this.jbt1 = new JRadioButton("男");
		this.jbt2 = new JRadioButton("女");
		//init JCheckbox 参数就是label显示在后面什么字
		this.jcb = new JCheckBox("足球");
		//init GroupButton 注意一下加入容器组件的时候不是将btgroup加入而是加入JRadioButton
		this.btgoup = new ButtonGroup();
		this.btgoup.add(jbt1);
		this.btgoup.add(jbt2);
		
		
		//init JComboBox String []jg = {"北京1","北京2","北京3","北京4"};
		//参数是一个字符串数组
		String []jg = {"北京1","北京2","北京3","北京4"};
		this.jcbox = new JComboBox(jg);
		
		//init JList 参数是一个字符串数组 默认没有滚动天可能显示不全
		String []dz = {"黄山1","黄山2","黄山3","黄山4"};
		this.jlist = new JList(dz);
		this.jlist2 = new JList(dz);
		//init JScrollPane  它的参数是JList对象
		//如果用了这个就不要用jlist反之亦然。
		this.jlist.setVisibleRowCount(2);//设置显示大小
		this.jsp = new JScrollPane(this.jlist);
		//设置你希望显示多少个选项
		
		
		
		//add to JFrame Layout is GridLayout
		this.setLayout(new GridLayout(8,1));
		
		//设置加入JPanel布局
		this.jp1.add(this.lb1);
		this.jp1.add(this.text);
		
		this.jp2.add(this.lb2);
		this.jp2.add(this.password);
			
		this.jp3.add(this.jb1);
		this.jp3.add(this.jb2);
		
		this.jp4.add(this.jcb);
		
		this.jp5.add(this.jbt1);
		this.jp5.add(this.jbt2);
		
		this.jp6.add(this.jcbox);
		
		this.jp7.add(this.jlist2);
		
		this.jp8.add(this.jsp);
		
		//设置加入JFrame的布局
		this.add(this.jp1);
		this.add(this.jp2);
		this.add(this.jp3);
		this.add(this.jp4);
		this.add(this.jp5);
		this.add(this.jp6);
		this.add(this.jp7);
		this.add(this.jp8);

		
		
		//设置窗体
		this.setTitle("Login");
		this.setSize(400,400);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
}
