package swing;
import java.awt.*;
import javax.swing.*;
/**
 * JSplitPane �ָ�
 * @author Administrator
 *
 */

public class jinshan_jiemian extends JFrame{
	private JSplitPane jsp = null;
	private JList list = null;
	private JLabel label = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jinshan_jiemian a = new jinshan_jiemian();
	}
	public jinshan_jiemian(){
		//new ImageIcon ��ͼƬ�������ĿĿ¼��testĿ¼
		this.label = new JLabel(new ImageIcon("a.jpg"));
		
		String a [] = {"435","132","23","3"};
		this.list = new JList(a);
		
		//JSplitPane.HORIZONTAL_SPLIT ˮƽ��ʾ �����ʾ �ұ���ʾ
		this.jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, this.list, this.label);
		//�Ƿ�����۵�
		this.jsp.setOneTouchExpandable(true);
		
		this.add(this.jsp);
		
		this.setResizable(false);
		this.setSize(200,200);
		this.setLocation(100,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
