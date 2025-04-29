package com.lily;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public void start()
    {
        while (true) {
            System.out.println("------------欢迎来到ATM系统------------");
            System.out.println("1、用户登录");
            System.out.println("2、用户开户");
            System.out.println("请选择：");
            int command=sc.nextInt();
            switch(command)
            {
                case 1:
                    login();
                    break;
                case 2:
                    createAccont();
                    break;
                default:
                    System.out.println("没有该操作");
            }
        }
    }
    private void createAccont() {
        Account acc=new Account();
        System.out.println("----------您已进入开户界面-----------");
        System.out.println("请输入您的姓名：");
        String name=sc.next();
        acc.setName(name);
        while (true) {
            System.out.println("请输入您的性别：");
            char sex=sc.next().charAt(0);
            if(sex=='男'||sex=='女')
            {
                acc.setSex(sex);
                break;
            }
            else
            {
                System.out.println("你输入的性别不对，只能是男或者女");
            }
        }
        while (true) {
            System.out.println("请输入您的密码：");
            String passWord=sc.next();
            System.out.println("请再次确认您的密码：");
            String okpassWord=sc.next();
            if(passWord.equals(okpassWord))
            {
                acc.setPassWord(passWord);
                break;
            }
            else {
                System.out.println("您输入的两次密码不一致，请确认");
            }
        }
        System.out.println("请输入取现额度：");
        double limit=sc.nextDouble();
        acc.setLimit(limit);
        //系统为用户开户
        String  cardId;
        cardId=createCardId();
        acc.setCardId(cardId);
        //3、将信息添加到账户中
        accounts.add(acc);
        System.out.println("恭喜您，"+acc.getName()+"已成功开户,您的卡号为"+acc.getCardId());
    }
    private String createCardId() {
        while (true) {
            String cardId="";
            Random r=new Random();
            for (int i = 0; i < 8; i++) {
                int data=r.nextInt(10);
                cardId += data;
            }
            //判断卡号是否与之前的重复
            if(getAccontByCardId(cardId)==null)
            {
                return cardId;
            }
        }
    }
    private Account getAccontByCardId(String cardId)
    {
        for (int i = 0; i < accounts.size(); i++) {
            if(cardId.equals(accounts.get(i).getCardId()))
            {
                return accounts.get(i);
            }
        }
        return null;
    }
    private void login() {
        if(accounts.size()==0)
        {
            System.out.println("当前系统中没有账户，请先开户");
            return;
        }
        while (true) {
            System.out.println("请输入您的卡号");
            String cardId=sc.next();
            Account acc=getAccontByCardId(cardId);
            if(acc==null)
            {
                System.out.println("该卡号没有相应的账户，请确认");
            }
            else
            {
                while (true) {
                    System.out.println("请输入密码：");
                    String passWord=sc.next();
                    if(passWord.equals(acc.getPassWord()))
                    {
                        System.out.println("您已成功登录，您的卡号为："+acc.getCardId());
                    }
                    else {
                        System.out.println("您输入的密码不对，请确认");
                    }
                }
            }
        }
    }

}
