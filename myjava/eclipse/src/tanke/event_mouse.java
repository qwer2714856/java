package tanke;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * event �¼�������� ί���¼�ģ��
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
		this.jb = new JButton("��ɫ");
		this.jb2 = new JButton("��ɫ");
		this.add(this.jb,BorderLayout.NORTH);
		this.add(this.m);
		this.add(this.jb2,BorderLayout.SOUTH);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		//ע����� addActionListener(ag) ag���Ǽ����ĸ�����ʵ��
		jb.addActionListener(this);
		jb.addActionListener(new Cat());//��Cat��
		//���֪��˭���
		jb.setActionCommand("��ɫ");//��ֵ���ֵ��˭,�����¼�������
		jb2.addActionListener(this);
		jb2.addActionListener(new Cat());//��Cat��
		jb2.setActionCommand("��ɫ");//��ֵ���ֵ��˭,�����¼�������
		
		
	}
	
	
	@Override
	//���¼�����ķ��� ,������Ӷ��ʱ�����
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//�ж����ĸ���ť�����
		if(e.getActionCommand().equals("��ɫ")){
			System.out.println("��ɫ");
			Graphics a = this.m.getGraphics();
			a.setColor(Color.red);
			a.fillRect(0, 0, 400, 400);
		}else{
			System.out.println("��ɫ");
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