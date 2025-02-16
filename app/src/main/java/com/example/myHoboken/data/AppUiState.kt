package com.example.myHoboken.data

import android.provider.ContactsContract.Data
import androidx.navigation.NavBackStackEntry

/**
 * Breadcrumbs of current session.
 */

data class AppUiState(

    // Selected Category
    val categoryName: String = "",

    // Selected Business
    val businessName: String = "",

    // Categories
    //TO DO map function not necessary?
    val categories: List<Int> = listOf(),

    // Businesses
    val businesses: List<Int> = listOf(),



)
