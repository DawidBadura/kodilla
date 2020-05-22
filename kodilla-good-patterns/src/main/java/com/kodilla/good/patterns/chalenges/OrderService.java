package com.kodilla.good.patterns.chalenges;

import java.util.List;

public interface OrderService {
    default void createOrder(User customer, List<Items>basket){


    }
}
