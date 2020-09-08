package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraOnion extends AbstractPizzaOrderDecorator {

    public ExtraOnion(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", onion";
    }
}
