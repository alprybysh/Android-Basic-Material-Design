package com.fachrinfl.android_basic_material_design.scenarios;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.fachrinfl.android_basic_material_design.MainActivity;
import com.fachrinfl.android_basic_material_design.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isNotChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainScreen {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void verifySwitchButton(){
        onView(withId(R.id.switch_id))
                .check(matches(isDisplayed()))
                .check(matches(isNotChecked()))
                .check(matches(withText("Comment")))
                .perform(click())
                .check(matches(isChecked()));
    }


    @Test
    public void verifyCheckBox(){
        onView(withId(R.id.checkbox_id))
                .check(matches(isDisplayed()))
                .check(matches(isNotChecked()))
                .check(matches(withText("Comedy")))
                .perform(click())
                .check(matches(isChecked()));
    }

    @Test
    public void verifyRadioWomenButton(){
        onView(withId(R.id.women_id))
                .check(matches(isDisplayed()))
                .check(matches(isNotChecked()))
                .check(matches(withText("Women")))
                .perform(click())
                .check(matches(isChecked()));
    }


    @Test
    public void verifyRadioManButton(){
        onView(withId(R.id.man_id))
                .check(matches(isDisplayed()))
                .check(matches(isNotChecked()))
                .check(matches(withText("Man")))
                .perform(click())
                .check(matches(isChecked()));
    }


    @Test
    public void fillFormWomen(){
        onView(withId(R.id.switch_id))
                .perform(click())
                .check(matches(isChecked()));
        onView(withId(R.id.checkbox_id))
                .perform(click())
                .check(matches(isChecked()));
        onView(withId(R.id.women_id))
                .perform(click())
                .check(matches(isChecked()));
    }

    @Test
    public void fillFormMan(){
        onView(withId(R.id.switch_id))
                .perform(click())
                .check(matches(isChecked()));
        onView(withId(R.id.checkbox_id))
                .perform(click())
                .check(matches(isChecked()));
        onView(withId(R.id.man_id))
                .perform(click())
                .check(matches(isChecked()));
    }
}
