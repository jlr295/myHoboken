package com.example.myHoboken.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myHoboken.R
import com.example.myHoboken.data.DataSource
import com.example.myHoboken.model.Category
import com.example.myHoboken.ui.components.ScrollableButtonCategories

/**
 * Displays cover photo and list of business categories
 */

@Composable
fun StartCategoryScreen(
    onCategoryButtonClick:(Category) -> Unit,
    modifier: Modifier = Modifier
) {

    val categories = DataSource.categories

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

            Text(
                text = stringResource(R.string.select_category),
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
            )

            ScrollableButtonCategories(
                catList = categories,
                onClick = onCategoryButtonClick,
                modifier = Modifier
                    .fillMaxSize()
         )

    }
}





