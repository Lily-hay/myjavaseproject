package com.lily.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    ArrayList<Food> allfoods=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public void addFood() {
        System.out.println("=======上架菜品==========");
//1、获取菜品信息
        Food f = new Food();
        System.out.println("菜品名称:");
        String name=sc.next();
        System.out.println("菜品价格:");
        double price=sc.nextDouble();
        System.out.println("描述:");
        String depc=sc.next();
        //2、将信息加载到Food类中
        f.setName(name);
        f.setPrice(price);
        f.setDepc(depc);
        //3、将Food类添加到集合中
        allfoods.add(f);
        System.out.println("菜品上架成功！");

    }
    private void showallfood() {
        for (int i = 0; i < allfoods.size(); i++) {
            Food food=allfoods.get(i);
            System.out.println(food.getName()+"\t"+food.getPrice()+"\t"+food.getDepc());
        }
    }

    public void start()
    {
        while (true) {
            System.out.println("========商家管理系统==========");
            System.out.println("1、上架菜品");
            System.out.println("2、下架菜品");
            System.out.println("3、展示菜品");
            System.out.println("请输入操作命令：");
            int operator=sc.nextInt();
            switch(operator)
            {
                case 1:
                    addFood();
                    break;
                case 2:
                    break;
                case 3:
                    showallfood();
                    break;
                default:
                    System.out.println("输入错误！");
            }
        }

    }



}
