package com.aayushi.demo.bottomnav

import com.aayushi.demo.R


sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int,
    val icon_focused: Int
) {

    // for home
    object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon = R.drawable.baseline_home_24,
        icon_focused = R.drawable.baseline_home_24
    )

    // for report
    object Report: BottomBarScreen(
        route = "report",
        title = "Report",
        icon = R.drawable.baseline_sports_score_24,
        icon_focused = R.drawable.baseline_sports_score_24
    )

    // for report
    object Profile: BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = R.drawable.baseline_person_24,
        icon_focused = R.drawable.baseline_person_24
    )

}