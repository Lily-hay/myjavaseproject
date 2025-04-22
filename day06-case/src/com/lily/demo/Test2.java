package com.lily.demo;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("四位验证码："+createCode(4));
        System.out.println("六位验证码："+createCode(6));
    }
    public static String createCode(int n)
    {
        String code="";
        Random r=new Random();
        for (int i = 0; i < n; i++) {
            int type=r.nextInt(3);//生成验证码类型
            switch(type)
            {
                case 0://数字
                    int num=r.nextInt(10);
                    code+=num;
                    break;
                case 1://大写
                    char c1=(char)(r.nextInt(26)+65);
                    code+=c1;
                    break;
                case 2://小写
                    char c2=(char)(r.nextInt(26)+97);
                    code+=c2;
                    break;
            }
        }
        return code;
    }
}
