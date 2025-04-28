package com.lily;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts=new ArrayList<>();
    public void start()
    {
        while (true) {
            System.out.println("------------欢迎来到ATM系统------------");
            System.out.println("1、用户登录");
            System.out.println("2、用户开户");
            Scanner sc=new Scanner(System.in);
            System.out.println("请选择：");
            int command=sc.nextInt();
            switch(command)
            {
                case 1:
                    break;
                case 2:
                    break;
                default:
                    System.out.println("没有该操作");
            }
        }
    }
}
