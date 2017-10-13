package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by jblaz on 2017-10-11.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){};

    public void add(Tweet tweet) throws IllegalArgumentException {
        if (this.hasTweet(tweet)) {
            throw new IllegalArgumentException("Duplicate Tweet");
        } else {
            tweets.add(tweet);
        }
    }

    public boolean hasTweet(Tweet tweet) {
        int size = tweets.size();
        for (int i=0; i < size; i++) {
            if (tweet == tweets.get(i)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
        //return tweets.contains(tweet);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets() {
        return tweets;
    }

    public int getCount() {
        return tweets.size();
    }

}
