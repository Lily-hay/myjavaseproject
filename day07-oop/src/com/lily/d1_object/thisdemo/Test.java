package com.lily.d1_object.thisdemo;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.print();
        System.out.println(s1);
        s1.score=100;
        double score=200;
        s1.pass(score);
    }
}
