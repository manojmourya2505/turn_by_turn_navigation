package com.inouiw.scrutiny

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    var activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun buttonClickTesting() {
        onView(withId(R.id.tv_message)).check(matches(withText("Welcome Scrutiny")))

        onView(withId(R.id.bt_click_me)).perform(click())

        onView(withId(R.id.tv_message)).check(matches(withText("Hi Scrutiny, How are You?")))
    }
}