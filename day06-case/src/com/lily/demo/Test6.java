package com.lily.demo;
//找素数
public class Test6 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 101; i <=200; i++) {
            boolean flag=true;//信号位思想
            for (int j = 2; j <=i/2 ; j++) {
                if(i%j==0)
                {
                    flag=false;
                    break;//如果不是素数，马上跳出循环
                }
            }
            if(flag){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
