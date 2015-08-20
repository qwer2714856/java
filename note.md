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

