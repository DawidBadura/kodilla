package com.kodilla.good.patterns.chalenges.FoodToDoor;

public class ExtraFoodShop implements ProcessShop {
    private BaseOfOrders baseOfOrders = new BaseOfOrders();

    @Override
    public boolean process(Order order) {
        System.out.println("ExtraFoodShop");

        baseOfOrders.add(order.getProductName(), order.getQuantity());
        if (productAvailiable(order.getProductName(), order.getQuantity())) {
            return confirmCustomer(order.getUserName());
        } else return false;

    }

    boolean confirmCustomer(String customer) {
        return true;
    }

    boolean productAvailiable(String productName, int numbersOfProducts) {
        return true;
    }

    class BaseOfOrders {
        void add(String pName, int quantity) {

        }
    }
}
