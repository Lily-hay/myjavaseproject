# java基础

## 1、安装

长期稳定的版本JDK8、11等

java 执行工具

javac 编译工具

## 2、几个命令行窗口常用命令

1、dir 列出当前文件夹目录下的文件下信息

2、cd 进入某个目录

​     cd.. 回到上一级

​     cd\ 回到根目录

3、cls 清楚命令行窗口的内容

Java开发步骤：编写→编译→运行，类名与文件名一致

## 3、入门知识

1、java运行原理

 高级语言→汇编语言→机器语言

2、JDH组成

JVM：Java虚拟机，真正运行Java程序的地方

核心类库：Java写好的程序

System.out.println("Hello World!!!");

JRE:Java运行环境

JDK：Java工具开发包

Javac将源代码编译为class文件，将其送入虚拟机，调用核心类库执行代码

3、Java跨平台特性

一次编译，处处可用，为每个平台提供了不同的虚拟机

4、环境变量

Path环境变量可用于记住程序路径，方便在命令行窗口任意目录下直接启动程序

老版本JDK需要自己手动配D:\Program Files\Java\jdk-21\bin

JAVA_HOME:D:\Program Files\Java\jdk-21

方便维护，path改为%JAVA_HOME%\bin

## 4、创建工程

1、project→module→package→class

编译产生的文件在out里

字体设置：font

2、快捷键

main/psvm  main方法 sout输出

ctrl+D复制前一行

对代码注释 ctrl+/,ctrl+shift+/

生成说明文档：命令窗口 javadoc -d api ./Java文件

3、字面量

'\t'一个tab空格

数据存储原理  计算机表示数据的最小单元：字节B

## 5、数据类型

1、数据类型：基本类型8种，在Java中，byte占1字节，char占两字节；默认的数据类型int，double；float a=3.14F.long b=3621694L,还有String类型

2、数据类型转换

```
//        自动类型换，显示的时候根据类型决定
        char ch='a';
        int it=ch;
//        自动类型换，小到大
        float b=it;
```

3、表达式的自动类型转换

表达式中由最高类型决定

表达式中，byte,short,char是直接转成int类型参与运算的

```
        byte a=10;
        int b=20;
        long c=30;
//        int result=a+b+c;报错，自动转为最高类型运算
        long result=a+b+c;
//        long result2=b+c+3.14;报错，3.14为double类型
        double result2=b+c+3.14;
//       表达式中，byte,short,char是直接转成int类型参与运算的
        byte a1=37;
        byte a2=40;
//        byte a3=a1+a2;报错
        int a3=a1+a2;
```

4、强制类型转换

大范围的变量不能直接转为小范围的

浮点型转为int,丢掉小数部分

```
byte b1=(byte)b;
int i=1500;
int j=(byte)i;//数据溢出
```

5、运算符

基本运算符 +可做连接符，能算则算，不能算则连接

++在变量前，先+后用，在后，先用后加

赋值运算符 a+=b  a=(a的类型)a+b，包含强制类型转换

关系运算符：与或非亦或 & |  !  ^

&& 短路与 左边为false,右边不执行，性能好一点

||短路或 左边为true，右边直接不执行，性能好

&&优先级大于||

6、扫描器

```
//1、导包
//2、创建扫描对象
//3、使用扫描器sc去接收用户键盘输入信息
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age:");
int age=sc.nextInt();
System.out.println("your age is:"+age);
System.out.println("请输入您的名字");
String name=sc.next();
System.out.println("您的名字是："+name);
```

## 6、分支控制

1、switch

//switch不支持double,float,long
String weekday="周三";
switch(weekday)
{
    case "周一"://case只能接收自变量，不接受变量
        System.out.println("study");
        break;//不写break，出现穿透性，并不全是坏处，多个输出一样时，可用于简化代码
    case "周三"：
        System.out.println("study3");
        break;
            
}

## 7、数组

1、数组的定义

数据类型 [] 数组名=new 数据类型[]{元素}；

也可写为 数据类型 数组名[]

简化类型   数据类型 [] 数组名={元素}；

```
int[] ages=new int[]{21,34,38};
//简化
int[] ages2={21,34,64};
```

数组变量名中存储的是数组内存中地址，是引用数据类型

2、数组的访问

数组名[索引]

ages[0]

访问数组长度，索引

```
//        访问数组长度
        System.out.println(ages.length);
        //索引
        System.out.println(ages.length-1);
```

3、数组的遍历

```
//数组遍历
for (int age : ages) {
    System.out.println(age);
}
for(int i=0;i<ages.length;i++)
{
	System.out.println(ages[i]);
}
```

4、动态初始化数组

数据类型[] 数组名=new 数据类型[长度]；//后期存入数据

int[] ages=new int[4]；

boolean类型数组默认值False

5、程序的执行原理

Java内存分为方法区、栈和堆

字节码文件即（.class文件）加载到方法区(文件加载到内存中)，main函数送到栈内存中，其中的变量也存储到这个区域，new出来的对象存储在堆中，通过返回对象的地址传送到栈中。

6、多个变量指向同一个数组对象

存储的是相同的地址，每个变量修改数组值都有效

```
int[] arr1=new int[]{1,2,3,4,5};
int[] arr2=arr1;
System.out.println(arr1);
System.out.println(arr2);
arr2[2]=10;
System.out.println(arr1[2]);//数组里的值已被改变
```

某个数组变量存储的地址为null,它将不再指向任何对象

```
arr2=null;
    System.out.println(arr2);
    System.out.println(arr2[0]);//空指针异常，NullPointerException
}
```

数组遍历需要注意

```
    int[] facescore={15,9000,10000,20000,9500,-5};
    int max=facescore[0];
    for (int i = 1; i < facescore.length; i++) {
        if(facescore[i]>max)//facescore[i]每次都要到堆里找,寻找了两次
        {
            max=facescore[i];
        }
    }
    System.out.println(max);
}
//改进
    int[] facescore={15,9000,10000,20000,9500,-5};
    int max=facescore[0];
    for (int i = 1; i < facescore.length; i++) {
    	score=facescore[i]
        if(score>max)//facescore[i]//只找了一次
        {
            max=score;
        }
    }
    System.out.println(max);
```

7、数组交换

```
for (int i = 0,j= facescore.length-1; i < j; i++,j--) {
    int temp=facescore[j];
    facescore[j]=facescore[i];
    facescore[i]=temp;
}
for (int i = 0; i < facescore.length; i++) {
    System.out.print(facescore[i]+" ");
}
```

```
//打乱数组中的数据
Random r=new Random();
for (int i = 0;i<facescore.length; i++) {
    int j=r.nextInt(facescore.length);
    int temp=facescore[j];
    facescore[j]=facescore[i];
    facescore[i]=temp;
}
for (int i = 0; i < facescore.length; i++) {
    System.out.print(facescore[i]+" ");
```

## 8、方法

1、方法也就是函数



```
public static int getMax(int a,int b){
    int max=a>b ? a:b;
    return max;
}
```

2、方法的执行原理

方法运行在栈中

保证调完方法能够回来，并且释放内存空间

3、基本类型的参数传递机制

**值传递，传输的是实参存储的值的副本**

```
 int a=10;
    change(a);
    System.out.println(a);//10值并没有改变
}
public static void change(int a)
{
    System.out.println(a);//10
    a=20;
    System.out.println(a);//20
```

4、引用类型的参数传递机制

传递的是地址

```
int[] arr={10,20,30};
    change1(arr);
    System.out.println(arr[1]);//366值改变
}
public static void change1(int[] arr)
{
    System.out.println(arr[1]);//20
    arr[1]=366;
    System.out.println(arr[1]);//366
}
```

demo

```
public static boolean compare(int[] arr1,int[] arr2)
{
    if(arr1==null || arr2==null)//卫语句，排除其他情况
    {
        return false;
    }
    if(arr1.length!=arr2.length)
    {
        return false;
    }
    for (int i = 0; i < arr1.length; i++) {
        if(arr1[i]!=arr2[i])
        {
            return false;
        }
    }
    return true;
}
```

5、方法重载

一个类中，名称相同，形参列表必须不同（个数、类型、顺序），不关心形参的名称

```
public static void fire()
{
    System.out.println("向M国发射一枚火箭");
}
public static void fire(String location)
{
    System.out.println("向"+location+"发射一枚火箭");
}
public static void fire(String location,int number)
{
    System.out.println("向"+location+"发射"+number+"枚火箭");
}
```

## 9、面向对象编程

1、基本创建

```
//类：对象的数据结构
public class Student {
	//成员对象
    String name;
    double chinese;
    double math;
    //成员方法
    public void printAllScore()
    {
        System.out.println(name+"总成绩："+(chinese+math));
    }
    public void printAverageScore()
    {
        System.out.println(name+"平均成绩："+(chinese+math)/2);
    }
}
```

```
Student s1=new Student();//创建对象,每new一次，得到一个新的对象
s1.name="波妞";
s1.chinese=69;
s1.math=89;
s1.printAllScore();
s1.printAverageScore();
```

对象本质是一种特殊的数据结构

​											s1学生表

|  name   |      |
| :-----: | ---- |
| chinese |      |
|  math   |      |
|   ...   |      |

**每new一次，得到一个新的对象**，在堆内存中开辟一块内存区域代表一个学生对象

2、理解类和对象的一些注意事项

①创建对象的成员变量有初始化的默认值0，null等

②一个文件类中可以有多个类，但public所指的必须为文件名

③当堆内存中的对象，没用被任何变量引用（指向时），被判定为垃圾，java有自动垃圾回收机制

