package com.example.mindbenders.ui.theme.screens.register

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mindbenders.R
import com.example.mindbenders.navigation.ROUTE_HOME
import com.example.mindbenders.navigation.ROUTE_LOGIN
import com.example.mindbenders.ui.theme.MindBendersTheme

@Composable
fun Greeting(name: String, navController: NavController) {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var emailAddress by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .background(Color.White)
            .padding(16.dp)
    ) {
        Text(
            text = "Good Morning $name",
            fontSize = 20.sp,
            color = Color.Blue,
            fontFamily = FontFamily.SansSerif,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.lorem),
            contentDescription = "Sample image",
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .height(80.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = firstName,
            onValueChange = { firstName = it },
            label = { Text(text = "Enter First Name") },
            placeholder = { Text(text = "Please enter your first name") },
            modifier = Modifier
                .wrapContentWidth()
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = lastName,
            onValueChange = { lastName = it },
            label = { Text(text = "Enter Last Name") },
            placeholder = { Text(text = "Please enter your last name") },
            modifier = Modifier
                .wrapContentWidth()
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = emailAddress,
            onValueChange = { emailAddress = it },
            label = { Text(text = "Enter Email Address") },
            placeholder = { Text(text = "Please enter your email address") },
            modifier = Modifier
                .wrapContentWidth()
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                       navController.navigate(ROUTE_HOME)
            },
            colors = ButtonDefaults.buttonColors(Color.Green),
            modifier = Modifier
                .wrapContentWidth()
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = "REGISTER HERE",
                modifier = Modifier.padding(5.dp)
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {
                    navController.navigate(ROUTE_LOGIN)
                },
                colors = ButtonDefaults.buttonColors(Color.Magenta)
            ) {
                Text(
                    text = "LOGIN HERE",
                    modifier = Modifier.padding(5.dp)
                )
            }

            Button(
                onClick = {
                    // Implement forgot password action
                },
                colors = ButtonDefaults.buttonColors(Color.Red)
            ) {
                Text(
                    text = "FORGOT PASSWORD",
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MindBendersTheme {
        Greeting("Alvin", rememberNavController())
    }
}
