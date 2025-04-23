package com.lily.d1_object.encapsulation;

public class person {
    String name;
    private  int age;//私有成员不能直接访问
    private double chinese;
    private double math;

    public void setAge(int age) {//修饰的成员公开，可以在任何地方直接访问
        if(age>=0 && age<=180)
        {
            this.age=age;
        }
    }

    public int getAge() {
        return age;
    }
    public void printAllscore()
    {
        System.out.println(name+"总成绩是："+(math+chinese));
    }
}
