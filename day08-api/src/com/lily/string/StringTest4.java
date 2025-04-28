package com.lily.string;

import java.util.Scanner;

public class StringTest4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("第"+(i+1)+"次登录开始：");
            System.out.println("请输入登录名：");
            String loginName=sc.next();
            System.out.println("请输入密码：");
            String password=sc.next();
            String result = login(loginName, password);
            if(result.equals("success"))
            {
                System.out.println("登录成功，请进入系统");
                break;
            }
            else {
                System.out.println(result);
            }

        }
    }
    public static String login(String loginName,String password) {
        String okloginName="lily";
        String okpassword="123456";
        if(okloginName.equals(loginName))
        {
            if(okpassword.equals(password))
            {
                return "success";
            }
            else {
                return "您输入的密码有问题，请检查";
            }
        }
        else
        {
            return "您输入的登录名有问题，请重新输入";
        }

    }
}
