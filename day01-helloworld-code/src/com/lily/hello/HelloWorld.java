package com.lily.hello;

import java.util.Scanner;

/**
 * 文档注释
 * 一般用在类上，方法上
 * 里面的内容可以提取到程序说明中
 */
public class HelloWorld {
    /**
     * 文档注释
     * 一般用在类上，方法上
     * main方法
     */
    public static void main(String[] args) {
        //单行注释
        System.out.println("Hello World");
        /*
        多行注释
         */

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

    }
}
