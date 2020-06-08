package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoping = factory.executeTask(TaskFactory.SHOPPING_TASK);
        //Then
        Assert.assertEquals(true, shoping.isTaskExecuted());
        Assert.assertEquals("shoptask", shoping.getTaskName());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.executeTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertEquals(true, painting.isTaskExecuted());
        Assert.assertEquals("painttask", painting.getTaskName());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.executeTask(TaskFactory.DRIVING_TASK);
        //Then
        Assert.assertEquals(true, driving.isTaskExecuted());
        Assert.assertEquals("drivingtask", driving.getTaskName());
    }
}
