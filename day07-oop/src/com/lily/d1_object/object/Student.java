package com.lily.d1_object.object;
//类：对象的数据结构
public class Student {
    String name;
    double chinese;
    double math;
    public void printAllScore()
    {
        System.out.println(name+"总成绩："+(chinese+math));
    }
    public void printAverageScore()
    {
        System.out.println(name+"平均成绩："+(chinese+math)/2);
    }
}
