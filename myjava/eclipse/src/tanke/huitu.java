package tanke;
import java.awt.*;
import javax.swing.*;
/**
 * ��ͼ����
 * 1.class MyPane extends JPanel
 * 2.��д����JPanel�ķ��� paint(Graphics g)
 * 3.һ���Ƚ���Ҫ�ĵ� ���ø����super.paint(g);
 * 4.����������һ��panel �ŵ�JFrame����ȥ
 * 
 * ��ͼԭ��
 * Component ���ṩ�������ͻ�ͼ��ص�����Ҫ���ࡣ
 * 1.paint (Graphics g)������������
 * 2.repaint() ˢ���������ۣ�Ϊʲô̹�˿��Զ�������Ϊ�ڲ�ͣ��ˢ����ۣ�̹�˵�λ�ñ��˾ͻᷢ��һ��repaint�������ػ�
 * 3.�������һ������Ļ����ʾ��ʱ�򣬳���ͻ��Զ��ĵ���paint()����������ͼ�񣬳��˵�һ�ε��û���������ʱ���Զ����ã�1���������С����2���ڷ����ı䣬3repaint.
 * Graphics ���������Ҫ���յķ���
 * drawLine ��ֱ��
 * drawOval ��Բ
 * drawRect ������
 * fillRect ������
 * fillOval ���Բ
 * drawImage ��ͼƬ
 * drawString���ַ���
 * setFont ���û�������
 * setColor ���û�����ɫ
 * drawArc ������
 * ����һ��fill �� draw�Ǳ˴˶����Ĳ��ǻ������䣬��Ȼ�������������׸��߿�
 * Color c = new Color(0,255,255);
 * g.setColor(c);
 * @author ding.luchao
 *
 */
public class huitu extends JFrame{
	private MyPane pl = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		huitu a = new huitu();
	}
	public huitu(){
		this.pl = new MyPane();
		this.add(this.pl);
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

//����һ��MyPane,���ڻ�ͼ����ʾ��ͼ��һ������
class MyPane extends JPanel{
	//��д����ķ�����paint����
	//Graphics �ǻ�ͼ����Ҫ��,���԰�������һֻ����
	public void paint(Graphics g){//�����û���ֶ����ã���һ�ε�ʱ�����Զ����á�
		//���ø���Ĺ��캯����ɳ�ʼ��,��仰������.
		super.paint(g);
		System.out.println("�����Ƿ��Զ�����");
		//�Ȼ�һ��ԲȦ
		g.drawOval(10, 10, 30, 30);
		g.drawLine(0, 0, 20, 20);
		g.drawRect(0, 0, 100, 100);
		//���ñ�����ɫ
		Color c = new Color(0,255,255);
		g.setColor(c);
		//g.draw3DRect(100, 100, 100, 100, false);//����ȥ
		//g.fill3DRect(100, 100, 100, 100, true);//͹����
		
		//���� x y ���ĵ�
		//���ο��
		//����߻���
		//�ұ��߻���
		g.drawArc(200, 100, 190, 100, 100, -200);

		
	}
}