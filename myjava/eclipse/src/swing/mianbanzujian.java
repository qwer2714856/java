package swing;
/**
 * JPanel
 * ���ֲ��ֹ�������ʹ��
 * Ĭ�ϲ�����������
 * һ������ֻ��һ��JFrame����������������ж��JPanel����������JPanel
 * ��Ҳ����ʹ��FlowLayout BorderLayout GridLayout �Ȳ��ֹ���
 * �����������ʹ�ôﵽ��Ϊ���ӵĲ���Ч����
 * �ܽ�һ��JPanel
 * 1.JPanel �� JComponent�����ࡣ
 * 2.����������������Լ����������
 * 3.Ĭ�ϲ��ֹ������ǣ���ʽ���֡�
 * @author ding.luchao
 *
 */
import java.awt.*;
import javax.swing.*;

public class mianbanzujian extends JFrame {
	private JPanel jp1,jp2;
	private JButton [] jb = null;
	private int size = 6;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mianbanzujian init = new mianbanzujian();
	}
	public mianbanzujian(){
		//��ʼ��������ť
		jb = new JButton[this.size];
		for(int i = 0; i < this.size; i++){
			jb[i] = new JButton(String.valueOf(i));
		}
		//����JPanel
		this.jp1 = new JPanel();
		this.jp2 = new JPanel();
		//���ò��ֹ�����
		//��ΪJFrameĬ���Ǳ߽粼�����Բ���������
		
		//jp1�Ĳ���
		jp1.add(jb[0]);
		jp1.add(jb[1]);
		jp1.add(jb[2]);
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
		//jp2�Ĳ���
		jp2.add(jb[4]);
		jp2.add(jb[5]);
		jp2.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//������������JFrame�Ĳ���
		this.add(jp1, BorderLayout.NORTH);
		this.add(jb[3], BorderLayout.CENTER);
		this.add(jp2, BorderLayout.SOUTH);
		
		//��ֹ��ק
		this.setResizable(false);
		//����title
		this.setTitle("JPanel");
		//���ô�С
		this.setSize(200,200);
		//����λ��
		this.setLocation(100,100);
		//���ùرպ���������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��ʾ
		this.setVisible(true);
		
	}
}
