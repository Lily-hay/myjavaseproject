package com.lily.valiable;

public class valiable {
    public static void main(String[] args) {
//        自动类型换，显示的时候根据类型决定
        char ch='a';
        int it=ch;
//        自动类型换，小到大
        float p=it;
        System.out.println(ch);
        System.out.println(it);
        System.out.println(p);
//表达式类型转换
        byte a=10;
        int b=20;
        long c=30;
//        int result=a+b+c;报错，自动转为最高类型运算
        long result=a+b+c;
//        long result2=b+c+3.14;报错，3.14为double类型
        double result2=b+c+3.14;
//        表达式中，byte,short,char是直接转成int类型参与运算的
        byte a1=37;
        byte a2=40;
//        byte a3=a1+a2;报错
        int a3=a1+a2;
//强制类型转换
        byte b1=(byte)b;
        int i=1500;
        int j=(byte)i;//数据溢出
        System.out.println(i);
        System.out.println(j);





    }
}