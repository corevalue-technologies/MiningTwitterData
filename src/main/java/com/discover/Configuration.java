package com.discover;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * @author : Shubham Aggarwal
 * @since : 11/07/17
 */
public class Configuration {

    static final String CONSUMER_KEY = "<CONSUMER_KEY>";
    static final String CONSUMER_SECRET = "<CONSUMER_SECRET>";
    static final String ACCESS_TOKEN = "<ACCESS_TOKEN>";
    static final String ACCESS_TOKEN_SECRET = "<ACCESS_TOKEN_SECRET>";

    public static Twitter getTwitterInstance() {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(CONSUMER_KEY)
                .setOAuthConsumerSecret(CONSUMER_SECRET)
                .setOAuthAccessToken(ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(ACCESS_TOKEN_SECRET);

        TwitterFactory tf = new TwitterFactory(cb.build());

        return tf.getInstance();
    }
}
