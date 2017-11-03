package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.EditText;
import com.robotium.solo.Solo;


public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    private Solo solo;

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
        Log.d("SETUP", "setUp()");
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }

//    public void testTweet(){
//        solo.assertCurrentActivity("wrong activity", LonelyTwitterActivity.class);
//        solo.clickOnButton("Clear");
//        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
//
//        solo.clickOnButton("Save");
//
//        solo.clearEditText((EditText) solo.getView(R.id.body));
//
//        assertTrue(solo.waitForText("Test Tweet!"));
//
//        solo.clickOnButton("Clear");
//
//        assertFalse(solo.waitForText("Test Tweet!", 1, 1000));
//    }
//
//    public void testClickTweetList(){
//        LonelyTwitterActivity activity = (LonelyTwitterActivity) solo.getCurrentActivity();
//
//        solo.assertCurrentActivity("wrong activity", LonelyTwitterActivity.class);
//        solo.clickOnButton("Clear");
//        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
//
//        solo.clickOnButton("Save");
//
//        solo.clearEditText((EditText) solo.getView(R.id.body));
//        assertTrue(solo.waitForText("Test Tweet!"));
//
//        final ListView oldTweetsList = activity.getOldTweetsList();
//        Tweet tweet = (Tweet) oldTweetsList.getItemAtPosition(0);
//        assertEquals("Test Tweet!", tweet.getMessage());
//
//        solo.clickInList(0);
//        solo.assertCurrentActivity("wrong activity", EditTweetActivity.class);
//
//        assertTrue(solo.waitForText("New Activity", 1, 1000));
//        solo.goBack();
//        solo.assertCurrentActivity("wrong Activity", LonelyTwitterActivity.class);
//
//
//    }

    public void testTweet() {
        solo.assertCurrentActivity("Wrong Activity", LonelyTwitterActivity.class);
        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
        solo.clickOnButton("Save");
        solo.enterText((EditText) solo.getView(R.id.body), "");
        assertTrue(solo.waitForText("Test Tweet!"));

        solo.clickOnButton("Clear");
    }

    public void testClickTweetList() {
        solo.assertCurrentActivity("Wrong activity", LonelyTwitterActivity.class);
        solo.clickOnButton("Clear");
        solo.enterText((EditText) solo.getView(R.id.body), "click this");
        solo.clickOnButton("Save");
        solo.waitForText("click this");

        solo.clickInList(0);
        solo.assertCurrentActivity("Wrong activity", EditTweetActivity.class);
        solo.waitForText("click this");
        boolean exists = solo.searchText("click this", true);
        assertTrue(exists);
    }



    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

}