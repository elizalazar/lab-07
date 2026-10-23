package com.example.lab_7

// Lab Walkthrough: Step 10 b & d
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

// Lab Walkthrough: Step 10 a
@RunWith(AndroidJUnit4::class)
class FormulaZeroTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>() // access MainActivity

    // Lab Walkthrough: Step 10 c
    @Test
    fun navigate_to_races_add_race_and_return_home() {
        // navigate to race screen
        composeTestRule
            .onNodeWithTag("raceButton")
            .performClick()

        // verify race screen
        composeTestRule
            .onNodeWithText("Upcoming Races")
            .assertExists()

        // enter race location
        composeTestRule
            .onNodeWithTag("locationInput")
            .performTextInput("Canada")

        // add race location
        composeTestRule
            .onNodeWithTag("addRaceButton")
            .performClick()

        // verify race appears
        composeTestRule
            .onNodeWithText("Canada")
            .assertExists()

        // return to home screen
        composeTestRule
            .onNodeWithTag("backButton")
            .performClick()

        // verify return to home screen
        composeTestRule
            .onNodeWithText("FormulaZero Home")
            .assertExists()
    }

    // Lab Participation Exercise
    @Test
    fun navigate_to_drivers_add_clear_and_return_home() {
        // navigate to drivers screen
        composeTestRule
            .onNodeWithTag("driversButton")
            .performClick()

        // verify drivers screen
        composeTestRule
            .onNodeWithText("FormulaZero Drivers")
            .assertExists()

        // enter driver 1 name
        composeTestRule
            .onNodeWithTag("nameInput")
            .performTextInput("Sandra")

        // add driver 1
        composeTestRule
            .onNodeWithTag("addDriverButton")
            .performClick()

        // verify driver 1 appears
        composeTestRule
            .onNodeWithText("Sandra")
            .assertExists()

        // enter driver 2 name
        composeTestRule
            .onNodeWithTag("nameInput")
            .performTextInput("Theona")

        // add driver 2
        composeTestRule
            .onNodeWithTag("addDriverButton")
            .performClick()

        // verify driver 2 appears
        composeTestRule
            .onNodeWithText("Theona")
            .assertExists()

        // clear drivers
        composeTestRule
            .onNodeWithTag("clearDriverButton")
            .performClick()

        // verify drivers are cleared
        composeTestRule
            .onNodeWithText("Sandra")
            .assertDoesNotExist()
        composeTestRule
            .onNodeWithText("Theona")
            .assertDoesNotExist()

        // return to home screen
        composeTestRule
            .onNodeWithTag("backButton")
            .performClick()

        // verify return to home screen
        composeTestRule
            .onNodeWithText("FormulaZero Home")
            .assertExists()
    }
}


