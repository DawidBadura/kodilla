package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void logIn() {
        Logger.getInstance().log("3,3,2020");
    }


    @Test
    public void testGetLastLog() {
        //Given
        //When
        String fileName = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("3,3,2020", fileName);
    }
}
