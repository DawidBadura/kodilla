package com.kodilla.good.patterns.chalenges.FoodToDoor;

public class HealthyShop implements ProcessShop {
    @Override
    public boolean process(Order order) {
        System.out.println("HealthyShop");

        if (checkIfAvailiable(order.getProductName(), order.getQuantity())) {
            sendEmail(order.getUserEmail());
            return true;
        } else return false;
    }

    boolean checkIfAvailiable(String prodName, int numbOfProd) {
        return true;
    }

    void sendEmail(String email) {

    }
}
