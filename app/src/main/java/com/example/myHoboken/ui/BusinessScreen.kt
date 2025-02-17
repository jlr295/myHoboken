package com.example.myHoboken.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myHoboken.R
import com.example.myHoboken.data.AppUiState
import com.example.myHoboken.data.DataSource
import com.example.myHoboken.ui.theme.MyHobokenTheme

@Composable
fun BusinessScreen(
    appUiState: AppUiState,
    onBusinessSelection: (Int) -> Unit,
    modifier: Modifier = Modifier
){
    val resources = LocalContext.current.resources
    //val businesses = appUiState.businesses.map { id -> resources.getString(id) }

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier,
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_medium))
        ) {
            Text(
                text = appUiState.categoryName,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(
                    dimensionResource(R.dimen.padding_medium)
                )
            )
        }
        appUiState.businesses.forEach(){ item ->
            FilledTonalButton(
                onClick = { onBusinessSelection(item) },
                modifier = Modifier
                    .width(500.dp)
                    .height(100.dp)
                    .padding(start = 12.dp, end = 12.dp, bottom = 8.dp)
            ) {
                Text(resources.getString(item))
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun StartBusinessPreview() {
    MyHobokenTheme(darkTheme = false, dynamicColor = false) {
        val resources = LocalContext.current.resources
        BusinessScreen(
            appUiState = AppUiState(
                categories = DataSource.categories,
                categoryName = "Cafes",
                currentScreen = "Businesses",
                businesses = DataSource.cafes
            ),
            onBusinessSelection = { },
            modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(R.dimen.padding_small))
        )
    }
}