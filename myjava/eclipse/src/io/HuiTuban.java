package io;
import java.io.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * java版的记事本
 * 界面加功能
 * //新swing的组件(隆重推荐)
 * JFileChooser 文件选择组件
 * @author Administrator
 *
 */
public class HuiTuban extends JFrame implements ActionListener{
	private JPanel jp = null;
	private TextArea textarea  = null;
	//定义菜单条
	//主干就是那个菜单横条
	private JMenuBar jmb = null;
	//横向的干上的那些选项
	private JMenu jm = null;
	//每一个JMenu对应一组这个
	private JMenuItem jmt = null;
	private JMenuItem jmt2 = null;
	
	//文件选择组件
	JFileChooser jfc = null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		HuiTuban init = new HuiTuban();
		
	}
	public HuiTuban(){
		
		/*//创建菜单 
		this.jmb = new JMenuBar();
		
		this.jm = new JMenu("文件(o)");
		//设置助记符
		this.jm.setMnemonic('o');
		//下拉
		this.jmt = new JMenuItem("打开", new ImageIcon("a.jpg"));
		
		this.setJMenuBar(this.jmb);
		this.jmb.add(this.jm);
		this.jm.add(this.jmt);*/
		
		this.jmb = new JMenuBar();
		this.jm = new JMenu("文件(o)");
		this.jm.setMnemonic('o');
		this.jmt = new JMenuItem("打开", new ImageIcon("a.jpg"));
		this.jmt2 = new JMenuItem("保存");
		
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
		
		this.setTitle("记事本");
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
				//打开弹出一个选择框
				//新swing的组件(隆重推荐)
				this.jfc = new JFileChooser();
				this.jfc.setDialogTitle("请选择文件");
				this.jfc.showOpenDialog(null);
				this.jfc.setVisible(true); 
				//得到用户选择的全路径
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
						//这里可以用setText但是必须一次性写入否则有问题
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
				this.jfc.setDialogTitle("保存");
				this.jfc.showSaveDialog(null);
				this.jfc.setVisible(true);
				String absolutePathSave = this.jfc.getSelectedFile().getAbsolutePath();
				//写入
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
