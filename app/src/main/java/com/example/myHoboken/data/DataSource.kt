package com.example.myHoboken.data

import com.example.myHoboken.R

object DataSource {
    val categories = listOf(
        R.string.bars,
        R.string.parks,
        R.string.restaurants,
        R.string.cafes,
        R.string.shopping
    )


    val bars = listOf(
        R.string.belo_bar,
        R.string.carpe_diem,
        R.string.dear_maud,
        R.string.pier_13,
        R.string.string_ray
    )

    val parks = listOf(
        R.string.church_square_park,
        R.string.maxwell_park,
        R.string.pier_a,
        R.string.sinatra_park,
        R.string.stevens_park
    )

    val restaurants = listOf(
        R.string.augustinos,
        R.string.karma_kafe,
        R.string.morelias,
        R.string.panela,
        R.string.tosti
    )

    val cafes = listOf(
        R.string.bwe,
        R.string.mojo,
        R.string.roost,
        R.string.hive,
        R.string.yukis
    )

    val shopping = listOf(
        R.string.athleta,
        R.string.sephora,
        R.string.madewell,
        R.string.lululemon,
        R.string.thriftbox
    )

    val businessMap = mapOf(
        "Bars" to bars,
        "Parks" to parks,
        "Restaurants" to restaurants,
        "Cafes" to cafes,
        "Shopping" to shopping
    )

    val PhotoMap = mapOf(
        R.string.athleta to R.drawable.athleta,
        R.string.sephora to R.drawable.sephora,
        R.string.madewell to R.drawable.madewell,
        R.string.lululemon to R.drawable.lululemon,
        R.string.thriftbox to R.drawable.thriftbox,
        R.string.bwe to R.drawable.bwe,
        R.string.mojo to R.drawable.mojo,
        R.string.roost to R.drawable.roost,
        R.string.hive to R.drawable.hive,
        R.string.yukis to R.drawable.yukis,
        R.string.augustinos to R.drawable.augustinos,
        R.string.karma_kafe to R.drawable.karmakafe,
        R.string.morelias to R.drawable.morelias,
        R.string.panela to R.drawable.panela,
        R.string.tosti to R.drawable.tosti,
        R.string.church_square_park  to R.drawable.churchsquare,
        R.string.maxwell_park to R.drawable.maxwellpark,
        R.string.pier_a to R.drawable.piera,
        R.string.sinatra_park to R.drawable.sinatra,
        R.string.stevens_park to R.drawable.stevenspark,
        R.string.belo_bar to R.drawable.belobar,
        R.string.carpe_diem to R.drawable.carpediem,
        R.string.dear_maud to R.drawable.dearmaud,
        R.string.pier_13 to R.drawable.pier13,
        R.string.string_ray to R.drawable.stingray
    )

}