package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestCalculateStatistics {
    @Test
    public void testStatisticsmorepoststhancomments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> nameList = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(makeList(100));
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.1, statisticsCalculator.getComentsForPost(), 1e-8);
        Assert.assertEquals(1.0, statisticsCalculator.getCommentsForUser(), 1e-8);
        Assert.assertEquals(10.0, statisticsCalculator.getPostsForUser(), 1e-8);
    }


    @Test
    public void testStatistics0names() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> nameList = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(makeList(0));
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10,statisticsCalculator.getComentsForPost(),1e-8);
        Assert.assertEquals(0,statisticsCalculator.getCommentsForUser(),1e-8);
        Assert.assertEquals(0,statisticsCalculator.getPostsForUser(),1e-8);
    }
    @Test
    public void testStatistics0comments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> nameList = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(makeList(100));
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0,statisticsCalculator.getComentsForPost(),1e-8);
        Assert.assertEquals(0,statisticsCalculator.getCommentsForUser(),1e-8);
        Assert.assertEquals(0.1,statisticsCalculator.getPostsForUser(),1e-8);
    }
    @Test
    public void testStatistics0posts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> nameList = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(makeList(50));
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0,statisticsCalculator.getComentsForPost(),1e-8);
        Assert.assertEquals(0.2,statisticsCalculator.getCommentsForUser(),1e-8);
        Assert.assertEquals(0,statisticsCalculator.getPostsForUser(),1e-8);
    }
    @Test
    public void testStatisticsmorecommetsthanposts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> nameList = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(makeList(20));
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10,statisticsCalculator.getComentsForPost(),1e-8);
        Assert.assertEquals(50,statisticsCalculator.getCommentsForUser(),1e-8);
        Assert.assertEquals(5,statisticsCalculator.getPostsForUser(),1e-8);
    }


    List<String> makeList(int size) {
        List<String> nameList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nameList.add("john");
        }
        return nameList;
    }

}


