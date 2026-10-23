package com.example.lab_7

// Lab Walkthrough: Step 3
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

// Lab Walkthrough: Step 6 b
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


// Lab Walkthrough: Step 6 a
@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "FormulaZero Home",
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                navController.navigate("races")
            },
            modifier = Modifier.testTag("raceButton") // for testing
        ) {
            Text("Upcoming Races")
        }

        // Lab Participation Exercise
        Spacer(modifier = Modifier.height(6.dp))

        Button(
            onClick = {
                navController.navigate("drivers")
            },
            modifier = Modifier.testTag("driversButton") // for testing
        ) {
            Text("Drivers")
        }
    }
}