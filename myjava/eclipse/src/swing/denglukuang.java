package swing;
/**
 * ��¼��ʵ��
 * ���Ӳ���
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
	 * ���õ����
	 * ����JTextField,JPasswordField
	 * JCheckbox
	 * JRadioButton
	 * �ر�˵��һ��
	 *   ͬһ�鵥ѡ��ť���봴��ButtonGroupȻ��ѵ�ѡ��������뵽ButtonGroup��
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
		lb1 = new JLabel("�û���");
		lb2 = new JLabel("    ����");
		//init JButton
		jb1 = new JButton("ȷ��");
		jb2 = new JButton("ȡ��");
		//init Text ����int��ֵ������
		text = new JTextField(10);
		password = new JPasswordField(10);
		
		//add to JFrame Layout is GridLayout
		this.setLayout(new GridLayout(3,1));
		
		//���ü���JPanel����
		jp1.add(lb1);
		jp1.add(text);
		
		jp2.add(lb2);
		jp2.add(password);
			
		jp3.add(jb1);
		jp3.add(jb2);
		
		//���ü���JFrame�Ĳ���
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);

		
		
		//���ô���
		this.setTitle("Login");
		this.setSize(400,150);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
}
