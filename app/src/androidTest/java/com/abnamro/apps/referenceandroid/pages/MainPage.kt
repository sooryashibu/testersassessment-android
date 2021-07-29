package com.abnamro.apps.referenceandroid.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry.getInstrumentation
import com.abnamro.apps.referenceandroid.R
import org.hamcrest.Matchers.allOf

class MainPage {
    fun verifyWhetherAllElementsArePresent() {
        onView(withId(R.id.fab))
            .check(matches(isDisplayed()))
        onView(withId(R.id.fragment))
            .check(matches(isDisplayed()))
        onView(withId(R.id.hello_world_title))
            .check(matches(isDisplayed()))
    }

    fun verifyIfTextPresent(text: String) {
        onView(withId(R.id.hello_world_title))
            .check(matches(withText(text)))
    }

    fun verifySnackBarVisible() {
        onView(withId(R.id.fab)).perform(click())
        onView(withId(com.google.android.material.R.id.snackbar_text))
            .check(matches(withText("Replace with your own action")))
    }

    fun verifyWhetherOptionsAreShown() {
        openActionBarOverflowOrOptionsMenu(getInstrumentation().targetContext)
        onView(allOf(withId(R.id.title), withText(R.string.action_settings), isDisplayed())).perform(click());
    }
}