package com.lily.string;

import java.util.Random;

//用String生成随机验证码
public class StringTest5 {
    public static void main(String[] args) {
        System.out.println(create(6));
        System.out.println(create(8));
    }
    public static String create(int n)
    {
        String code="";
        String s="abcdefghijklmnopqrstuvwyzABCDEFGKIGKLMNOPQRSTUVWXYZ012345789";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index=r.nextInt(s.length());
            char c=s.charAt(index);
            code+=c;
        }
        return code;
    }
}
