package com.kodilla.good.patterns.chalenges;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetreiver {
    public OrderRequest retrive() {
         List<Items> basket=new ArrayList<>();
         User customer = new User("karol","nowak", "kar@.com", "stosik 24", 4446);


        basket.add(new Items("phone", new User("szymon","stabiszewski","szymon@.org","dlugastreet 22",4444), 1, 999.99));
        basket.add(new Items("camera", new User("marek","krupa","krupa@.org","kazimierza 22",9878), 1, 559.99));
        basket.add(new Items("shampoo", new User("piotr","pacult","pietr@.org","myslenicka 22",9666), 3, 9.99));

        return new OrderRequest(basket, customer);
    }
}
