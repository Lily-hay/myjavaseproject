package com.lily.d1_object.demo;

public class movieOperator {
    private movie[] movies;
    public movieOperator(movie[] movies) {
        this.movies=movies;
    }
    public void showAllMovie()
    {
        System.out.println("全部电影信息如下：");
        for (int i = 0; i < movies.length; i++) {
            movie m=movies[i];
            System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getPrice()+"\t"+m.getActor());
        }
    }
    public void getMovieById(int id)
    {
        for (int i = 0; i < movies.length; i++) {
            if(movies[i].getId()==id)
            {
                movie m=movies[i];
                System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getPrice()+"\t"+m.getActor());
                return;
            }
            System.out.println("您输入的id没有对应的电影");
        }

    }
}
