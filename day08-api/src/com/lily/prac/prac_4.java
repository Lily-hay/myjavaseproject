package com.lily.prac;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class prac_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的账号：");
        String name=sc.next();
        System.out.println("请输入您的密码：");
        String passWord=sc.next();
        login(name,passWord);

    }
    public static void login(String name, String passWord) {
        Scanner sc = new Scanner(System.in);
        String okName="gzitheima";
        String okPassWord="loveJava";
        String okCode=create(5);
        System.out.println("系统生成的验证码为："+okCode);
        System.out.println("请输入验证码：");
        String code=sc.next();
        if(!(name.equals(okName))||!(passWord.equals(okPassWord)))
        {
            System.out.println("账号或密码错误");
        }
        else
        {
            if(!code.equalsIgnoreCase(okCode))
            {
                System.out.println("验证码错误");
            }
            else {
                System.out.println("欢迎您进入系统！");
            }
        }



    }
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
