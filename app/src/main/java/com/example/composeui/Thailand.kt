package com.example.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeui.ui.theme.ComposeUITheme
import com.example.composeui.ui.theme.DeepBlue1
import com.example.composeui.ui.theme.DeepRed

@Composable
fun Thailand() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        ) {
            Row(
                modifier = Modifier
                    .background(color = DeepRed)
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Text(text = "")
            }
            Row(
                modifier = Modifier
                    .background(color = Color.White)
                    .weight(1f)
                    .fillMaxWidth()
            ) {
                Text(text = "")
            }
            Row(
                modifier = Modifier
                    .background(color = DeepBlue1)
                    .weight(2.5f)
                    .fillMaxWidth()
            ) {
                Text(text = "")
            }
            Row(
                modifier = Modifier
                    .background(color = Color.White)
                    .weight(1f)
                    .fillMaxWidth()
            ) {
                Text(text = "")
            }
            Row(
                modifier = Modifier
                    .background(color = DeepRed)
                    .weight(1f)
                    .fillMaxWidth()
            ) {
                Text(text = "")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ThailandPreview() {
    ComposeUITheme {
        Thailand()
    }
}