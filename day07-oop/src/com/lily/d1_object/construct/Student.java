package com.lily.d1_object.construct;

public class Student {
    String name;
    int age;
    public Student(){
        System.out.println("无参构造器");
    }
    public Student(String name)
    {
        this.name=name;
        System.out.println(this.name);
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println(this.name+":"+this.age);
    }
}