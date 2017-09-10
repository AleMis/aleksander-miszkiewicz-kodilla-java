package com.kodilla.testing.forum.statistics;

public class ForumCalculations {

    public Statistics statistics;
    public int usersNumber;
    public int postsNumber;
    public int commentsNumber;
    public double avgPostsPerUser;
    public double avgCommentsPerUser;
    public double avgCommentsPerPost;

    public ForumCalculations(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if(postsNumber == 0 || usersNumber == 0) {
            avgPostsPerUser = 0;
        }else {
            avgPostsPerUser = (double) postsNumber /  (double) usersNumber;
        }

        if(commentsNumber == 0 || usersNumber == 0) {
            avgCommentsPerUser = 0;
        } else {
            avgCommentsPerUser = (double) commentsNumber / (double) usersNumber;
        }

        if(commentsNumber == 0 || postsNumber ==0) {
            avgCommentsPerPost = 0;
        }else {
            avgCommentsPerPost = (double) commentsNumber / (double) postsNumber;
        }
    }

    public void ShowStatistics() {
        System.out.println("Number of Users: " + usersNumber
                        + "\n" + "Number of Posts: " + postsNumber
                        + "\n" + "Number of Comments: " + commentsNumber
                        + "\n" + "Average number of posts per user: " + avgPostsPerUser
                        + "\n" + "Average number of comments per user: " + avgCommentsPerUser
                        + "\n" + "Average number of comments per post: " + avgCommentsPerPost);
    }

//    public int getUsersNumber() {
//        return usersNumber;
//    }
//
//    public int getPostsNumber() {
//        return postsNumber;
//    }
//
//    public int getCommentsNumber() {
//        return commentsNumber;
//    }
//
//    public double getAvgPostsPerUser() {
//        return avgPostsPerUser;
//    }
//
//    public double getAvgCommentsPerUser() {
//        return avgCommentsPerUser;
//    }
//
//    public double getAvgCommentsPerPost() {
//        return avgCommentsPerPost;
//    }
}
