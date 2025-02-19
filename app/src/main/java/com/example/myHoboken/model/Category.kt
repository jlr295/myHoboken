package com.example.myHoboken.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Category (
    @StringRes val name: Int,
    @DrawableRes val icon: Int,
    val businesses: List<Business>
)