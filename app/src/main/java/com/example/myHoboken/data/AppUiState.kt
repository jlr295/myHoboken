package com.example.myHoboken.data

import android.provider.ContactsContract.Data
import androidx.navigation.NavBackStackEntry

/**
 * Breadcrumbs of current session.
 */


data class AppUiState(

    // Selected Category
    val categoryID: Int = 0,

    val categoryName: String = "",

    // Selected Business
    val businessID: Int = 0,

    val categories: List<Int> = DataSource.categories.map{it},

    val businessOptions: List<String> = listOf()

)
