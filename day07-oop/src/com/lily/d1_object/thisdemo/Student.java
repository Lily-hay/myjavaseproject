package com.lily.d1_object.thisdemo;

public class Student {
    double score;
    public void print()
    {
        System.out.println("this:"+this);
    }
    public void pass(double score)
    {
        if(this.score>=score)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
