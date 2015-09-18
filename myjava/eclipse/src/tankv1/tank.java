package tankv1;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import redio.AePlayWave;
/**
 * ̹�˵������ĵ�
 * 1.����̹��
 * 2.�ҵ�̹�˿������������˶�
 * 3.���Է����ӵ����5��
 * 4.���ҵ�̹�˻��е��˵�̹�ˣ����˵�̹�˾���ʧ��Ҫ���б�ըЧ����
 * 5.�ұ������б���Ч��
 * 6.��ֹ����̹���ص��˶�
 * 7.���Էֹ�
 * 8.����������Ϸ��ʱ����ͣ��ʼ
 * 9.���Լ�¼��ҵķ���
 * 10.java����������
 * @author Administrator
 *
 */


public class tank extends JFrame implements ActionListener{
	public TankPanel tp = null;
	public MyPanelStart mps = null;
	//�˵�
	private JMenuBar jmb = null;
	private JMenu jm = null;
	private JMenuItem jmt = null;
	private JMenuItem save = null;
	private JMenuItem read = null;
	private JMenuItem exit = null;
	//��Ƶ����
	AePlayWave yp = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tank init = new tank();
	}
	

	public tank(){
		
		this.mps = new MyPanelStart();
		//�˵�����
		this.jmb = new JMenuBar();
		this.jm = new JMenu("��ʼ��Ϸ(O)");
		this.jm.setMnemonic('O');
		this.jmt = new JMenuItem("��ʼ����Ϸ(G)");
		this.jmt.setMnemonic('G');
		//this.jmt.setIcon(new ImageIcon("a.jpg"));
		this.save = new JMenuItem("������Χ(s)");
		this.read = new JMenuItem("��ȡ��һ��(r)");
		this.exit = new JMenuItem("�˳�ϵͳȫ������(e)");
		this.save.setMnemonic('s');
		this.read.setMnemonic('r');
		this.exit.setMnemonic('e');
		
		this.setJMenuBar(this.jmb);
		this.jmb.add(this.jm);
		this.jm.add(this.jmt);
		this.jm.add(this.read);
		this.jm.add(this.save);
		this.jm.add(this.exit);
		
		//���¼�
		this.jmt.addActionListener(this);
		this.jmt.setActionCommand("0");
		//����İ��¼�
		this.save.addActionListener(this);
		this.save.setActionCommand("1");
		//�󶨶�ȡ���¼�
		this.read.addActionListener(this);
		this.read.setActionCommand("2");
		//���˳�ϵͳ�¼�
		this.exit.addActionListener(this);
		this.exit.setActionCommand("3");
		//��ʵ�ؿ���panel
		Thread thread2 = new Thread(this.mps);
		thread2.start();
		this.add(this.mps);
				
		this.setTitle("��½��PK������");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);

	}
	
	private void addTpInJFrame(){
		//����֮ǰҪɾ���ɵ�
		if(this.mps != null){
			this.remove(this.mps);
			this.mps = null;
		}
		if(this.tp != null){
			//kill ���������̷߳�����������Ϸ������
			this.tp.setPanelThreadStatus(false);
			this.remove(this.tp);
			this.tp = null;
		}
		
		//������Ƶ
		if(this.yp == null){
			this.yp = new AePlayWave("tp\\love.wav");
		}else{
			this.yp.stop();
			this.yp = new AePlayWave("tp\\love.wav");
		}
		this.yp.start();
		
		this.tp = new TankPanel();
		//����ˢ���߳�
		Thread thread = new Thread(this.tp);
		thread.start();
		
		//��ս��panel
		this.add(this.tp);
		
		//ע�����
		this.addKeyListener(this.tp);
		
		//��ʾ��ˢ��JFrame
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//0 ��ʼ��Ϸ
		//1�Ǳ������
		//2��ȡ����
		//3�˳�ϵͳ-ͬʱҪ�б���Ĺ���
		if(e.getActionCommand().equals("0")){
			//����Ϸ
			Recorder.setNews(true);
			//��ʼ������
			Recorder.resetData();
			//��ȡ�ܷ�
			Recorder.readScore();
			
			this.addTpInJFrame();

		}else{
			//�����˳�
			if(e.getActionCommand().equals("1")){
				Recorder.save();
				//�˳�
				System.exit(0);
			}else{
				if(e.getActionCommand().equals("2")){
					//���Ͼ�
					Recorder.setNews(false);
					Recorder.readAll();//����������
					this.addTpInJFrame();
				}else{
					if(e.getActionCommand().equals("3")){
						//����һ��
						Recorder.saveAll();
						//�˳�
						System.exit(0);
					}
				}
			}
		}
	}
}

/**
 * ̹�˵����
 * ��ΪҪʵ��̹�˶��������Ա���Ҫ���TankPanel�������̵��¼�
 * @author Administrator
 *
 */
class TankPanel extends JPanel implements KeyListener,Runnable{
	
	/**
	 * ������Ϸ�������������panel����
	 */
	//�����ҵ�̹��
	private GoodTanks myTank = null;
	//���廵��̹��,�̻߳���ʹ��Vector
	private Vector<BadTanks> badTanksList = new Vector<BadTanks>();
	//private BadTanks badTank = null;
	//panel�̵߳�״̬
	private Boolean panelThreadStatus = true;
	//���屬ը��ͼƬ
	private Image image1 = null;
	private Image image2 = null;
	private Image image3 = null;
	//����ը��������
	Vector<Bomb> bombList = new Vector<Bomb>();
	
	//������Χ
	private int activityW = 400;
	private int activityH = 300;
	//�����ʼ�����ٸ�����̹��
	private int numBadTank = Recorder.getBadTanKNum();
	
	public Boolean getPanelThreadStatus() {
		return panelThreadStatus;
	}

	public void setPanelThreadStatus(Boolean panelThreadStatus) {
		this.panelThreadStatus = panelThreadStatus;
	}
	
	public TankPanel(){
		//����Ϸ
		if(Recorder.getNews()){
			this.myTank = new GoodTanks(100,264);
			//this.badTank = new BadTanks(200,200); 
			//��ʼ�����˵�̹��
			for(int i = 0; i < this.numBadTank; i++){
				BadTanks badTank = new BadTanks((i)*30,0);
				this.badTanksList.add(badTank);
				Thread thread = new Thread(badTank);
				thread.start();
	
				//�����˼��������ӵ�
				badTank.fire(this.activityW, this.activityH);
			}
		}else{
			//���Ͼ�
			//��ʼ����̹��
			this.myTank = new GoodTanks(Recorder.getGoodTankNode().getX(), Recorder.getGoodTankNode().getY(), Recorder.getGoodTankNode().getDir());
			//��ʼ������
			for(int i = 0; i < Recorder.getNdList().size();i++){
				Node nd = Recorder.getNdList().get(i);
				BadTanks badTank = new BadTanks(nd.getX(), nd.getY(), nd.getDir());
				this.badTanksList.add(badTank);
				Thread thread = new Thread(badTank);
				thread.start();
				badTank.fire(this.activityW, this.activityH);
			}
		}
		BadTanks.badTankList = this.badTanksList;
		Recorder.setBadTankList(this.badTanksList);
		Recorder.setGoodTank(this.myTank);
		//��ʼ����ըͼƬ--����ͼƬ���Ϊһ����ըЧ��
		/*this.image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/tp/bz.png"));
		this.image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/tp/bz2.png"));
		this.image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/tp/bz3.png"));*/
		try{
			//�����test���Ŀ¼
			//�Ȱ�ͼƬ�����ڴ����������������һ�λ������⣬��Ȼ�����߳���Ȼ�����������⡣������Ҳ�Ǹ�˼·
			this.image1 = ImageIO.read(new File("tp\\bz.png"));
			this.image2 = ImageIO.read(new File("tp\\bz2.png"));
			this.image3 = ImageIO.read(new File("tp\\bz3.png"));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void paint(Graphics g){
		//��һ�ε��õ�ʱ�򴴽�����̹�ˣ�Ȼ��ÿ�ε���repaint��ʱ������ԭ�����������
		super.paint(g);
		
		//��ʵ����൱��һ������ÿ�ζ���Ҫ�ڻ��������»������������������Ƕ�̬�ģ�ÿ���ػ�ԭ���ľͲ�������Ҫ���»���һ�Σ������������������ڶ���
		//repaint �൱���ڻ��������»���ͼ��ԭ���Ķ������ˡ�
		
		//����JPanel�Ļ����
		g.setColor(Color.gray);
		g.fillRect(0, 0, this.activityW, this.activityH);
		
		//������̹��,��ʾ��Ϣ
		this.Recorder(g);
		
		//��ʼ���Լ�̹��ͼƬ
		if(this.myTank.isLive){
			this.createTank(this.myTank.getX(), this.myTank.getY(), g, this.myTank.getDir(), this.myTank.getIdentity(), this.myTank, this.myTank.getColor());
		}else{
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, this.activityW, this.activityH);
			g.setColor(Color.RED);
			g.drawString("Game over", 150, 140);
			return ;
		}
		//����̹��
		for(int i = 0; i < this.badTanksList.size(); i++){
			BadTanks bt = this.badTanksList.get(i);
			if(bt.isLive){
				this.createTank(bt.getX(), bt.getY(), g, bt.getDir(), bt.getIdentity(), bt, bt.getColor());
				//���Ƶ���̹��
				for(int j = 0; j < bt.bulletList.size(); j++){
					Bullet bullet = bt.bulletList.get(j);
					if(bullet.isLive){
						this.createBulleat(bullet.getX(),bullet.getY(), g, bullet.getColor(), bullet.getWidth(), bullet.getHeight());
					}else{
						bt.bulletList.remove(bullet);
					}
				}
			}else{
				this.badTanksList.remove(bt); 
				BadTanks.badTankList.remove(bt);
				//���ܶ�������ɾ��
				Recorder.lessen();
				//����ɱ����̹��
				Recorder.addKillBadTanKNum();
			}
		}
		
		//�Լ����ӵ�
		for(int i = 0; i < this.myTank.bulletList.size(); i++){
			Bullet bullet = this.myTank.bulletList.get(i);
			if(bullet.isLive == true){
				this.createBulleat(bullet.getX(),bullet.getY(), g, bullet.getColor(), bullet.getWidth(), bullet.getHeight());
			}else{
				if(bullet != null){
					this.myTank.clearBulletList(bullet);	
				}
				
			}
		}
		
		 
		
		//��ʼ���Ʊ�ը��ͼ��
				for(int i = 0; i < this.bombList.size(); i++){
					Bomb b = this.bombList.get(i);
					if(b.getIsLive()){
						this.bombPlay(b, g);
					}else{
						//�Ӷ���ɾ��
						this.bombList.remove(b);
					}
				}
	}
	
	//������ʾ��Ϣ
	private void Recorder(Graphics g){
		//������ʾ��Ϣ̹�ˣ���̹�˲�����ս����
		this.createTank(10, 320, g, 1, 1, null, Color.yellow);
		this.createTank(200, 320, g, 1, 1, null, Color.red);
		//�����ҷ�̹�ˣ��͵���̹�˵���
		g.setColor(Color.black);
		g.drawString("��������ʣ�ࣺ"+Recorder.getMyLife(), 40, 340);
		g.drawString("����̹��ʣ�ࣺ"+Recorder.getBadTanKNum(), 230, 340);
		//������ҵ��ܳɼ�
		g.setFont(new Font("����",Font.BOLD,20));
		g.drawString("�ܷ֣�" + Recorder.getKillBadTanKNum(), 450, 50);
		//��һ�����˵�̹��
		this.createTank(420, 30, g, 1, 1, null, Color.RED);
	}
	
	private void bombPlay(Bomb b, Graphics g){
		int bs = (int)Math.ceil((double)b.getLife() / 3);
		switch(bs){
		case 3:
			g.drawImage(this.image1, b.getX(), b.getY(), 30, 30, this);
			break;
		case 2:
			g.drawImage(this.image2, b.getX(), b.getY(), 30, 30, this);
			break;
		case 1:
			g.drawImage(this.image3, b.getX(), b.getY(), 30, 30, this);
			break;
		}		 
	}
	private void setTankAndBulleatStatus(Bullet b, Tanks tk){
		//���巽�� 1�� 2�� 0�� 3��
		Boolean isHit = false;
		int btMaxX = b.getX() + b.getWidth();
		int btMaxY = b.getY() + b.getHeight();
		int btMinX = b.getX();
		int btMinY = b.getY();
		
		int tkPTMaxX = 0;
		int tkPTMaxY = 0;
		int tkPTMinX = 0;
		int tkPTMinY = 0;
		int tkMaxX = 0;
		int tkMaxY = 0;
		int tkMinX = 0;
		int tkMinY = 0;
		//���巽�� 1�� 2�� 0�� 3��
		switch(tk.dir){
		case 0:
			//�ڹ�
			tkPTMaxX = tk.getX() + 8 + 4;
			tkPTMinX = tk.getX() + 8;
			tkPTMaxY = tk.getY() + 5;
			tkPTMinY = tk.getY();
			//̹��
			tkMaxX = tk.getX() + 20;
			tkMinX = tk.getX();
			tkMaxY = tk.getY() + 30;
			tkMinY = tk.getY();
			if((btMinX < tkPTMaxX && btMinX > tkPTMinX && btMinY < tkPTMaxY && btMinY > tkPTMinY) 
			|| 
			(btMaxX < tkPTMaxX && btMaxX > tkPTMinX && btMaxY < tkPTMaxY && btMaxY > tkPTMinY)
			||
			(btMinX < tkMaxX && btMinX > tkMinX && btMinY < tkMaxY && btMinY > tkMinY)
			||
			(btMaxX < tkMaxX && btMaxX > tkMinX && btMaxY < tkMaxY && btMaxY > tkMinY)
			){
				isHit = true;
			}
			
			
			;break;
		case 1:
			
			//�ڹ�
			tkPTMaxX = tk.getX() + 8 + 4;
			tkPTMinX = tk.getX() + 8;
			tkPTMaxY = tk.getY();
			tkPTMinY = tk.getY() - 5;
			//̹��
			tkMaxX = tk.getX() + 20;
			tkMinX = tk.getX();
			tkMaxY = tk.getY() + 30;
			tkMinY = tk.getY();
			if((btMinX < tkPTMaxX && btMinX > tkPTMinX && btMinY < tkPTMaxY && btMinY > tkPTMinY) 
			|| 
			(btMaxX < tkPTMaxX && btMaxX > tkPTMinX && btMaxY < tkPTMaxY && btMaxY > tkPTMinY)
			||
			(btMinX < tkMaxX && btMinX > tkMinX && btMinY < tkMaxY && btMinY > tkMinY)
			||
			(btMaxX < tkMaxX && btMaxX > tkMinX && btMaxY < tkMaxY && btMaxY > tkMinY)
			){
				isHit = true;
			}
			
			;break;
		case 2:
			
			//�ڹ�
			tkPTMaxX = tk.getX() + 12 + 5;
			tkPTMinX = tk.getX() + 12;
			tkPTMaxY = tk.getY() + 8 + 4;
			tkPTMinY = tk.getY() + 8;
			//̹��
			tkMaxX = tk.getX() + 20;
			tkMinX = tk.getX();
			tkMaxY = tk.getY() + 30;
			tkMinY = tk.getY();
			if((btMinX < tkPTMaxX && btMinX > tkPTMinX && btMinY < tkPTMaxY && btMinY > tkPTMinY) 
			|| 
			(btMaxX < tkPTMaxX && btMaxX > tkPTMinX && btMaxY < tkPTMaxY && btMaxY > tkPTMinY)
			||
			(btMinX < tkMaxX && btMinX > tkMinX && btMinY < tkMaxY && btMinY > tkMinY)
			||
			(btMaxX < tkMaxX && btMaxX > tkMinX && btMaxY < tkMaxY && btMaxY > tkMinY)
			){
				isHit = true;
			}
			
			;break;
		case 3:
			
			//�ڹ�
			tkPTMaxX = tk.getX() - 5 + 5;
			tkPTMinX = tk.getX() - 5;
			tkPTMaxY = tk.getY() + 8 + 4;
			tkPTMinY = tk.getY() + 8;
			//̹��
			tkMaxX = tk.getX() + 20;
			tkMinX = tk.getX();
			tkMaxY = tk.getY() + 30;
			tkMinY = tk.getY();
			if((btMinX < tkPTMaxX && btMinX > tkPTMinX && btMinY < tkPTMaxY && btMinY > tkPTMinY) 
			|| 
			(btMaxX < tkPTMaxX && btMaxX > tkPTMinX && btMaxY < tkPTMaxY && btMaxY > tkPTMinY)
			||
			(btMinX < tkMaxX && btMinX > tkMinX && btMinY < tkMaxY && btMinY > tkMinY)
			||
			(btMaxX < tkMaxX && btMaxX > tkMinX && btMaxY < tkMaxY && btMaxY > tkMinY)
			){
				isHit = true;
			}
			
			;break;
		}
		
		if(isHit){
			//System.out.println("--");
			//��Ѫ�����Ѫ�����ͼ�ȥѪ����
			int life = tk.getLife();
			if(life < 1){
				tk.isLive = false;
			}else{
				tk.setLife(--life);
			}
			
			b.isLive = false;
			//���������̹�˾ʹ���һ��ը����
			Bomb bob = new Bomb(tk.getX(),tk.getY());
			Thread thread = new Thread(bob);
			thread.start();
			this.bombList.add(bob);
		}
	}
	
	private void createBulleat(int x, int y, Graphics g, Color color, int width, int height){
		g.setColor(color);
		g.fill3DRect(x, y, width, height, false);
	}
	private void createTank(int x, int y, Graphics g, int dir, int type, Tanks tk, Color color){
		//ɫ��
		/*Color color = color;
		if(type == 0){
			color = Color.cyan;
		}else{
			color = Color.yellow;
		}*/
		
			
		switch(dir){
		case 0:
			//�������
			g.setColor(color);
			g.fill3DRect(x, y, 5, 30, false);
							
			//�ұ�����
			g.fill3DRect(x+15, y, 5, 30, false);
									
			//��
			g.fill3DRect(x+5, y+5, 10, 20,false);
			g.fillOval(x+5, y+10, 9, 8);
									
			//��Ͳ��
			g.fillRect(x+8, y+12, 4, 23);
			;break;//��
		case 1:
			//�������
			g.setColor(color);
			g.fill3DRect(x, y, 5, 30, false);
							
			//�ұ�����
			g.fill3DRect(x+15, y, 5, 30, false);
									
			//��
			g.fill3DRect(x+5, y+5, 10, 20,false);
			g.fillOval(x+5, y+10, 9, 8);
									
			//��Ͳ��
			g.fillRect(x+8, y-5, 4, 23);
			;break;//��
		case 2:
			//�������
			g.setColor(color);
			g.fill3DRect(x, y, 30, 5, false);
							
			//�ұ�����
			g.fill3DRect(x, y+15, 30, 5, false);
									
			//��
			g.fill3DRect(x+5, y+5, 20, 10,false);
			g.fillOval(x+10, y+5, 8, 9);
									
			//��Ͳ��
			g.fillRect(x+12, y+8, 23, 4);
			;break;//��
		case 3:
			//�������
			g.setColor(color);
			g.fill3DRect(x, y, 30, 5, false);
							
			//�ұ�����
			g.fill3DRect(x, y+15, 30, 5, false);
									
			//��
			g.fill3DRect(x+5, y+5, 20, 10,false);
			g.fillOval(x+10, y+5, 8, 9);
									
			//��Ͳ��
			g.fillRect(x-5, y+8, 23, 4);
			;break;//��
		}
		
		//��һ�γ�ʼ��̹���ǵĳߴ� �����������ļ���ó�
		if(tk != null && tk.getSizeH() == 0){
			tk.setSizeH(36);
			tk.setSizeCz(6);
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//�ж��ǲ��Ƿ����
		int dir = -1;
		//set tank position
		switch(e.getKeyCode()){
		case KeyEvent.VK_UP:
			this.myTank.moveTop();
			dir = 1;
			;break;
		case KeyEvent.VK_RIGHT:
			dir = 2;
			this.myTank.moveRight(this.activityW);
			;break;
		case KeyEvent.VK_DOWN:
			dir = 0;
			this.myTank.moveDown(this.activityH);
			;break;
		case KeyEvent.VK_LEFT:
			dir = 3;
			this.myTank.moveLeft();
			;break;
		case KeyEvent.VK_ESCAPE:
			if(Attribute.paused){
				Attribute.paused = false;
			}else{
				Attribute.paused = true;
			}
			;break;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE && this.myTank.bulletList.size() < this.myTank.getBulletNum()){
			//����
			this.myTank.fire(this.activityW, this.activityH);
			dir = 4;
		}
		
		//�������������
		if(dir!=-1){
			this.repaint();
		}
	}
	//���˴���
	private void setIsLive(Vector<Bullet> b, Vector<BadTanks> tk){	
		for(int i = 0; i < b.size(); i++){
			for(int j = 0; j < tk.size(); j++){
				this.setTankAndBulleatStatus(b.get(i), tk.get(j));
			}
		}		
	}
	
	//���˴����
	private void badKillGood(Vector<BadTanks> badList, GoodTanks tk){	
	    for(int i = 0; i < badList.size(); i++){
	    	BadTanks badTk = badList.get(i);
	    	for(int j = 0; j < badTk.bulletList.size(); j++){
	    		 this.setTankAndBulleatStatus(badTk.bulletList.get(j), tk);
	    	}
	    }
	}
	
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//ˢ���߳�
	public void run() {
		// TODO Auto-generated method stub
		while(panelThreadStatus){
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(Attribute.paused){
				continue;
			}
			
			//���˴��˵��ӵ���̹��״̬
			this.setIsLive(this.myTank.bulletList, this.badTanksList);
			//���˸ɵ�����
			this.badKillGood(this.badTanksList, this.myTank);
			
			this.repaint();	

		}
	}
}


/**
 * �Զ���ؿ�
 * @author Administrator
 *
 */
class MyPanelStart extends JPanel implements Runnable{
	//������Χ
	private int activityW = 400;
	private int activityH = 300;
	private int isShow = 1;
	public void paint(Graphics g){
		super.paint(g);
		g.fillRect(0, 0, this.activityW, this.activityH);
		//��ʾ��Ϣ
		if(this.isShow == 1){
			g.setColor(Color.yellow);
			g.setFont(new Font("������κ", Font.BOLD, 30));
			g.drawString("stage: 1", 130, 150);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){			
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(this.isShow == 0){
				this.isShow = 1;
			}else{
				this.isShow = 0;
			}
			
			this.repaint();
		}
	}
}