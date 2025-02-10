package com.example.myHoboken.ui


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.myHoboken.R

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
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth()
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ) {

            Image(
                painterResource(R.drawable.pier_a_mumford_and_sons_concert_1024x678),
                contentScale = ContentScale.Crop,
                contentDescription = null,
                modifier = Modifier
                    .width(350.dp)
                    .padding(20.dp)
            )
            Spacer(
                modifier = Modifier
                    .height(20.dp)
                    .fillMaxWidth()
            )

            Text(
                text = stringResource(R.string.select_category),
                Modifier
                    .align(Alignment.Start)
                    .padding(10.dp)
            )

            Spacer(
                modifier = Modifier
                    .height(10.dp)
                    .fillMaxWidth()
            )
        }
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        categories.forEach { item ->
            SelectCategoryButton(
                labelCategoryId = item,
                modifier = Modifier
                    .widthIn(300.dp)
            )
        }
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
        modifier = modifier
    ) {
        Text(stringResource(labelCategoryId))
    }

}