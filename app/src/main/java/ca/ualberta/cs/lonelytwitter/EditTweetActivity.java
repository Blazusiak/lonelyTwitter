package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

public class EditTweetActivity extends Activity {

    private Intent intent;
    private NormalTweet tweet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        intent = getIntent();
        String gsonTweet = intent.getStringExtra("tweet");
        Gson gson = new Gson();

        tweet = gson.fromJson(gsonTweet, NormalTweet.class);
        TextView tweetText = (TextView) findViewById(R.id.textView);
        tweetText.setText(tweet.getMessage());
    }
}
