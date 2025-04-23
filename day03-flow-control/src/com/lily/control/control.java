package com.lily.control;

import java.util.Random;
import java.util.Scanner;

public class control {
    public static void main(String[] args) {
        //switch不支持double,float,long
        String weekday="周三";
        switch(weekday)
        {
            case "周一"://case只能接收自变量，不接受变量
                System.out.println("study");
                break;//不写break，出现穿透性，并不全是坏处，多个输出一样时，可用于简化代码
            case "周三":
                System.out.println("study3");
                break;

        }
        for(int i=1;i<=4;i++)
        {
            for (int j = 1; j <=5 ; j++) {
                System.out.print("⭐");
            }
           System.out.println();
        }
        Random r = new Random();
        int lucknumber=r.nextInt(100)+1;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("请输入一个数字：");
            int guessnumber=sc.nextInt();
            if(guessnumber>lucknumber)
            {
                System.out.println("猜大了");
            }
            else if(guessnumber<lucknumber)
            {
                System.out.println("猜小了");
            }
            else
            {
                System.out.println("猜对了");
                break;
            }
        }


    }
}
