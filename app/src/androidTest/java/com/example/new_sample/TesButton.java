package com.example.new_sample;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class TesButton {
    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void tesButton(){
        //cari id button1 terus di klik
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("1")));
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("1+")));
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("1")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("2")));
        onView(withId(R.id.button_clear)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("")));

//pengurangan
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_sub)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("2-")));
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("2")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("0")));
        onView(withId(R.id.button_clear)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("")));

//        perkalian
        onView(withId(R.id.button3)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("3")));
        onView(withId(R.id.button_multi)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("3x")));
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("4")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("12")));
        onView(withId(R.id.button_clear)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("")));

//      pembagian
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
        onView(withId(R.id.button_divide)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("5/")));
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("5")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("1")));
        onView(withId(R.id.button_clear)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("")));

//      decimal
        onView(withId(R.id.button6)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("6")));
        onView(withId(R.id.button_dot)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("6.")));
        onView(withId(R.id.button7)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("7")));
        onView(withId(R.id.button_add)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("6.7+")));
        onView(withId(R.id.button8)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("8")));
        onView(withId(R.id.button_equal)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("14.7")));
        onView(withId(R.id.button_clear)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("")));

//-/+
        onView(withId(R.id.button9)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("9")));
        onView(withId(R.id.button_para2)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("-9")));
        onView(withId(R.id.button_clear)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("")));

//        percent
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("1")));
        onView(withId(R.id.button0)).perform(click());
        onView(withId(R.id.input)).check(matches(withText("0")));
        onView(withId(R.id.output)).check(matches(withText("10")));
        onView(withId(R.id.button_para1)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("10%")));
        onView(withId(R.id.button_clear)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("")));



    }

}
