package com.kodilla.good.patterns.chalenges.FoodToDoor;

public class Food2Door {
    private ProcessShop processShop;

    public Food2Door(Order order) {
        this.processShop = order.getShop();
        processShop.process(order);
    }

}
