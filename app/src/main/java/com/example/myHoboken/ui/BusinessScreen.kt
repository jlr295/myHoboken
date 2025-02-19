package com.example.myHoboken.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myHoboken.model.Business
import com.example.myHoboken.R
import com.example.myHoboken.data.AppUiState

@Composable
fun BusinessScreen(
    appUiState: AppUiState,
    onBusinessSelection: (Business) -> Unit,
    modifier: Modifier = Modifier
){
    var resources = LocalContext.current.resources

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier,
    ) {

        Text(
            text = stringResource(appUiState.category.name),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(dimensionResource(R.dimen.padding_medium))
        )

        appUiState.category.businesses.forEach { item ->
            FilledTonalButton(
                onClick = { onBusinessSelection(item) },
                modifier = Modifier
                    .width(500.dp)
                    .height(100.dp)
                    .padding(start = 12.dp, end = 12.dp, bottom = 8.dp)
            ) {
                Text(resources.getString(item.name))
            }
        }
    }
}


