package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double postsForUser;
    double commentsForUser;
    double comentsForPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();

        if (numberOfUsers != 0 && numberOfPosts != 0) {
            postsForUser = (double) numberOfPosts / (double) numberOfUsers;
        } else {
            postsForUser = 0;
        }

        if (numberOfComments != 0 && numberOfPosts != 0) {
            comentsForPost = (double) numberOfComments / (double) numberOfPosts;
        } else {
            comentsForPost = 0;
        }
        if (numberOfUsers != 0 && numberOfComments != 0) {
            commentsForUser = (double) numberOfComments / (double) numberOfUsers;
        } else {
            commentsForUser = 0;
        }
    }


    public void showStatistics() {
        System.out.print("StatisticsCalculator{" +
                "numberOfUsers=" + numberOfUsers +
                ", numberOfPosts=" + numberOfPosts +
                ", numberOfComments=" + numberOfComments +
                ", postsForUser=" + postsForUser +
                ", commentsForUser=" + commentsForUser +
                ", comentsForPost=" + comentsForPost +
                '}');
    }

    public double getPostsForUser() {
        return postsForUser;
    }

    public double getCommentsForUser() {
        return commentsForUser;
    }

    public double getComentsForPost() {
        return comentsForPost;
    }
}
