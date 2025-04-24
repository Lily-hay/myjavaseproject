package com.lily.pkg;

import com.lily.pkg2.Car;
import com.lily.pkg2.tiger;

public class Test1 {
    public static void main(String[] args) {
        Student s = new Student();
        Car c = new Car();//不同包导入类需要导包
        tiger t = new tiger();
        t.run();
        com.lily.pkg3.tiger t1 = new com.lily.pkg3.tiger();//相同类名只能导入一个，其他的需要带包使用
        t1.run();

    }
}
