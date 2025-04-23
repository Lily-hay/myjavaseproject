package com.lily.d1_object.javabean;
//操作对象
public class StudentOperator {
    private Student s;
    public StudentOperator(Student s) {
        this.s = s;
    }
    public void printPass()
    {
        if(s.getScore()>=60)
        {
            System.out.println("通过");
        }
        else
        {
            System.out.println("挂了");
        }
    }
}
