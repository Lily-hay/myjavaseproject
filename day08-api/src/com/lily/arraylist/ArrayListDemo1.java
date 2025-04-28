package com.lily.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();
        //1、直接添加数据
        list.add("java1");
        list.add("java1");
        list.add("100");
        list.add("金庸");
        System.out.println(list);

        //2、插入数据，指定位置
        list.add(1,"嵌入式");
        System.out.println(list);

        //3、根据索引获取数据
        String ele=list.get(1);
        System.out.println(ele);

        //4、根据索引删除数据，会返回被删除的数据
        System.out.println(list.remove(3));
        System.out.println(list);

        //5、直接删除数据，返回真假，默认只删除第一个出现的
        System.out.println(list.remove("java1"));
        System.out.println(list);

        //6、修改某个位置的数据，返回被修改之前的数据
        System.out.println(list.set(2, "古龙"));
        System.out.println(list);


    }
}
