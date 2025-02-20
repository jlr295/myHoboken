package com.example.myHoboken.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import com.example.myHoboken.data.AppUiState
import com.example.myHoboken.model.Business
import com.example.myHoboken.ui.components.ScrollableButtonBusinesses

@Composable
fun BusinessScreen(
    appUiState: AppUiState,
    onBusinessSelection: (Business) -> Unit,
    modifier: Modifier = Modifier
){

    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {

        Text(
            text = stringResource(appUiState.category.name),
            overflow = TextOverflow.Ellipsis,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
        )


        ScrollableButtonBusinesses(
            busList = appUiState.category.businesses,
            onClick = onBusinessSelection,
            modifier = Modifier
                .fillMaxSize()
        )


    }
}


