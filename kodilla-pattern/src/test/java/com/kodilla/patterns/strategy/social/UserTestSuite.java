package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.FacebookPublisher;
import com.kodilla.patterns.strategy.social.Millenials;
import com.kodilla.patterns.strategy.social.YGeneration;
import com.kodilla.patterns.strategy.social.ZGeneration;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        Millenials zenek = new Millenials("Zenek");
        YGeneration gienek = new YGeneration("Gienek");
        ZGeneration bolek = new ZGeneration("Bolek");

        //When
        String zenekPublisher = zenek.sharePost();
        System.out.println(zenek.getUserName() + " is from millenials generation. " + zenekPublisher);
        String gienekPublisher = gienek.sharePost();
        System.out.println(gienek.getUserName() + " is from YGeneration. " + gienekPublisher);
        String bolekPublisher = bolek.sharePost();
        System.out.println(bolek.getUserName() + " is from ZGeneration. " + zenekPublisher);

        //Then
        Assert.assertEquals("Social Publisher: Twitter", zenekPublisher);
        Assert.assertEquals("Social Publisher: Facebook", gienekPublisher);
        Assert.assertEquals("Social Publisher: Snapchat", bolekPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        Millenials zenek = new Millenials("Zenek");

        //When
        zenek.setSocialPublisher(new FacebookPublisher());
        String zenekNewPublisher = zenek.sharePost();

        //Then
        Assert.assertEquals("Social Publisher: Facebook", zenekNewPublisher);
    }
}
