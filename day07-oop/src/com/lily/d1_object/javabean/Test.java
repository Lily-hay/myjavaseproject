package com.lily.d1_object.javabean;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("小红","女",165,78);
        s1.getScore();
        s1.getHeight();
        s1.getName();
        s1.getSex();
        StudentOperator s=new StudentOperator(s1);
        s.printPass();
    }
}
