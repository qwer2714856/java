package tanke;
import java.awt.*;

import javax.swing.*;
/**
 * ����ͼƬ
 * drawImage
 * drawString
 * @author Administrator
 *
 */
public class huatupian extends JFrame{
	private MyPanel m = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		huatupian init = new huatupian();
	}
	public huatupian(){
		this.m = new MyPanel();
		this.add(this.m);
		this.setSize(400,400);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class MyPanel extends JPanel{
	public void paint(Graphics g){
		super.paint(g);
		/*g.setColor(Color.blue);
		g.fillOval(0, 0, 100, 100);
		
		//�����·��/�ʹ���src���� ����������ľ͵���ʽ�ǡ�
		Image img = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/a.jpg"));
		
		//��һ��ֵͼƬ�������Ͻ�,���봰�������
		//�ڶ�����ͼƬҪ�����Ͷ�ߣ����ŵĹ�ϵ���ǽ�ȡ
		//�������Ժ����ʱ�ò���
		//this�Ǹ����ʴ���JPanel����
		g.drawImage(img, 90, 90, 30, 30, this); 	*/	
		//����һ���������Font
		//Font 1.���� 2.������ʽ 3.�����С,����������Ҫ��֤java�������������������ǲ����Եģ�����в���ʶĬ�������塣
		g.setFont(new Font("���Ĳ���",Font.BOLD,50));
		Color c = new Color(255,0,152);
		g.setColor(c);
		g.drawString("Ding.Luchao", 0 , 100);
		
	}
}