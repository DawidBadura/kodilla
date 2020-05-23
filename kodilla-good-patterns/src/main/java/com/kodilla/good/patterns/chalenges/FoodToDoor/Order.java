package com.kodilla.good.patterns.chalenges.FoodToDoor;

public class Order {
    String userName;
    String userAddress;
    int contactNUmber;
    String userEmail;
    String productName;
    int quantity;
    double price;
    ProcessShop shop;

    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public int getContactNUmber() {
        return contactNUmber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public ProcessShop getShop() {
        return shop;
    }

    public Order(String userName, String userAddress, int contactNUmber, String userEmail, String productName, int quantity, double price, ProcessShop shop) {
        this.userName = userName;
        this.userAddress = userAddress;
        this.contactNUmber = contactNUmber;
        this.userEmail = userEmail;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.shop = shop;

    }
}
