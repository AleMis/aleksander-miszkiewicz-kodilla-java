package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumCalculationsTestSuite {

    private static final double DELTA = 1e-15;

    // Test 1: gdy liczba postów = 0
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

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumCalculations forumCalculations = new ForumCalculations(statisticsMock);
        forumCalculations.calculateAdvStatistics(statisticsMock);

        //When
        double testAvgPostsPerUser = forumCalculations.avgPostsPerUser;
        double testAvgCommentsPerUser = forumCalculations.avgCommentsPerUser;
        double testAvgCommentsPerPost = forumCalculations.avgCommentsPerPost;


        //Then
        Assert.assertEquals(0.0, testAvgPostsPerUser, DELTA);
        Assert.assertEquals(2.0, testAvgCommentsPerUser, DELTA);
        Assert.assertEquals(0.0, testAvgCommentsPerPost, DELTA);
    }

    //Test 2: gdy liczba postów = 1000
    @Test
    public void testCalculateAdvStatisticsPosts1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<>();

        for(int i = 0; i<100; i++) {
            usersNamesList.add("Name" + i);
        }

        int post = 1000;
        int comments = 200;

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumCalculations forumCalculations = new ForumCalculations(statisticsMock);
        forumCalculations.calculateAdvStatistics(statisticsMock);

        //When
        double testAvgPostsPerUser = forumCalculations.avgPostsPerUser;
        double testAvgCommentsPerUser = forumCalculations.avgCommentsPerUser;
        double testAvgCommentsPerPost = forumCalculations.avgCommentsPerPost;


        //Then
        Assert.assertEquals(10.0, testAvgPostsPerUser, DELTA);
        Assert.assertEquals(2.0, testAvgCommentsPerUser, DELTA);
        Assert.assertEquals(0.2, testAvgCommentsPerPost, DELTA);
    }

    //Test 3: gdy liczba komentarzy = 0
    @Test
    public void testCalculateAdvStatisticsComments0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<>();

        for(int i = 0; i<100; i++) {
            usersNamesList.add("Name" + i);
        }

        int post = 1000;
        int comments = 0;

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumCalculations forumCalculations = new ForumCalculations(statisticsMock);
        forumCalculations.calculateAdvStatistics(statisticsMock);

        //When
        double testAvgPostsPerUser = forumCalculations.avgPostsPerUser;
        double testAvgCommentsPerUser = forumCalculations.avgCommentsPerUser;
        double testAvgCommentsPerPost = forumCalculations.avgCommentsPerPost;


        //Then
        Assert.assertEquals(10.0, testAvgPostsPerUser, DELTA);
        Assert.assertEquals(0.0, testAvgCommentsPerUser, DELTA);
        Assert.assertEquals(0.0, testAvgCommentsPerPost, DELTA);
    }

    //Test 4: gdy liczba komentarzy < liczba postów
    @Test
    public void testCalculateAdvStatisticsCommentsPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<>();

        for(int i = 0; i<100; i++) {
            usersNamesList.add("Name" + i);
        }

        int post = 200;
        int comments = 100;

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumCalculations forumCalculations = new ForumCalculations(statisticsMock);
        forumCalculations.calculateAdvStatistics(statisticsMock);

        //When
        double testAvgPostsPerUser = forumCalculations.avgPostsPerUser;
        double testAvgCommentsPerUser = forumCalculations.avgCommentsPerUser;
        double testAvgCommentsPerPost = forumCalculations.avgCommentsPerPost;


        //Then
        Assert.assertEquals(2.0, testAvgPostsPerUser, DELTA);
        Assert.assertEquals(1.0, testAvgCommentsPerUser, DELTA);
        Assert.assertEquals(0.5, testAvgCommentsPerPost, DELTA);
    }

    //Test 5: gdy liczba komentarzy > liczba postów
    @Test
    public void testCalculateAdvStatisticsCommentsPosts2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<>();

        for(int i = 0; i<100; i++) {
            usersNamesList.add("Name" + i);
        }

        int post = 100;
        int comments = 200;

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumCalculations forumCalculations = new ForumCalculations(statisticsMock);
        forumCalculations.calculateAdvStatistics(statisticsMock);

        //When
        double testAvgPostsPerUser = forumCalculations.avgPostsPerUser;
        double testAvgCommentsPerUser = forumCalculations.avgCommentsPerUser;
        double testAvgCommentsPerPost = forumCalculations.avgCommentsPerPost;


        //Then
        Assert.assertEquals(1.0, testAvgPostsPerUser, DELTA);
        Assert.assertEquals(2.0, testAvgCommentsPerUser, DELTA);
        Assert.assertEquals(2.0, testAvgCommentsPerPost, DELTA);
    }

    //Test 6: gdy liczba użytkowników = 0
    @Test
    public void testCalculateAdvStatisticsUsers0() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<>();

        int post = 100;
        int comments = 200;

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumCalculations forumCalculations = new ForumCalculations(statisticsMock);
        forumCalculations.calculateAdvStatistics(statisticsMock);

        //When
        double testAvgPostsPerUser = forumCalculations.avgPostsPerUser;
        double testAvgCommentsPerUser = forumCalculations.avgCommentsPerUser;
        double testAvgCommentsPerPost = forumCalculations.avgCommentsPerPost;


        //Then
        Assert.assertEquals(0.0, testAvgPostsPerUser, DELTA);
        Assert.assertEquals(0.0, testAvgCommentsPerUser, DELTA);
        Assert.assertEquals(2.0, testAvgCommentsPerPost, DELTA);
    }

    //Test 7: gdy liczba użytkowników = 1000
    @Test
    public void testCalculateAdvStatisticsUsers1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNamesList = new ArrayList<>();

        for(int i = 0; i<1000; i++) {
            usersNamesList.add("Name" + i);
        }

        int post = 100;
        int comments = 200;

        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(post);
        when(statisticsMock.commentsCount()).thenReturn(comments);

        ForumCalculations forumCalculations = new ForumCalculations(statisticsMock);
        forumCalculations.calculateAdvStatistics(statisticsMock);

        //When
        double testAvgPostsPerUser = forumCalculations.avgPostsPerUser;
        double testAvgCommentsPerUser = forumCalculations.avgCommentsPerUser;
        double testAvgCommentsPerPost = forumCalculations.avgCommentsPerPost;


        //Then
        Assert.assertEquals(0.1, testAvgPostsPerUser, DELTA);
        Assert.assertEquals(0.2, testAvgCommentsPerUser, DELTA);
        Assert.assertEquals(2.0, testAvgCommentsPerPost, DELTA);
    }

}
