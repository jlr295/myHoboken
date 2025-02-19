package com.example.myHoboken.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myHoboken.model.Category
import com.example.myHoboken.R
import com.example.myHoboken.data.DataSource
import com.example.myHoboken.ui.theme.MyHobokenTheme

/**
 * Displays cover photo and list of business categories
 */

@Composable
fun StartCategoryScreen(
    onCategoryButtonClick:(Category) -> Unit,
    modifier: Modifier = Modifier
) {

    val categories = DataSource.categories

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

            Text(
                text = stringResource(R.string.select_category),
                fontSize = 20.sp,
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
fun ScrollableButtons(catList: List<Category>, onClick: (Category) -> Unit, modifier: Modifier){
    LazyColumn(
        contentPadding = PaddingValues(dimensionResource(R.dimen.padding_small)),
        modifier = modifier
    ) {
        items(catList) { category ->
            ButtonCard(category) { onClick(category) }
        }
    }
}

@Composable
fun ButtonCard(obj: Category, onClick: (Category) -> Unit ) {
    ElevatedCard (
        shape = RoundedCornerShape(15),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceColorAtElevation(10.dp)
        ),
        onClick = { onClick(obj) },
        modifier = Modifier
            .fillMaxWidth()
            .height(125.dp)
            .padding(dimensionResource(R.dimen.padding_extrasmall))
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Icon (
                painter = painterResource(obj.icon) ,
                contentDescription = stringResource(obj.name),
                modifier = Modifier
                    .padding(dimensionResource(R.dimen.padding_small))
                    .size(50.dp)
            )

            Text(
                text = stringResource(obj.name),
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(horizontal = dimensionResource(R.dimen.padding_small))
            )
        }
    }
}

