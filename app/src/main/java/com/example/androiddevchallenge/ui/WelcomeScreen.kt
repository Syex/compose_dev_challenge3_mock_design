package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun WelcomeScreen(onAnyButtonClicked: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_light_welcome),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colors.background),
            contentScale = ContentScale.FillBounds
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.ic_light_logo),
                contentDescription = null
            )

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                modifier = Modifier
                    .height(72.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                shape = RoundedCornerShape(20),
                onClick = onAnyButtonClicked
            ) {
                Text(text = "SIGN UP")
            }

            Spacer(modifier = Modifier.height(8.dp))

            Button(
                modifier = Modifier
                    .height(72.dp)
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                shape = RoundedCornerShape(20),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = MaterialTheme.colors.secondary
                ),
                onClick = onAnyButtonClicked
            ) {
                Text(text = "LOG IN")
            }
        }
    }
}

@Preview("Welcome", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        WelcomeScreen {}
    }
}