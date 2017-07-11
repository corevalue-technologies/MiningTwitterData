package com.discover;

import twitter4j.*;

import java.util.List;

/**
 * @author : Shubham Aggarwal
 * @since : 11/07/17
 */
public class TwitterMain {

    public static void main(String[] args) throws TwitterException {

        Twitter twitter = Configuration.getTwitterInstance();

        //showHomeTimeline(twitter);
        //updateTweet(twitter, "From Twitter4J");
        //getOtherUserTimeline(twitter, "DiscoverSDKs");
        searchTweets(twitter, "DiscoverSDKs");
    }

    private static void showHomeTimeline(Twitter twitter) throws TwitterException {

        List<Status> statuses = null;
        statuses = twitter.getHomeTimeline();

        System.out.println("Showing home timeline.");

        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":" + status.getText());
            String url = "https://twitter.com/" + status.getUser().getScreenName() + "/status/" + status.getId();
            System.out.println("Above tweet URL : " + url);

                /*status.getSource();
                status.getCreatedAt();
                status.getFavoriteCount();
                status.getGeoLocation();
                status.getLang();
                status.getPlace();
                status.getRetweetCount();
                status.getUser().getBiggerProfileImageURL();
                status.getUser().getEmail();
                status.getUser().getFollowersCount();
                status.getUser().getFriendsCount();*/
        }
    }

    private static void updateTweet(Twitter twitter, String tweet) throws TwitterException {

        Status status = twitter.updateStatus(tweet);
        System.out.println("Successfully updated the status to [" + status.getText() + "].");
    }

    private static void getOtherUserTimeline(Twitter twitter, String userName) throws TwitterException {

        List<Status> statuses = twitter.getUserTimeline(userName);

        for (Status status : statuses) {
            System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
        }
    }

    private static void searchTweets(Twitter twitter, String searchTerm) throws TwitterException {

        Query query = new Query("source:" + searchTerm);
        QueryResult result = twitter.search(query);

        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
        }
    }

}
