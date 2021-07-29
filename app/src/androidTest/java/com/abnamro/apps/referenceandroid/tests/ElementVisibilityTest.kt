package com.abnamro.apps.referenceandroid.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.abnamro.apps.referenceandroid.BaseTest
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ElementVisibilityTest : BaseTest() {

    @Test
    fun checkVisibility() {
        mainPage.verifyWhetherAllElementsArePresent()
    }

    @Test
    fun checkTextVisibility() {
        mainPage.verifyIfTextPresent("Hello World!")
    }

    @Test
    fun checkOptionsInTheActionBar() {
        mainPage.verifyWhetherOptionsAreShown()
    }

    @Test
    fun checkSnackBarVisibilityOnClick() {
        mainPage.verifySnackBarVisible()
    }


}