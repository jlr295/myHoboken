package com.example.myHoboken

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.myHoboken.ui.StartCategoryScreen
import com.example.myHoboken.data.DataSource

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
            style = MaterialTheme.typography.headlineLarge,
             modifier = Modifier.fillMaxWidth()
        ) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
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
            ) },
        containerColor = MaterialTheme.colorScheme.surface
    ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            ) {
                StartCategoryScreen(
                    categories = DataSource.categories,
                    modifier = Modifier
                        .fillMaxWidth()
                )
        }
    }

}