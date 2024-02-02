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

    // for ENGvsIND
    object ENGvsIND: BottomBarScreen(
        route = "ENGvsIND",
        title = "ENGvsIND",
        icon = R.drawable.baseline_sports_score_24,
        icon_focused = R.drawable.baseline_sports_score_24
    )

    // fro matches
    object Matches: BottomBarScreen(
        route = "Matches",
        title = "Matches",
        icon = R.drawable.baseline_sports_cricket_24,
        icon_focused = R.drawable.baseline_sports_cricket_24
    )

    //for Fixtures
    object Fixtures: BottomBarScreen(
        route = "Fixtures",
        title = "Fixtures",
        icon = R.drawable.baseline_calendar_month_24,
        icon_focused = R.drawable.baseline_calendar_month_24
    )

    // for report
    object Profile: BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = R.drawable.baseline_person_24,
        icon_focused = R.drawable.baseline_person_24
    )

}