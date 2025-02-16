package com.example.myHoboken.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myHoboken.R
import com.example.myHoboken.data.AppUiState
import com.example.myHoboken.ui.theme.MyHobokenTheme

/**
 * Displays cover photo and list of business categories
 */

@Composable
fun StartCategoryScreen(
    appUiState: AppUiState,
    onCategoryButtonClick:(String) -> Unit,
    modifier: Modifier = Modifier
) {
    val resources = LocalContext.current.resources

    val categories = appUiState.categories.map { id -> resources.getString(id)}

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painterResource(R.drawable.pier_a_mumford_and_sons_concert_1024x678),
            contentScale = ContentScale.Crop,
            contentDescription = null,
            modifier = Modifier
                .width(350.dp)
                .height(380.dp)
                .clip(RoundedCornerShape(10))
        )

        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_medium))
        ) {
            Row(
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier.fillMaxWidth()
            ){
                Text(
                    text = stringResource(R.string.select_category),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(15.dp)
                )
            }
            categories.forEach { item ->
                Button(
                    onClick =  { onCategoryButtonClick(item) },
                    shape = RoundedCornerShape(40),
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Text(item)
                }
            }
        }
    }
}



@Preview(showSystemUi = true)
@Composable
fun StartPreview() {
    MyHobokenTheme(darkTheme = false, dynamicColor = false) {
        StartCategoryScreen(
            appUiState = AppUiState(),
            onCategoryButtonClick = { },
            modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(R.dimen.padding_small))
        )
    }
}