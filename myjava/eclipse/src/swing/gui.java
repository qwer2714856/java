package swing;
import java.awt.*;
import javax.swing.*;
public class gui extends JFrame{
	//��Ҫ��swing��������ڣ��ڹ��캯������
	private JButton jb1 = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gui g = new gui();
	}
	/**
	 * ʹ�ù��캯����ʼ������
	 */
	public gui(){
		//��ʼ�����
		//����һ��button��ť���widgets������ģ�Ҳ��������ġ�	
		jb1 =  new JButton("����һ����ť");
		
		//��������
		//jFrame ��һ�����������࣬�����������swing�������
		//��Ϊ�����̳���JFrame���Կ���ֱ����this
		//JFrame jf = new JFrame();
		//��Ӱ�ť,Ĭ��ռ����������,JFrameĬ���Ǳ߽粼�����Ի�ռ����������
		this.add(jb1);
		//���ñ���
		this.setTitle("hi");
		//���ô�С�������ؼ���
		this.setSize(100,100);
		//���ó�ʼλ��
		this.setLocation(100,200);
		//�˳���ʱ��͹رգ���֤ϵͳ�е�jvmҲ�˳�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��ʾ������� Ĭ�ϵ�������Ļ���Ͻ�
		this.setVisible(true);		
	}
}
