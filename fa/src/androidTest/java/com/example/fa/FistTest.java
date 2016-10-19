package com.example.fa;

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

public class FistTest extends ActivityInstrumentationTestCase2<FScreen> {
    public FistTest() {
        super(FScreen.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testEnterName() throws Exception {
        onView(withId(R.id.editText)).perform(typeText("elephant"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Hello my friends")));
    }
}
