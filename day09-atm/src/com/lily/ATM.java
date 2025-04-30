package com.lily;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts=new ArrayList<>();
    private Account loginAcc;
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
            System.out.println("请输入您的卡号:");
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
                        loginAcc=acc;
                        showUserCommand();
                        return;
                    }
                    else {
                        System.out.println("您输入的密码不对，请确认");
                    }
                }
            }
        }
    }
    /*展示操作命令*/
    private void showUserCommand()
    {
        while (true) {
            System.out.println(loginAcc.getName()+",您可以选择如下功能进行账户的处理=====");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、修改密码");
            System.out.println("6、注销当前账户");
            System.out.println("7、退出登录");
            System.out.println("请选择：");
            int command=sc.nextInt();
            switch(command)
            {
                case 1://查询账户
                    showLoginAccount();
                    break;
                case 2://存款
                    depositMoney();
                    break;
                case 3://取款
                    drawMoney();
                    break;
                case 4://转账
                    transferMoney();
                    break;
                case 5://修改密码
                    updatePassWord();
                    return;
                case 6://注销当前账户
                    if(deleteAccount())
                    {
                        return;//返回欢迎界面
                    }
                    break;
                case 7://退出登录
                    System.out.println("您已退出登录！");
                    return;

                default:
                    System.out.println("您当前输入的操作不存在，请确认");
            }
        }
    }

    private void updatePassWord() {
        System.out.println("====修改密码操作====");
        while (true) {
            System.out.println("请输入您的密码：");
            String passWord=sc.next();
            if(passWord.equals(loginAcc.getPassWord()))//密码输入正确，输入两次密码
            {
                while (true) {
                    System.out.println("请输入新密码：");
                    String newPassword=sc.next();
                    System.out.println("请再次确认密码：");
                    String okPassword=sc.next();
                    if(newPassword.equals(okPassword))
                    {
                        loginAcc.setPassWord(newPassword);
                        System.out.println("密码修改成功");
                        return;
                    }
                    else {
                        System.out.println("两次输入的密码不一致，请重新输入");
                    }
                }
            }
            else {
                System.out.println("您输入的密码有误，请确认~~~");
            }
        }

    }

    private boolean deleteAccount() {
        //判断用户是否真要销户
        System.out.println("====销户操作======");
        System.out.println("请判断您是否真的要销户y/n");
        String command=sc.next();
        switch(command)
        {
            case "y":
                if(loginAcc.getMoney()==0)//判断账户是否有余额
                {
                    accounts.remove(loginAcc);
                    System.out.println("您已成功销户");
                    return true;

                }
                else
                {
                    System.out.println("您的账户中还有余额，不允许销户");
                    return false;
                }
            default:
                return false;
        }

    }

    /*转账*/
    private void transferMoney() {
        System.out.println("===转账====");
        //判断系统中的账户足够吗
        if(accounts.size()<=1)
        {
            System.out.println("当前系统中的账户不足两个，请开户");
            return;
        }
        //判断账户中有没有钱
        if(loginAcc.getMoney()==0)
        {
            System.out.println("您账户里没有钱，不能转账");
            return;
        }
        else
        {
            while (true) {
                System.out.println("请输入要转账的账户卡号：");
                String cardId=sc.next();
                Account acc=getAccontByCardId(cardId);
                if(acc==null)
                {
                    System.out.println("您输入的账户不存在，请确认");

                }
                else
                {
                    while (true) {
                        //判断姓氏是否正确
                        String rName="*"+acc.getName().substring(1);
                        System.out.println("请输入"+rName+"的姓氏：");
                        String preName=sc.next();

                      if (acc.getName().startsWith(preName)) {
                            while (true) {
                                System.out.println("请输入您要转账的金额：");
                                double money=sc.nextDouble();
                                if(money>=loginAcc.getMoney())
                                {
                                    System.out.println("您的余额不足，当前余额为"+loginAcc.getMoney());
                                }
                                else
                                {
                                    acc.setMoney(acc.getMoney()+money);
                                    loginAcc.setMoney(loginAcc.getMoney()-money);
                                    System.out.println("转账成功，您当前余额为"+loginAcc.getMoney());
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /*查询账户*/
    private void showLoginAccount()
    {
        System.out.println("您的账户信息如下：");
        System.out.println("姓名："+loginAcc.getName());
        System.out.println("卡号："+loginAcc.getCardId());
        System.out.println("性别："+loginAcc.getSex());
        System.out.println("余额："+loginAcc.getMoney());
        System.out.println("取现额度："+loginAcc.getLimit());

    }

    private void depositMoney() {
        System.out.println("====存钱操作====");
        System.out.println("请输入存款金额：");
        double money = sc.nextDouble();
        loginAcc.setMoney(loginAcc.getMoney() + money);
        System.out.println("您已成功存钱，存钱后的余额为" + loginAcc.getMoney());
    }
    private void drawMoney(){
        System.out.println("======取款操作======");
        while (true) {
            System.out.println("请输入您的取款金额：");
            double money=sc.nextDouble();
            if(loginAcc.getMoney()<100)
            {
                System.out.println("您的余额不足100，不能取款");
                return;
            }
            if(loginAcc.getMoney()>=money)
            {
                if(money<=loginAcc.getLimit())
                {
                    loginAcc.setMoney(loginAcc.getMoney()-money);
                    System.out.println("您已成功取钱"+money+"，您的余额还剩余"+loginAcc.getMoney());
                    //退出取款操作
                    break;
                }
                else
                {
                    System.out.println("您的取款金额超出取款限额，您最多可取"+loginAcc.getLimit());
                }
            }
            else
            {
                System.out.println("您的余额不足，您的余额还剩"+loginAcc.getMoney());
            }
        }
    }

}
