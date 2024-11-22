package com.neoteric.november.november.linkedlist;

public class Product {
    public String name;
    public double price;
    public String model;

    public Product(String name, double price, String model) {
        this.name = name;
        this.price = price;
        this.model = model;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
