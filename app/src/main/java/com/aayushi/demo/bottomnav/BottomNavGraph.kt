package com.aayushi.demo.bottomnav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aayushi.demo.screen.bottomNav.*


@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route)
        {
            HomeScreen()
        }

        composable(route = BottomBarScreen.ENGvsIND.route)
        {
            ENGvsIND()
        }

        composable(route = BottomBarScreen.Matches.route)
        {
            Matches()
        }

        composable(route = BottomBarScreen.Fixtures.route)
        {
            Fixtures()
        }

        composable(route = BottomBarScreen.Profile.route)
        {
            ProfileScreen()
        }
    }
}