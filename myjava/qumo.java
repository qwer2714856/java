/*
 * �ж��������Ƿ��������
 * ding.luchao
 * 20150821
 */
//�����
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.String;

public class qumo{
    public static void main(String []args){
        int a = 2;
	int b = 2;
	int x = 1;
	if(a % b == 0){
            System.out.println("ok");
	}else{
	    System.out.println("bad");
	}
	int q = (x--);
	System.out.println(q);

	try{
            //���������Ӽ��̽����� System.in�����׼�������
	    InputStreamReader isr = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(isr);

	    //������ʾ
	    System.out.println("�������һ����");
	    //�ӿ���̨��ȡһ������
	    String al = br.readLine();
	    System.out.println("������ڶ�����");
	    String a2 = br.readLine();

	    //��String->float
	    float d = Float.parseFloat(al);
	    float d1 = Float.parseFloat(a2);
	    System.out.println(d+d1);

	}catch(Exception e){
           e.printStackTrace();
	}
    }
}
