package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestCalculateStatistics {
    @Test
    public void testCalculateStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        Statistics statisticsMock1 = mock(Statistics.class);
        Statistics statisticsMock2 = mock(Statistics.class);
        List<String> nameList = new ArrayList<>();
        List<String> nameList1 = new ArrayList<>();
        for(int i=0;i<100;i++) {
            nameList.add("john");
        }

        when(statisticsMock.usersNames()).thenReturn(nameList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        when(statisticsMock1.usersNames()).thenReturn(nameList1);
        when(statisticsMock1.postsCount()).thenReturn(100);
        when(statisticsMock1.commentsCount()).thenReturn(1000);

        when(statisticsMock2.usersNames()).thenReturn(nameList);
        when(statisticsMock2.postsCount()).thenReturn(0);
        when(statisticsMock2.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        StatisticsCalculator statisticsCalculator1 = new StatisticsCalculator();

        StatisticsCalculator statisticsCalculator2 = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);
        statisticsCalculator1.calculateAdvStatistics(statisticsMock1);
        statisticsCalculator2.calculateAdvStatistics(statisticsMock2);

        //Then
        Assert.assertEquals(0.1,statisticsCalculator.getComentsForPost(),1e-8);
        Assert.assertEquals(1.0,statisticsCalculator.getCommentsForUser(),1e-8);
        Assert.assertEquals(10.0,statisticsCalculator.getPostsForUser(),1e-8);

        Assert.assertEquals(10,statisticsCalculator1.getComentsForPost(),1e-8);
        Assert.assertEquals(0,statisticsCalculator1.getCommentsForUser(),1e-8);
        Assert.assertEquals(0,statisticsCalculator1.getPostsForUser(),1e-8);

        Assert.assertEquals(0,statisticsCalculator2.getComentsForPost(),1e-8);
        Assert.assertEquals(0,statisticsCalculator2.getCommentsForUser(),1e-8);
        Assert.assertEquals(0,statisticsCalculator2.getPostsForUser(),1e-8);





    }
}