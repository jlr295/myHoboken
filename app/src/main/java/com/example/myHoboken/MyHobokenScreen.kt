package com.example.myHoboken

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

/**
 * Displays the top bar and navigation buttons
 */

// ENUM with categories
enum class MyHobokenScreen(@StringRes val title: Int) {
    Start(title = R.string.app_name),
    Categories(title = R.string.categories),
    Details(title = R.string.detail_page)
}

// App bar
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyHobokenAppBar(
    currentScreen: MyHobokenScreen,
    //canNavigateBack: Boolean,
    //navigateUp: () -> Unit,
    //modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(
            text = stringResource(currentScreen.title),
            style = MaterialTheme.typography.headlineLarge
        ) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        )
    )

}

// Working app skeleton with navigation and App Bar
@Composable
fun MyHobokenApp(

){
    /*TODO: Continue with this*/
    val currentScreen = MyHobokenScreen.valueOf(MyHobokenScreen.Start.name)

    Scaffold(
        topBar = {
            MyHobokenAppBar(
                currentScreen = currentScreen
            )
        }
    ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            ) {
                Card(){
                    //Testing Content
                    Text(text = "TESTING")
                }

        }
    }

}