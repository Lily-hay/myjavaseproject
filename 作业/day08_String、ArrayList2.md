

## 基础部分

#### 练习一

> 目标：掌握字符串的遍历

##### **1. 需求**

````java
1.定义一个方法， 接收一个字符串代表QQ号码。方法中实现判断QQ是否正确：a.长度在5-12之间。 b.首位不能为0
2.定义main方法，使用Scanner录入一个字符串作为QQ号码。调用方法，接收返回的结果    
````

程序执行，在控制台输出效果

````java
调用方法，传入的QQ账号是： 326666777
结果：true
调用方法，传入的QQ账号是： 026666777
结果：false
调用方法，传入的QQ账号是： 3266
结果：false 
调用方法，传入的QQ账号是： 3266123456789
结果：false     
````

##### 2. 知识点

* 字符串的遍历
  * char charAt(int index)
    * 获取指定索引处的字符，返回一个字符

  * int length()
    * 获取数组的长度

  * char[] toCharArray();
    * 把字符串转化为字符数组，返回一个字符数组

  * boolean startsWith(String prefix)
    * 判断是否以指定的prefix开头，如果是返回true，如果不是，返回false


##### **3. 思路分析**

````java
1.自定义一个方法，方法接收一个字符串，返回值为布尔类型。如果传入的QQ账号是正确的，就返回true，如果是不正确的就返回false。
2.方法中实现：
    2.1 判断字符串的长度是否在[5,12]之间
    2.2 判断字符串是否以0开始。可以使用startsWith()的方法判断。或者使用charAt()的方法获取第一个字符判断是否为0字符。如果是0，直接返回false 
    2.3 遍历字符串。
    2.4 使用charAt()方法获取字符串的每一个字符。
    2.5 判断字符是否为'0'~'9' 之间的字符，如果不是，则返回false
    2.6 循环结束之后，返回true。代表所有都是数字字符
3.定义main方法，键盘录入一个字符串，调用方法， 传入字符串，接收返回的结果。    
````

````java
public class Test01 {
    public static void main(String[] args) {
        //3.定义main方法，键盘录入一个字符串，调用方法， 传入字符串，接收返回的结果。
        System.out.println(checkQQ("326666777"));
        System.out.println(checkQQ("026666777"));
        System.out.println(checkQQ("3266"));
        System.out.println(checkQQ("3266123456789"));
    }

    //1.自定义一个方法，方法接收一个字符串，返回值为布尔类型。如果传入的QQ账号是正确的，就返回true，如果是不正确的就返回false。
    public static boolean checkQQ(String QQNumber) {
        //2.1 判断字符串的长度是否在[5,12]之间
        if (QQNumber.length() < 5 || QQNumber.length() > 12) {
            return false;
        }

        //2.2 先判断字符串是否以0开始。可以使用startsWith()的方法判断。或者使用charAt()的方法获取第一个字符判断是否为0字符。如果是0，直接返回false
        if (QQNumber.startsWith("0")) {
            return false;
        }
        //2.3 遍历字符串。
        for (int i = 0; i < QQNumber.length(); i++) {
            //2.4 使用charAt()方法获取字符串的每一个字符。
            char ch = QQNumber.charAt(i);
            //2.5 判断字符是否为'0'~'9' 之间的字符，如果不是，则返回false
            if (!(ch >= '0' && ch <= '9')) {
                return false;
            }
        }
        //2.6 循环结束之后，返回true。代表所有都是数字字符
        return true;

    }
}

````





#### 练习二

> 目标：掌握字符串的遍历

##### **1. 需求**

````java
1.定义一个方法， 接收一个字符串代表身份证号码。方法中实现判断身份证是否正确：a.身份证长度为18。b.第一位是不为0的数字。c.2-17位都是数字。d.最后一位可以是数字，可以是大写字母'X'
2.定义main方法，使用Scanner录入一个字符串作为身份证号码。调用方法，接收返回的结果    
````

程序执行，在控制台输出效果

````java
调用方法，传入的身份证号码是： 440881199001010202
结果：true
调用方法，传入的身份证号码是： 44088119900101020X
结果：true
调用方法，传入的身份证号码是： a40881199001010202
结果：false 
调用方法，传入的身份证号码是： 040881199001010202
结果：false
调用方法，传入的身份证号码是： 440881199a01010202
结果：false
调用方法，传入的身份证号码是： 4408811990101020
结果：false    
````

##### 2. 知识点

* 字符串的遍历
  * char charAt(int index)
    * 获取指定索引处的字符，返回一个字符
  * int length()
    * 获取数组的长度
  * char[] toCharArray();
    * 把字符串转化为字符数组，返回一个字符数组

##### **3. 思路分析**

````java
1.自定义一个方法，方法接收一个字符串，返回值为布尔类型。如果传入的身份证号是正确的，就返回true，如果是不正确的就返回false。
2.方法中实现：
    2.1 判断身份证号码的长度是否为18.如果不是则直接返回false
    2.2 判断身份证号码第一位是否是不为0的数字，如果不是，直接返回false
    2.3 判断身份证的最后一位是否为数字或者字符'X'，如果不是，直接返回false
    2.4 从第二位开始，遍历身份证号码的前十七位，获取每一个位置的字符。
    2.5 循环中，判断字符是否为'0'~'9' 之间的字符，如果不是，则返回false
    2.6 循环结束之后，返回true。代表身份证号码符合条件
3.定义main方法，键盘录入一个字符串，调用方法， 传入字符串，接收返回的结果。    
````

````java
public class Test02 {
    public static void main(String[] args) {
        //3.定义main方法，键盘录入一个字符串，调用方法， 传入字符串，接收返回的结果。
        System.out.println(checkId("440881199001010202"));
        System.out.println(checkId("44088119900101020X"));
        System.out.println(checkId("a40881199001010202"));
        System.out.println(checkId("040881199001010202"));
        System.out.println(checkId("440881199a01010202"));
        System.out.println(checkId("4408811990101020"));
    }
    //1.自定义一个方法，方法接收一个字符串，返回值为布尔类型。如果传入的身份证号是正确的，就返回true，如果是不正确的就返回false。
    public static boolean checkId(String id){
        //2.1 判断身份证号码的长度是否为18.如果不是则直接返回false
        if(id.length() != 18){
            return false;
        }
        //2.2 判断身份证号码第一位是否是不为0的数字，如果不是，直接返回false
        if(id.startsWith("0")){
            return false;
        }
        //2.3 判断身份证的最后一位是否为数字或者字符'X'，如果不是，直接返回false
        if(!(id.charAt(17) >= '0' && id.charAt(17) <= '9' || id.charAt(17) == 'X')){
            return false;
        }
        //2.4 遍历身份证号码的前十七位，获取每一个位置的字符。
        for (int i = 0; i < id.length()-1; i++) {
            char ch = id.charAt(i);
            //2.5 循环中，判断字符是否为'0'~'9' 之间的字符，如果不是，则返回false
            if(!( ch >= '0' && ch <= '9')){
                return false;
            }
        }
        //2.6 循环结束之后，返回true。代表身份证号码符合条件
        return true;

    }
}

````





#### 练习三

> 目标：掌握字符串的遍历

##### **1. 需求**

````java
1.定义一个方法，用于生成验证码。方法接收一个整数，这个整数代表验证的长度。方法中实现生成一个任意的包含大写字母、小写字母，数字字符组合成的验证码。返回验证码
2.定义main方法，调用自定义方法，传入一个整数。接收一个返回的验证码。输出打印    
数据提供：
    data:abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789
````

程序执行，在控制台输出效果【效果不唯一】

````java
调用方法，传入整数：5
得到的验证码是：A63xY
调用方法，传入整数：6
得到的验证码是：aaUixt    
````

##### 2. 知识点

* 字符串的遍历
  * char charAt(int index)
    * 获取指定索引处的字符，返回一个字符
  * int length()
    * 获取数组的长度

##### **3. 思路分析**

````java
核心思想：从一个包含所有的大小写字母数字字符的字符串中随机抽取一个符号出来，拼接成一个验证码即可。
1.自定义一个方法，方法接收一个整数，返回一个字符串
2.方法中实现：
    2.1 先定义一个空的字符串。String s = "";用于拼接验证码
    2.2 创建随机数对象
    2.3 定义for循环，循环执行指定验证码长度的次数。循环中实现：
        2.3.1 随机生成范围是[0,61]的整数，作为索引。
        2.3.2 根据这个索引，从字符串中获取对应位置的字符。使用方法charAt()
        2.3.3 把这个字符拼接到空字符串s中
    2.4 循环结束之后，返回s。随机生成的验证码
3.定义main方法，调用方法， 传入一个整数，接收返回的结果，输出结果    
````

````java
import java.util.Random;
public class Test03 {
    public static void main(String[] args) {
        System.out.println("生成的验证码为:" + createCode(5));
    }
    public static String createCode(int length){
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        //2.1 先定义一个空的字符串。String s = "";用于拼接验证码
        String s = "";
        //2.2 创建随机数对象
        Random r = new Random();
        //2.3 定义for循环，循环执行指定验证码长度的次数。循环中实现：
        for (int i = 0; i < length; i++) {
            //2.3.1 随机生成范围是[0,61]的整数，作为索引。
            int index = r.nextInt(62);
            //2.3.2 根据这个索引，从字符串中获取对应位置的字符。使用方法charAt()
            char ch = data.charAt(index);
            //2.3.3 把这个字符拼接到空字符串s中
            s += ch;

        }
        //2.4 循环结束之后，返回s。随机生成的验证码
        return s;
    }
}

````





#### 练习四

> 目标：掌握字符串的比较

##### **1. 需求**

````java
实现模拟登录。现在已知某一个系统中注册了一个用户信息。账号密码分别为："gzitheima" , "loveJava" 。现在模拟用户登录，提示用户输入账号和密码。同时，使用【练习三】中的方法得到一个验证码，提示用户输入验证码。如果用户输入的账号、密码和验证码都正确，则提示用户登录成功。根据对应的情况，提示用户进行正确的操作。注意，账号和密码是严格区分大小写。验证码可以忽略大小写
````

程序执行，在控制台输出效果【效果不唯一】

````java
正确的情况：
    请输入登录名:
    gzitheima
    请输入登录密码:
	loveJava
	系统生成验证码为：x68Ao
    请输入验证码：
    x68ao
    系统提示：欢迎您进入系统!    

错误的情况：【账号或者密码有误】
    请输入登录名:
    gzitheima
    请输入登录密码:
	lovejava
	系统生成验证码为：x68Ao
    请输入验证码：
    x68ao
    系统提示：您输入的账号或者密码有误  
        
错误的情况：【验证码有误】
    请输入登录名:
    gzitheima
    请输入登录密码:
	loveJava
	系统生成验证码为：x68Ao
    请输入验证码：
    x68ab
    系统提示：您输入的验证码有误          
````

##### 2. 知识点

* 字符串内容的比较
  * boolean equals(Object anObject) 
    * 比较字符串内容。严格区分大小写

  * boolean equalsIgnoreCase(String anotherString)
    * 比较字符串内容。大小写比较


##### **3. 思路分析**

````java
1.创建键盘录入对象
2.提示用户输入账号，使用键盘录入，定义变量保存录入的账号
3.提示用户输入密码，使用键盘录入，定义变量保存录入的密码
4.调用方法，获取验证码，定义变量存储。把获取到的验证码输出在控制台
5.提示用户输入验证码，使用键盘录入，定义变量用保存录入的验证码
6.先使用if语句判断输入的验证码和系统生成的验证码忽略大小写比较是否一样。
   6.1 如果一样，则使用if语句判断用户输入的账号和系统账号 以及 用户输入的密码和系统密码是否一致。
    	6.1.1 如果是，则提示登录成功
    	6.1.2 如果不是，则提示账号或者密码有误
   6.2 如果不一样，则提示验证码错误 
````

````java
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
       //1.创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //2.提示用户输入账号，使用键盘录入，定义变量保存录入的账号
        System.out.println("请输入登录名:");
        String username = sc.next();
        //3.提示用户输入密码，使用键盘录入，定义变量保存录入的密码
        System.out.println("请输入登录密码:");
        String pwd = sc.next();
        //4.调用方法，获取验证码，定义变量存储。把获取到的验证码输出在控制台
        String sysCode = Test03.createCode(5);
        //5.提示用户输入验证码，使用键盘录入，定义变量用保存录入的验证码
        System.out.println("系统生成验证码为：" + sysCode);
        System.out.println("请输入验证码：");
        String code = sc.next();
        //6.先使用if语句判断输入的验证码和系统生成的验证码忽略大小写比较是否一样。
        if(code.equalsIgnoreCase(sysCode)){
            //6.1 如果一样，则使用if语句判断用户输入的账号和系统账号 以及 用户输入的密码和系统密码是否一致。
            if(username.equals("gzitheima") && pwd.equals("loveJava")){
                //6.1.1 如果是，则提示登录成功
                System.out.println("欢迎您进入系统");
            }else{
                //6.1.2 如果不是，则提示账号或者密码有误
                System.out.println("账号或者密码有误");
            }
        }else{
            //6.2 如果不一样，则提示验证码错误
            System.out.println("您输入的验证码有误");
        }

    }

}

````



#### 练习五

> 目标：掌握字符串的截取

##### **1. 需求**

````java
转账时，关键信息屏蔽和验证。
    需求：模拟转账功能。转账时，要求输入对方的姓氏，输入正确之后，才能转账。现在有人准备想秦艾德转账，要求，先把秦艾德的姓氏屏蔽，再让对方输入姓氏。如果输入正确，打印：姓氏输入正确，可以转账。如果输入不正确，打印：姓氏输入不正确，不能转账
````

程序执行，在控制台输出效果【效果不唯一】

````java
把名字屏蔽之后的效果： *艾德
请输入对方的姓氏：张
结果：姓氏输入错误，不能转账
    
------------------------ 
把名字屏蔽之后的效果： *艾德
请输入对方的姓氏：秦
结果：姓氏输入正确，可以转账
````

##### 2. 知识点

* 字符串截取
  * String substring(int index)
    * 从指定索引处开始截取字符串，到字符串的结束，返回一个子字符串

  * String substring(int beginIndex , int endIndex)
    * 从beginIndex开始截取，到endIndex结束。返回一个子字符串，包含beginIndex处的字符，不包含endIndex处的字符。

* 判断是否以指定的内容开头
  * boolean startsWith(String prefix)
    * 判断字符串是否以指定的prefix开头，如果是，则返回true。反之，返回false


##### **3. 思路分析**

````java
1. 先定义一个字符串变量name，存储指定的名字。例如，秦艾德
2. 使用字符串的截取的功能substring(),截取name后面的名字。从索引为1开始，往后截取所有的内容。定义一个新的变量保存截取之后的结果
3. 创建键盘录入对象
4. 提示对方输入姓氏。输出时， 可以使用字符串的拼接，  用"*"拼接上截取之后的内容
5. 接收对方输入的姓氏，使用一个新的字符串变量存储
6. 使用startsWith()的方法，判断name是否以对方输入的姓氏开头。给出对应的提示    
````

````java
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        //1. 先定义一个字符串变量name，存储指定的名字。例如，秦艾德
        String name = "秦艾德";
        //2. 使用字符串的截取的功能substring(),截取name后面的名字。从索引为1开始，往后截取所有的内容。定义一个新的变量保存截取之后的结果
        String secondName = name.substring(1);
        //3. 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //4. 提示对方输入姓氏。输出时， 可以使用字符串的拼接，  用"*"拼接上截取之后的内容
        System.out.println("请输入对方的姓氏:*" + secondName);
        //5. 接收对方输入的姓氏，使用一个新的字符串变量存储
        String firstName = sc.next();
        //6. 使用startsWith()的方法，判断name是否以对方输入的姓氏开头。给出对应的提示
        if(name.startsWith(firstName)){
            System.out.println("姓氏输入正确，可以转账");
        }else{
            System.out.println("姓氏输入错误，不能转账");
        }
    }
}
````



#### 练习六

> 目标：掌握字符串内容的替换

##### **1. 需求**

````java
实现敏感词的屏蔽。
    玩游戏时。我们会发现，如果输入的是一些骂人或者不文明的词，都会被屏蔽掉，变成**。现在要求：如果用户输入的词语中包含"尼玛"，"你妈"，"草","操","傻逼"这些词语，都统一屏蔽为"**"。
````

程序执行，在控制台输出效果【效果不唯一】

````java
例如输入的内容是："我草尼玛，你个傻逼上单，只会带线，永远不跟团";
屏蔽之后的结果是： "我****，你个**上单，只会带线，永远不跟团"
````

##### 2. 知识点

* 字符串内容的替换
  * String replace(String oldStr , String newStr)
    * 使用newStr替换字符串中对应的oldStr，返回一个新的字符串
  

##### **3. 思路分析**

````java
1. 先把所有的敏感词存放到一个数组中
2. 创建键盘录入对象，录入一个需要被屏蔽的字符串s
3. 遍历定义好的敏感词的数组
    3.1 获取每一个敏感词
    3.2 s去调用字符串的方法replace()，把敏感词替换为"**"。使用s去接收替换节后的结果
4. 循环结束之后，输出屏蔽之后的字符串s    
````

````java
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
       //1. 先把所有的敏感词存放到一个数组中
        String[] words = {"尼玛","你妈","草","操","傻逼"};
       //2. 创建键盘录入对象，录入一个需要被屏蔽的字符串s
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一句话");
        String s = sc.next();
       //3. 遍历定义好的敏感词的数组
        for (int i = 0; i < words.length; i++) {
            //3.1 获取每一个敏感词
            //3.2 s去调用字符串的方法replace()，把敏感词替换为"**"。使用s去接收替换节后的结果
           s = s.replace(words[i] , "**");
        }
       //4. 循环结束之后，输出屏蔽之后的字符串s
        System.out.println(s);
    }
}

````



#### 练习七

> 目标：掌握字符串内容的分割和判断字符串中是否有指定的内容

##### **1. 需求**

````java
现在有一个字符串，包含了一些书籍名字，请把书籍的名字切割出来。切割完之后，把包含Java的书籍数出来。
  包含书籍名称的字符串内容是： "《Head First Java》、《Effective Java》、《Python核心编程》、《Java并发实践》、《Thinking in Java》、《Python编程快速上手》"
````

程序执行，在控制台输出效果

````java
《Head First Java》
《Effective Java》
《Java并发实践》
《Thinking in Java》
````

##### 2. 知识点

* 字符串内容的分割
  * String[] split(String regex) 
    * 把字符串按照某个字符串内容分割，返回分割之后的结果

* 判断字符串中是否包含指定的内容
  * boolean contains(String str)
    * 判断字符串中是否包含指定的str，如果是包含，则返回true。如果是不包含，则返回false


##### **3. 思路分析**

````java
1. 先使用一个字符串，存储所有书籍的名称
2. 使用字符串中的split()方法，按照"、"把里面的书籍信息分割出来。存放到一个字符串数组中
3. 遍历字符串数组，获取里面的每一个字符串
    3.1 使用字符串的contains，结合if语句，判断字符串内容中是否包含"Java"，如果是，则输出这个字符串	
````

`````java
public class Test07 {
    public static void main(String[] args) {
        //1. 先使用一个字符串，存储所有书籍的名称
        String content = "《Head First Java》、《Effective Java》、《Python核心编程》、《Java并发实践》、《Thinking in Java》、《Python编程快速上手》";
        //2. 使用字符串中的split()方法，按照"、"把里面的书籍信息分割出来。存放到一个字符串数组中
        String[] ss = content.split("、");
        //3. 遍历字符串数组，获取里面的每一个字符串
        for (int i = 0; i < ss.length; i++) {
            //3.1 使用字符串的contains，结合if语句，判断字符串内容中是否包含"Java"，如果是，则输出这个字符串
            if(ss[i].contains("Java")){
                System.out.println(ss[i]);
            }
        }
    }
}
`````





#### 练习八

> 目标：掌握集合常见API的使用以及集合的遍历

##### **1. 需求**

````java
一、	请按以下要求编写代码：
1.	定义Student类，包含以下属性：
	学号、姓名、身高
2.	定义MainApp类，包含main()方法；
3.	在main()方法中，创建一个可以存储Student对象的集合对象；
4.	创建以下几个Student对象：
	学号		姓名		身高	
	it001	黄渤		1.72
	it002	孙红雷	1.78
	it003	章子怡	1.64
	it004	杨颖		1.68
5.	将上面几个对象添加到集合中
6.	遍历集合打印每个对象的属性值；
7.	获取并打印集合大小；
8.	获取第3个学员对象，并打印其属性值；
9.	移除掉第4个学员对象；
10.	再次获取并打印集合大小；
11.	将第一个对象替换为以下对象：
	it005	撒贝宁	1.67
12.	遍历集合，打印出身高在1.70以上的学员信息；
13.	遍历集合，打印出“孙”姓的学员信息；  
````

````java
public class Student {
// 学号、姓名、身高
    private String id;
    private String name;
    private double height;

    public Student() {
    }

    public Student(String id, String name, double height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

````

````java
import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {
        //4.定义学生对象
        Student s1 = new Student("it001", "黄渤", 1.72);
        Student s2 = new Student("it002", "孙红雷", 1.78);
        Student s3 = new Student("it003", "章子怡", 1.64);
        Student s4 = new Student("it004", "杨颖", 1.68);
        // 5.将上面几个对象添加到集合中
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        // 6.遍历集合打印每个对象的属性值；
        System.out.println("学号\t\t姓名\t\t\t身高");
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getId() + "\t" + s.getName() + "\t\t\t" + s.getHeight());
        }
        // 7.获取并打印集合大小；
        System.out.println("集合元素个数为:" + list.size());
        // 8.获取第3个学员对象，并打印其属性值；
        Student stu3 = list.get(2);
        System.out.println("第三个学生信息为:");
        System.out.println("学号 : " + stu3.getId() + " , 姓名 : " + stu3.getName() + " , 身高 : " + stu3.getHeight());
        //9.移除掉第4个学员对象；
        list.remove(3);
        //10.再次获取并打印集合大小；
        System.out.println("集合元素个数为:" + list.size());
        // 11.将第一个对象替换为以下对象：
        //it005	撒贝宁	1.67
        Student s5 = new Student("it005", "撒贝宁", 1.67);
        list.set(0 ,s5);
        //12.遍历集合，打印出身高在1 .70 以上的学员信息；
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if(s.getHeight() > 1.70){
                System.out.println(s.getName() + " , " + s.getHeight());
            }
        }
        //13.遍历集合，打印出“孙”姓的学员信息；
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if(s.getName().startsWith("孙")){
                System.out.println(s.getName());
            }
        }
    }

}
````



#### 练习九

##### 1.需求

````java
1.定义ArrayList集合，存入多个字符串
	如:"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "你好啊"  "我来啦"  "别跑啊"
2.遍历集合,删除长度大于5的字符串,打印删除后的集合对象
3.基于上一步,删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
````

`````java
import java.util.ArrayList;

public class Test09 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "你好啊"  "我来啦"  "别跑啊"
        list.add("ab1");
        list.add("123ad");
        list.add("bca");
        list.add("dadfadf");
        list.add("dddaaa");
        list.add("你好啊");
        list.add("我来啦");
        list.add("别跑啊");
        //2.遍历集合,删除长度大于5的字符串,打印删除后的集合对象
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length() > 5) {
                list.remove(s);
                i--;
            }
        }
        System.out.println(list);
        //3.基于上一步,删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (ch >= '0' && ch <= '9') {
                    list.remove(s);
                    i--;
                    break;
                }
            }
        }
        System.out.println(list);
    }
}
`````

