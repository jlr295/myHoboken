package com.example.myHoboken.data

import com.example.myHoboken.model.Business
import com.example.myHoboken.model.Category

/**
 * Breadcrumbs of current session.
 */

data class AppUiState(

    // Current Screen
    val currentScreen: String = "",

    // Selected Category
    val category: Category = Category(0, 0, listOf()),

    // Selected Business
    val business: Business = Business(0, 0, 0, 0),


    )
