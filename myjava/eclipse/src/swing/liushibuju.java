package swing;
import java.awt.*;
import javax.swing.*;
public class liushibuju extends JFrame{
	//��Ҫ��swing��������ڣ��ڹ��캯������
	private JButton jb1,jb2,jb3,jb4,jb5;
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		liushibuju g = new liushibuju();
	}
	public liushibuju(){
		//��ʼ�����
		//����һ��button��ť���widgets������ģ�Ҳ��������ġ�		
		jb1 =  new JButton("1");
		jb2 =  new JButton("2");
		jb3 =  new JButton("3");
		jb4 =  new JButton("4");
		jb5 =  new JButton("5");
		
		//��ʽ����FlowLayout һ����ʾ��ʾ�����ͻ���
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		 
		//���ò��ֹ�����,��ʽ����Ĭ���Ǿ��в��ֵģ��ڶ�������м���������Ʒ���
		//������������Ű����Ϊһ�����壬�Ժ�Ȼ��������Ҷ��뷽��
		//�������������˲��ֹ������У�����Ĵ�С�����ܳ���Ա�Ŀ��ƣ������ɲ��ֹ������
		//�����Ҫ��ô���ͱ��뽫this.setLayout(null);�����Ͳ�ʹ�ò����ˣ��������ɿ��ư�ť��С��
		//���������ŵ�ʱ�������λ�ÿ��ܷ����ı䣬������Ĵ�С�����Ա䡣
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		
		//��ֹ�û��ı䴰���С
		this.setResizable(false);
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
