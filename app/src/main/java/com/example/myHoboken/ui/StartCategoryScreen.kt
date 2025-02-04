package com.example.myHoboken.ui


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.ui.res.stringResource

/**
 * Displays cover photo and list of business categories
 */
@Composable
fun StartCategoryScreen(
    categories: List<Int>,
    onNextButtonClicked: (Int) -> Unit = {},
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        categories.forEach { item ->
            SelectCategoryButton(
                labelCategoryId = item
            )
        }
    }
}

@Composable
fun SelectCategoryButton(
    labelCategoryId: Int,
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
){
    Button(
        onClick = onClick,
        modifier = modifier.widthIn(250.dp)
    ) {
        Text(stringResource(labelCategoryId))
    }

}