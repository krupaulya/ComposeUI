package com.example.composeui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.composeui.ui.theme.ComposeUITheme
import com.example.composeui.ui.theme.Pink40

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ImageLoading() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Pink40),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val inputValue = remember { mutableStateOf("") }
        TextField(
            value = inputValue.value,
            onValueChange = {
                inputValue.value = it
            },
            placeholder = { Text(text = "Your link for an image") }
        )
        AsyncImage(
            model = ImageRequest
                .Builder(LocalContext.current)
                .data(inputValue.value)
                .build(),
            contentDescription = null,
            placeholder = painterResource(id = R.drawable.cat),
            error = painterResource(id = R.drawable.error),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(300.dp)
                .height(300.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun ImageLoadingPreview() {
    ComposeUITheme {
        ImageLoading()
    }
}