package com.lily.string;
//String的用法
public class Str1 {
    public static void main(String[] args) {
        String name="小黑";
        String s1=new String();//无参
        System.out.println(s1);
        String s2=new String("菠萝吹雪");//有参
        System.out.println(s2);
        char[] c= {'a','b','c','中','国'};
        String s3=new String(c);//将字符串数组转为字符串
        System.out.println(s3);
        byte[] b={97,98,99,65,66,67};
        String s4=new String(b);//将字节数组的值转为字符串
        System.out.println(s4);

    }
}
