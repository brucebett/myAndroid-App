package com.example.mindbenders.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mindbenders.ui.theme.screens.clients.AddClient
import com.example.mindbenders.ui.theme.screens.home.HomeScreen
import com.example.mindbenders.ui.theme.screens.login.Login
import com.example.mindbenders.ui.theme.screens.register.Greeting

@Composable
fun AppNavHost(navController:NavHostController= rememberNavController(),
               startDestination: String = ROUTE_ADD_CLIENT){
              NavHost(navController=navController,
                  startDestination=startDestination){
                  composable(ROUTE_REGISTER){ Greeting("Alvin",navController)}
                  composable(ROUTE_HOME){ HomeScreen(navController) }
                  composable(ROUTE_LOGIN){ Login(navController)}
                  composable(ROUTE_ADD_CLIENT){ AddClient(navController)}

              }


}

