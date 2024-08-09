package com.example.mindbenders.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.mindbenders.R
import com.example.mindbenders.navigation.ROUTE_ABOUT

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Box {
        Image(
            painter = painterResource(id = R.drawable.dashboard),
            contentDescription = "Image",
            contentScale = ContentScale.FillBounds
        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBar(
            title = { Text(text = "Mind Benders") },
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = "home",
                        tint = Color.DarkGray
                    )
                }
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Gray,
                titleContentColor = Color.DarkGray,
                navigationIconContentColor = Color.LightGray
            ),
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Person, contentDescription = "person")

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Search, contentDescription = "search")

                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Menu, contentDescription = "menu")

                }
            }

        )
        Row(modifier = Modifier.wrapContentWidth())
        {
            Card(modifier = Modifier.padding(15.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            )
            {
                Box(modifier = Modifier.height(100.dp))
                {
                    Image(
                        painter = painterResource(id = R.drawable.music),
                        contentDescription = "Image",

                        )
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(15.dp),
                        contentAlignment = Alignment.Center){
                        Text(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp

                            , fontStyle = FontStyle.Normal
                            , color = Color.Black
                            , text = "SAVINGS ACCOUNT")

                    }

                }







            }
            Card(modifier = Modifier.padding(15.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            )
            {
                Box(modifier = Modifier.height(100.dp))
                {
                    Image(
                        painter = painterResource(id = R.drawable.music),
                        contentDescription = "Image",

                        )
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(15.dp),
                        contentAlignment = Alignment.Center){
                        Text(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp

                            , fontStyle = FontStyle.Normal
                            , color = Color.Black
                            , text = "DEPOSIT MONEY" +
                                    "")

                    }

                }








            }

        }

        Row(modifier = Modifier.wrapContentWidth()) {
            Card(modifier = Modifier.padding(15.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            )
            {
                Box(modifier = Modifier.height(100.dp))
                {
                    Image(
                        painter = painterResource(id = R.drawable.music),
                        contentDescription = "Image",

                        )
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(15.dp),
                        contentAlignment = Alignment.Center){
                        Text(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp

                            , fontStyle = FontStyle.Normal
                            , color = Color.Black
                            , text = "LIVE SESSIONS")

                    }

                }








            }
            Card(
                onClick = {
                    navController.navigate(ROUTE_ABOUT)

                },
                modifier = Modifier.padding(15.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            )
            {
                Box(

                    modifier = Modifier.height(100.dp))
                {
                    Image(
                        painter = painterResource(id = R.drawable.music),
                        contentDescription = "Image",

                        )
                    Box(

                        modifier = Modifier
                        .matchParentSize()
                        .padding(10.dp),
                        contentAlignment = Alignment.Center){
                        Text(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp

                            , fontStyle = FontStyle.Normal
                            , color = Color.Black
                            , text = "ABOUT COMPANY")

                    }

                }








            }

        }
        Row(modifier = Modifier.wrapContentWidth())
        {
            Card(modifier = Modifier.padding(15.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            )
            {
                Box(modifier = Modifier.height(100.dp))
                {
                    Image(
                        painter = painterResource(id = R.drawable.music),
                        contentDescription = "Image",

                        )
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(15.dp),
                        contentAlignment = Alignment.Center){
                        Text(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp

                            , fontStyle = FontStyle.Normal
                            , color = Color.Black
                            , text ="ADD NEW CLIENTS")

                    }

                }







            }
            Card(modifier = Modifier.padding(15.dp),
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp)
            )
            {
                Box(modifier = Modifier.height(100.dp))
                {
                    Image(
                        painter = painterResource(id = R.drawable.music),
                        contentDescription = "Image",

                        )
                    Box(modifier = Modifier
                        .matchParentSize()
                        .padding(15.dp),
                        contentAlignment = Alignment.Center){
                        Text(fontWeight = FontWeight.Bold,
                            fontSize = 20.sp

                            , fontStyle = FontStyle.Normal
                            , color = Color.Black
                            , text = "VIEW ALL CLIENTS")

                    }

                }








            }

        }

    }

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}


