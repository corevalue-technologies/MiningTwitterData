package com.discover;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 * @author : Shubham Aggarwal
 * @since : 11/07/17
 */
public class Configuration {

    static final String CONSUMER_KEY = "f6RgD6FtabLhyOirF1dClW0Yu";
    static final String CONSUMER_SECRET = "55FbvuajSzdb8hW7DeuVHgz8WgxLTJzOBrw1ZQmDWMKSw1jEyv";
    static final String ACCESS_TOKEN = "116193615-MeVlzCB7J69RF0pEAvXHRsf3sZKk7i8zWEC8euls";
    static final String ACCESS_TOKEN_SECRET = "HYTneCGV3FY1W5tEhYlBIWfOj3DCPWwTX447kmIKcS9EV";

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
