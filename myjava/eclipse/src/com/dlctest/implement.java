package com.dlctest;

public class implement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master p = new Master();
		p.Use(new phone());
		System.out.println(UsbInterfaces.a);
	}

}
class xiangji implements UsbInterfaces{
	public void start(){
		System.out.println("�����ʼ");
	}
	public void stop(){
		System.out.println("���ֹͣ");
	}
}

class phone implements UsbInterfaces{
	public void start(){
		System.out.println("�ֻ���ʼ");
	}
	public void stop(){
		System.out.println("�ֻ�ֹͣ");
	}
}

class Master{
	public void Use(UsbInterfaces device){
		device.start();
		device.stop();
	}
}
 
