package com.lily.array;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] ages=new int[]{21,34,38};
        //简化
        int[] ages2={21,34,64};
        System.out.println(ages[1]);
//        访问数组长度
        System.out.println(ages.length);
        //索引
        System.out.println(ages.length-1);
        //数组遍历
        for (int age : ages) {
            System.out.println(age);
        }
        int[] arr1=new int[]{1,2,3,4,5};
        int[] arr2=arr1;
        System.out.println(arr1);
        System.out.println(arr2);
        arr2[2]=10;
        System.out.println(arr1[2]);

        arr2=null;
        System.out.println(arr2);
//        System.out.println(arr2[0]);//报错
        int[] facescore={15,9000,10000,20000,9500,-5};
        int max=facescore[0];
        for (int i = 1; i < facescore.length; i++) {
            if(facescore[i]>max)
            {
                max=facescore[i];
            }
        }
        System.out.println(max);
        //数组元素交换
        for (int i = 0,j= facescore.length-1; i < j; i++,j--) {
            int temp=facescore[j];
            facescore[j]=facescore[i];
            facescore[i]=temp;
        }
        for (int i = 0; i < facescore.length; i++) {
            System.out.print(facescore[i]+" ");
        }

        //打乱数组中的数据
        Random r = new Random();
        for (int i = 0; i < facescore.length; i++) {
            int j = r.nextInt(facescore.length);
            int temp = facescore[j];
            facescore[j] = facescore[i];
            facescore[i] = temp;
        }
        for (int i = 0; i < facescore.length; i++) {
            System.out.print(facescore[i] + " ");
        }
    }
}
