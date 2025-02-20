package com.example.myHoboken.data

import com.example.myHoboken.model.Business
import com.example.myHoboken.model.Category
import com.example.myHoboken.R

object DataSource {

    private val bars = listOf(
        Business(
            R.string.belo_bar, R.drawable.belobar,
            address = R.string.belo_add,
            description = 0
        ),
        Business(
            R.string.carpe_diem, R.drawable.carpediem,
            address = R.string.carpe_add,
            description = 0
        ),
        Business(
            R.string.dear_maud, R.drawable.dearmaud,
            address = R.string.maud_add,
            description = 0
        ),
        Business(
            R.string.pier_13, R.drawable.pier13,
            address = R.string.pier13_add,
            description = 0
        ),
        Business(
            R.string.string_ray, R.drawable.stingray,
            address = R.string.stingray_add,
            description = 0
        )
    )

    private val parks = listOf(
        Business(
            R.string.church_square_park, R.drawable.churchsquare,
            address = R.string.churchsq_add,
            description = 0
        ),
        Business(
            R.string.maxwell_park, R.drawable.maxwellpark,
            address = R.string.maxwell_add,
            description = 0
        ),
        Business(
            R.string.pier_a, R.drawable.piera,
            address = R.string.piera_add,
            description = 0
        ),
        Business(
            R.string.sinatra_park, R.drawable.sinatra,
            address = R.string.sinatra_add,
            description = 0
        ),
        Business(
            R.string.stevens_park, R.drawable.stevenspark,
            address = R.string.stevens_add,
            description = 0
        )
    )

    private val restaurants = listOf(
        Business(
            R.string.augustinos, R.drawable.augustinos,
            address = R.string.augustinos_add,
            description = 0
        ),
        Business(
            R.string.karma_kafe, R.drawable.karmakafe,
            address = R.string.bwe_add,
            description = 0
        ),
        Business(
            R.string.morelias, R.drawable.morelias,
            address = R.string.morelias_add,
            description = 0
        ),
        Business(
            R.string.panela, R.drawable.panela,
            address = R.string.panela,
            description = 0
        ),
        Business(
            R.string.tosti, R.drawable.tosti,
            address = R.string.tosti_add,
            description = 0
        )
    )

    private val cafes = listOf(
        Business(
            R.string.bwe, R.drawable.bwe,
            address = R.string.bwe_add,
            description = 0
        ),
        Business(
            R.string.mojo, R.drawable.mojo,
            address = R.string.mojo_add,
            description = 0
        ),
        Business(
            R.string.roost, R.drawable.roost,
            address = R.string.roost_add,
            description = 0
        ),
        Business(
            R.string.hive, R.drawable.hive,
            address = R.string.hive_add,
            description = 0
        ),
        Business(
            R.string.yukis, R.drawable.yukis,
            address = R.string.yukis_add,
            description = 0
        )
    )

    private val shopping = listOf(
        Business(
            R.string.athleta, R.drawable.athleta,
            address = R.string.athleta_add,
            description = 0
        ),
        Business(
            R.string.sephora, R.drawable.sephora,
            address = R.string.sephora_add,
            description = 0
        ),
        Business(
            R.string.madewell, R.drawable.madewell,
            address = R.string.madewell_add,
            description = 0
        ),
        Business(
            R.string.lululemon, R.drawable.lululemon,
            address = R.string.lulu_add,
            description = 0
        ),
        Business(
            R.string.thriftbox, R.drawable.thriftbox,
            address = R.string.thriftb_add,
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