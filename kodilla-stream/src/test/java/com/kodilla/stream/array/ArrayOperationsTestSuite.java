package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void estGetAverage() {
        //given
        int[] arrayOfInt = {3, 5, 1, 6, 8, 3, 4, 3};
        int[] arrayOfInt1 = {1, 6, 8, 3, 0, 3};
        int[] arrayOfInt2 = {};
        int[] arrayOfInt3 = {3, 5, 1, 6, 8, 3, -53};


        //when
        double result = ArrayOperations.getAverage(arrayOfInt);
        double result1 = ArrayOperations.getAverage(arrayOfInt1);
        double result2 = ArrayOperations.getAverage(arrayOfInt2);
        double result3 = ArrayOperations.getAverage(arrayOfInt3);
        //then
        Assert.assertEquals(4.125, result, 0.001);
        Assert.assertEquals(3.5, result1, 0.001);
        Assert.assertEquals(0, result2, 0.001);
        Assert.assertEquals(-3.857, result3, 0.001);
    }
}
