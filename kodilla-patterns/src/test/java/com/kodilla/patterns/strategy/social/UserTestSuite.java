package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new ZGeneration("Kodilla");

        //When
        String steavenShouldPost = steven.sharePost();
        System.out.println("Steven should: " + steavenShouldPost);
        String johnShouldPost = john.sharePost();
        System.out.println("John should: " + johnShouldPost);
        String kodillaShouldPost = kodilla.sharePost();
        System.out.println("Kodilla should: " + kodillaShouldPost);

        //Then
        Assert.assertEquals("Millenials publisher share on Facebook", steavenShouldPost);
        Assert.assertEquals("y generation share on Twitter", johnShouldPost);
        Assert.assertEquals("z generation share on Snapchat", kodillaShouldPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenShouldPost = steven.sharePost();
        System.out.println("Steven should: " + stevenShouldPost);
        steven.setPrefferedSP(new TwitterPublisher());
        stevenShouldPost = steven.sharePost();
        System.out.println("Steven now should: " + stevenShouldPost);

        //Then
        Assert.assertEquals("y generation share on Twitter", stevenShouldPost);
    }
}
