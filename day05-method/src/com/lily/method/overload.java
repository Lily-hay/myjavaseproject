package com.lily.method;

public class overload {
    public static void main(String[] args) {
        fire();
        fire("日本");
        fire("日本",3797);

    }
    public static void fire()
    {
        System.out.println("向M国发射一枚火箭");
    }
    public static void fire(String location)
    {
        System.out.println("向"+location+"发射一枚火箭");
    }
    public static void fire(String location,int number)
    {
        System.out.println("向"+location+"发射"+number+"枚火箭");
    }
}
