package tanke;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * һ�������߱�����¼�Դ��
 * ��һ����ʵ�ֶ���¼��Ľӿڣ��Ϳ���ʵ�ּ�������¼�
 * ��Mys֪����갴�µ���Ϣ������֪������
 * ��Mys֪���ĸ���������
 * ��קMouseMotionListener
 * �����¼������ĵ�
 * ��panel֪�����ڵı仯
 * @author Administrator
 *
 */
public class Event_mouses extends JFrame{
	Mys m = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event_mouses init = new Event_mouses();
	}
	public Event_mouses(){
		this.m = new Mys();
		this.add(this.m);
		this.setSize(400,400);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		//�������ļ���
		this.addMouseListener(this.m);
		//��������¼�
		this.addKeyListener(this.m);
		//��ס
		this.addMouseMotionListener(this.m);
		//���ڵ�ʱ��
		this.addWindowListener(this.m);
		 	
	}
}
class Mys extends JPanel implements MouseListener,KeyListener,MouseMotionListener,WindowListener{
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.black);
		g.fillRect(0, 0, 400, 300);
	}

	@Override
	//����� ����+�ɿ�
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("X=" + e.getX() + "Y=" + e.getY());
	}

	@Override
	//��갴��ȥû���ɿ�	
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//����ɿ���
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//����ƶ�������
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//����뿪��
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//ʵʱ��� ֻҪһ�ƶ����Ͼͼ���൱��mouse move
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX());
	}

	@Override
	//���ڸմ�
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���ڸմ�");
	}

	@Override
	//���ڹر�
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���ڹ���");
	}

	@Override
	//���ڹر���
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		//����������ӦΪ�Ѿ�����
		System.out.println("����");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//�������
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeactivated�����windowActivated����");
	}

	@Override
	//��С��
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("��С��");
	}

	 
}
