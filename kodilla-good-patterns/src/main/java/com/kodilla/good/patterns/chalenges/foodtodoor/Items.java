package com.kodilla.good.patterns.chalenges.foodtodoor;

public class Items {
    private String name;
    private User shop;
    private int quantity;
    private double price;

    public Items(String name, User shop, int quantity, double price) {
        this.name = name;
        this.shop = shop;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public User getShop() {
        return shop;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
