package swing;
import java.awt.*;
import javax.swing.*;
public class wanggebuju extends JFrame{
	//��Ҫ��swing��������ڣ��ڹ��캯������
	private JButton [] jb = null;
	private int size = 9;
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wanggebuju g = new wanggebuju();
	}
	public wanggebuju(){
		//��ʼ�����
		//����һ��button��ť���widgets������ģ�Ҳ��������ġ�
		jb = new JButton[size];
		for(int i = 0; i < size; i++){
			jb[i] = new JButton(String.valueOf(i));
		}
		
	   	
		
		/*GridLayout ���֣��������ָ�Ϊ���ж��У�
		 * �������䵽ÿ�������У���ӵ������е�������������Ͻǵ������У�
		 * Ȼ������ҷ��������������ռ�����е�������������м����������ҡ�
		 */
		//������
		//�������񲼾���,��һ�������������ڶ�����������,���������ĸ��ǲ����ǿ��ư�ť�Ͱ�ť�߽�ġ�
		//��������λ�ò������������Ŷ��仯������С��仯
		//��������Ĵ�С��ͬ
		//����ͨ��GridLayout(int rows, int cols, int hgap, int wgap);��ָ�����У�����x y�ľ���
		this.setLayout(new GridLayout(3,3,10,10));
		for(int i = 0; i < size; i++){
			this.add(jb[i]);
		}
		 
		
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
