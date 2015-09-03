package tanke;
import java.awt.*;

import javax.swing.*;
/**
 * 绘制图片
 * drawImage
 * drawString
 * @author Administrator
 *
 */
public class huatupian extends JFrame{
	private MyPanel m = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		huatupian init = new huatupian();
	}
	public huatupian(){
		this.m = new MyPanel();
		this.add(this.m);
		this.setSize(400,400);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class MyPanel extends JPanel{
	public void paint(Graphics g){
		super.paint(g);
		/*g.setColor(Color.blue);
		g.fillOval(0, 0, 100, 100);
		
		//如果是路径/就代表src下面 下面这个长的就当公式记。
		Image img = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/a.jpg"));
		
		//第一组值图片的组左上角,距离窗体的坐标
		//第二组是图片要画多宽和多高，缩放的关系不是截取
		//自三组以后的暂时用不到
		//this是个代词代表JPanel本身
		g.drawImage(img, 90, 90, 30, 30, this); 	*/	
		//接收一个字体对象Font
		//Font 1.字体 2.字体样式 3.字体大小,这个字体必须要保证java库里面有这个字体否则是不可以的，如果有不认识默认是宋体。
		g.setFont(new Font("华文彩云",Font.BOLD,50));
		Color c = new Color(255,0,152);
		g.setColor(c);
		g.drawString("Ding.Luchao", 0 , 100);
		
	}
}