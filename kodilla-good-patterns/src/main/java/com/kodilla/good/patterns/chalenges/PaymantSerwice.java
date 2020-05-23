package com.kodilla.good.patterns.chalenges;

import java.util.List;

public interface PaymantSerwice {
    default boolean payment(User customer, List<Items> basket) {
        return true;
    }
}
