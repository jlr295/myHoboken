package com.example.myHoboken.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

            Text(
                text = stringResource(R.string.select_category),
                fontWeight = FontWeight.Bold,
                fontSize = 23.sp,
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
            )

            ScrollableButtons(
                catList = categories,
                onClick = onCategoryButtonClick,
                modifier = Modifier
                    .fillMaxSize()
         )

    }
}

@Composable
fun ScrollableButtons(catList: List<String>, onClick: (String) -> Unit, modifier: Modifier){
    LazyColumn(
        contentPadding = PaddingValues(dimensionResource(R.dimen.padding_small)),
        modifier = modifier
    ) {
        items(catList) { category ->
            ButtonCard(category, { onClick(category) })
        }
    }
}

@Composable
fun ButtonCard(obj: String, onClick: (String) -> Unit){
    Card (
        shape = RoundedCornerShape(15),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        ),
        onClick = { onClick(obj) },
        modifier = Modifier
            .fillMaxWidth()
            .height(125.dp)
            .padding(dimensionResource(R.dimen.padding_extrasmall))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Icon (
                painter = ,
                contentDescription = obj,
                modifier = Modifier
                    .padding(dimensionResource(R.dimen.padding_small))
            )

            Text(
                text = obj,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 25.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(horizontal = dimensionResource(R.dimen.padding_small))
            )
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