package com.example.screamitus_android;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.rule.ActivityTestRule;

//import androidx.test.uiautomator.UiDevice;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    public UiDevice mDevice;

    @Rule
    public ExampleUnitTest activityRule
            = new ExampleUnitTest(MainActivity.class);

    public ExampleUnitTest(Class<MainActivity> mainActivityClass) {
    }

    @Test
        public void changeText_sameActivity() {

            onView(withId(R.id.daysTextBox))
                    .perform(typeText(stringToBetyped), closeSoftKeyboard());
            onView(withId(R.id.changeTextBt)).perform(click());
//
//        mDevice.findObject(By.res(this, "text"))
//                .setText(STRING_TO_BE_TYPED);
//        mDevice.findObject(By.res(this, "changeTextBt"))
//                .click();


    }
