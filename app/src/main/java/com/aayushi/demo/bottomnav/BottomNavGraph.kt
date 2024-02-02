package com.aayushi.demo.bottomnav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aayushi.demo.screen.bottomNav.HomeScreen
import com.aayushi.demo.screen.bottomNav.ProfileScreen
import com.aayushi.demo.screen.bottomNav.ReportScreen


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
        composable(route = BottomBarScreen.Report.route)
        {
            ReportScreen()
        }
        composable(route = BottomBarScreen.Profile.route)
        {
            ProfileScreen()
        }
    }
}