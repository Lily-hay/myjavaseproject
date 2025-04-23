package com.lily.d1_object.demo;

public class Test {
    //目标：电影信息开发
    //1、每个电影设计类，用于创造电影对象
    //2、准备好数据对象，由一个一个电影对象存储
    //3、将电影对象给到操作对象，输出电影信息和实现id查询信息功能
    public static void main(String[] args) {
        movie[] movies = new movie[5];
        movies[0] = new movie(1,"热辣滚烫",46,"贾玲");
        movies[1]=new movie(2,"飞驰人生",45.7,"沈腾");
        movies[2]=new movie(3,"熊出没",40.3,"光头强");
        movies[3]=new movie(4,"非诚勿扰",39.8,"葛优，淑红");
        movies[4]=new movie(5,"第二十条",45.8,"赵丽颖");
        movieOperator operator=new movieOperator(movies);
        operator.showAllMovie();
        operator.getMovieById(3);
    }
}
