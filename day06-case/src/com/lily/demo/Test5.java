package com.lily.demo;

import java.util.Random;
import java.util.Scanner;

//抢红包
public class Test5 {
    public static void main(String[] args) {
        int[] money={9,666,188,520,99999};
        start(money);
    }
    public static void start(int[] money)
    {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        for (int i = 0; i < money.length; i++) {
            System.out.println("请第"+(i+1)+"位粉丝抽奖:");
            sc.next();
            while(true)
            {//将抽过的值赋零，再随机抽到不为零的
               int index=r.nextInt(money.length);
               int Randmoney=money[index];
               if(Randmoney!=0)
               {
                   System.out.println("您抽中了"+Randmoney);
                   money[index]=0;
                   break;
               }
            }
        }

    }
}
