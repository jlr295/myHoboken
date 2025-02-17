package com.example.myHoboken.data

/**
 * Breadcrumbs of current session.
 */

data class AppUiState(

    // Current Screen
    val currentScreen: String = "",

    // Selected Category
    val categoryName: String = "",

    // Selected Business
    val businessName: String = "",

    // Business Photo
    val businessPhoto: Int = 0,

    // Business Description
    val businessDescription: String = "We are testing this guy to see what we can say",

    // Categories
    //TO DO map function not necessary?
    val categories: List<Int> = listOf(),

    // Businesses
    val businesses: List<Int> = listOf(),



)
