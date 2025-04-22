package com.lily.d1_object;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="波妞";
        s1.chinese=69;
        s1.math=89;
        s1.printAllScore();
        s1.printAverageScore();
        Student s2=new Student();
        s2.name="小虎";
        s2.chinese=78;
        s2.math=99;
        System.out.println(s1);
        System.out.println(s2);
    }
}
