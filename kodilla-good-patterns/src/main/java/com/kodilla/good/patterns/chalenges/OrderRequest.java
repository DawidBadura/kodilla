package com.kodilla.good.patterns.chalenges;

import java.util.List;

public class OrderRequest {
    private List<Items> basket;
    private User customer;

    public OrderRequest(List<Items> basket, User customer) {
        this.basket = basket;
        this.customer = customer;
    }

    public List<Items> getBasket() {
        return basket;
    }

    public User getCustomer() {
        return customer;
    }
}



