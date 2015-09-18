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

子类调用父类的构造方法可以用super 子类用supper必须放在子类构造函数的最前面
如果希望在子类中，去调用父类的构造方法，要求在子类的构造函数调用。

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
equals 是区分大小的
不区分大小的是
equalsIgnoreCase

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



多维数组
int a [][] = new int[2][3];

二进制
基本概念
逢二进一
0 1 表示这样表示稳定
实际的网速是1m/8 为什么是除因为他用的是比特
1字节=8个比特
计算机的硬盘
1m = 1000k 不是1024所以实际会有差

最高位是符号位 0 正数 1负数

1.二进制的最高位是符号位：0表示正数，1负数
2.正数的源码，反码，补码都一样
3.负数的反码=它的源码符号位不变，其他位取反
4.负数的补码=它的反码加1
5.0的反码，补码都是0
6.java 	都是有符号的
7.运算的时候，都是以补码的方式来运算的。

计算机中计算是补码的形式,负数的二进制如果要还原成本来的面目要来个逆向操作
1111 1111 这个是个二进制的-1
所以换算回源码是
1111 1110 去掉补码得到反码
1000 0001 取反去掉反码得到原码用源码得到10进制数字

记住二进制的负数永远都是以补码的形式存在的，然而计算机计算也是用补码，但是如果要输出显示那就必须换算回十进制，必须要转成源码，在转十进制,但计算的时候都是补码

!!!!计算机补码运算后，二进制高位是0记住就别倒腾了，如果是个负数在逆向转的到源码，换算成十进制

注意取反和~不同~这个是运算补码的时候取反符号位要跟着变，而反码符号位是不变的。


运算
System.out.println("~"+(~2));


源码，反码，补码


位运算

移位运算符
>> 右移 移出去的用空位用符号位的数字补位，符号位不动 1 >> 2 = 0 (正0 负1 )
<< 左移 符号位不变用0补低位
>>> 最低位置移除高位补0注意符号位也移动


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



总结只要运算不管是为运算还是移位运算统统以补码的形式操作


集合框架（集合类和接口）
为什么需要?
package jikekuangjia;
import java.util.*;
public class question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//数组是定长的，所以无法的伸缩他的大小。
		Yg yg[] = new Yg[10];//现在就是这个问题定小了不够用大了浪费
		yg[0] = new Yg("ding.luchao", 28, 85.2F);
		
		//用集合类就OK了
		//如果集合类也满足不了就带用链表了，强烈建议学链表。
		//--------------List结构------------
		//ArrayList
		//LinkedList
		//Vector
		//Stack
		//---------------Map结构------------
		//HashMap
		//Hashtable
		//---------------Set结构------------
		//HashSet
		//TreeSet
		//---------------Queue结构集合
		//Queue
		//集合类的增删改查
		
		//定义ArrayList 对象
		ArrayList a = new ArrayList();
		//向ArrayList 添加一个数据，类型是object,可以是任何的object类型。
		//创建一个职员
		Yg firstYg = new Yg("ding.luchao", 29, 38.5F);
		//将firstYg 加入到a中去 关于add去看文档，默认查到尾部
		a.add(firstYg);
		//这里有个概念说明下，a.add(firstYg)并不是在a的队列里面重新开辟了一块存放firstYg大小的区域，而是存放了指向firstYg的引用地址。
		
		//如何访问ArrayList的数据
		Yg as = (Yg)a.get(0);//因为返回的是Object所以需要强转一下	
		System.out.println(as.getName());
		
		//可不可以放入同样的对象，是可以的
		
		//删除一个对象
		a.remove(0);
		
		//显示大小 显示长度
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
//终止现在正在运行java虚拟机，也就是退出系统
System.exit(0) 
System.exit(-1)
0和-1的区别
0:正常退出
非0:非0的代表异常退出

LinkedList --栈个队列用这个
比ArrayList 多了2个方法addFirst  addLast 往列表的头和尾部加入。栈和队列的概念
                                 getFirst 从头取 getLast从尾取

//非线程的性能高于线程的
Vector 向量
Vector vector = new Vector()

Stack 栈
Stack stack = new Stack()

Vector、Stack：线程安全
ArrayList、LinkedList：非线程安全
LinkedList：双向链表
ArrayList，Vector，Stack：数组
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
	  
		//将emp1放入hashMap里面
		//key value
		//value就是emp1对象
		hm.put(emp1.getName(), emp1);
		//注意这个有点是要说明的arraylist如果放入相同的内容是不会覆盖的，而HashMap如果放入相同的key 是回发生覆盖的
		//key是唯一的
		hm.put(emp1.getName(), emp1);
		//查找ding.luchao的数据
		if(hm.containsKey(emp1.getName())){
			System.out.println("exists");
			//取出数据
			Emp getEmp = (Emp)hm.get(emp1.getName());
			System.out.println(getEmp.getAge()+"--"+hm.size());
		}
		//遍历HashMap
		//迭代器 
		Iterator it = hm.keySet().iterator();
		//是否存在下一个
		while(it.hasNext()){
			//取出key
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

HashMap 和 Hashtable 用法上完全一致

===================集合类的一些区别============
HashMap 和 Hashtable的区别?
相同点都可以用来存放java对象
区分：
1.Hashtable 是基于就的Dictionary类的，HashMap是java 1.2引进的Map接口的一个实现
2.Hashtable 是同步的准确的说是线程同步。这个类中的一些方法保证了Hashtablez中的对象是线程安全的。
HashMap是异步的，因此HashMap中的对象并不是线程安全的。因为同步需要浪费效率所以如果不需要线程的安全使用HashMap。
3.HashMap可以让你的空值作为一个条目的key或value
Hashtable不可以放入空值null

ArrayList 和 Vectora 区别？
相同点都可以用来存放java对象
1.Vector 是同步的
2.数据增长 自动增长 ArrayList 扩展50% Vector 扩展 1倍
例如将在向数组增加一个就满了，它会自动在扩展一些空间出来，但是如果说你没有装满它扩展的空间，它也会占那么大的地方。
Vector 1个满了变2个，2个满了变4个四个满了变8个。。。。
ArryList 是50%
所以看出来如果大数据量用Vector比较有优势，自增的几率小。
但是如果是小数据量用Vector 会造成空间浪费。
所以你创建后实际的空间会大，因为它自动给你创建了一部分空间了


总结一把
1.如果要求线程安全就用Vector Hashtable
2.如果不要求线程ArrayList LinkedList HashMap
3.键值对HashMap HashTable
4.数据量大同时线程安全就用Vector,如果数量大不用考虑线程安全也用Vector吧，减小自动开辟空间的几率。

补充一下
数据集合接口List Map Set Queue
所以可以
List a = new ArrayList();
List b = new LinkedList();
当然a,b只能访问它们接口定义的方法，它们独子的方法是获取不到的。


脏数据
多个线程在没有防护的情况下，同时操作一个数据。
用锁的概念在做防护
当一个线程在工作其他的线程需要等待.




泛型(好些个类型泛泛) 充分理解什么是泛型
泛型的好处在编译的时候检查类型安全，并且所有的强制转换都是自动和隐式的，提高代码重用性,注意如果是int 这里是<Integer>。
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
		//放入到集合中
		dogList.add(dog1);
		//取注意这里有个强转的动作,如果不强转就报错了,这里有个安全隐患。
		Dog tmp = (Dog)dogList.get(0);
		//注意看这个安全隐患
		/*Exception in thread "main" java.lang.ClassCastException: jikekuangjia.Dog cannot be cast to jikekuangjia.Cat
	at jikekuangjia.fanxing.main(fanxing.java:17)*/
		//编译的时候不知道放的是什么玩意所以运行就报错了
		Cat cat1 = (Cat)dogList.get(0);//这样看是没有问题的，但是如果运行会报出类型转换失败，为什么，因为狗强转猫。
		
		//解决这个问题可以用泛型
		//如果声明改为 ArrayList<Dog> dogList = new ArrayList<Dog>();
		//那么Cat cat1 = (Cat)dogList.get(0);就会报错
		//“<类型>” 这个就是泛型
		//Dog tmp = dogList.get(0); 这里也不用(Dog)强转了。
		
		
		
		
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

理解泛型就是一类广泛的类型你传给它什么，它就是个什么。
例如
//定义个一个类  <T>是个类型，但是不知道具体是个什么类型
class Gen<T>{
	private T c;
	public Gen(T str){
		this.c = str;
	}
	//得到T类型的名称
	public void getC(){
		System.out.println(this.c.getClass().getName());
	}
}
调用的是Gen<Integer> a = new Gen<Integer>(2);
这里还会在编译的时候检查实参你传的是不是一个Integer类型。即对(2)检查
a.getC();
这里泛型指的是integer因为传了一个integer
实例的变量.getClass().getName();//得到类型
Integer a = 1;
a.getClass().getName();//获取类的名称
<中的值>必须是类名字例如Integer Float Boolean等等
类的形参可以是任意但是实参传的时候必须是类型
class SQL<T>
SQL<String>
这个时候T就是个String
java的反射机制，也是java的经典用法。
以上面的那个代码块为例
this.c.getClass().这里有很多获取（this.c这个值的）类一些方法。
this.c其实就一个实例2是Integer的实例""是String的实例
实例.getClass().通过值反射到类得到一些类的信息。
例如
import java.lang.reflect.Method; 反射机制的包
Method [] a = this.c.getClass().getMethods();
//得到的是一个Integer类里面的方法
Method [] a = this.c.getClass().getMethods();
//打印
for(int i=0; i<a.length; i++){
    System.out.println("方法"+a[i].getName());
}
通过反射机制了解类的很多信息

在定义类的时候如果没有办法确认某些属性的类型就需要使用泛型
class A<不知道什么类型>{
 private 不知道什么类型 a;
}
A<传入确认的类例如String> a = new A<传入确认的类例如String>(实例这个时候编译器就会对这个实例进行检查查看这个值是否是String的实例)

这个时候
class A<这个确认的类型就确认下来了>
感觉这个用在多态蛮好的

总结
1.类型安全
2.向后兼容
3.层次清惜
4.性能较高，用泛型java编写的代码可以为java编译器和虚拟机带来更多信息(反射信息)，这些信息对java程序做进一步优化提供条件。


异常 掌握java中的异常处理 当出现程序没有办法控制的外部环境问题（用户提供的file不存在，file内容损坏、网络问题等等）时,java就会用异常对象来描述。
java中处理异常的2种方法
1.在发生异常的地方处理。
2.将异常抛给调用者，让调用者处理。
使用好异常，代码会很健壮。

异常
三种，检查性异常，运行期异常，错误
检查性异常：java.lang.Exception 编译的时候就会检查可能会有异常的地方要求调用者必须解决。
运行期异常: java.lang.RuntimeException 编译期没有办法发现的,运行的时候才发现，例如数组越界。
错误:java.lang.Error 错误是最难检查到的。
顶层的是java.lang.Throwable这几种异常都是它的孙类。
java.lang.Exception 和 java.lang.Error继承java.lang.Throwable
java.lang.runtimeExcetion 继承 java.lang.Excetion

import java.io.*;
import java.net.*;
public class trys {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//检查性异常这个不是程序的错，因为例如网络连不通，文件打不开等等
		//而很可能是远程的修改等等
		//打开一个不存在的文件
		//编译器很聪明，它在想它如果找不到这个文件怎么办，所以它要求你处理如果找不到的异常。
		//这种就是检查性异常，编译期就报错了。
		//FileReader fr = new FileReader("d:\a.txt");
		//连接IP
		//他认为你可能写错了所以你要处理
		//Socket sock = new Socket("127.0.0.1", 80);
		//编译器先期可以预见的异常
		
		
		
		//运行异常--只有在运行的时候才能知道 必须处理
		//例如数组越界，0被除
		//int a = 4 / 0;//代码没有错运行起来就报错了
		/*Exception in thread "main" java.lang.ArithmeticException: / by zero
	at trys.main(trys.java:25)*/
		//int [] as = new int[10];//数组越界
		//System.out.println(as[100]);
		/*
		 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100
	at trys.main(trys.java:29)
		  */
		
		
		//真正的错误，源于程序的BUG可能程序耗尽了。
		//例如程序排序，调内存这个时候内存耗尽。
		//最不好调的，有的跟环境有很大关系，死活起不来，有的被外部环境挡死，杀毒软件等等。
		
		
		
		//捕获异常 的解决方案
		//当程序错误的点开始中断
		//解决
		//1.try catch
		//2.使用 throw扔给调用者
		//最大捕获，不关什么错误多都让Exception来捕获，常用！
		/*try{
			FileReader fr = new FileReader("d:/a.txt");
		}catch(Exception e){//这是个最大捕获,不关什么异常统统让catch捕获
			//输出异常信息，易于排错
			//e.getMessage 输出错误信息 需要System.out.println
			//e.printStackTrace() 直接就输出错误信息
			
		}*/
		
		//最小捕获,不用大Exception而是用对应的错误捕获,有什么异常就捕获什没异常。	
		/*try {
			FileReader fr = new FileReader("d:/a.txt");
			Socket sock = new Socket("127.0.0.1", 80);
		} catch (FileNotFoundException e) {//最小捕获针对一种错误如果里面还有其他错误，这种捕获是不够的
			// TODO: handle exception
			e.printStackTrace();
		} catch(IOException e){//多种错误如果要用最小的精确捕获，就需要使用多个catch来分别捕获。
			e.printStackTrace();
		}*/
	
		//建议不用分着么细致,直接用Exception捕获所有的。

		//finally
		FileReader fr = null;
		try {
			fr = new FileReader("d:/a.txt");
		} catch (Exception e) {
			// TODO: handle exception
		} finally{//不关是不是出现了异常统统走这个，这个作用很显而易见，一般说把需要关闭的资源，【文件，内存，数据库等等】。
			 if(fr != null){
				 try{
					 fr.close();//关闭资源是必须的不关是否成功
				 }catch(Exception e){
					 
				 }
			 }
		}
		
		//try catch finally 不一定要三者都必须出现
		//一般必须这三者一起出现
		
		//以下几个情况finally 不一定被执行
		//finally 块中发生了异常
		//程序所在的线程死亡
		//在代码中使用Systen.exit(Number)
		//关闭cpu
		
		
		
		
		
	}
}
class test{
		//抛给调用者 -- throws Exception
		//谁调用test类的hi方法，谁就要负责解决它
	    //如果调用者都不想关这个异常就交给虚拟机了
		public void hi() throws Exception
		{
			FileReader fr = new FileReader("d:/a.txt");
		}
}

//如果 printStackTrace()报出了很多错误注意第一个开始报错的位置，因为其他很可能是调用它出了错误


InputStreamReader ipt = new InputStreamReader(System.in);
BufferedReader rd = new BufferedReader(ipt);
rd.close关闭输入流。关闭它就不用关闭ipt了


一个数组分数的值删除
其实可以换一种思想，将改值设为-1即可

switch 的判断优良中差 可以将分数/10得到的一个int就能够明确知道是哪个分数段的。

二维数组的赋值
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
当调用hi的时候返回的是aa在返回-1，原因是除了中断程序或者卡死程序必须要执行finally所以这个时候先打印在返回-1.

===字符串池子的问题
当声明为
String c = "abcd";
它先去堆区字符串池找abc的值，然后如果找到将地址赋值给c.
String b = "abcd";
c == b;
String d = "abc";
d+="d"
a != d 因为d 定义的时候就决定了它和c不是一个地址而是新开的一个地址。

String f = new String("abcd");

f!=a当你使用了new 压根就不进字符串池子


=========================swing==========================
1.图形用户界面GUI 介绍 goo-e
2.eclips开发工具介绍
3.swing组件介绍
4.三大常用布局管理器

1.初步掌握swing组件的使用
2.知道什么是awt，swing,swt,jFace
3.掌握常用的布局管理器
4.学会使用eclipse做java程序开发
关于使用去查看java file 里面有详细注释
GUI 开发的步骤
1.主类继承JFrame
2.定义需要的组件
3.构造方法创建组件
4.设置布局管理器
5.添加组件
6.设置窗口
7.显示窗口
=========
什么组件想滚动就往JScrollPane 的实例中放,例如list testarea.目前测试的就这两种
this.testArea = new JTextArea(10,30);//高度，长度
this.jsp = new JScrollPane(this.testArea);//添加到滚动

this.lb = new JLabel("<html><a href=''>aaa</a></html>",JLabel.CENTER);
this.lb.setFont(new Font("宋体",Font.PLAIN,16));
this.lb.setForeground(Color.red);
this.lb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
===================================坦克大战================================
1.写需求
学习项目的应该先学会拆，将功能模块拆解成多个小模块，然后去琢磨，最后拼装成自己的东西。
技术===========
1.java绘图坐标体系
java绘图的坐标系的原点是基于弹出窗口的左上脚，而弹出框的是基于屏幕的。
像素是一个密度单位，厘米是个长度单位两者1法比较。 

//事件的流程
1.类实现想用的接口，KeyListener MouseListener ActionLister WindowListener
2.把接口的方法实现，重写好它。
3.完成这两部这个类就是监听者，方法过程就是处理流程
4.返回的ActionEvent e 就是一个事件，用e可以得到譬如 getActionCommand(Action) getKeyCode(KeyListener) 等等
5. 在事件源上注册监听，什么是事件源，就是绑定的那个实例对象，例如 一个按钮，或者主类，被实例 后可以绑定事件例如
Event_keyword i = new Event_keyword();
this.addKeyListener(this.m);//this 就是i的实例，this.m就是事件监听者
当前实例绑定事件监听者this.m,this m 是监听者的实例。
如果是ActionListener 有可this.setActionCommand("值传递") 事件可以用e.getActionCommand()获取传递的值
6.事件传递是靠事件对象的例如ActionEvent KeyEvent MouseEvent or WindowEvent
=====================深入事件==============================================
1事件源
事件源是一个产生（或触发）事件的对象，比如前面的JButton的一个对象btml。当这个事件源对象的默写状态以某种方式发生变化时，就会产生某种类型的事件（<<一个事件源可能会发生多个不同类型的事件>>）如果某个组件（对象）希望得到事件源产生的事件，就需要在这个事件源上注册。一个事件源可以注册不同事件，例如j.addKeyListener j.addActionListener.等等只要你想可以绑定多个!!!<一个事件源可以被多个事件监听者监听>!!!其实就是同一个事件add多个事件监听者例如 addActionListener(new a()) addActionListener(new b());
2.事件就是承载 事件源状态改变时的信息对象。java.awt.event javax.swing.event中定义了各种事件类型，常见的事件类有：
ActionEvent                 通常在按下按钮，或双击一个列表或选中某个菜单系发生
AdjustmentEvent             当操作一个滚动条发生
ComponentEvent              当一个组件隐藏，移动，改变大小发生
ContainerEvent              当一个组件从容器加入或者删除发生
FocusEvent                  当一个组件获得或失去焦点发生
ItemEvent                   当一个复选框或是列表项被选中，当一个选择框或选择菜单被选中
KeyEvent                    键盘
MouseEvent                  鼠标
TextEvent                   本区域发生改变,例如聊天
WindowEvent                 当一个窗口激活，关闭，失效，恢复，最小最大化

3.事件监听器接口例如WindowListener, ActionListener,KeyListener,MouseListener等等

===============================总结
1.编写事件处理类（事件监听者）
2.更觉需求给事件处理类实现监听器接口
3.在事件处理类中重写（实现）其事件处理的函数
4.在事件源类中指定该事件的监听器（响应者）是谁，即注册监听。

java 采用委托机制处理事件
在事件源中需要注册事件监听类。否则事件监听类接收不到事件源发生的事件。
  


======================================线程====================
目标：
1.理解线程的基本概念
2.掌握编写线程的两种方法
3.搞清楚线程的运行机制
4.完成坦克大战游戏
===========================================深入了解线程
深入理解线程
当多个线程操纵一组数据的时候要小心了主意使用synchronized
线程对象只能启动一个线程。
/**
 * 使用线程的注意事项
 * 1.线程对象只能启动一个线程
 * Catz cat = new Catz();
 * Thread thread1 = new Thread(cat);
 * thread1.start();
 * thread1.start();
 * 如果启动两次直接报错  
 * Dogz dog = new Dogz();
 * Thread thread2 = new Thread(dog);
 * Thread thread3 = new Thread(dog);
 * thread2.start();
 * thread3.start();
 * 这样写就没有问题,因为启动了两个线程跑一个类，但是一个线程只能跑一次所以上面的用例是错误的。
 * @author Administrator
 *
 */

多线程并发，同时访问同一组数据，存在加锁和解锁的问题。
package xiancheng;
/**
 * 多线程卖票系统
 * 调试信息查看哪条线程在工作
 * Thread.currentThread().getName()查看哪条线程在工作,获取当前运行线程的名字。
 * 什么是线程安全
 * 同一个票被多个窗口同时售出
 * 解决问题的关键
 * 解决问题的关键就是要保证容易出问题的代码的原子性
 * 什么是原子性
 * 当A线程执行某段代码的时候别的线程必须等到其他线程完成后才执行。
 * 就和排队上茅房一样。
 * java处理线程同步的方法提供了
 * synchronized(Object) 对象锁{你要同步的代码} 《线程锁》
 * 排队的线程会呆在等待线程池子里面，线程池中的代码是不占系统资源的它们都是阻塞状态所以不占系统资源。等到synchronized的代码执行完毕后，在从线程池子里面拿下一个线程进来，排队的线程相对队列，先进先出的排在线程等待池中，但是也不是完全的，线程这个有优先级，会破坏这个链条，如果优先级一样没的说就是队列走法，否则就按照优先级，高的线进（就像上茅房有个比较重要的任务来了，可能要他先上，也可能让正在执行的中断进入进程池，让这个优先级高的先运行）。
 * 对象锁默认的标志位是1，代表没有人在使用资源，如果是0代表有人在使用，当没有任何线程使用为1，如果有线程操控就为0
 * 当进来了就把标志重置为0，用完了空闲在重置1（必须用完要重置回否则是死锁），当等待线程池里有线程，下一个线程来就会直接排到线程等待池的队列中，而不是在去问线程锁是不是打开的状态。如果空池要去问线程锁的状态的。
 * 死锁，用完后没有重置回原来的开锁状态。
 * 死锁是有可能的在执行的时候程序异常，但是没有解锁就完了，两个对象互斥，你读我我读你就成死锁了，尽量避免并发的线程相互访问。
 * 1.互斥条件：所谓互斥就是进程在某一时间内独占资源。
 * 2.请求与保持条件：一个进程因请求资源而阻塞时，对已获得的资源保持不放。
 * 3.不剥夺条件:进程已获得资源，在末使用完之前，不能强行剥夺。
 * 4.循环等待条件:若干进程之间形成一种头尾相接的循环等待资源关系。
 * 
 * 理解就是
 * 
 *  synchronized (obj1) {
                System.out.println("我已经锁定obj1，休息0.5秒后锁定obj2去！");   
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
                System.out.println("我已经锁定obj2，休息0.5秒后锁定obj1去！");   
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj1) {
                    System.out.println("0");
                }
            }
 * 锁：
 * 文件锁，对象锁，数据库锁，行锁，表锁（数据库的锁是自动执行的）。
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
		
		//定义三个售票窗口,三个线程跑同一个对象。
		Thread thread1 = new Thread(s);
		Thread thread2 = new Thread(s);
		Thread thread3 = new Thread(s);
		//相对于对一个事情启动了多条线程在同时操作。
		//线程号谁先动谁是0号
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
class ShouPiaoChuangKou implements Runnable{
	private int allPNum = 2000;
	private Dog myDog = new Dog();//用来看着同步锁，想进来看看锁
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		String str = "";
		while(true){
			//认为这个要保证原子性,同步代码块,this就是对象锁，代表本对象。
			//这里的这个对可以是任意对象只要有个对象看着就行
			synchronized(this.myDog){//可以用this 可以用其他对象，要有个对象看着这个锁
				if(this.allPNum >0){
					this.allPNum--;
					str = "剩余" + this.allPNum;
					if(this.allPNum == 0){
						str = "没了";
					}
				}else{
					break; 
				}
				System.out.println(Thread.currentThread().getName()+str);
				//处理并发，共享数据
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
//看着进程锁
class Dog{
	
}

========================IO=======================
io编程
//例如存盘退出
1.理解file流的基本概念。
2.掌握file编程方法。
3.把握字节流和字节流。
4.完成坦克大战游戏。

file在程序中是以流的形式来操作的。

内存<-输入流<-aaa.txt
    ->输出流->
从内存流出是输出流
从内存流入是输入流

file流的分类
java流分为两种流
1.字节流：可以用于读写二进制file及任何类型file
2.字符流：可以用于读取file内容
3.对象流
         字节流(以字节的形式存在的)              字符流
输入         InputStream                         Reader 
输出         OutputStream                        Writer

file头的概念，所有的file有个file头里面存放了大小类型等等，后缀不能表示file的真实类型，需要读取file头，后缀的意义就是看看它是个什么类型的。
==========================
-file头，读取先读file头  -
-                        - 
-                        -
-                        -
-                        -
-                        -
-                        -
-                        -
==========================

可以以txt打开的是字符
二进制是byte存放的

字符流只能读取txt类型中的一些内容，不能是字节流的内容

所有操作系统最小的存放单位块，每个块有自己的最小大小，操作系统管理硬盘上存放的是各个数据块，每个数据块会分配一个空间，但是当你一个file的实际大小小于一个块时，它也会占用这个块的大小
例如讲一个快是4KB而这个file是22b那么它在硬盘上也占用4kb一个数据块
假如file是4.1kb那么没有疑问占用2个块多余空间就浪费了。
linux的最小空间可以改。数据块越少寻址越快但是越浪费空间。反之速度慢空间利用率高。
linux是fileSystem

假设这是一块磁盘
80G，磁盘划分若干磁道，在每个小磁道是就是存放数据块。
小的话就小吧，因为如果file变大再分会消耗系统资源所以这块就相当预留。
存储大file可能分配的磁道不是相邻的，但是最佳的状态就是相邻的分配。
这个不相邻可能是删除等操作造成的，产生一些碎片。
=============================
                            =
                            =
                            =
                            =
=============================

fd = new FileReader(fromPath);
fw = new FileWriter(toPath, true);
//一次读十个
char []c = new char[10];
int n = 0;
while((n = fd.read(c)) != -1){
    fw.write(c);
}
这里有个问题要注意下，如果char读取的很大如果file本身很小就会使用其它字符不缺所以这个定义也挺重要的。

file的关闭原则
后打开的先关闭，和关门一样。


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

关闭项目节省内存开销
右键项目->closeproject

查看某个方法是怎么写的？
选中方法名字右键->open Dedaration

当由于没有引包引发错误，点击前面的那个小*号出来有个import点击会自动引入包

try 的快捷键
打一个try 然后按助手建我设置的是alt+/ 直接出现补全就可以

显示行号
右键左侧边的竖线->show Line Numbers

如果想知道什么类型的异常将鼠标放到错误的波浪线上上面就有提示了直接捕获就可以

eclipse 项目拷贝
1.右键项目copy
2.粘贴到你的硬盘
3.别的机器import -> General -> Existing Projects into Workspace -> Select root directory -> Copy projects into workspace(如果选择这个相当于将项目拷贝到工作空间，不选相当于在原有的项目上直接修改。)


eclipse 调试
设断点以后debug 后找到Expressions->右键add->输入你想检测的语句

=========================作用域=======================
//作用于的概念 函数作用域
