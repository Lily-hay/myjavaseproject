package com.lily.prac;

import java.util.Random;
import java.util.Scanner;

public class prac_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您要生成的验证码的位数：");
        int num=sc.nextInt();
        System.out.println(create(num));

    }
    /*生成验证码*/
    public static String create(int num)
    {
        Random r=new Random();
        String data="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String code="";
        for (int i = 0; i < num; i++) {
            int index=r.nextInt(data.length());
            code+=data.charAt(index);
        }
        return code;
    }
}
