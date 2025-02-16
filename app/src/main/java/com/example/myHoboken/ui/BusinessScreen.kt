package com.example.myHoboken.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.myHoboken.data.AppUiState

@Composable
fun BusinessScreen(
    appUiState: AppUiState,
    onBusinessSelection: (String) -> Unit,
    modifier: Modifier = Modifier
){
    val resources = LocalContext.current.resources
    val businesses = appUiState.businesses.map { id -> resources.getString(id)}

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier,
    ) {
        businesses.forEach{ item ->
            FilledTonalButton(
                onClick = { onBusinessSelection(item)},
                modifier = Modifier
                    .width(500.dp)
                    .height(100.dp)
                    .padding(start = 12.dp, end = 12.dp, bottom = 8.dp)
            ) {
                Text(item)
            }
        }
    }
}

