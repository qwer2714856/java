package swing;
import javax.swing.*;
import java.awt.*;
/**
 * JLabel
 * JTabbedPane
 * JButton
 * �˵����
 * JMenuBar    ���� 
 * JMenu       ��֦
 * JMenuItem   ��Ҷ
 * JMenuBar ���� ���JMenu 
 * JMenu ������� JMenuItem
 * �����˵�
 * JMenu�������Ƕ��JMenu
 * ������
 * JToolBar ������
 * @author Administrator
 *
 */
public class JTabbedPane extends JFrame{
	private JLabel lb = null;
	private JTabbedPane jtb = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JTabbedPane a = new JTabbedPane();
	}
	public JTabbedPane(){
		//��label������ʾ,�Լ�������ʽ
		this.lb = new JLabel("<html><a href=''>aaa</a></html>",JLabel.CENTER);
		this.lb.setFont(new Font("����",Font.PLAIN,16));
		this.lb.setForeground(Color.red);
		this.lb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		this.lb.setBackground(Color.yellow);
		this.lb.setBackground(new Color(0,0,0));
		
		
		JButton a = new JButton(new ImageIcon("a.jpg"));
		//this.jtb = new JTabbedPane();
		 
		
		
		this.add(this.lb);
		this.setSize(100,100);
		this.setVisible(true);
		 
	}
}
