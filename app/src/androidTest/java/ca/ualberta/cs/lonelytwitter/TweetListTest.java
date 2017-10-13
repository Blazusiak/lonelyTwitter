package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by jblaz on 2017-10-11.
 */

public class TweetListTest  extends ActivityInstrumentationTestCase2 {

    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testDelete() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("deleting tweet");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("has tweet");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
        try {
            list.add(tweet);
            assertTrue(Boolean.FALSE);
        } catch (IllegalArgumentException e){
            assertTrue(Boolean.TRUE);
        }
    }

    public void testGetTweet() {
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("get tweet");
        list.add(tweet);
        Tweet returnedTweet = list.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
    }

    public void testGetTweets() {
        TweetList list = new TweetList();
        Tweet tweet1 = new NormalTweet("tweet 1");
        Tweet tweet2 = new NormalTweet("tweet 2");
        Tweet tweet3 = new NormalTweet("tweet 3");
        list.add(tweet1);
        list.add(tweet2);
        list.add(tweet3);
        ArrayList<Tweet> gotTweets = list.getTweets();
        assertEquals(gotTweets.get(0).getMessage(), "tweet 1");
        assertEquals(gotTweets.get(1).getMessage(), "tweet 2");
        assertEquals(gotTweets.get(2).getMessage(), "tweet 3");
    }

    public void testGetCount() {
        TweetList list = new TweetList();
        Tweet tweet1 = new NormalTweet("tweet 1");
        Tweet tweet2 = new NormalTweet("tweet 2");
        Tweet tweet3 = new NormalTweet("tweet 3");
        list.add(tweet1);
        list.add(tweet2);
        list.add(tweet3);
        assertEquals(list.getCount(), 3);
    }
}
