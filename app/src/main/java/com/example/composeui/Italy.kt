package com.example.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
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
import com.example.composeui.ui.theme.DeepGreen

@Composable
fun Italy() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Black),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        ) {
            Column(
                modifier = Modifier
                    .background(color = DeepGreen)
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                Text(text = "")
            }
            Column(
                modifier = Modifier
                    .background(color = Color.White)
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                Text(text = "")
            }
            Column(
                modifier = Modifier
                    .background(color = Color.Red)
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                Text(text = "")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ItalyPreview() {
    ComposeUITheme {
        Italy()
    }
}