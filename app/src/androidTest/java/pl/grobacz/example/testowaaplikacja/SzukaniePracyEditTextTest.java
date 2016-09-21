package pl.grobacz.example.testowaaplikacja;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by grobacz on 2016-09-20.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class SzukaniePracyEditTextTest {
    private String mStringToBetyped;

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void initValidString() {
        // Specify a valid string.
        mStringToBetyped = "Espresso";
    }

    @Test
    public void changeText_sameActivity() {
        onView(withId(R.id.szukaniePracyStartButton)).perform(click());

        // Type text and then press the button.
        onView(withId(R.id.espressoEditText))
                .perform(typeText(mStringToBetyped), closeSoftKeyboard());

        // Check that the text was changed.
        onView(withId(R.id.espressoEditText))
                .check(matches(withText(mStringToBetyped)));
    }
}
