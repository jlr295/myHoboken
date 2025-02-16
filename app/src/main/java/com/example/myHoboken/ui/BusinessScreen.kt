package com.example.myHoboken.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BusinessScreen(
    categories: List<Int>,
    onNextButtonClicked: (Int) -> Unit = {},
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier,
    ) {
        categories.forEach{ item ->
            SelectBarButton(
                labelCategoryId = item,
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
                    .weight(1f)
            )
        }
    }
}

@Composable
fun SelectBarButton(
    labelCategoryId: Int,
    onClick: () -> Unit = {},
    modifier: Modifier = Modifier
){
    ElevatedButton(
        onClick = onClick,
        shape = RoundedCornerShape(15),
        colors = ButtonColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainerHigh,
            contentColor = Color.Black,
            disabledContentColor = Color.Black,
            disabledContainerColor = MaterialTheme.colorScheme.onSecondary,
        ),
        border = BorderStroke(1.dp, Color.Gray),
        modifier = modifier
    ) {
        Text(
            text = stringResource(labelCategoryId),
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}