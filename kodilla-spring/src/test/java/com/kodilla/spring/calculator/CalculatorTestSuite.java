package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double aDd = calculator.add(2.5, 2.5);
        double sUb = calculator.sub(2.5, 2.5);
        double mUl = calculator.mul(2.5, 2.5);
        double dIv = calculator.div(2.5, 2.5);
        //Then
        Assert.assertEquals(5, aDd, 0.001);
        Assert.assertEquals(0, sUb, 0.001);
        Assert.assertEquals(6.25, mUl, 0.001);
        Assert.assertEquals(1, dIv, 0.001);
    }

}
