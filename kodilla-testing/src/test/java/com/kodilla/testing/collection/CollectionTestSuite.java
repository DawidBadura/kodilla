package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test: begin");
    }

    @After
    public void after() {
        System.out.println("Test: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddnumbersexterminator = new OddNumbersExterminator();
        //When
        List<Integer> myList = oddnumbersexterminator.exterminate(new ArrayList<Integer>());
        //Then
        Assert.assertEquals(new ArrayList<Integer>(), myList);


    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddnumbersexterminator = new OddNumbersExterminator();
        //When
        List<Integer> myList = oddnumbersexterminator.exterminate(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)));
        //Then
        Assert.assertEquals(new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8)), myList);
    }
}
