package com.kodilla.good.patterns.chalenges.foodtodoor;

import com.kodilla.good.patterns.chalenges.Items;
import com.kodilla.good.patterns.chalenges.User;

import java.util.List;

public interface OrderService {
    default void process(User customer, List<Items> basket) {

    }
}
