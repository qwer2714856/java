package swing;
import javax.swing.*;
import java.awt.*;
/**
 * JTextArea �ı���
 * ���������һ��LOGO
 *     this.setIconImage((new ImageIcon("a.jpg")).getImage());
 * @author Administrator
 *
 */
public class qqliaotian extends JFrame {
	private JTextArea testArea = null;
	private JComboBox jcb = null;
	private JButton jb = null;
	private JPanel jp1,jp2;
	private JTextField jt = null;
	private JScrollPane jsp = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		qqliaotian a = new qqliaotian();
	}
	public qqliaotian(){
		this.testArea = new JTextArea(10,30);//�߶ȣ�����
		this.jsp = new JScrollPane(this.testArea);//��ӵ�����
		
		this.jcb = new JComboBox(new String []{"1","1","1","1"});
		
		this.jb = new JButton("�ύ");
		
		this.jt = new JTextField(10);
		
		//this.jp1 = new JPanel();
		this.jp2 = new JPanel();
		
		//this.setLayout(new GridLayout(2,1));
		
		//this.jp1.add(this.testArea);
		this.jp2.add(this.jcb);
		this.jp2.add(this.jt);
		this.jp2.add(this.jb);
		
		
		this.add(this.jsp); 
		this.add(this.jp2,BorderLayout.SOUTH);
		
		this.setTitle("̹��");
		this.setIconImage((new ImageIcon("a.jpg")).getImage()); 
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
