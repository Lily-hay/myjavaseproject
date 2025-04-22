package com.lily.demo;
//买飞机票
public class Test1 {
    public static void main(String[] args) {
        double price=calc(1000,8,"头等舱");
        System.out.println(price);
    }
    public static double calc(double price,int month,String type)
    {
        if(month>=5 && month<=10)
        {
            switch(type)
            {
                case "头等舱":
                    price*=0.95;
                    break;
                case "经济舱":
                    price*=0.85;
                    break;
            }
        }
        else {
            switch(type)
            {
                case "头等舱":
                    price*=0.7;
                    break;
                case "经济舱":
                    price*=0.6;
                    break;
            }
        }
        return price;
    }
}
