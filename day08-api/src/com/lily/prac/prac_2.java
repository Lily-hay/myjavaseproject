package com.lily.prac;

import java.util.Scanner;

public class prac_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的身份证号：");
        String idCard=sc.next();
        System.out.println(checkId(idCard));
    }
    /*验证身份证号*/
    public static boolean checkId(String id)
    {
        if(id.length()!=18)
        {
            return false;
        }
        if(id.startsWith("0"))
        {
            return false;
        }
        for (int i = 0; i < id.length()-1; i++) {
            char c=id.charAt(i);
            if(!(c>='0'&&c<='9'))
            {
                return false;
            }
        }
        char d=id.charAt(id.length()-1);
        if(!((d>='0'&&d<='9')||d=='X'))
        {
            return false;
        }
        return true;
    }
}
