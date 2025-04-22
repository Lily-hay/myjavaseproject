package com.lily.demo;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        double score=start(6);
        System.out.println("选手的平均分为："+score);
    }
    public static double start(int n)
    {
        double[] scores=new double[n];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第"+(i+1)+"个评委的打分：");
            double score=sc.nextInt();
            if(score<0 || score>100)
            {
                System.out.println("您输入的打分必须在0-100之间");
                i--;
                continue;
            }
            scores[i]=score;
        }
        double max=scores[0];
        double min=scores[0];
        double sum=scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]>max) max=scores[i];
            if(scores[i]<min) min=scores[i];
            sum+=scores[i];
        }
        System.out.println("最高分为："+max);
        System.out.println("最低分为："+min);
        return (sum-min-max)/(n-2);
    }
}
