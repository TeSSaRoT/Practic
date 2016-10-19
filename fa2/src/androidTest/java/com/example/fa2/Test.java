package com.example.fa2;

/**
 * Created by nleonenko on 18.10.16.
 */

import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class Test extends ActivityInstrumentationTestCase2<MainActivity> {
    public Test() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    @org.junit.Test
    public void testEnterName() throws Exception {
        onView(withId(R.id.editText)).perform(typeText("elephant"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView2)).check(matches(withText("Hello my friends")));
    }
}
