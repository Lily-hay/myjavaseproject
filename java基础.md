# java基础

## 5、数组

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

## 6、方法

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

## 7、面向对象编程

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

