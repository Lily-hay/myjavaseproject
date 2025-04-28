package com.lily.arraylist;

public class Food {
    private String name;
    private double price;
    private String depc;
    public Food() {
    }

    public Food(String name, double price, String depc) {
        this.name = name;
        this.price = price;
        this.depc = depc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDepc() {
        return depc;
    }

    public void setDepc(String depc) {
        this.depc = depc;
    }
}
