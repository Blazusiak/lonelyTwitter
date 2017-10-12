package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

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
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }
}
