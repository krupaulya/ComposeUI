package com.example.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.composeui.ui.theme.ComposeUITheme

@Composable
fun Flags(
    navController: NavController
) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color.Black)
            .fillMaxWidth()

    ) {
        Country(countryName = R.string.austria, navController, Screens.Austria.route)
        Country(countryName = R.string.colombia, navController, Screens.Colombia.route)
        Country(countryName = R.string.denmark, navController, Screens.Denmark.route)
        Country(countryName = R.string.italy, navController, Screens.Italy.route)
        Country(countryName = R.string.madagascar, navController, Screens.Madagascar.route)
        Country(countryName = R.string.poland, navController, Screens.Poland.route)
        Country(countryName = R.string.switzerland, navController, Screens.Switzerland.route)
        Country(countryName = R.string.thailand, navController, Screens.Thailand.route)

    }
}

@Composable
fun Country(countryName: Int, navController: NavController, route: String) {
    Text(
        text = stringResource(id = countryName),
        fontSize = 35.sp,
        color = Color.White,
        modifier = Modifier
            .clickable(enabled = true) {
                navController.navigate(route = route)
            }
    )
}

@Preview(showBackground = true)
@Composable
fun FlagsPreview() {
    ComposeUITheme {
        Flags(navController = rememberNavController())
    }
}