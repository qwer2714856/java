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

3.四大特征
公认的三大特征
多态(一个对象的多种状态)、继承、封装（抽象）


=========================作用域=======================
//作用于的概念 函数作用域
