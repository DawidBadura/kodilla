package com.kodilla.good.patterns.chalenges.FoodToDoor;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("piotr kowalski","Wisniowieckiego 88",433244333,"kowalski@.mail","ryz",2,2.33,new ExtraFoodShop());
        Food2Door food2Door = new Food2Door(order);
    }
}
