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

������
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



�쳣
���֣����룬���У�error


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


=========================������=======================
//�����ڵĸ��� ����������
