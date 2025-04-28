package com.lily.arraylist;

import java.util.ArrayList;
//删除带有枸杞的购物
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList();
        list1.add("java入门");
        list1.add("宁夏枸杞");
        list1.add("黑枸杞");
        list1.add("人字拖");
        list1.add("特技枸杞");
        list1.add("枸杞子");
        System.out.println(list1);

        //方法一：
        for (int i = 0; i < list1.size(); i++) {
            String name=list1.get(i);
            if(name.contains("枸杞"))
            {
                i--;//让i回退一个，避免删除时，后面的元素补上来，造成漏删
                list1.remove(name);
            }

        }
        System.out.println(list1);
        System.out.println("...............");
        //方法二：倒序遍历
        ArrayList<String> list2=new ArrayList();
        list2.add("java入门");
        list2.add("宁夏枸杞");
        list2.add("黑枸杞");
        list2.add("人字拖");
        list2.add("特技枸杞");
        list2.add("枸杞子");
        System.out.println(list2);
        for (int i = list2.size()-1; i >=0; i--) {
            String name=list2.get(i);
            if(name.contains("枸杞"))
            {
                list2.remove(name);
            }
        }
        System.out.println(list2);

    }
}
