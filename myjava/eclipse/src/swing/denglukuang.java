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
	 * ���õ����
	 * ����JTextField,JPasswordField
	 * JCheckbox
	 * JRadioButton
	 * �ر�˵��һ��
	 *   ͬһ�鵥ѡ��ť���봴��ButtonGroupȻ��ѵ�ѡ��������뵽ButtonGroup��
	 * JComboBox
	 * JList
	 * JScrollPane
	 * �ܽ᣺
	 * �˽⵽�˳������JFrame,JButton,JPanel,JLabel,JTextField,JPasswordField
	 * JCheckBox,JRadioButton,ButtonGroup,JComboBox,JList,JScrollPane
	 * ���󲼾�
	 * BorderLayout���߽粼�֣�JFrame Ĭ��
	 * FlowLayout����ʽ���֣� JPanel Ĭ��
	 * GridLayout�����񲼾֣�
	 * �⼸��Ҫ����
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
		this.lb1 = new JLabel("�û���");
		this.lb2 = new JLabel("    ����");
		//init JButton
		this.jb1 = new JButton("ȷ��");
		this.jb2 = new JButton("ȡ��");
		//init Text ����int��ֵ������
		this.text = new JTextField(10);
		this.password = new JPasswordField(10);
		//init JRadioButton ��������label��ʾ�ں���ʲô�֣�һ����������ѡ��ť�������� ButtonGroup
		this.jbt1 = new JRadioButton("��");
		this.jbt2 = new JRadioButton("Ů");
		//init JCheckbox ��������label��ʾ�ں���ʲô��
		this.jcb = new JCheckBox("����");
		//init GroupButton ע��һ�¼������������ʱ���ǽ�btgroup������Ǽ���JRadioButton
		this.btgoup = new ButtonGroup();
		this.btgoup.add(jbt1);
		this.btgoup.add(jbt2);
		
		
		//init JComboBox String []jg = {"����1","����2","����3","����4"};
		//������һ���ַ�������
		String []jg = {"����1","����2","����3","����4"};
		this.jcbox = new JComboBox(jg);
		
		//init JList ������һ���ַ������� Ĭ��û�й����������ʾ��ȫ
		String []dz = {"��ɽ1","��ɽ2","��ɽ3","��ɽ4"};
		this.jlist = new JList(dz);
		this.jlist2 = new JList(dz);
		//init JScrollPane  ���Ĳ�����JList����
		//�����������Ͳ�Ҫ��jlist��֮��Ȼ��
		this.jlist.setVisibleRowCount(2);//������ʾ��С
		this.jsp = new JScrollPane(this.jlist);
		//������ϣ����ʾ���ٸ�ѡ��
		
		
		
		//add to JFrame Layout is GridLayout
		this.setLayout(new GridLayout(8,1));
		
		//���ü���JPanel����
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
		
		//���ü���JFrame�Ĳ���
		this.add(this.jp1);
		this.add(this.jp2);
		this.add(this.jp3);
		this.add(this.jp4);
		this.add(this.jp5);
		this.add(this.jp6);
		this.add(this.jp7);
		this.add(this.jp8);

		
		
		//���ô���
		this.setTitle("Login");
		this.setSize(400,400);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
}
