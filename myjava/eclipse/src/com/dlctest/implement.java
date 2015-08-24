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
		System.out.println("相机开始");
	}
	public void stop(){
		System.out.println("相机停止");
	}
}

class phone implements UsbInterfaces{
	public void start(){
		System.out.println("手机开始");
	}
	public void stop(){
		System.out.println("手机停止");
	}
}

class Master{
	public void Use(UsbInterfaces device){
		device.start();
		device.stop();
	}
}
 
