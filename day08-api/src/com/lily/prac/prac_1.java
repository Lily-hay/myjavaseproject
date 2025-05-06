package com.lily.prac;

import java.util.Scanner;

/*掌握字符串的遍历*/
public class prac_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的QQ号：");
        String qq=sc.next();
        System.out.println(checkQQ(qq));

    }
    /*验证qq号*/
    public static boolean checkQQ(String qq)
    {

        if(qq.startsWith("0"))
        {
            return false;
        }
        if(qq.length()<5 || qq.length()>12)
        {
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char c=qq.charAt(i);
            if(!(c>='0' && c<='9'))
            {
                return false;
            }
        }
        return true;
    }
}
