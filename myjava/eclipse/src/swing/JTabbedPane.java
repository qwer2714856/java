package swing;
import javax.swing.*;
import java.awt.*;
/**
 * JLabel
 * JTabbedPane
 * JButton
 * 菜单组件
 * JMenuBar    树干 
 * JMenu       树枝
 * JMenuItem   树叶
 * JMenuBar 包含 多个JMenu 
 * JMenu 包含多个 JMenuItem
 * 二级菜单
 * JMenu里面可以嵌套JMenu
 * 工具条
 * JToolBar 容器类
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
		//让label剧中显示,以及设置样式
		this.lb = new JLabel("<html><a href=''>aaa</a></html>",JLabel.CENTER);
		this.lb.setFont(new Font("宋体",Font.PLAIN,16));
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
