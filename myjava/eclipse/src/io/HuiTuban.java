package io;
import java.io.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * java��ļ��±�
 * ����ӹ���
 * //��swing�����(¡���Ƽ�)
 * JFileChooser �ļ�ѡ�����
 * @author Administrator
 *
 */
public class HuiTuban extends JFrame implements ActionListener{
	private JPanel jp = null;
	private TextArea textarea  = null;
	//����˵���
	//���ɾ����Ǹ��˵�����
	private JMenuBar jmb = null;
	//����ĸ��ϵ���Щѡ��
	private JMenu jm = null;
	//ÿһ��JMenu��Ӧһ�����
	private JMenuItem jmt = null;
	private JMenuItem jmt2 = null;
	
	//�ļ�ѡ�����
	JFileChooser jfc = null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		HuiTuban init = new HuiTuban();
		
	}
	public HuiTuban(){
		
		/*//�����˵� 
		this.jmb = new JMenuBar();
		
		this.jm = new JMenu("�ļ�(o)");
		//�������Ƿ�
		this.jm.setMnemonic('o');
		//����
		this.jmt = new JMenuItem("��", new ImageIcon("a.jpg"));
		
		this.setJMenuBar(this.jmb);
		this.jmb.add(this.jm);
		this.jm.add(this.jmt);*/
		
		this.jmb = new JMenuBar();
		this.jm = new JMenu("�ļ�(o)");
		this.jm.setMnemonic('o');
		this.jmt = new JMenuItem("��", new ImageIcon("a.jpg"));
		this.jmt2 = new JMenuItem("����");
		
		this.setJMenuBar(this.jmb);
		this.jmb.add(this.jm);
		this.jm.add(this.jmt);
		this.jm.add(this.jmt2);
		
		this.textarea = new TextArea();
		this.jp = new JPanel();
		this.jp.setLayout(new BorderLayout());
		this.jp.add(this.textarea);
		this.add(this.jp);
		
		this.jmt.addActionListener(this);
		this.jmt.setActionCommand("1");
		this.jmt2.addActionListener(this);
		this.jmt2.setActionCommand("2");
		
		this.setTitle("���±�");
		this.setSize(800, 500);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(e.getActionCommand());
		switch(num){
			case 1:
				//�򿪵���һ��ѡ���
				//��swing�����(¡���Ƽ�)
				this.jfc = new JFileChooser();
				this.jfc.setDialogTitle("��ѡ���ļ�");
				this.jfc.showOpenDialog(null);
				this.jfc.setVisible(true); 
				//�õ��û�ѡ���ȫ·��
				String absolutePath = this.jfc.getSelectedFile().getAbsolutePath();
				
				BufferedReader bf = null;
				BufferedReader bw = null;
				String s = "";
				String strall = "";
			try {
				bf = new BufferedReader(new FileReader(absolutePath));
				try {
					
					/*while((s = bf.readLine()) != null){
						this.textarea.append(s+"\r\n");
					}*/
					
					while((s = bf.readLine()) != null){
						//���������setText���Ǳ���һ����д�����������
						strall += s+"\r\n";
					}
					this.textarea.setText(strall);
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally{
				try {
					bf.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
				
				break;
			case 2:
				this.jfc = new JFileChooser();
				this.jfc.setDialogTitle("����");
				this.jfc.showSaveDialog(null);
				this.jfc.setVisible(true);
				String absolutePathSave = this.jfc.getSelectedFile().getAbsolutePath();
				//д��
				BufferedWriter bws = null;
				BufferedReader brs = null;
				
				try {
					brs = new BufferedReader(new StringReader(this.textarea.getText()));
					FileWriter jw = new FileWriter(absolutePathSave);
					bws = new BufferedWriter(jw);
					String str = "";
					while((str=brs.readLine()) != null){
						System.out.println(str);
						bws.write(str+"\r\n");
					}
					
					//System.out.println(this.textarea.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}finally{
					try {
						bws.close();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				}
				break;
		} 
	}
}
