package com.lily.string;
//熟悉String提供的处理字符串的常用方法
public class StringDemo2 {
    public static void main(String[] args) {
        //1、获取字符串的长度
        String s1="ab黑马999";
        System.out.println(s1.length());

        //2、获取某个索引的字符
        System.out.println(s1.charAt(2));

        //3、遍历字符串
        //方法一
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
        //方法二，将字符串转为字符串数组，再进行遍历
        char[] c=s1.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        String s2="黑马666";
        String s3="黑马666";
        //4、equals：判断字符串相同返回true
        System.out.println(s2.equals(s3));//true
        System.out.println(s2==s3);//比较的是地址，false

        String st1="agfh56";
        String st2="AgFh56";
        //5、忽略大小写比较字符串内容
        System.out.println(st1.equalsIgnoreCase(st2));

        //6、截取字符串内容
        System.out.println(st1.substring(0,2));
        System.out.println(st1.substring(2));//截取后一段内容

        //7、将字符串内容替换为其他，并返回新的对象
        String info="这个游戏太垃圾，sb,还我钱";
        String info1=info.replace("垃圾","**").replace("sb","++");
        System.out.println(info1);

        //8、判断字符串中是否包含某个关键词
        String s="黑马程序员999";
        System.out.println(s.contains("黑马"));

        //9、判断是否为某些字符开头
        System.out.println(s.startsWith("黑马"));
        System.out.println(s.startsWith("程序员"));
        //10、判断是否以某些字符结尾
        System.out.println(s.endsWith("999"));
        System.out.println(s.endsWith("员999"));

        //11、将字符串按照指定内容分割为多个字符串
        String stars="王宝强，黎明，张曼玉，成龙";
        String[] names=stars.split("，");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
