#第1讲
语言特点
1.java语言是简单的
2.java语言是面向对象的
3.java语言是跨平台
4.java是高性能的

第一个程序
java的运行原理
jdk 全称 java development kit
jdk 包括jre 一堆java工具和java基础的类库


jdk
1.jre(java运行环境)
2.java的工具（编译器javac 解释器 java）
3.一堆基础类库 3600多个记住常用的类也就150个


jdk的安装注意事项
jdk 可以有多个只要装的地方不同就可以

jdk 和 jre 的区别
jdk 是程序员开发用的开发环境
jre 是执行java程序的环个jre就可以



=========================1========================
//注释写法
//作者
//功能
//日期
//public 表示共工的一个java file只能有一个public class class 名称要和file名称一致
//public static void main(String args[])  主函数
//System.out.println('hello world')
//javac 编译 生成.class file 
//java 编译后的.class file 但是只需要file name 不需要.class
//如果有错就编译就报错了，通过不提示

java source code 编译和java程序运行关系。
java source code .java file -> 通过javac编译为java字节码.class file->通过java.exe（解释器）将字节码加载到java虚拟机(jvm)->在虚拟机里面执行
反编译小尹反编译。
java字节码被解释到虚拟机内存里面运行

===================================2====================
int a = 10;//声明一个int 类型的变量
在执行的时候
在内存申请了一个空间放了一个10,a就是地址（栈）int代表申请多少空间
一个int 4个字节32位
long b=20
b 地址 申请一个long空间存放20 占8个字节
int a=10
int b=20
int result=a+b

一个程序就是一个世界
世界中的事物就是程序中的对象

java基本数据类型
1.整数类型
2.小数（浮点）类型
3.布尔类型
4.字符类型

整数类型
byte 一个字节 -128-127
short 两个字节 -32768-32767
int   四个字节 -2147483648-2147483647 
long  八字节 -? 到 ?
区别 大小上有区别
二进制
2进一
最后一位符号位
0正数
1负数
反码 1 对 0 0 对1
补码 第一位加一

二进制负数
最后一个符号位
所以可能出现+-0
当为负0可以看做正数加一取负例如127 负数就是正数+1取反
这个是印度人发明的
算大小
byte -(2（的字节*8-1）次方) 到 2（的字节*8-1）次方-1 

short 

int   

long long 的声明需要加上一个l long=100l不加会被当int类型
都可以用这个公式

如果现有的类型 没有办法存贮可以考虑使用链表字符串或者字符数组来解决这些问题
海量数比较麻烦

小数类型
float 

double

float表示单精度浮点数在机内占4个字节，用32位二进制描述。 
double表示双精度浮点数在机内占8个字节，用64位二进制描述。

浮点数在机内用指数型式表示，分解为：数符，尾数，指数符，指数四部分。 
数符占1位二进制，表示数的正负。 
指数符占1位二进制，表示指数的正负。 
尾数表示浮点数有效数字，0.xxxxxxx,但不存开头的0和点 
指数存指数的有效数字。 

指数占多少位，尾数占多少位，由计算机系统决定。 
可能是数符加尾数占24位，指数符加指数占8位 -- float. 符号占位1小数7 
数符加尾数占48位，指数符加指数占16位 -- double.     符号占位1小数15

知道了这四部分的占位，按二进制估计大小范围，再换算为十进制，就是浮点数的数值范围。

对编程人员来说，double 和 float 的区别是double精度高，有效数字16位，float精度7位。但double消耗内存是float的两倍，double的运算速度比float慢得多，java语言中数学函数名称double 和 float不同，不要写错，能用单精度时不要用双精度（以省内存，加快运算速度）。

boolean
boolean s = true
true false
	
字符类型
char
单个字符占2字节
用'aa'表示

多个字符
String是类

思考
int test='a'+'b'
a的ascii 和 b的ascii相加赋值给test
char test2='a'+'b'
a的ascii 和 b 的asscii 将加然后得到的ascii转义回字符,因为195在ascii中越界了所以就是个?
char test2='a'+23可以得到一个字符
结论：
在java中对char进行加减会转成ascii的整数对待，如果返回给int就是整数
返回char 就是对应的ascii的对应char
乘法需要自己测试

char test3='汉'//汉字是unicode //char 采用了unicode编码
一个asscii码没有办法储存它
但是输出没有问题
int test3='汉'//输出的unicode码

定义变量
int a;
初始化变量
int a=1;
给变量赋值
a=2;

基本数据类型的转换
int a=1.2;
不能编译通过
低精度可以转高精度，反之不可以
1.2是高精度所以不能交给低精度的int
高转低会损失精度报错

doucble b = 3;
可以通过
低精度转高精度没问题
精度
byte<short<long<float<double

float a=3.4
编译过不去
因为默认小数是double类型
所以高精度转低进度就错了
正确的是
float a = 3.4f

如何把高精度转成低精度
int a = (int)1.2 
java 会忽略小数位数
int a = 1;
double b = 4.5;
a = b;
报错 高精度往精度转错误
b = a
就可以了
int a = 3;
int b = a + 3.4;
照样报错
低精度和高精度进行预算会自动往高精度转换
然后高精度有给低精度了所以又报错了


算数运算符
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

System.out.println输出
输入
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

try{
InputStreamReader io = new InputStreamReader(System.in);//System.in标准输入
BufferedReader rd = new BufferedReader(io);

//读取
String a1 = rd.readLine();
String a2 = rd.readLine();

float d1= Float.parseFloat(a1)
float d2 = Float.parseFloat(a2)
}catch(Execption e){
    e.printStackTrace();
}


什么是包？
是类的包装


&& || !

if else switch

switch 条件表达式
数据类switch(a)
应该和case 常量类型一致
switch(data)
data是有限制的
byte short init char enum 等


编程复杂问题
先将复杂问题查分成若干简单问题在做
死去活来法比较复杂的现限定小的范围找规律在放大

String a = "";
String a = new String();
区别在与第一句会先去内存里面找是否有这个值有就指向它没有就创建。
第二句不关有没有都要在内存里面开辟一块新的区域用来存储它。




===============================对象================================
java面型对象编程 类与对象
java面向对象编程 构造方法
1.初步掌握java中的类和对象
2.什么事成员变量和成员方法
3.掌握构造方法的使用
对象是复合数据类型 

定义类
class Cat{
    //成员属性
    int age;
    String name;
    String color;
    //成员方法
}

Cat cat = new Cat();
Cat是一个复合数据类型

//类是对象抽象出来的，类要自己去定义，想有什么自己就定义什么,类是抽象的，代表一类事物。
对象代表一个具体的事物。
类是对象的模板，对象是类的个体实例。

全面的类的定义
package 包名
class Cat extends Animal implements interface
{
    成员属性
    构造方法
    成员方法
}
引用数据类型
class Cat{
    int age;
    String name;
    String color;
    Master myMaster;//猫的主人 对象的变量就是引用类型
}
class Master{
   int age;
   String name;
   String adress
}


创建对象的两种方法
1
Cat cat1;//声明是Cat类型
cat1 = new Cat();//创建Cat对象
2
Cat cat1 = new Cat();

Parse p = new Parse();
p.age = 1;
Parse pClone;
pCloen = p;\\赋值引用的时候也要注意他们是同一类型
创建对象后，不管是否赋值都会分配内存空间，而这个分配的空间是根据类重定义的内容。java 对象如果有多个引用都指向这个对象那么如果一个引用改变了对象的某个值所有的引用都将改变，和js有些不一样。

类和对象的关系
类是模板创建出很多对象，人是上帝，用模板创建了对象放进内存。
java有自己的垃圾回收，不需要手动，当java虚拟机发现有一个对象没有指向就是垃圾。
Parse p = new Parse();
p = null;
这个时候被创建的这个对象就成垃圾了
适当的时候将其回收，垃圾回收有自己的机制。
垃圾回收是jvm自己调用，当它觉得内存不够了它就出来回收下。



类的成员方法
语法
成员方法也叫成员函数。
可见性 返回函数类型 方法名（参数列表）{
语句；//方法函数主体
}
class P{
    int age;
    String name;
    public void spack(){
        System.out.println("我是好人");
    }
    //计算
    public void jisuan(){
        int result = 0;
        for(int i = 0; i < 1000; i++){
            result += i;
        }
       System.out.println(result);
    }  
    //接收参数
    public void jisuan(int count){
       int result = 0;
       for(int i = 0; i < count; i++){
	    result += i;
        }
	System.out.println(result);
    }
    //返回类型的
    public int jisuan(int count){
        
    }
}
P p = new P();
p.spack();

//类内的同名方法，但是参数不同,不同叫做重载,如果非参数不同而名字相同返回类型不同也报错。只能是参数不同才能叫重载。


//函数调用的原理图
p.jisuan(1);
函数会开一个新栈，和main函数完全独立的栈空间，去新栈执行jisuan内部的代码在按照顺序执行当执,而且来讲函数内部的int 变量也会在新栈中声明和定义所以和主函数没有关系，独立的栈空间。当这个函数执行后，它会回到调用它的那个区域去,然后在继续在调用的那个区域执行知道main函数执行结束。

方法的声明
方法的声明是没有函数体的
例如接口和抽象类
public int test(int a);

//调用成员方法注意
在调用某个成员方法的时候，给出的具体数值个数，类型，和类型相匹配。
注意小数默认是double float接收的时候要明确指出是float类型的
3.2F

类可以什么都没有，没有成员属性成员方法。


编写类
1.先设计类
2.然后根据类创建对象

构造方法
如果不手动建立构造函数，是有一个默认构造函数的。
如果手动建立默认的就被重写了所以要按照自定义的规则来了。
class Parse{
    int age;
    String name;
    public 注意没有任何修饰 Parse(int age, String name){
       this.age = age;
       this.name = name;
    }
}
Parse p = new Parse(ag1, ag2);//参数和构造函数统一

!!!!**java类可以有多个构造方法
为什么因为重载的缘故，接收数据类型需要不同就会有多个不同的构造方法了。

默认构造方法
如果一个构造都没有
系统会自动生成
public Person(){

}
//需要用就就明确的在写出来
自己写了后就自动被重写了


总结：
1.构造方法和类名相同
2.构造方法没有返回值
3.主要作用是完成对新对象初始化，初始化成员属性
4.创建新对象自动调用构造
5.一个类可以有多个参数不同的构造方法。
6.每一个类都一个默认构造方法

1.java面向对象
this
this 的必要性
this 是属于对象的不是类的。
this只能在类定义中用。

2.java面向对象
类的变量, 类方法
所有对象共享的变量和方法
静态变量静态方法
静态变量可以被任何对象访问,直接用类也可以访问它.
Parse.total
注意只用静态的才可以用类名直接访问,普通的不能那么干.
定义的方法
public static int a = 1;
总结：
1.所有对象都共享
2.可以被任何对象修改
3.可以用类访问
4.定义 修饰符 static 数据类型 变量 访问修饰符可以不加,后面将描述
不写修饰符默认就是public
5.如何类变量
类名.变量
对象名.变量
6.存储在静态区域
7.静态局域块
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
解释静态代码块只在第一次执行
也就是说默认是1经过静态代码块为2
经过构造函数是3
再次执行的时候静态的就不跑了，
在进构造函数变为4

静态的东西是构建类时候就触发了，跟对象没关系，定义类的时候就运行了,就已经存进代码区了。

静态方法
public static int getStudentInfo(){

}
静态方法,所有对象都共享一个方法,节省开销，静态方法只能用静态属性，非静态方法也可用静态书属性。 
最好所有的静态属性都用静态方法访问，操作。
静态的必须都是public 的


3.四大特征
公认的三大特征
多态(一个对象的多种状态)、继承、封装（抽象）
抽象：
我们去定义一个类的时候，实际上就是把一类事物共有的属性方法取出来，形成一个物理模板。这种研究问题的方法叫做抽思想。
封装：
封装就是把抽象出的数据和对数据的操作封装在一起，数据被保护在内部，程序的其它部分只有通过被授权的操作（成员方法），才能对数据进行操作。
//尽可能所有的成员属性都是私有的
访问控制修饰符号
public 
private
protected
默认

4中访问级别的范围
访问级别       访问控制器       同类       同包       不同包子类 同包子类   不同包
公开           public           可以访问   可以访问   可以访问   可以访问   可以访问
受保护         protected        可以访问   可以访问   可以访问   可以访问   不可以访问
默认           没有修饰符       可以访问   可以访问   不可以访问 可以访问 不可以访问
私有           private          可以访问   不可以访问 不可以访问 不可以访问 不可以访问
http://xuyanzhi6688.blog.163.com/blog/static/2920588920115178519198/

包的必要性
多人同时开发，同时起一样的类名就容易造成冲突。
在同一个包下面建立两个名字相同的class就会报错
即使不是同一个file定义同名的class也不行，必须分包定义。
新建一个包在eclipse
包的命名com.xiaoming.a.a.a.a这个可以一直延伸下去但是最好不要超过5层。
com.xiaoming 
com.xiaoqiang
他们都隶属于com但是他们又有他们自己的空间，这个时候小强和小明可以在自己的的包下建类这个时候他们彼此建一样的类也不会报错了。
现在如果在他们彼此的包下建立class eclipse会自动加上打包命令
例如
package com.xiaoqiang
package com.xiaoming
作用会将类生成的字节码放到com.xiaoqiang,或者com.xiaoming里面去。
常用的包
java.lang.* 自动引入
java.net.* 网络开发
java.util.* 工具包
java.awt.*窗口工具包

引入包
import java.util.*

系统的类都放在哪？
系统会引入一个CLASSPATH的环境变量那个倒是是个什么？
其实是别人写好一堆编译好的class 打成了一个.jar file 你去引用。 
jre/lib/rt.jar不需要加入classpath默认就能找到

================================================================================

这JDK的配置CLASSPATH中的dt.jar和tools.jar这两个文件到底是干什么的，有人说这个dt.jar是关于swing的 打开这个包确实可以看到和swing有关的类，说是如果用到swing就要配置这classpath，但是rt.jar中的swing呢 这个不才是真正的包含swing类库吗？ 还有就是这两个包到底是用作开发的类库，还是JDK中的JAVAC等程序运行要的类库。 如果不路径这两个包对我们开发的程序中有什么影响?

———————————————————————————————

答：dt.jar和tools.jar是两个java最基本的包，里面包含了从java最重要的lang包到各种高级功能如可视化的swing包，是java必不可少的。
而path下面的bin里面都是java的可执行的编译器及其工具，如java，javadoc等，你在任意的文件夹下面运行cmd键入javac，系统就能自动召见java的编译器就是归功于这个环境变量的设置  

rt.jar是JAVA基础类库，dt.jar是关于运行环境的类库，tools.jar是工具类库  

设置在classpath里是为了让你 import *  
———————————————————————————————

web系统都用到tool.jar  

你用winrar看看里面是什么内容啦  
---------------------------------------------------------------  

1.  
rt.jar 默认就在 根classloader的加载路径里面 放在claspath是多此一举  
不信你可以去掉classpath里面的rt.jar  

然后用 java -verbose XXXX 的方式运行一个简单的类 就知道 JVM的系统根Loader的路径里面  

不光rt.jar jre/lib下面的大部分jar 都在这个路径里   

2.  

tools.jar 是系统用来编译一个类的时候用到的 也就是javac的时候用到  

javac XXX.java  

实际上就是运行   

java -Calsspath=%JAVA_HOME%/lib/tools.jar xx.xxx.Main XXX.java   

javac就是对上面命令的封装 所以tools.jar 也不用加到classpath里面  

3.  
dt.jar是关于运行环境的类库,主要是swing的包 你要用到swing时最好加上  


dt.jar好像是swing的一些什么类，Eclipse开发环境默认的JRE也没有包括它。应该没用。
tools.jar应用服务器用来编译JSP文件，应用服务器自己会加载，不需要自己设置。


关于path和classpath的含义：  
1.path变量的含义就是系统在任何路径下都可以识别java,javac命令  
2.classpath变量的含义是告诉jvm要使用或执行的class放在什么路径上，便于JVM加载class文件，.;表示当前路径，tools.jar和dt.jar为类库路径。如果不用Swing里面的东西，可以不加dt.jar。 tools.jar里面是最基本的工具类，比如javac，不加是无法做开发的。  


 1. rt.jar 默认就在 根classloader的加载路径里面 放在claspath是多此一举 不信你可以去掉classpath里面的rt.jar 然后用 java -verbose **X 的方式运行一个简单的类 就知道 JVM的系统根Loader的路径里面 不光rt.jar jre/lib下面的大部分jar 都在这个路径里   
 2. tools.jar 是系统用来编译一个类的时候用到的 也就是javac的时候用到 javac **.java 实际上就是运行 java -Calsspath=%JAVA_HOME%/lib/tools.jar xx.**.Main **.java javac就是对上面命令的封装 所以tools.jar 也不用加到classpath里面  
 3. dt.jar是关于运行环境的类库,主要是swing的包 你要用到swing时最好加上  


dt.jar是关于运行环境的类库,主要是swing的包 
tools.jar是关于一些工具的类库 
rt.jar包含了jdk的基础类库，也就是你在java doc里面看到的所有的类的class文件

编译和运行需要的都是toos.jar里面的类 , 分别是   
  sun.tools.java.*;   
  sun.tools.javac.*;



!!!如果找不到类可以手动的指定一下CLASSPATH
============================================================================

跨包访问
com.xiaoqiang.ssl v = new com.xiaoqiang.ssl();
System.out.println(v.m);
xiaoqiang 这个包下面的ssl类必须是public否则没有办法访问
m也必须是public
com.xiaoqiang.ssl这样写十分的麻烦可以一步到位，
顶部
import com.xiaoqiang.ssl
只有类文件内部的类可以设置protected/private。
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


继承
为什么要继承
//当有多个类有共同属性的时候就需要抽象出来，然后子类去继承它。
class 继承  extends
注意事项：
1.子类最多只能继承一个父类（单继承）
2.java所有类都是Object类的子类
3.jdk中有大约202个包3777个类、接口、异常、枚举、注释和错误。
4.在做开发强力建议使用JDK帮助能手册

在开发中自己定义的一些类必须要继承别人
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



包的特点
1.区分相同名字的类
2.类很多的话很好管理类
3.控制访问范围



方法的重载，覆盖。
重载：
方法参数不同方法名字相同，即为重载。
abc.getMax(12,4.5f)

public int getMax(int i, int j)
{

}
public float getMax(float i, float j){

}
当调用的时候回调用下面这个因为int i 可以向高精度的float转。

简单的说，类的同一种功能的多个实现方式，使用哪个在于调用者传的参数。
1.方法名相同。
2.方法的参数、类型、个数、顺序至少有一个不同。
3.方法的返回类型可以不同。
4.方法的修饰符可以不同。

覆盖：
实际就是子类重写父类的方法。

class Animal{
	int age;
	String name;
	//jiao 
	public void jiao(){
		System.out.println("叫");
	}
	
}
//猫猫叫
class Cat extends Animal{
	public void jiao(){
		System.out.println("喵喵");
	}
	
}
//汪汪叫
class Dog extends Animal{
	public void jiao(){
		System.out.println("旺旺");
	}
}

简单的说：方法覆盖就是子类有一个方法，和父类的某个方法的 名称、返回值、参数一样，那么我们就说子类的这个方法覆盖了父类的那个方法。

总的有两点
1.子类的方法的返回类型，参数，方法名称要和父类的方法的返回值类型，名称，参数完全一样否则报错。
2.子类的方法不能缩小父类的访问权限。
例如父类是public 的方法子类不可以使用public以下的修饰符号复写方法.

《《链表》》
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
		//从k个人开始，数m下
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
  

《《多态》》
所谓多态，就是指一个引用(类型)在不同情况下的多种状态.
你也可以这样理解：多态是通过指向父类的指针，来调用在不同子类实现方法。
myeclipse 是 eclipse(开源) 的插件,myeclipse继承eclipse。
自动为私有属性生成get 和 set
定义
private int age;
private String name;
鼠标选中
右键->source->generate getters and setters->select all ->ok
就会为你选中的私有属性定义get和set方法

package luchao;
/**
 * 多态的综合例子
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
		System.out.println("我吃"+zl.getZl());
	}
}

class Cat4 extends Animals3{
	public void eat(Food zl){
		System.out.println("猫吃"+zl.getZl());
	}
}
class Dog4 extends Animals3{
	public void eat(Food zl){
		System.out.println("狗吃"+zl.getZl());
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
		return "鱼肉";
	}
}
class gt extends Food{
	public String getZl(){
		return "骨头肉";
	}
}


class Master{
	public void w(Animals3 a, Food b){
		a.eat(b);
	}
}

总结：
精髓的一句，一个引用类型在不同情况下的多种状态。
java允许父类的引用变量引用它子类的实例对象
Animal a = new cat();

抽象类、接口、final
抽象类
接口
final

抽象类
abstract 修饰的类是抽象类，abstract 修饰的方法是抽象方法。
抽象方法必须定义在抽象类里面。
子类如果要继承抽象类则必须要实现抽象类里面的抽象方法.
抽象类不能被实例化a
抽象类可以有非抽象方法
抽象类可以额没有抽象方法


接口：
接口是是特出的抽象类
语法
class 类名 implements interface{

}
一个重要的原则，当一个了实现了一个接口，那么这个类就必须实现改接口的所有方法都实现。
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

package com.dlctest;

public interface UsbInterfaces {
	public void start();
	public void stop();
}

接口也体现了一种多态的行为看master

注意事项
1.接口不能被实例化。
2.接口所有方法也不能有主体 a();
3.抽象类可以有实现的方法，接口不可以有，必须只有非实现方法。
4.接口是更加抽象的抽象类
5.一个类可以实现多个接口 implements a,b
6.接口中可有变量,接口里面不能直接写int a;这样定义变量，int a = 1;
就ok了，解释一下，首先说一下
接口中可以有变量但不能用private 和 protected 的修饰符
a接口中的变量，本质上都是static和final类型,不管你加不加在接口中，作为全局变量使用。访问的形式：接口名.变量名(这是个技巧，因为它作为全局存在)
一个接口不能继承其他类，但是可以继承别的接口。
接口继承接口

interface UsbInterfaces extends hi 这样定义接口继承是ok的
如果
class xiangji implements UsbInterfaces extends hi 这样就报错了原因是不能再继承类上实现的接口在继承接口.
java 没有多继承所以使用接口就可以弥补这一点
class x implements a,b,c 可以同时实现多个接口的方法。
当实现接口的时候没有实现方法会报错，可以点击那个错误然后选择add ...

用接口体现多态
前期绑定在编译的时候确定类型的。
后期绑定例如说多态 a(interfaces car) 这个定义的一个接口变量在前期的时候不知道它会传递那个对象只有运行才能根据实参确认这样的叫做后期绑定

final的使用
最后的最终的
可以修饰变量和方法
1.当不希望父类的某个方法被子类覆盖，可以用final
2.当不希望类的某个值修改，如果是变量是final的必须赋值初值否则没有办法编译,final 修饰的变量一般叫做常量我们一般使用aaa_bbb_ccc命名，如果定义以后是没有办法在赋值的。

什么时候考虑用
安全的考虑
不希望别人修改
不希望别人继承
某些变量值是固定
3.当不希望被继承 final class a别人没有办法继承。

int a 如果不给初值是多少？
默认0

==========================================================================
数组
一维数组
[] arr , arr [] 都可以
int arr[] = new int[6];
定义一个定长的int类型的数组长度是6
内存里面开辟一个arr的int类型的空间长度是6,每一个单元都是int类型
从0开始算
数组不能越界访问
如何知道数组大小
arr.length; 

int a [] = {1,2,3,4,5,6,7,8,9};
相当于
int a [] = new int [9];
然后用for a[i]赋值上面的那个简单

对象数组：
定义个类
class Dog{
    String name;
}
定义对象数组
Dog a [] = new Dog[5]//定长的5个。 
a[0] = new Dog();
Dog [] a = {new Dog()};//不定长的。



排序，查找

多维数组

对象和字符串在比较的时候不能用==  他们比较的是地址
需要用到一个函数
equals
str.equals("aaa")
小结
1.数组主要用处存放同一类型的数据。
2.简单数据类型int float...数组,可以直接赋值
3.对象数组定义后,赋值时需要再为每个对象分配空间即new一个
4.数组大小必须事先确定,ArrayList可以解决
ArrayList<String> list = new ArrayList<String>();
这个就有String用别的类型都错误。
5.数组名可以理解为指向数组地址的引用
6.数组的下标是从0开始编号的。
7.int a[] = new a[x];这个x可以事先定义，但是不不可以从控制台输入，它编译的时候就需要这个值。

排序
1.内部排序
指将需要处理的所有数据都加载到内部存储器中进行排序。
包括（交换排序，选择排序，插入排序）
1.交换排序

2.冒泡

3.插入排序
插入排序是内部排序，是对于排序元素以插入的方式找寻该元素的适当位置，已达到排序目的

 插入排序分为

 1.插入排序
 2.谢尔排序
 3.二叉树排序


.快速排序


其他排序

选堆排序用树和堆的思想
希尔排序法
二叉树排序

【大数据排序】
合并排序
直接合并排序




//获取时间邮戳
Calendar c1 = Calendar.getInstance();
long c1s = c1.getTimeInMillis();
比较两个时间间隔必须要在new一次
Calendar c2 = Calendar.getInstance();
long c1s2 = c2.getTimeInMillis();
cls2-cls1即可

java 是值传递，传递对象是传引用非指针。

code
    




2.外部排序
数据量大，没有办法加载到内存中，需要借助外部存储进行排序包括（合并排序，直接合并排序）



=========================================================排序===========

package array;
import java.util.*;
public class paixu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Px p = new Px();
		//获取时间
		//单实例
		//获取时间
		Calendar c1 = Calendar.getInstance();
		long c1s = c1.getTimeInMillis();
		p.Ks(100000);
		//p.Cr(100000);
		//p.mp(100000);
		//p.ks(100000);
		//获取时间
		Calendar c2 = Calendar.getInstance();
		long c2s = c2.getTimeInMillis();
		System.out.println("time="+(c2s-c1s));
	}

}

class Px{
	 
	//冒泡排序 效率最低
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
	
	
	//选择排序 效率比冒泡高
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
	//插入排序
	public void Cr(int count){
		double a [] = new double[count];
		for(int i = 0; i < a.length; i++){
			a[i] = i * Math.random();
		}
				
		//插入排序思想就是拿本身和前面的那写进行比较
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
	
	//快速排序
	public void Ks(int count){
		double a [] = new double[count];
		for(int i = 0; i < a.length; i++){
			a[i] = i * Math.random();
		}
		
		//核心思想就是取中间数左右两边，然后在取中间数左右两边。
		this._ks(0, a.length-1,a);
		
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	/**
	 * 
	 * @param left 左边下标
	 * @param right 右边下标
	 * @param arr 数组
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


查找

顺序查找

二分查找
将没有序列的变为有序的然后在用二分查找
思想就是先跟中间的比较然后在判断是左边找还是右边找，然后递归起来。

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



异常
三种，编译，运行，error


eclipse
java 最后的项目是以工程的形式管理的，不过多大的项目，散列的file是没有意义的。
设置字体
window->preferences->general->appearance->colors and fonts->basic->Text font
在class file里面打/** 回车就自动生成一些注释
在注释里面打一个@附后会提示好多内容
关于使用eclipse的类编译
当你保存的时候就会自动编译,相当于javac

重命名file
右键 file->refactor->rename

补全快捷键
edit->content Assist->default

快捷键设置
window->preferences->General->keys 找到对应的功能点击就可以修改
在Binding删除原来的然后安装alt ctrl或者其他的然后在按其他键

包含try catch 块
选择要包涵的代码语句，注意不能有注释，右键surround with try catch


=========================作用域=======================
//作用于的概念 函数作用域
