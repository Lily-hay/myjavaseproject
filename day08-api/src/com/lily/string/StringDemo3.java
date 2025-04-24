package com.lily.string;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1="abc";//放在常量池中
        String s2="abc";//不用放了，直接返回相同的地址
        System.out.println(s1==s2);//true

        char[] ch={'a','b','c'};
        String st1=new String(ch);//在堆内存中
        String st2=new String(ch);//在堆内存中，地址不同
        System.out.println(st1==st2);//false

        String s3="abc";
        String s4="ab";
        String s5=s4+"c";//在编译的时候不知道三s4是什么
        System.out.println(s3==s5);//false

        String s6="abc";
        String s7="a"+"b"+"c";//编译的时候就将s7拼起来了，提高执行效率
        System.out.println(s6==s7);//true
    }
}
