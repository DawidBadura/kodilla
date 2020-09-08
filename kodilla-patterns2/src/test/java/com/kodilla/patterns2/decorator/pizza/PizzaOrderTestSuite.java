package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void  testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }
    @Test
    public void  testBasicPizzaOrdergetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sause, cheese", description);
    }
    @Test
    public void  testPizzaWithExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder=new ExtraCheese(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(17), calculatedCost);
    }
    @Test
    public void testPizzaWithExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheese(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sause, cheese, extra cheese", description);
    }
    @Test
    public void testPizzaWithExtraHamGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder=new ExtraHam(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(19), calculatedCost);
    }
    @Test
    public void testPizzaWithExtraHamGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraHam(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sause, cheese, ham", description);
    }
    @Test
    public void  testPizzaWithExtraCheeseAndOnionGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder=new ExtraCheese(theOrder);
        theOrder = new ExtraOnion(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(19), calculatedCost);
    }
    @Test
    public void  testPizzaWithExtraCheeseAndOnionGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheese(theOrder);
        theOrder = new ExtraOnion(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato sause, cheese, extra cheese, onion", description);
    }
}
