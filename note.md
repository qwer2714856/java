#��1��
�����ص�
1.java�����Ǽ򵥵�
2.java��������������
3.java�����ǿ�ƽ̨
4.java�Ǹ����ܵ�

��һ������
java������ԭ��
jdk ȫ�� java development kit
jdk ����jre һ��java���ߺ�java���������


jdk
1.jre(java���л���)
2.java�Ĺ��ߣ�������javac ������ java��
3.һ�ѻ������ 3600�����ס���õ���Ҳ��150��


jdk�İ�װע������
jdk �����ж��ֻҪװ�ĵط���ͬ�Ϳ���

jdk �� jre ������
jdk �ǳ���Ա�����õĿ�������
jre ��ִ��java����Ļ���jre�Ϳ���



=========================1========================
//ע��д��
//����
//����
//����
//public ��ʾ������һ��java fileֻ����һ��public class class ����Ҫ��file����һ��
//public static void main(String args[])  ������
//System.out.println('hello world')
//javac ���� ����.class file 
//java ������.class file ����ֻ��Ҫfile name ����Ҫ.class
//����д�ͱ���ͱ����ˣ�ͨ������ʾ

java source code �����java�������й�ϵ��
java source code .java file -> ͨ��javac����Ϊjava�ֽ���.class file->ͨ��java.exe�������������ֽ�����ص�java�����(jvm)->�����������ִ��
������С�������롣
java�ֽ��뱻���͵�������ڴ���������

===================================2====================
int a = 10;//����һ��int ���͵ı���
��ִ�е�ʱ��
���ڴ�������һ���ռ����һ��10,a���ǵ�ַ��ջ��int����������ٿռ�
һ��int 4���ֽ�32λ
long b=20
b ��ַ ����һ��long�ռ���20 ռ8���ֽ�
int a=10
int b=20
int result=a+b

һ���������һ������
�����е�������ǳ����еĶ���

java������������
1.��������
2.С�������㣩����
3.��������
4.�ַ�����

��������
byte һ���ֽ� -128-127
short �����ֽ� -32768-32767
int   �ĸ��ֽ� -2147483648-2147483647 
long  ���ֽ� -? �� ?
���� ��С��������
������
2��һ
���һλ����λ
0����
1����
���� 1 �� 0 0 ��1
���� ��һλ��һ

�����Ƹ���
���һ������λ
���Կ��ܳ���+-0
��Ϊ��0���Կ���������һȡ������127 ������������+1ȡ��
�����ӡ���˷�����
���С
byte -(2�����ֽ�*8-1���η�) �� 2�����ֽ�*8-1���η�-1 

short 

int   

long long ��������Ҫ����һ��l long=100l���ӻᱻ��int����
�������������ʽ

������е����� û�а취�������Կ���ʹ�������ַ��������ַ������������Щ����
�������Ƚ��鷳

С������
float 

double

float��ʾ�����ȸ������ڻ���ռ4���ֽڣ���32λ������������ 
double��ʾ˫���ȸ������ڻ���ռ8���ֽڣ���64λ������������

�������ڻ�����ָ����ʽ��ʾ���ֽ�Ϊ��������β����ָ������ָ���Ĳ��֡� 
����ռ1λ�����ƣ���ʾ���������� 
ָ����ռ1λ�����ƣ���ʾָ���������� 
β����ʾ��������Ч���֣�0.xxxxxxx,�����濪ͷ��0�͵� 
ָ����ָ������Ч���֡� 

ָ��ռ����λ��β��ռ����λ���ɼ����ϵͳ������ 
������������β��ռ24λ��ָ������ָ��ռ8λ -- float. ����ռλ1С��7 
������β��ռ48λ��ָ������ָ��ռ16λ -- double.     ����ռλ1С��15

֪�������Ĳ��ֵ�ռλ���������ƹ��ƴ�С��Χ���ٻ���Ϊʮ���ƣ����Ǹ���������ֵ��Χ��

�Ա����Ա��˵��double �� float ��������double���ȸߣ���Ч����16λ��float����7λ����double�����ڴ���float��������double�������ٶȱ�float���ö࣬java��������ѧ��������double �� float��ͬ����Ҫд�����õ�����ʱ��Ҫ��˫���ȣ���ʡ�ڴ棬�ӿ������ٶȣ���

boolean
boolean s = true
true false
	
�ַ�����
char
�����ַ�ռ2�ֽ�
��'aa'��ʾ

����ַ�
String����

˼��
int test='a'+'b'
a��ascii �� b��ascii��Ӹ�ֵ��test
char test2='a'+'b'
a��ascii �� b ��asscii ����Ȼ��õ���asciiת����ַ�,��Ϊ195��ascii��Խ�������Ծ��Ǹ�?
char test2='a'+23���Եõ�һ���ַ�
���ۣ�
��java�ж�char���мӼ���ת��ascii�������Դ���������ظ�int��������
����char ���Ƕ�Ӧ��ascii�Ķ�Ӧchar
�˷���Ҫ�Լ�����

char test3='��'//������unicode //char ������unicode����
һ��asscii��û�а취������
�������û������
int test3='��'//�����unicode��

�������
int a;
��ʼ������
int a=1;
��������ֵ
a=2;

�����������͵�ת��
int a=1.2;
���ܱ���ͨ��
�;��ȿ���ת�߾��ȣ���֮������
1.2�Ǹ߾������Բ��ܽ����;��ȵ�int
��ת�ͻ���ʧ���ȱ���

doucble b = 3;
����ͨ��
�;���ת�߾���û����
����
byte<short<long<float<double

float a=3.4
�������ȥ
��ΪĬ��С����double����
���Ը߾���ת�ͽ��Ⱦʹ���
��ȷ����
float a = 3.4f

��ΰѸ߾���ת�ɵ;���
int a = (int)1.2 
java �����С��λ��
int a = 1;
double b = 4.5;
a = b;
���� �߾���������ת����
b = a
�Ϳ�����
int a = 3;
int b = a + 3.4;
��������
�;��Ⱥ͸߾��Ƚ���Ԥ����Զ����߾���ת��
Ȼ��߾����и��;����������ֱ�����


���������
+-*/%
a++
a--
++a
--a

b+=a
b-=a
b/=a
b%=a


==
>=
<=
!=
>
<

System.out.println���
����
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

try{
InputStreamReader io = new InputStreamReader(System.in);//System.in��׼����
BufferedReader rd = new BufferedReader(io);

//��ȡ
String a1 = rd.readLine();
String a2 = rd.readLine();

float d1= Float.parseFloat(a1)
float d2 = Float.parseFloat(a2)
}catch(Execption e){
    e.printStackTrace();
}


ʲô�ǰ���
����İ�װ


&& || !

if else switch

switch �������ʽ
������switch(a)
Ӧ�ú�case ��������һ��
switch(data)
data�������Ƶ�
byte short init char enum ��


��̸�������
�Ƚ����������ֳ����ɼ���������
��ȥ�������Ƚϸ��ӵ����޶�С�ķ�Χ�ҹ����ڷŴ�

String a = "";
String a = new String();
���������һ�����ȥ�ڴ��������Ƿ������ֵ�о�ָ����û�оʹ�����
�ڶ��䲻����û�ж�Ҫ���ڴ����濪��һ���µ����������洢����




===============================����================================
java���Ͷ����� �������
java��������� ���췽��
1.��������java�е���Ͷ���
2.ʲô�³�Ա�����ͳ�Ա����
3.���չ��췽����ʹ��
�����Ǹ����������� 

������ø���Ĺ��췽��������super ������supper����������๹�캯������ǰ��
���ϣ���������У�ȥ���ø���Ĺ��췽����Ҫ��������Ĺ��캯�����á�

public class aaa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child a = new child();
		System.out.println(a.a);
	}

}
class parent{
	int a = 1;
	public parent(int a){
		this.a = a;
	}
}
class child extends parent{
	public child(){
		super(10);
	}
}


class Cat{
    //��Ա����
    int age;
    String name;
    String color;
    //��Ա����
}

Cat cat = new Cat();
Cat��һ��������������

//���Ƕ����������ģ���Ҫ�Լ�ȥ���壬����ʲô�Լ��Ͷ���ʲô,���ǳ���ģ�����һ�����
�������һ����������
���Ƕ����ģ�壬��������ĸ���ʵ����

ȫ�����Ķ���
package ����
class Cat extends Animal implements interface
{
    ��Ա����
    ���췽��
    ��Ա����
}
������������
class Cat{
    int age;
    String name;
    String color;
    Master myMaster;//è������ ����ı���������������
}
class Master{
   int age;
   String name;
   String adress
}


������������ַ���
1
Cat cat1;//������Cat����
cat1 = new Cat();//����Cat����
2
Cat cat1 = new Cat();

Parse p = new Parse();
p.age = 1;
Parse pClone;
pCloen = p;\\��ֵ���õ�ʱ��ҲҪע��������ͬһ����
��������󣬲����Ƿ�ֵ��������ڴ�ռ䣬���������Ŀռ��Ǹ������ض�������ݡ�java ��������ж�����ö�ָ�����������ô���һ�����øı��˶����ĳ��ֵ���е����ö����ı䣬��js��Щ��һ����

��Ͷ���Ĺ�ϵ
����ģ�崴�����ܶ���������ϵۣ���ģ�崴���˶���Ž��ڴ档
java���Լ����������գ�����Ҫ�ֶ�����java�����������һ������û��ָ�����������
Parse p = new Parse();
p = null;
���ʱ�򱻴������������ͳ�������
�ʵ���ʱ������գ������������Լ��Ļ��ơ�
����������jvm�Լ����ã����������ڴ治�������ͳ��������¡�



��ĳ�Ա����
�﷨
��Ա����Ҳ�г�Ա������
�ɼ��� ���غ������� �������������б�{
��䣻//������������
}
class P{
    int age;
    String name;
    public void spack(){
        System.out.println("���Ǻ���");
    }
    //����
    public void jisuan(){
        int result = 0;
        for(int i = 0; i < 1000; i++){
            result += i;
        }
       System.out.println(result);
    }  
    //���ղ���
    public void jisuan(int count){
       int result = 0;
       for(int i = 0; i < count; i++){
	    result += i;
        }
	System.out.println(result);
    }
    //�������͵�
    public int jisuan(int count){
        
    }
}
P p = new P();
p.spack();

//���ڵ�ͬ�����������ǲ�����ͬ,��ͬ��������,����ǲ�����ͬ��������ͬ�������Ͳ�ͬҲ����ֻ���ǲ�����ͬ���ܽ����ء�


//�������õ�ԭ��ͼ
p.jisuan(1);
�����Ὺһ����ջ����main������ȫ������ջ�ռ䣬ȥ��ջִ��jisuan�ڲ��Ĵ����ڰ���˳��ִ�е�ִ,�������������ڲ���int ����Ҳ������ջ�������Ͷ������Ժ�������û�й�ϵ��������ջ�ռ䡣���������ִ�к�����ص����������Ǹ�����ȥ,Ȼ���ڼ����ڵ��õ��Ǹ�����ִ��֪��main����ִ�н�����

����������
������������û�к������
����ӿںͳ�����
public int test(int a);

//���ó�Ա����ע��
�ڵ���ĳ����Ա������ʱ�򣬸����ľ�����ֵ���������ͣ���������ƥ�䡣
ע��С��Ĭ����double float���յ�ʱ��Ҫ��ȷָ����float���͵�
3.2F

�����ʲô��û�У�û�г�Ա���Գ�Ա������


��д��
1.�������
2.Ȼ������ഴ������

���췽��
������ֶ��������캯��������һ��Ĭ�Ϲ��캯���ġ�
����ֶ�����Ĭ�ϵľͱ���д������Ҫ�����Զ���Ĺ������ˡ�
class Parse{
    int age;
    String name;
    public ע��û���κ����� Parse(int age, String name){
       this.age = age;
       this.name = name;
    }
}
Parse p = new Parse(ag1, ag2);//�����͹��캯��ͳһ

!!!!**java������ж�����췽��
Ϊʲô��Ϊ���ص�Ե�ʣ���������������Ҫ��ͬ�ͻ��ж����ͬ�Ĺ��췽���ˡ�

Ĭ�Ϲ��췽��
���һ�����춼û��
ϵͳ���Զ�����
public Person(){

}
//��Ҫ�þ;���ȷ����д����
�Լ�д�˺���Զ�����д��


�ܽ᣺
1.���췽����������ͬ
2.���췽��û�з���ֵ
3.��Ҫ��������ɶ��¶����ʼ������ʼ����Ա����
4.�����¶����Զ����ù���
5.һ��������ж��������ͬ�Ĺ��췽����
6.ÿһ���඼һ��Ĭ�Ϲ��췽��

1.java�������
this
this �ı�Ҫ��
this �����ڶ���Ĳ�����ġ�
thisֻ�����ඨ�����á�

2.java�������
��ı���, �෽��
���ж�����ı����ͷ���
��̬������̬����
��̬�������Ա��κζ������,ֱ������Ҳ���Է�����.
Parse.total
ע��ֻ�þ�̬�Ĳſ���������ֱ�ӷ���,��ͨ�Ĳ�����ô��.
����ķ���
public static int a = 1;
�ܽ᣺
1.���ж��󶼹���
2.���Ա��κζ����޸�
3.�����������
4.���� ���η� static �������� ���� �������η����Բ���,���潫����
��д���η�Ĭ�Ͼ���public
5.��������
����.����
������.����
6.�洢�ھ�̬����
7.��̬�����
static{
    i++;
}

public class ss{
    static int a = 1;
    static {
        a++;
    }
    public ss(){
        a++;
    }
}
ss f = new ss();
ss.a // 3
ss.f1 = new ss();
ss.a //4
���;�̬�����ֻ�ڵ�һ��ִ��
Ҳ����˵Ĭ����1������̬�����Ϊ2
�������캯����3
�ٴ�ִ�е�ʱ��̬�ľͲ����ˣ�
�ڽ����캯����Ϊ4

��̬�Ķ����ǹ�����ʱ��ʹ����ˣ�������û��ϵ���������ʱ���������,���Ѿ�����������ˡ�

��̬����
public static int getStudentInfo(){

}
��̬����,���ж��󶼹���һ������,��ʡ��������̬����ֻ���þ�̬���ԣ��Ǿ�̬����Ҳ���þ�̬�����ԡ� 
������еľ�̬���Զ��þ�̬�������ʣ�������
��̬�ı��붼��public ��


3.�Ĵ�����
���ϵ���������
��̬(һ������Ķ���״̬)���̳С���װ������
����
����ȥ����һ�����ʱ��ʵ���Ͼ��ǰ�һ�����ﹲ�е����Է���ȡ�������γ�һ������ģ�塣�����о�����ķ���������˼�롣
��װ��
��װ���ǰѳ���������ݺͶ����ݵĲ�����װ��һ�����ݱ��������ڲ����������������ֻ��ͨ������Ȩ�Ĳ�������Ա�����������ܶ����ݽ��в�����
//���������еĳ�Ա���Զ���˽�е�
���ʿ������η���
public 
private
protected
Ĭ��

4�з��ʼ���ķ�Χ
���ʼ���       ���ʿ�����       ͬ��       ͬ��       ��ͬ������ ͬ������   ��ͬ��
����           public           ���Է���   ���Է���   ���Է���   ���Է���   ���Է���
�ܱ���         protected        ���Է���   ���Է���   ���Է���   ���Է���   �����Է���
Ĭ��           û�����η�       ���Է���   ���Է���   �����Է��� ���Է��� �����Է���
˽��           private          ���Է���   �����Է��� �����Է��� �����Է��� �����Է���
http://xuyanzhi6688.blog.163.com/blog/static/2920588920115178519198/

���ı�Ҫ��
����ͬʱ������ͬʱ��һ����������������ɳ�ͻ��
��ͬһ�������潨������������ͬ��class�ͻᱨ��
��ʹ����ͬһ��file����ͬ����classҲ���У�����ְ����塣
�½�һ������eclipse
��������com.xiaoming.a.a.a.a�������һֱ������ȥ������ò�Ҫ����5�㡣
com.xiaoming 
com.xiaoqiang
���Ƕ�������com�����������������Լ��Ŀռ䣬���ʱ��Сǿ��С���������Լ��ĵİ��½������ʱ�����Ǳ˴˽�һ������Ҳ���ᱨ���ˡ�
������������Ǳ˴˵İ��½���class eclipse���Զ����ϴ������
����
package com.xiaoqiang
package com.xiaoming
���ûὫ�����ɵ��ֽ���ŵ�com.xiaoqiang,����com.xiaoming����ȥ��
���õİ�
java.lang.* �Զ�����
java.net.* ���翪��
java.util.* ���߰�
java.awt.*���ڹ��߰�

�����
import java.util.*

ϵͳ���඼�����ģ�
ϵͳ������һ��CLASSPATH�Ļ��������Ǹ������Ǹ�ʲô��
��ʵ�Ǳ���д��һ�ѱ���õ�class �����һ��.jar file ��ȥ���á� 
jre/lib/rt.jar����Ҫ����classpathĬ�Ͼ����ҵ�

================================================================================

��JDK������CLASSPATH�е�dt.jar��tools.jar�������ļ������Ǹ�ʲô�ģ�����˵���dt.jar�ǹ���swing�� �������ȷʵ���Կ�����swing�йص��࣬˵������õ�swing��Ҫ������classpath������rt.jar�е�swing�� ��������������İ���swing����� ���о�����������������������������⣬����JDK�е�JAVAC�ȳ�������Ҫ����⡣ �����·���������������ǿ����ĳ�������ʲôӰ��?

��������������������������������������������������������������

��dt.jar��tools.jar������java������İ�����������˴�java����Ҫ��lang�������ָ߼���������ӻ���swing������java�ز����ٵġ�
��path�����bin���涼��java�Ŀ�ִ�еı��������乤�ߣ���java��javadoc�ȣ�����������ļ�����������cmd����javac��ϵͳ�����Զ��ټ�java�ı��������ǹ鹦�������������������  

rt.jar��JAVA������⣬dt.jar�ǹ������л�������⣬tools.jar�ǹ������  

������classpath����Ϊ������ import *  
��������������������������������������������������������������

webϵͳ���õ�tool.jar  

����winrar����������ʲô������  
---------------------------------------------------------------  

1.  
rt.jar Ĭ�Ͼ��� ��classloader�ļ���·������ ����claspath�Ƕ��һ��  
���������ȥ��classpath�����rt.jar  

Ȼ���� java -verbose XXXX �ķ�ʽ����һ���򵥵��� ��֪�� JVM��ϵͳ��Loader��·������  

����rt.jar jre/lib����Ĵ󲿷�jar �������·����   

2.  

tools.jar ��ϵͳ��������һ�����ʱ���õ��� Ҳ����javac��ʱ���õ�  

javac XXX.java  

ʵ���Ͼ�������   

java -Calsspath=%JAVA_HOME%/lib/tools.jar xx.xxx.Main XXX.java   

javac���Ƕ���������ķ�װ ����tools.jar Ҳ���üӵ�classpath����  

3.  
dt.jar�ǹ������л��������,��Ҫ��swing�İ� ��Ҫ�õ�swingʱ��ü���  


dt.jar������swing��һЩʲô�࣬Eclipse��������Ĭ�ϵ�JREҲû�а�������Ӧ��û�á�
tools.jarӦ�÷�������������JSP�ļ���Ӧ�÷������Լ�����أ�����Ҫ�Լ����á�


����path��classpath�ĺ��壺  
1.path�����ĺ������ϵͳ���κ�·���¶�����ʶ��java,javac����  
2.classpath�����ĺ����Ǹ���jvmҪʹ�û�ִ�е�class����ʲô·���ϣ�����JVM����class�ļ���.;��ʾ��ǰ·����tools.jar��dt.jarΪ���·�����������Swing����Ķ��������Բ���dt.jar�� tools.jar������������Ĺ����࣬����javac���������޷��������ġ�  


 1. rt.jar Ĭ�Ͼ��� ��classloader�ļ���·������ ����claspath�Ƕ��һ�� ���������ȥ��classpath�����rt.jar Ȼ���� java -verbose **X �ķ�ʽ����һ���򵥵��� ��֪�� JVM��ϵͳ��Loader��·������ ����rt.jar jre/lib����Ĵ󲿷�jar �������·����   
 2. tools.jar ��ϵͳ��������һ�����ʱ���õ��� Ҳ����javac��ʱ���õ� javac **.java ʵ���Ͼ������� java -Calsspath=%JAVA_HOME%/lib/tools.jar xx.**.Main **.java javac���Ƕ���������ķ�װ ����tools.jar Ҳ���üӵ�classpath����  
 3. dt.jar�ǹ������л��������,��Ҫ��swing�İ� ��Ҫ�õ�swingʱ��ü���  


dt.jar�ǹ������л��������,��Ҫ��swing�İ� 
tools.jar�ǹ���һЩ���ߵ���� 
rt.jar������jdk�Ļ�����⣬Ҳ��������java doc���濴�������е����class�ļ�

�����������Ҫ�Ķ���toos.jar������� , �ֱ���   
  sun.tools.java.*;   
  sun.tools.javac.*;



!!!����Ҳ���������ֶ���ָ��һ��CLASSPATH
============================================================================

�������
com.xiaoqiang.ssl v = new com.xiaoqiang.ssl();
System.out.println(v.m);
xiaoqiang ����������ssl�������public����û�а취����
mҲ������public
com.xiaoqiang.ssl����дʮ�ֵ��鷳����һ����λ��
����
import com.xiaoqiang.ssl
ֻ�����ļ��ڲ������������protected/private��
public class Test
{
    public static void main(String[] args)
    {
        ........
    }  
    private class Protected
    {
        protected String s = "Thinking in Java.";
    }
}


�̳�
ΪʲôҪ�̳�
//���ж�����й�ͬ���Ե�ʱ�����Ҫ���������Ȼ������ȥ�̳�����
class �̳�  extends
ע�����
1.�������ֻ�ܼ̳�һ�����ࣨ���̳У�
2.java�����඼��Object�������
3.jdk���д�Լ202����3777���ࡢ�ӿڡ��쳣��ö�١�ע�ͺʹ���
4.��������ǿ������ʹ��JDK�������ֲ�

�ڿ������Լ������һЩ�����Ҫ�̳б���
package luchao;
import javax.swing.*;
public class jFrame extends JFrame{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jFrame jframe = new jFrame();
		jframe.show();
	}
	
	public jFrame(){
		this.setVisible(true);
		this.setSize(200,200);
	}

}



�����ص�
1.������ͬ���ֵ���
2.��ܶ�Ļ��ܺù�����
3.���Ʒ��ʷ�Χ



���������أ����ǡ�
���أ�
����������ͬ����������ͬ����Ϊ���ء�
abc.getMax(12,4.5f)

public int getMax(int i, int j)
{

}
public float getMax(float i, float j){

}
�����õ�ʱ��ص������������Ϊint i ������߾��ȵ�floatת��

�򵥵�˵�����ͬһ�ֹ��ܵĶ��ʵ�ַ�ʽ��ʹ���ĸ����ڵ����ߴ��Ĳ�����
1.��������ͬ��
2.�����Ĳ��������͡�������˳��������һ����ͬ��
3.�����ķ������Ϳ��Բ�ͬ��
4.���������η����Բ�ͬ��

���ǣ�
ʵ�ʾ���������д����ķ�����

class Animal{
	int age;
	String name;
	//jiao 
	public void jiao(){
		System.out.println("��");
	}
	
}
//èè��
class Cat extends Animal{
	public void jiao(){
		System.out.println("����");
	}
	
}
//������
class Dog extends Animal{
	public void jiao(){
		System.out.println("����");
	}
}

�򵥵�˵���������Ǿ���������һ���������͸����ĳ�������� ���ơ�����ֵ������һ������ô���Ǿ�˵�����������������˸�����Ǹ�������

�ܵ�������
1.����ķ����ķ������ͣ���������������Ҫ�͸���ķ����ķ���ֵ���ͣ����ƣ�������ȫһ�����򱨴�
2.����ķ���������С����ķ���Ȩ�ޡ�
���縸����public �ķ������಻����ʹ��public���µ����η��Ÿ�д����.

����������
package luchao;

public class lianbiao3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked ln = new Linked(5);
		//ln.printForword();
		//ln.printBackWord();
		ln.play(2,2);
	}

}

/**
* Childed
*/
class Childed{
	int no;
	Childed nextChild;
	Childed prevChild;
	
	public Childed(int i){
		this.no = i;
	}
}
/**
* Link
*/
class Linked{
	Childed firstChild;
	Childed lastChild;
	Childed temp;
	Childed temp2;
	int len;
	//double linked list
	public Linked(int len){
		this.len = len;
		for(int i = 1; i <= len; i++){
			Childed c = new Childed(i);
			if(i == 1){
				//firstChild
				this.firstChild = this.temp = c;
			}else{
				this.temp2 = this.temp;
				this.temp.nextChild = c;
				this.temp = c;
				this.temp.prevChild = this.temp2;
				//lastChild
				if(i==len){
					this.lastChild = this.temp;
					this.temp.nextChild = this.firstChild;
					this.firstChild.prevChild = this.temp;
				}
			}
		}
	}
	public void printForword(){
		Childed tmp = this.firstChild;
		do{
			System.out.println(tmp.no);
			tmp = tmp.nextChild;
		}while(tmp != this.firstChild);
	}
	public void printBackWord(){
		Childed tmp = this.firstChild;
		do{
			System.out.println(tmp.no);
			tmp = tmp.prevChild;
		}while(tmp != this.firstChild);
	}
	
	public void play(int k, int m){
		Childed playTemp = this.firstChild;
		Childed deleteChild = null;
		//��k���˿�ʼ����m��
		if(k > 1){
			for(int i = 1; i < k; i++){
				playTemp = playTemp.nextChild;
			}
		}
		
		
		while(this.len > 1){
			if(m > 1){
				for(int i = 1; i < m; i++){
					playTemp = playTemp.nextChild;
				}
			}
			
			playTemp.prevChild.nextChild = playTemp.nextChild;
			playTemp.nextChild.prevChild = playTemp.prevChild;
			deleteChild = playTemp;
			playTemp = playTemp.nextChild;
			
			System.out.println(deleteChild.no);
			
			this.len --;
		}
		System.out.println("==============");
		System.out.println("last out:" + playTemp.no);
		
	}
}
  

������̬����
��ν��̬������ָһ������(����)�ڲ�ͬ����µĶ���״̬.
��Ҳ����������⣺��̬��ͨ��ָ�����ָ�룬�������ڲ�ͬ����ʵ�ַ�����
myeclipse �� eclipse(��Դ) �Ĳ��,myeclipse�̳�eclipse��
�Զ�Ϊ˽����������get �� set
����
private int age;
private String name;
���ѡ��
�Ҽ�->source->generate getters and setters->select all ->ok
�ͻ�Ϊ��ѡ�е�˽�����Զ���get��set����

package luchao;
/**
 * ��̬���ۺ�����
 * @author ding.luchao
 *
 */
public class duotai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master m = new Master();
		m.w(new Dog4(), new gt());
	}

}
class Animals3{
	String name;
	int age;
	public void eat(Food zl){
		System.out.println("�ҳ�"+zl.getZl());
	}
}

class Cat4 extends Animals3{
	public void eat(Food zl){
		System.out.println("è��"+zl.getZl());
	}
}
class Dog4 extends Animals3{
	public void eat(Food zl){
		System.out.println("����"+zl.getZl());
	}
}


class Food{
	String name;
	public String getZl(){
		return "";
	}
}

class fash extends Food{
	public String getZl(){
		return "����";
	}
}
class gt extends Food{
	public String getZl(){
		return "��ͷ��";
	}
}


class Master{
	public void w(Animals3 a, Food b){
		a.eat(b);
	}
}

�ܽ᣺
�����һ�䣬һ�����������ڲ�ͬ����µĶ���״̬��
java����������ñ��������������ʵ������
Animal a = new cat();

�����ࡢ�ӿڡ�final
������
�ӿ�
final

������
abstract ���ε����ǳ����࣬abstract ���εķ����ǳ��󷽷���
���󷽷����붨���ڳ��������档
�������Ҫ�̳г����������Ҫʵ�ֳ���������ĳ��󷽷�.
�����಻�ܱ�ʵ����a
����������зǳ��󷽷�
��������Զ�û�г��󷽷�


�ӿڣ�
�ӿ������س��ĳ�����
�﷨
class ���� implements interface{

}
һ����Ҫ��ԭ�򣬵�һ����ʵ����һ���ӿڣ���ô�����ͱ���ʵ�ָĽӿڵ����з�����ʵ�֡�
package com.dlctest;

public class implement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Master p = new Master();
		p.Use(new phone());
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

package com.dlctest;

public interface UsbInterfaces {
	public void start();
	public void stop();
}

�ӿ�Ҳ������һ�ֶ�̬����Ϊ��master

ע������
1.�ӿڲ��ܱ�ʵ������
2.�ӿ����з���Ҳ���������� a();
3.�����������ʵ�ֵķ������ӿڲ������У�����ֻ�з�ʵ�ַ�����
4.�ӿ��Ǹ��ӳ���ĳ�����
5.һ�������ʵ�ֶ���ӿ� implements a,b
6.�ӿ��п��б���,�ӿ����治��ֱ��дint a;�������������int a = 1;
��ok�ˣ�����һ�£�����˵һ��
�ӿ��п����б�����������private �� protected �����η�
a�ӿ��еı����������϶���static��final����,������Ӳ����ڽӿ��У���Ϊȫ�ֱ���ʹ�á����ʵ���ʽ���ӿ���.������(���Ǹ����ɣ���Ϊ����Ϊȫ�ִ���)
һ���ӿڲ��ܼ̳������࣬���ǿ��Լ̳б�Ľӿڡ�
�ӿڼ̳нӿ�

interface UsbInterfaces extends hi ��������ӿڼ̳���ok��
���
class xiangji implements UsbInterfaces extends hi �����ͱ�����ԭ���ǲ����ټ̳�����ʵ�ֵĽӿ��ڼ̳нӿ�.
java û�ж�̳�����ʹ�ýӿھͿ����ֲ���һ��
class x implements a,b,c ����ͬʱʵ�ֶ���ӿڵķ�����
��ʵ�ֽӿڵ�ʱ��û��ʵ�ַ����ᱨ�����Ե���Ǹ�����Ȼ��ѡ��add ...

�ýӿ����ֶ�̬
ǰ�ڰ��ڱ����ʱ��ȷ�����͵ġ�
���ڰ�����˵��̬ a(interfaces car) ��������һ���ӿڱ�����ǰ�ڵ�ʱ��֪�����ᴫ���Ǹ�����ֻ�����в��ܸ���ʵ��ȷ�������Ľ������ڰ�

final��ʹ��
�������յ�
�������α����ͷ���
1.����ϣ�������ĳ�����������า�ǣ�������final
2.����ϣ�����ĳ��ֵ�޸ģ�����Ǳ�����final�ı��븳ֵ��ֵ����û�а취����,final ���εı���һ�������������һ��ʹ��aaa_bbb_ccc��������������Ժ���û�а취�ڸ�ֵ�ġ�

ʲôʱ������
��ȫ�Ŀ���
��ϣ�������޸�
��ϣ�����˼̳�
ĳЩ����ֵ�ǹ̶�
3.����ϣ�����̳� final class a����û�а취�̳С�

int a ���������ֵ�Ƕ��٣�
Ĭ��0

==========================================================================
����
һά����
[] arr , arr [] ������
int arr[] = new int[6];
����һ��������int���͵����鳤����6
�ڴ����濪��һ��arr��int���͵Ŀռ䳤����6,ÿһ����Ԫ����int����
��0��ʼ��
���鲻��Խ�����
���֪�������С
arr.length; 

int a [] = {1,2,3,4,5,6,7,8,9};
�൱��
int a [] = new int [9];
Ȼ����for a[i]��ֵ������Ǹ���

�������飺
�������
class Dog{
    String name;
}
�����������
Dog a [] = new Dog[5]//������5���� 
a[0] = new Dog();
Dog [] a = {new Dog()};//�������ġ�



���򣬲���

��ά����

������ַ����ڱȽϵ�ʱ������==  ���ǱȽϵ��ǵ�ַ
��Ҫ�õ�һ������
equals
str.equals("aaa")
equals �����ִ�С��
�����ִ�С����
equalsIgnoreCase

С��
1.������Ҫ�ô����ͬһ���͵����ݡ�
2.����������int float...����,����ֱ�Ӹ�ֵ
3.�������鶨���,��ֵʱ��Ҫ��Ϊÿ���������ռ伴newһ��
4.�����С��������ȷ��,ArrayList���Խ��
ArrayList<String> list = new ArrayList<String>();
�������String�ñ�����Ͷ�����
5.�������������Ϊָ�������ַ������
6.������±��Ǵ�0��ʼ��ŵġ�
7.int a[] = new a[x];���x�������ȶ��壬���ǲ������Դӿ���̨���룬�������ʱ�����Ҫ���ֵ��

����
1.�ڲ�����
ָ����Ҫ������������ݶ����ص��ڲ��洢���н�������
��������������ѡ�����򣬲�������
1.��������

2.ð��

3.��������
�����������ڲ������Ƕ�������Ԫ���Բ���ķ�ʽ��Ѱ��Ԫ�ص��ʵ�λ�ã��Ѵﵽ����Ŀ��

 ���������Ϊ

 1.��������
 2.л������
 3.����������


.��������


��������

ѡ�����������Ͷѵ�˼��
ϣ������
����������

������������
�ϲ�����
ֱ�Ӻϲ�����




//��ȡʱ���ʴ�
Calendar c1 = Calendar.getInstance();
long c1s = c1.getTimeInMillis();
�Ƚ�����ʱ��������Ҫ��newһ��
Calendar c2 = Calendar.getInstance();
long c1s2 = c2.getTimeInMillis();
cls2-cls1����

java ��ֵ���ݣ����ݶ����Ǵ����÷�ָ�롣

code
    




2.�ⲿ����
��������û�а취���ص��ڴ��У���Ҫ�����ⲿ�洢��������������ϲ�����ֱ�Ӻϲ�����



=========================================================����===========

package array;
import java.util.*;
public class paixu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Px p = new Px();
		//��ȡʱ��
		//��ʵ��
		//��ȡʱ��
		Calendar c1 = Calendar.getInstance();
		long c1s = c1.getTimeInMillis();
		p.Ks(100000);
		//p.Cr(100000);
		//p.mp(100000);
		//p.ks(100000);
		//��ȡʱ��
		Calendar c2 = Calendar.getInstance();
		long c2s = c2.getTimeInMillis();
		System.out.println("time="+(c2s-c1s));
	}

}

class Px{
	 
	//ð������ Ч�����
	public void mp(int count){
		double a [] = new double[count];
		for(int i = 0; i < a.length; i++){
			a[i] = i * Math.random();
		}
		double tmp = 0.0;
		for(int i = 0; i < a.length - 1; i++){
			for(int j = 0; j < a.length - 1 -i; j++){
				
				if(a[j] > a[j+1]){
					tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	
	
	//ѡ������ Ч�ʱ�ð�ݸ�
	public void ks(int count){
		double a [] = new double[count];
		for(int i = 0; i < a.length; i++){
			a[i] = i * Math.random();
		}
		double tmp = 0.0;
		for(int i = 0; i < a.length-1; i++){
			double temp = a[i];
			int idx = i;
			for(int j = i+1; j < a.length; j++){
				
				if(temp < a[j]){
					temp = a[j];
					idx = j;
				}
			}
			tmp = a[i];
			a[i] = a[idx];
			a[idx] = tmp;
		}
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	//��������
	public void Cr(int count){
		double a [] = new double[count];
		for(int i = 0; i < a.length; i++){
			a[i] = i * Math.random();
		}
				
		//��������˼������ñ����ǰ�����д���бȽ�
		for(int i = 1; i < a.length; i++){
			double insertNode = a[i];
			int prev = i - 1;
			while(prev >= 0 && insertNode < a[prev]){
				a[prev + 1] = a[prev];
				prev --;
			}
			a[prev+1] = insertNode;
		}
		 
		
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		
	}
	
	//��������
	public void Ks(int count){
		double a [] = new double[count];
		for(int i = 0; i < a.length; i++){
			a[i] = i * Math.random();
		}
		
		//����˼�����ȡ�м����������ߣ�Ȼ����ȡ�м����������ߡ�
		this._ks(0, a.length-1,a);
		
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	/**
	 * 
	 * @param left ����±�
	 * @param right �ұ��±�
	 * @param arr ����
	 */
	private void _ks(int left, int right, double arr []){
		 int l =left;
		 int r = right;
		 double md = arr[(int)((l+r)/2)];
		 double tmp;
		 while(l < r){
			 while(arr[l] < md)l++;
			 while(arr[r] > md)r--;
			 if(l >= r)break;
			 tmp = arr[l];
			 arr[l] = arr[r];
			 arr[r] = tmp;
		 }
		if(l == r){
			l++;
			r--;
		}
		if(left < r) this._ks(left, r, arr);
		if(right > l) this._ks(l, right, arr);
	}
	
}

=========================================================================


����

˳�����

���ֲ���
��û�����еı�Ϊ�����Ȼ�����ö��ֲ���
˼������ȸ��м�ıȽ�Ȼ�����ж�������һ����ұ��ң�Ȼ��ݹ�������

package array;

public class arrayFind {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ef e = new Ef();
		e.ef();
	}

}
class Ef{
	public void ef(){
		
		int rs;
		int ay [] = {1,2,3,4,5,8};
		rs = this.find(0, ay.length - 1, ay, 2);
		System.out.println(rs);
	}
	private int find(int l, int r, int arr [], int val){
		 
		 
		int m = (l+r)/2;
		int rs = -1;
		int rs2 = val - arr[m];
				
		 
		if(rs2 > 0 && r != m){
			rs = this.find(++m, r, arr, val);
		}else{
			if(rs2 < 0 && l != m){
				rs = this.find(l, m, arr, val);
			}
		}
	
		 
		if(rs2 == 0){
			rs = m;
		}
		
		
		return rs;
	}
}



��ά����
int a [][] = new int[2][3];

������
��������
�����һ
0 1 ��ʾ������ʾ�ȶ�
ʵ�ʵ�������1m/8 Ϊʲô�ǳ���Ϊ���õ��Ǳ���
1�ֽ�=8������
�������Ӳ��
1m = 1000k ����1024����ʵ�ʻ��в�

���λ�Ƿ���λ 0 ���� 1����

1.�����Ƶ����λ�Ƿ���λ��0��ʾ������1����
2.������Դ�룬���룬���붼һ��
3.�����ķ���=����Դ�����λ���䣬����λȡ��
4.�����Ĳ���=���ķ����1
5.0�ķ��룬���붼��0
6.java 	�����з��ŵ�
7.�����ʱ�򣬶����Բ���ķ�ʽ������ġ�

������м����ǲ������ʽ,�����Ķ��������Ҫ��ԭ�ɱ�������ĿҪ�����������
1111 1111 ����Ǹ������Ƶ�-1
���Ի����Դ����
1111 1110 ȥ������õ�����
1000 0001 ȡ��ȥ������õ�ԭ����Դ��õ�10��������

��ס�����Ƶĸ�����Զ�����Բ������ʽ���ڵģ�Ȼ�����������Ҳ���ò��룬�������Ҫ�����ʾ�Ǿͱ��뻻���ʮ���ƣ�����Ҫת��Դ�룬��תʮ����,�������ʱ���ǲ���

!!!!�������������󣬶����Ƹ�λ��0��ס�ͱ����ˣ�����Ǹ�����������ת�ĵ�Դ�룬�����ʮ����

ע��ȡ����~��ͬ~��������㲹���ʱ��ȡ������λҪ���ű䣬���������λ�ǲ���ġ�


����
System.out.println("~"+(~2));


Դ�룬���룬����


λ����

��λ�����
>> ���� �Ƴ�ȥ���ÿ�λ�÷���λ�����ֲ�λ������λ���� 1 >> 2 = 0 (��0 ��1 )
<< ���� ����λ������0����λ
>>> ���λ���Ƴ���λ��0ע�����λҲ�ƶ�


		System.out.println("~="+(~2));
		System.out.println("&="+(3&2));
		System.out.println("|="+(3|2));
		System.out.println("^="+(3^2));
		System.out.println("-="+(~ -5));
		System.out.println("-6^6="+(-6^6));
		
		System.out.println("1>>2="+(1>>2));
		System.out.println("-1>>2="+(-1>>2));
		System.out.println("-1<<2="+(-1<<2));
		System.out.println("1<<2="+(1<<2));
		System.out.println("1>>>2="+(3>>>2));
		System.out.println("1>>>2="+(-3>>>2));



�ܽ�ֻҪ���㲻����Ϊ���㻹����λ����ͳͳ�Բ������ʽ����


���Ͽ�ܣ�������ͽӿڣ�
Ϊʲô��Ҫ?
package jikekuangjia;
import java.util.*;
public class question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����Ƕ����ģ������޷����������Ĵ�С��
		Yg yg[] = new Yg[10];//���ھ���������ⶨС�˲����ô����˷�
		yg[0] = new Yg("ding.luchao", 28, 85.2F);
		
		//�ü������OK��
		//���������Ҳ���㲻�˾ʹ��������ˣ�ǿ�ҽ���ѧ����
		//--------------List�ṹ------------
		//ArrayList
		//LinkedList
		//Vector
		//Stack
		//---------------Map�ṹ------------
		//HashMap
		//Hashtable
		//---------------Set�ṹ------------
		//HashSet
		//TreeSet
		//---------------Queue�ṹ����
		//Queue
		//���������ɾ�Ĳ�
		
		//����ArrayList ����
		ArrayList a = new ArrayList();
		//��ArrayList ���һ�����ݣ�������object,�������κε�object���͡�
		//����һ��ְԱ
		Yg firstYg = new Yg("ding.luchao", 29, 38.5F);
		//��firstYg ���뵽a��ȥ ����addȥ���ĵ���Ĭ�ϲ鵽β��
		a.add(firstYg);
		//�����и�����˵���£�a.add(firstYg)��������a�Ķ����������¿�����һ����firstYg��С�����򣬶��Ǵ����ָ��firstYg�����õ�ַ��
		
		//��η���ArrayList������
		Yg as = (Yg)a.get(0);//��Ϊ���ص���Object������Ҫǿתһ��	
		System.out.println(as.getName());
		
		//�ɲ����Է���ͬ���Ķ����ǿ��Ե�
		
		//ɾ��һ������
		a.remove(0);
		
		//��ʾ��С ��ʾ����
		System.out.println(a.size());
	}

}

class Yg{
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	private int age;
	private float sal;
	
	public Yg(String name, int age, float sal){
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
}
//��ֹ������������java�������Ҳ�����˳�ϵͳ
System.exit(0) 
System.exit(-1)
0��-1������
0:�����˳�
��0:��0�Ĵ����쳣�˳�

LinkedList --ջ�����������
��ArrayList ����2������addFirst  addLast ���б��ͷ��β�����롣ջ�Ͷ��еĸ���
                                 getFirst ��ͷȡ getLast��βȡ

//���̵߳����ܸ����̵߳�
Vector ����
Vector vector = new Vector()

Stack ջ
Stack stack = new Stack()

Vector��Stack���̰߳�ȫ
ArrayList��LinkedList�����̰߳�ȫ
LinkedList��˫������
ArrayList��Vector��Stack������
http://blog.csdn.net/a19881029/article/details/9408649

HASH
package jikekuangjia;
import java.util.*;
public class hash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap();
		
		Emp emp1 = new Emp("ding.luchao",26,22.5f,001);
	  
		//��emp1����hashMap����
		//key value
		//value����emp1����
		hm.put(emp1.getName(), emp1);
		//ע������е���Ҫ˵����arraylist���������ͬ�������ǲ��Ḳ�ǵģ���HashMap���������ͬ��key �ǻط������ǵ�
		//key��Ψһ��
		hm.put(emp1.getName(), emp1);
		//����ding.luchao������
		if(hm.containsKey(emp1.getName())){
			System.out.println("exists");
			//ȡ������
			Emp getEmp = (Emp)hm.get(emp1.getName());
			System.out.println(getEmp.getAge()+"--"+hm.size());
		}
		//����HashMap
		//������ 
		Iterator it = hm.keySet().iterator();
		//�Ƿ������һ��
		while(it.hasNext()){
			//ȡ��key
			String key = it.next().toString();
			Emp tmp = (Emp)hm.get(key);
			System.out.println(tmp.getAge());
		}
	}
}
class Emp{
	private String name;
	private int age;
	private float pay;
	private int num;
	
	public Emp(String name, int age, float pay, int num){
		this.name = name;
		this.age = age;
		this.pay = pay;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getPay() {
		return pay;
	}
	public void setPay(float pay) {
		this.pay = pay;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}

HashMap �� Hashtable �÷�����ȫһ��

===================�������һЩ����============
HashMap �� Hashtable������?
��ͬ�㶼�����������java����
���֣�
1.Hashtable �ǻ��ھ͵�Dictionary��ģ�HashMap��java 1.2������Map�ӿڵ�һ��ʵ��
2.Hashtable ��ͬ����׼ȷ��˵���߳�ͬ����������е�һЩ������֤��Hashtablez�еĶ������̰߳�ȫ�ġ�
HashMap���첽�ģ����HashMap�еĶ��󲢲����̰߳�ȫ�ġ���Ϊͬ����Ҫ�˷�Ч�������������Ҫ�̵߳İ�ȫʹ��HashMap��
3.HashMap��������Ŀ�ֵ��Ϊһ����Ŀ��key��value
Hashtable�����Է����ֵnull

ArrayList �� Vectora ����
��ͬ�㶼�����������java����
1.Vector ��ͬ����
2.�������� �Զ����� ArrayList ��չ50% Vector ��չ 1��
���罫������������һ�������ˣ������Զ�����չһЩ�ռ�������������˵��û��װ������չ�Ŀռ䣬��Ҳ��ռ��ô��ĵط���
Vector 1�����˱�2����2�����˱�4���ĸ����˱�8����������
ArryList ��50%
���Կ������������������Vector�Ƚ������ƣ������ļ���С��
���������С��������Vector ����ɿռ��˷ѡ�
�����㴴����ʵ�ʵĿռ�����Ϊ���Զ����㴴����һ���ֿռ���


�ܽ�һ��
1.���Ҫ���̰߳�ȫ����Vector Hashtable
2.�����Ҫ���߳�ArrayList LinkedList HashMap
3.��ֵ��HashMap HashTable
4.��������ͬʱ�̰߳�ȫ����Vector,����������ÿ����̰߳�ȫҲ��Vector�ɣ���С�Զ����ٿռ�ļ��ʡ�

����һ��
���ݼ��Ͻӿ�List Map Set Queue
���Կ���
List a = new ArrayList();
List b = new LinkedList();
��Ȼa,bֻ�ܷ������ǽӿڶ���ķ��������Ƕ��ӵķ����ǻ�ȡ�����ġ�


������
����߳���û�з���������£�ͬʱ����һ�����ݡ�
�����ĸ�����������
��һ���߳��ڹ����������߳���Ҫ�ȴ�.




����(��Щ�����ͷ���) ������ʲô�Ƿ���
���͵ĺô��ڱ����ʱ�������Ͱ�ȫ���������е�ǿ��ת�������Զ�����ʽ�ģ���ߴ���������,ע�������int ������<Integer>��
package jikekuangjia;
import java.util.*;
public class fanxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList dogList = new ArrayList();
		Dog dog1 = new Dog();
		//���뵽������
		dogList.add(dog1);
		//ȡע�������и�ǿת�Ķ���,�����ǿת�ͱ�����,�����и���ȫ������
		Dog tmp = (Dog)dogList.get(0);
		//ע�⿴�����ȫ����
		/*Exception in thread "main" java.lang.ClassCastException: jikekuangjia.Dog cannot be cast to jikekuangjia.Cat
	at jikekuangjia.fanxing.main(fanxing.java:17)*/
		//�����ʱ��֪���ŵ���ʲô�����������оͱ�����
		Cat cat1 = (Cat)dogList.get(0);//��������û������ģ�����������лᱨ������ת��ʧ�ܣ�Ϊʲô����Ϊ��ǿתè��
		
		//��������������÷���
		//���������Ϊ ArrayList<Dog> dogList = new ArrayList<Dog>();
		//��ôCat cat1 = (Cat)dogList.get(0);�ͻᱨ��
		//��<����>�� ������Ƿ���
		//Dog tmp = dogList.get(0); ����Ҳ����(Dog)ǿת�ˡ�
		
		
		
		
	}

}
class Cat{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	private String color;
}
class Dog{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	
}

��ⷺ�;���һ��㷺�������㴫����ʲô�������Ǹ�ʲô��
����
//�����һ����  <T>�Ǹ����ͣ����ǲ�֪�������Ǹ�ʲô����
class Gen<T>{
	private T c;
	public Gen(T str){
		this.c = str;
	}
	//�õ�T���͵�����
	public void getC(){
		System.out.println(this.c.getClass().getName());
	}
}
���õ���Gen<Integer> a = new Gen<Integer>(2);
���ﻹ���ڱ����ʱ����ʵ���㴫���ǲ���һ��Integer���͡�����(2)���
a.getC();
���ﷺ��ָ����integer��Ϊ����һ��integer
ʵ���ı���.getClass().getName();//�õ�����
Integer a = 1;
a.getClass().getName();//��ȡ�������
<�е�ֵ>����������������Integer Float Boolean�ȵ�
����βο��������⵫��ʵ�δ���ʱ�����������
class SQL<T>
SQL<String>
���ʱ��T���Ǹ�String
java�ķ�����ƣ�Ҳ��java�ľ����÷���
��������Ǹ������Ϊ��
this.c.getClass().�����кܶ��ȡ��this.c���ֵ�ģ���һЩ������
this.c��ʵ��һ��ʵ��2��Integer��ʵ��""��String��ʵ��
ʵ��.getClass().ͨ��ֵ���䵽��õ�һЩ�����Ϣ��
����
import java.lang.reflect.Method; ������Ƶİ�
Method [] a = this.c.getClass().getMethods();
//�õ�����һ��Integer������ķ���
Method [] a = this.c.getClass().getMethods();
//��ӡ
for(int i=0; i<a.length; i++){
    System.out.println("����"+a[i].getName());
}
ͨ����������˽���ĺܶ���Ϣ

�ڶ������ʱ�����û�а취ȷ��ĳЩ���Ե����;���Ҫʹ�÷���
class A<��֪��ʲô����>{
 private ��֪��ʲô���� a;
}
A<����ȷ�ϵ�������String> a = new A<����ȷ�ϵ�������String>(ʵ�����ʱ��������ͻ�����ʵ�����м��鿴���ֵ�Ƿ���String��ʵ��)

���ʱ��
class A<���ȷ�ϵ����;�ȷ��������>
�о�������ڶ�̬���õ�

�ܽ�
1.���Ͱ�ȫ
2.������
3.�����ϧ
4.���ܽϸߣ��÷���java��д�Ĵ������Ϊjava�����������������������Ϣ(������Ϣ)����Щ��Ϣ��java��������һ���Ż��ṩ������


�쳣 ����java�е��쳣���� �����ֳ���û�а취���Ƶ��ⲿ�������⣨�û��ṩ��file�����ڣ�file�����𻵡���������ȵȣ�ʱ,java�ͻ����쳣������������
java�д����쳣��2�ַ���
1.�ڷ����쳣�ĵط�����
2.���쳣�׸������ߣ��õ����ߴ���
ʹ�ú��쳣�������ܽ�׳��

�쳣
���֣�������쳣���������쳣������
������쳣��java.lang.Exception �����ʱ��ͻ�����ܻ����쳣�ĵط�Ҫ������߱�������
�������쳣: java.lang.RuntimeException ������û�а취���ֵ�,���е�ʱ��ŷ��֣���������Խ�硣
����:java.lang.Error ���������Ѽ�鵽�ġ�
�������java.lang.Throwable�⼸���쳣�����������ࡣ
java.lang.Exception �� java.lang.Error�̳�java.lang.Throwable
java.lang.runtimeExcetion �̳� java.lang.Excetion

import java.io.*;
import java.net.*;
public class trys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������쳣������ǳ���Ĵ���Ϊ������������ͨ���ļ��򲻿��ȵ�
		//���ܿ�����Զ�̵��޸ĵȵ�
		//��һ�������ڵ��ļ�
		//�������ܴ�����������������Ҳ�������ļ���ô�죬������Ҫ���㴦������Ҳ������쳣��
		//���־��Ǽ�����쳣�������ھͱ����ˡ�
		//FileReader fr = new FileReader("d:\a.txt");
		//����IP
		//����Ϊ�����д����������Ҫ����
		//Socket sock = new Socket("127.0.0.1", 80);
		//���������ڿ���Ԥ�����쳣
		
		
		
		//�����쳣--ֻ�������е�ʱ�����֪�� ���봦��
		//��������Խ�磬0����
		//int a = 4 / 0;//����û�д����������ͱ�����
		/*Exception in thread "main" java.lang.ArithmeticException: / by zero
	at trys.main(trys.java:25)*/
		//int [] as = new int[10];//����Խ��
		//System.out.println(as[100]);
		/*
		 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100
	at trys.main(trys.java:29)
		  */
		
		
		//�����Ĵ���Դ�ڳ����BUG���ܳ���ľ��ˡ�
		//����������򣬵��ڴ����ʱ���ڴ�ľ���
		//��õ��ģ��еĸ������кܴ��ϵ�������������еı��ⲿ����������ɱ������ȵȡ�
		
		
		
		//�����쳣 �Ľ������
		//���������ĵ㿪ʼ�ж�
		//���
		//1.try catch
		//2.ʹ�� throw�Ӹ�������
		//��󲶻񣬲���ʲô����඼��Exception�����񣬳��ã�
		/*try{
			FileReader fr = new FileReader("d:/a.txt");
		}catch(Exception e){//���Ǹ���󲶻�,����ʲô�쳣ͳͳ��catch����
			//����쳣��Ϣ�������Ŵ�
			//e.getMessage ���������Ϣ ��ҪSystem.out.println
			//e.printStackTrace() ֱ�Ӿ����������Ϣ
			
		}*/
		
		//��С����,���ô�Exception�����ö�Ӧ�Ĵ��󲶻�,��ʲô�쳣�Ͳ���ʲû�쳣��	
		/*try {
			FileReader fr = new FileReader("d:/a.txt");
			Socket sock = new Socket("127.0.0.1", 80);
		} catch (FileNotFoundException e) {//��С�������һ�ִ���������滹�������������ֲ����ǲ�����
			// TODO: handle exception
			e.printStackTrace();
		} catch(IOException e){//���ִ������Ҫ����С�ľ�ȷ���񣬾���Ҫʹ�ö��catch���ֱ𲶻�
			e.printStackTrace();
		}*/
	
		//���鲻�÷���ôϸ��,ֱ����Exception�������еġ�

		//finally
		FileReader fr = null;
		try {
			fr = new FileReader("d:/a.txt");
		} catch (Exception e) {
			// TODO: handle exception
		} finally{//�����ǲ��ǳ������쳣ͳͳ�������������ú��Զ��׼���һ��˵����Ҫ�رյ���Դ�����ļ����ڴ棬���ݿ�ȵȡ���
			 if(fr != null){
				 try{
					 fr.close();//�ر���Դ�Ǳ���Ĳ����Ƿ�ɹ�
				 }catch(Exception e){
					 
				 }
			 }
		}
		
		//try catch finally ��һ��Ҫ���߶��������
		//һ�����������һ�����
		
		//���¼������finally ��һ����ִ��
		//finally ���з������쳣
		//�������ڵ��߳�����
		//�ڴ�����ʹ��Systen.exit(Number)
		//�ر�cpu
		
		
		
		
		
	}
}
class test{
		//�׸������� -- throws Exception
		//˭����test���hi������˭��Ҫ��������
	    //��������߶����������쳣�ͽ����������
		public void hi() throws Exception
		{
			FileReader fr = new FileReader("d:/a.txt");
		}
}

//��� printStackTrace()�����˺ܶ����ע���һ����ʼ�����λ�ã���Ϊ�����ܿ����ǵ��������˴���


InputStreamReader ipt = new InputStreamReader(System.in);
BufferedReader rd = new BufferedReader(ipt);
rd.close�ر����������ر����Ͳ��ùر�ipt��


һ�����������ֵɾ��
��ʵ���Ի�һ��˼�룬����ֵ��Ϊ-1����

switch ���ж������в� ���Խ�����/10�õ���һ��int���ܹ���ȷ֪�����ĸ������εġ�

��ά����ĸ�ֵ
int a[][] = {{1,2,3,4},{1,2,3,4},{1,2,3,4}}

java m a b
public static void main(String [] args){
    System.out.println(args[0]);
}

public int hi(){
try{

}catch(){
    return -1;
}finally{
    System.out.println("aa");
}
}
������hi��ʱ�򷵻ص���aa�ڷ���-1��ԭ���ǳ����жϳ�����߿����������Ҫִ��finally�������ʱ���ȴ�ӡ�ڷ���-1.

===�ַ������ӵ�����
������Ϊ
String c = "abcd";
����ȥ�����ַ�������abc��ֵ��Ȼ������ҵ�����ַ��ֵ��c.
String b = "abcd";
c == b;
String d = "abc";
d+="d"
a != d ��Ϊd �����ʱ��;���������c����һ����ַ�����¿���һ����ַ��

String f = new String("abcd");

f!=a����ʹ����new ѹ���Ͳ����ַ�������


=========================swing==========================
1.ͼ���û�����GUI ���� goo-e
2.eclips�������߽���
3.swing�������
4.�����ò��ֹ�����

1.��������swing�����ʹ��
2.֪��ʲô��awt��swing,swt,jFace
3.���ճ��õĲ��ֹ�����
4.ѧ��ʹ��eclipse��java���򿪷�
����ʹ��ȥ�鿴java file ��������ϸע��
GUI �����Ĳ���
1.����̳�JFrame
2.������Ҫ�����
3.���췽���������
4.���ò��ֹ�����
5.������
6.���ô���
7.��ʾ����
=========
ʲô������������JScrollPane ��ʵ���з�,����list testarea.Ŀǰ���Եľ�������
this.testArea = new JTextArea(10,30);//�߶ȣ�����
this.jsp = new JScrollPane(this.testArea);//��ӵ�����

this.lb = new JLabel("<html><a href=''>aaa</a></html>",JLabel.CENTER);
this.lb.setFont(new Font("����",Font.PLAIN,16));
this.lb.setForeground(Color.red);
this.lb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
===================================̹�˴�ս================================
1.д����
ѧϰ��Ŀ��Ӧ����ѧ��𣬽�����ģ����ɶ��Сģ�飬Ȼ��ȥ��ĥ�����ƴװ���Լ��Ķ�����
����===========
1.java��ͼ������ϵ
java��ͼ������ϵ��ԭ���ǻ��ڵ������ڵ����Ͻţ�����������ǻ�����Ļ�ġ�
������һ���ܶȵ�λ�������Ǹ����ȵ�λ����1���Ƚϡ� 

//�¼�������
1.��ʵ�����õĽӿڣ�KeyListener MouseListener ActionLister WindowListener
2.�ѽӿڵķ���ʵ�֣���д������
3.����������������Ǽ����ߣ��������̾��Ǵ�������
4.���ص�ActionEvent e ����һ���¼�����e���Եõ�Ʃ�� getActionCommand(Action) getKeyCode(KeyListener) �ȵ�
5. ���¼�Դ��ע�������ʲô���¼�Դ�����ǰ󶨵��Ǹ�ʵ���������� һ����ť���������࣬��ʵ�� ����԰��¼�����
Event_keyword i = new Event_keyword();
this.addKeyListener(this.m);//this ����i��ʵ����this.m�����¼�������
��ǰʵ�����¼�������this.m,this m �Ǽ����ߵ�ʵ����
�����ActionListener �п�this.setActionCommand("ֵ����") �¼�������e.getActionCommand()��ȡ���ݵ�ֵ
6.�¼������ǿ��¼����������ActionEvent KeyEvent MouseEvent or WindowEvent
=====================�����¼�==============================================
1�¼�Դ
�¼�Դ��һ���������򴥷����¼��Ķ��󣬱���ǰ���JButton��һ������btml��������¼�Դ�����Ĭд״̬��ĳ�ַ�ʽ�����仯ʱ���ͻ����ĳ�����͵��¼���<<һ���¼�Դ���ܻᷢ�������ͬ���͵��¼�>>�����ĳ�����������ϣ���õ��¼�Դ�������¼�������Ҫ������¼�Դ��ע�ᡣһ���¼�Դ����ע�᲻ͬ�¼�������j.addKeyListener j.addActionListener.�ȵ�ֻҪ������԰󶨶��!!!<һ���¼�Դ���Ա�����¼������߼���>!!!��ʵ����ͬһ���¼�add����¼����������� addActionListener(new a()) addActionListener(new b());
2.�¼����ǳ��� �¼�Դ״̬�ı�ʱ����Ϣ����java.awt.event javax.swing.event�ж����˸����¼����ͣ��������¼����У�
ActionEvent                 ͨ���ڰ��°�ť����˫��һ���б��ѡ��ĳ���˵�ϵ����
AdjustmentEvent             ������һ������������
ComponentEvent              ��һ��������أ��ƶ����ı��С����
ContainerEvent              ��һ������������������ɾ������
FocusEvent                  ��һ�������û�ʧȥ���㷢��
ItemEvent                   ��һ����ѡ������б��ѡ�У���һ��ѡ����ѡ��˵���ѡ��
KeyEvent                    ����
MouseEvent                  ���
TextEvent                   ���������ı�,��������
WindowEvent                 ��һ�����ڼ���رգ�ʧЧ���ָ�����С���

3.�¼��������ӿ�����WindowListener, ActionListener,KeyListener,MouseListener�ȵ�

===============================�ܽ�
1.��д�¼������ࣨ�¼������ߣ�
2.����������¼�������ʵ�ּ������ӿ�
3.���¼�����������д��ʵ�֣����¼�����ĺ���
4.���¼�Դ����ָ�����¼��ļ���������Ӧ�ߣ���˭����ע�������

java ����ί�л��ƴ����¼�
���¼�Դ����Ҫע���¼������ࡣ�����¼���������ղ����¼�Դ�������¼���
  


======================================�߳�====================
Ŀ�꣺
1.����̵߳Ļ�������
2.���ձ�д�̵߳����ַ���
3.������̵߳����л���
4.���̹�˴�ս��Ϸ
===========================================�����˽��߳�
��������߳�
������̲߳���һ�����ݵ�ʱ��ҪС��������ʹ��synchronized
�̶߳���ֻ������һ���̡߳�
/**
 * ʹ���̵߳�ע������
 * 1.�̶߳���ֻ������һ���߳�
 * Catz cat = new Catz();
 * Thread thread1 = new Thread(cat);
 * thread1.start();
 * thread1.start();
 * �����������ֱ�ӱ���  
 * Dogz dog = new Dogz();
 * Thread thread2 = new Thread(dog);
 * Thread thread3 = new Thread(dog);
 * thread2.start();
 * thread3.start();
 * ����д��û������,��Ϊ�����������߳���һ���࣬����һ���߳�ֻ����һ����������������Ǵ���ġ�
 * @author Administrator
 *
 */

���̲߳�����ͬʱ����ͬһ�����ݣ����ڼ����ͽ��������⡣
package xiancheng;
/**
 * ���߳���Ʊϵͳ
 * ������Ϣ�鿴�����߳��ڹ���
 * Thread.currentThread().getName()�鿴�����߳��ڹ���,��ȡ��ǰ�����̵߳����֡�
 * ʲô���̰߳�ȫ
 * ͬһ��Ʊ���������ͬʱ�۳�
 * �������Ĺؼ�
 * �������Ĺؼ�����Ҫ��֤���׳�����Ĵ����ԭ����
 * ʲô��ԭ����
 * ��A�߳�ִ��ĳ�δ����ʱ�����̱߳���ȵ������߳���ɺ��ִ�С�
 * �ͺ��Ŷ���é��һ����
 * java�����߳�ͬ���ķ����ṩ��
 * synchronized(Object) ������{��Ҫͬ���Ĵ���} ���߳�����
 * �Ŷӵ��̻߳���ڵȴ��̳߳������棬�̳߳��еĴ����ǲ�ռϵͳ��Դ�����Ƕ�������״̬���Բ�ռϵͳ��Դ���ȵ�synchronized�Ĵ���ִ����Ϻ��ڴ��̳߳�����������һ���߳̽������Ŷӵ��߳���Զ��У��Ƚ��ȳ��������̵߳ȴ����У�����Ҳ������ȫ�ģ��߳���������ȼ������ƻ����������������ȼ�һ��û��˵���Ƕ����߷�������Ͱ������ȼ����ߵ��߽���������é���и��Ƚ���Ҫ���������ˣ�����Ҫ�����ϣ�Ҳ����������ִ�е��жϽ�����̳أ���������ȼ��ߵ������У���
 * ������Ĭ�ϵı�־λ��1������û������ʹ����Դ�������0����������ʹ�ã���û���κ��߳�ʹ��Ϊ1��������̲߳ٿؾ�Ϊ0
 * �������˾Ͱѱ�־����Ϊ0�������˿���������1����������Ҫ���ûط����������������ȴ��̳߳������̣߳���һ���߳����ͻ�ֱ���ŵ��̵߳ȴ��صĶ����У���������ȥ���߳����ǲ��Ǵ򿪵�״̬������ճ�Ҫȥ���߳�����״̬�ġ�
 * �����������û�����û�ԭ���Ŀ���״̬��
 * �������п��ܵ���ִ�е�ʱ������쳣������û�н��������ˣ��������󻥳⣬������Ҷ���ͳ������ˣ��������Ⲣ�����߳��໥���ʡ�
 * 1.������������ν������ǽ�����ĳһʱ���ڶ�ռ��Դ��
 * 2.�����뱣��������һ��������������Դ������ʱ�����ѻ�õ���Դ���ֲ��š�
 * 3.����������:�����ѻ����Դ����ĩʹ����֮ǰ������ǿ�а��ᡣ
 * 4.ѭ���ȴ�����:���ɽ���֮���γ�һ��ͷβ��ӵ�ѭ���ȴ���Դ��ϵ��
 * 
 * ������
 * 
 *  synchronized (obj1) {
                System.out.println("���Ѿ�����obj1����Ϣ0.5�������obj2ȥ��");   
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj2) {
                    System.out.println("1");
                }
            }
            
      synchronized (obj2) {
                System.out.println("���Ѿ�����obj2����Ϣ0.5�������obj1ȥ��");   
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj1) {
                    System.out.println("0");
                }
            }
 * ����
 * �ļ����������������ݿ��������������������ݿ�������Զ�ִ�еģ���
 * @author Administrator
 *
 */
public class MaiPiaoSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShouPiaoChuangKou s = new ShouPiaoChuangKou();
		
		//����������Ʊ����,�����߳���ͬһ������
		Thread thread1 = new Thread(s);
		Thread thread2 = new Thread(s);
		Thread thread3 = new Thread(s);
		//����ڶ�һ�����������˶����߳���ͬʱ������
		//�̺߳�˭�ȶ�˭��0��
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
class ShouPiaoChuangKou implements Runnable{
	private int allPNum = 2000;
	private Dog myDog = new Dog();//��������ͬ�����������������
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		String str = "";
		while(true){
			//��Ϊ���Ҫ��֤ԭ����,ͬ�������,this���Ƕ���������������
			//���������Կ������������ֻҪ�и������ž���
			synchronized(this.myDog){//������this ��������������Ҫ�и������������
				if(this.allPNum >0){
					this.allPNum--;
					str = "ʣ��" + this.allPNum;
					if(this.allPNum == 0){
						str = "û��";
					}
				}else{
					break; 
				}
				System.out.println(Thread.currentThread().getName()+str);
				//����������������
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
//���Ž�����
class Dog{
	
}

========================IO=======================
io���
//��������˳�
1.���file���Ļ������
2.����file��̷�����
3.�����ֽ������ֽ�����
4.���̹�˴�ս��Ϸ��

file�ڳ���������������ʽ�������ġ�

�ڴ�<-������<-aaa.txt
    ->�����->
���ڴ������������
���ڴ�������������

file���ķ���
java����Ϊ������
1.�ֽ������������ڶ�д������file���κ�����file
2.�ַ������������ڶ�ȡfile����
3.������
         �ֽ���(���ֽڵ���ʽ���ڵ�)              �ַ���
����         InputStream                         Reader 
���         OutputStream                        Writer

fileͷ�ĸ�����е�file�и�fileͷ�������˴�С���͵ȵȣ���׺���ܱ�ʾfile����ʵ���ͣ���Ҫ��ȡfileͷ����׺��������ǿ������Ǹ�ʲô���͵ġ�
==========================
-fileͷ����ȡ�ȶ�fileͷ  -
-                        - 
-                        -
-                        -
-                        -
-                        -
-                        -
-                        -
==========================

������txt�򿪵����ַ�
��������byte��ŵ�

�ַ���ֻ�ܶ�ȡtxt�����е�һЩ���ݣ��������ֽ���������

���в���ϵͳ��С�Ĵ�ŵ�λ�飬ÿ�������Լ�����С��С������ϵͳ����Ӳ���ϴ�ŵ��Ǹ������ݿ飬ÿ�����ݿ�����һ���ռ䣬���ǵ���һ��file��ʵ�ʴ�СС��һ����ʱ����Ҳ��ռ�������Ĵ�С
���署һ������4KB�����file��22b��ô����Ӳ����Ҳռ��4kbһ�����ݿ�
����file��4.1kb��ôû������ռ��2�������ռ���˷��ˡ�
linux����С�ռ���Ըġ����ݿ�Խ��ѰַԽ�쵫��Խ�˷ѿռ䡣��֮�ٶ����ռ������ʸߡ�
linux��fileSystem

��������һ�����
80G�����̻������ɴŵ�����ÿ��С�ŵ��Ǿ��Ǵ�����ݿ顣
С�Ļ���С�ɣ���Ϊ���file����ٷֻ�����ϵͳ��Դ���������൱Ԥ����
�洢��file���ܷ���Ĵŵ��������ڵģ�������ѵ�״̬�������ڵķ��䡣
��������ڿ�����ɾ���Ȳ�����ɵģ�����һЩ��Ƭ��
=============================
                            =
                            =
                            =
                            =
=============================

fd = new FileReader(fromPath);
fw = new FileWriter(toPath, true);
//һ�ζ�ʮ��
char []c = new char[10];
int n = 0;
while((n = fd.read(c)) != -1){
    fw.write(c);
}
�����и�����Ҫע���£����char��ȡ�ĺܴ����file�����С�ͻ�ʹ�������ַ���ȱ�����������Ҳͦ��Ҫ�ġ�

file�Ĺر�ԭ��
��򿪵��ȹرգ��͹���һ����


eclipse
java ������Ŀ���Թ��̵���ʽ����ģ�����������Ŀ��ɢ�е�file��û������ġ�
��������
window->preferences->general->appearance->colors and fonts->basic->Text font
��class file�����/** �س����Զ�����һЩע��
��ע�������һ��@�������ʾ�ö�����
����ʹ��eclipse�������
���㱣���ʱ��ͻ��Զ�����,�൱��javac

������file
�Ҽ� file->refactor->rename

��ȫ��ݼ�
edit->content Assist->default

��ݼ�����
window->preferences->General->keys �ҵ���Ӧ�Ĺ��ܵ���Ϳ����޸�
��Bindingɾ��ԭ����Ȼ��װalt ctrl����������Ȼ���ڰ�������

����try catch ��
ѡ��Ҫ�����Ĵ�����䣬ע�ⲻ����ע�ͣ��Ҽ�surround with try catch

�ر���Ŀ��ʡ�ڴ濪��
�Ҽ���Ŀ->closeproject

�鿴ĳ����������ôд�ģ�
ѡ�з��������Ҽ�->open Dedaration

������û�������������󣬵��ǰ����Ǹ�С*�ų����и�import������Զ������

try �Ŀ�ݼ�
��һ��try Ȼ�����ֽ������õ���alt+/ ֱ�ӳ��ֲ�ȫ�Ϳ���

��ʾ�к�
�Ҽ����ߵ�����->show Line Numbers

�����֪��ʲô���͵��쳣�����ŵ�����Ĳ����������������ʾ��ֱ�Ӳ���Ϳ���

eclipse ��Ŀ����
1.�Ҽ���Ŀcopy
2.ճ�������Ӳ��
3.��Ļ���import -> General -> Existing Projects into Workspace -> Select root directory -> Copy projects into workspace(���ѡ������൱�ڽ���Ŀ�����������ռ䣬��ѡ�൱����ԭ�е���Ŀ��ֱ���޸ġ�)


eclipse ����
��ϵ��Ժ�debug ���ҵ�Expressions->�Ҽ�add->��������������

=========================������=======================
//�����ڵĸ��� ����������
