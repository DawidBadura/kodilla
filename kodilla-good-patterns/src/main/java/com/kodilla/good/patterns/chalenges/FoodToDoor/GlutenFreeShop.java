package com.kodilla.good.patterns.chalenges.FoodToDoor;


import java.util.Date;

public class GlutenFreeShop implements ProcessShop {
    @Override
    public boolean process(Order order) {
        System.out.println("GlutenFreeShop");
        if (productAvailible(order) && transporterAvailiable()) {
            sendSms(order.contactNUmber, realizationTime());
            printOrder(order);
            return true;
        } else {
            sendSms(order.contactNUmber, false);
            return false;
        }
    }

    boolean productAvailible(Order order) {
        return true;
    }

    boolean transporterAvailiable() {
        return true;
    }

    void sendSms(Integer telephone, Date timeOfRealization) {

    }

    void sendSms(Integer telephone, boolean realizationConfirmed) {

    }

    Date realizationTime() {

        return new Date();
    }

    void printOrder(Order order) {

    }


}
