package com.example.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeui.ui.theme.ComposeUITheme

@Composable
fun Denmark() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(Color.Red)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 100.dp)
            ) {
                Row(
                    modifier = Modifier
                        .width(40.dp)
                        .fillMaxHeight()
                        .background(Color.White)

                ) {
                    Text(text = "")
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .background(Color.White)
                    .align(Alignment.Center)
            ) {
                Text(text = "")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DenmarkPreview() {
    ComposeUITheme {
        Denmark()
    }
}