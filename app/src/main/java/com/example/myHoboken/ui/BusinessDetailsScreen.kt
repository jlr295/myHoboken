package com.example.myHoboken.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myHoboken.R
import com.example.myHoboken.data.AppUiState

@Composable
fun BusinessDetailsScreen(
    appUiState: AppUiState,
    modifier: Modifier = Modifier
){
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier,
    ) {
        Text(
            text = stringResource(appUiState.business.name),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = stringResource(appUiState.business.address)
        )
        Image(
            painter = painterResource(appUiState.business.photo),
            alignment = Alignment.TopStart,
            contentScale = ContentScale.FillBounds,
            contentDescription = null,
            modifier = Modifier
                .width(350.dp)
                .height(400.dp)
                .clip(RoundedCornerShape(10))
        )



    }

}
