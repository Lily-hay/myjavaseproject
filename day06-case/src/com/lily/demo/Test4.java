package com.lily.demo;
//数字加密
public class Test4 {
    public static void main(String[] args) {
        System.out.println(encode(8346));
    }
    public static String encode(int number)
    {
        int[] data= new int[4];
        data[0]=number/1000;
        data[1]=number/100%10;
        data[2]=number/10%10;
        data[3]=number%10;
        for (int i = 0; i < data.length; i++) {
            data[i]=(data[i]+5)%10;
        }
        for (int i = 0,j=data.length-1; i < j; i++,j--) {
            int temp=data[j];
            data[j]=data[i];
            data[i]=temp;

        }
        String result="";//拼接字符
        for (int i = 0; i < data.length; i++) {
            result+=data[i];

        }
        return result;
    }
}
