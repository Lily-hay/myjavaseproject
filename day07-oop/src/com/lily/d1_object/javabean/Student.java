package com.lily.d1_object.javabean;
//实体类
public class Student {
    private String name;
    private String sex;
    private int height;
    private int score;

    public Student() {
    }

    public Student(String name, String sex, int height, int score) {
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
