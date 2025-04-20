package com.lily.method;

public class method1 {
    public static void main(String[] args) {
        int max=getMax(20,10);
        System.out.println(max);
    }
    public static int getMax(int a,int b){
        int max=a>b ? a:b;
        return max;
    }
}
