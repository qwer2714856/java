package swing;
import java.awt.*;
import javax.swing.*;
public class bianjiebuju extends JFrame{
	//��Ҫ��swing��������ڣ��ڹ��캯������
	private JButton jb1,jb2,jb3,jb4,jb5;
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bianjiebuju g = new bianjiebuju();
	}
	public bianjiebuju(){
		//��ʼ�����
		//����һ��button��ť���widgets������ģ�Ҳ��������ġ�		
		jb1 =  new JButton("��");
		jb2 =  new JButton("��");
		jb3 =  new JButton("��");
		jb4 =  new JButton("��");
		jb5 =  new JButton("��");
		
		//��������
		//jFrame ��һ�����������࣬�����������swing�������
		//��Ϊ�����̳���JFrame���Կ���ֱ����this
		//JFrame jf = new JFrame();
		//��Ӱ�ť,Ĭ��ռ����������,JFrameĬ���Ǳ߽粼�����Ի�ռ����������
		//1.����������ֶ��������
		//2.�м��������Զ�������С(ע�������м���Զ�����)
		//3.JFrame JDialogĬ�ϲ��ֹ���������BorderLayout
		this.add(jb4, BorderLayout.NORTH);//��
		this.add(jb2, BorderLayout.SOUTH);//��
		this.add(jb3, BorderLayout.WEST);//��
		this.add(jb1, BorderLayout.EAST);//��
		this.add(jb5, BorderLayout.CENTER);//�м�
		//���ñ���
		this.setTitle("hi");
		//���ô�С�������ؼ���
		this.setSize(400,400);
		//���ó�ʼλ��
		this.setLocation(100,200);
		//�˳���ʱ��͹رգ���֤ϵͳ�е�jvmҲ�˳�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��ʾ������� Ĭ�ϵ�������Ļ���Ͻ�
		this.setVisible(true);			
	}
}
