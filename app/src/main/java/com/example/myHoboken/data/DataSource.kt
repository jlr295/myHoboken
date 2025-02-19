package com.example.myHoboken.data

import com.example.myHoboken.model.Business
import com.example.myHoboken.model.Category
import com.example.myHoboken.R

object DataSource {

    private val bars = listOf(
        Business(
            R.string.belo_bar, R.drawable.belobar,
            address = 0,
            description = 0
        ),
        Business(
            R.string.carpe_diem, R.drawable.carpediem,
            address = 0,
            description = 0
        ),
        Business(
            R.string.dear_maud, R.drawable.dearmaud,
            address = 0,
            description = 0
        ),
        Business(
            R.string.pier_13, R.drawable.pier13,
            address = 0,
            description = 0
        ),
        Business(
            R.string.string_ray, R.drawable.stingray,
            address = 0,
            description = 0
        )
    )

    private val parks = listOf(
        Business(
            R.string.church_square_park, R.drawable.churchsquare,
            address = 0,
            description = 0
        ),
        Business(
            R.string.maxwell_park, R.drawable.maxwellpark,
            address = 0,
            description = 0
        ),
        Business(
            R.string.pier_a, R.drawable.piera,
            address = 0,
            description = 0
        ),
        Business(
            R.string.sinatra_park, R.drawable.sinatra,
            address = 0,
            description = 0
        ),
        Business(
            R.string.stevens_park, R.drawable.stevenspark,
            address = 0,
            description = 0
        )
    )

    private val restaurants = listOf(
        Business(
            R.string.augustinos, R.drawable.augustinos,
            address = 0,
            description = 0
        ),
        Business(
            R.string.karma_kafe, R.drawable.karmakafe,
            address = 0,
            description = 0
        ),
        Business(
            R.string.morelias, R.drawable.morelias,
            address = 0,
            description = 0
        ),
        Business(
            R.string.panela, R.drawable.panela,
            address = 0,
            description = 0
        ),
        Business(
            R.string.tosti, R.drawable.tosti,
            address = 0,
            description = 0
        )
    )

    private val cafes = listOf(
        Business(
            R.string.bwe, R.drawable.bwe,
            address = 0,
            description = 0
        ),
        Business(
            R.string.mojo, R.drawable.mojo,
            address = 0,
            description = 0
        ),
        Business(
            R.string.roost, R.drawable.roost,
            address = 0,
            description = 0
        ),
        Business(
            R.string.hive, R.drawable.hive,
            address = 0,
            description = 0
        ),
        Business(
            R.string.yukis, R.drawable.yukis,
            address = 0,
            description = 0
        )
    )

    private val shopping = listOf(
        Business(
            R.string.athleta, R.drawable.athleta,
            address = 0,
            description = 0
        ),
        Business(
            R.string.sephora, R.drawable.sephora,
            address = 0,
            description = 0
        ),
        Business(
            R.string.madewell, R.drawable.madewell,
            address = 0,
            description = 0
        ),
        Business(
            R.string.lululemon, R.drawable.lululemon,
            address = 0,
            description = 0
        ),
        Business(
            R.string.thriftbox, R.drawable.thriftbox,
            address = 0,
            description = 0
        )
    )

    val categories = listOf(
        Category(R.string.bars, R.drawable.bars, bars),
        Category(R.string.parks, R.drawable.parks, parks),
        Category(R.string.restaurants, R.drawable.restaurants, restaurants),
        Category(R.string.cafes, R.drawable.cafes, cafes),
        Category(R.string.shopping, R.drawable.shopping, shopping)
    )



}