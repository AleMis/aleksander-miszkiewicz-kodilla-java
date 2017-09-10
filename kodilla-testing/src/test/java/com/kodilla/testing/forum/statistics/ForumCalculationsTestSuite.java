package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumCalculationsTestSuite {


    //gdy liczba postów = 0
    @Test
    public void testCalculateAdvStatisticsPosts0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<>();

        for(int i = 0; i<100; i++) {
            usersNamesList.add("Name" + i);
        }

        int post = 0;
        int comments = 200;
        int userNamesNumber = usersNamesList.size();

        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.postsCount()).thenReturn(comments);
        when(statisticsMock.usersNames().size()).thenReturn(userNamesNumber);

        ForumCalculations forumCalculations = new ForumCalculations(statisticsMock);
        forumCalculations.calculateAdvStatistics(statisticsMock);

        //When
        double testAvgPostsPerUser = forumCalculations.avgPostsPerUser;
        double testAvgCommentsPerUser = forumCalculations.avgCommentsPerUser;
        double testAvgCommentsPerPost = forumCalculations.avgCommentsPerPost;


        //Then
        Assert.assertEquals(0.0, testAvgPostsPerUser);
        Assert.assertEquals(2.0, testAvgCommentsPerUser);
        Assert.assertEquals(0.0, testAvgCommentsPerPost);




    }

}
