package com.lily.method;

public class param {
    public static void main(String[] args) {
        int a=10;
        change(a);
        System.out.println(a);//10
        int[] arr={10,20,30};
        change1(arr);
        System.out.println(arr[1]);
        int[] arr1={12,34,24};
        int[] arr2={12,34,22};
        System.out.println(compare(arr1,arr2));
    }
    public static boolean compare(int[] arr1,int[] arr2)
    {
        if(arr1==null || arr2==null)
        {
            return false;
        }
        if(arr1.length!=arr2.length)
        {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void change1(int[] arr)
    {
        System.out.println(arr[1]);
        arr[1]=366;
        System.out.println(arr[1]);
    }
    public static void change(int a)
    {
        System.out.println(a);//10
        a=20;
        System.out.println(a);//20
    }

}
