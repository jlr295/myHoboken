package com.example.myHoboken

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.myHoboken.ui.BusinessDetailsScreen
import com.example.myHoboken.ui.BusinessScreen
import com.example.myHoboken.ui.SelectionViewModel
import com.example.myHoboken.ui.StartCategoryScreen

/**
 * Displays the top bar and navigation buttons
 */

// ENUM with categories
enum class MyHobokenScreen(@StringRes val title: Int) {
    Start(title = R.string.app_name),
    Businesses(title = R.string.businesses),
    BusinessDetails(title = R.string.business_details)
}


// App bar
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyHobokenAppBar(
    currentScreen: MyHobokenScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                stringResource(currentScreen.title),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
            )
                },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainer,
            titleContentColor = MaterialTheme.colorScheme.onSurface,
            navigationIconContentColor = MaterialTheme.colorScheme.onSurface
        ),
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Outlined.ArrowBack,
                        contentDescription = stringResource(R.string.back_button)
                    )
                }
            }
        }
    )

}

// Working app skeleton with navigation and App Bar
@Composable
fun MyHobokenApp(
    navController: NavHostController = rememberNavController(),
    viewModel: SelectionViewModel = viewModel(),

) {
    val backStackEntry by navController.currentBackStackEntryAsState()

   val currentScreen = MyHobokenScreen.valueOf(
       backStackEntry?.destination?.route ?: MyHobokenScreen.Start.name
    )

    Scaffold(
        topBar = {
            MyHobokenAppBar(
                currentScreen = currentScreen,
                canNavigateBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() }
            )
        },
        containerColor = MaterialTheme.colorScheme.surface

    ) { innerPadding ->
        val uiState by viewModel.uiState.collectAsState()

        NavHost(
            navController = navController,
            startDestination = MyHobokenScreen.Start.name,
            modifier = Modifier.padding(innerPadding)
        ) {

            // Starting Screen with category list.
            composable(MyHobokenScreen.Start.name){
                StartCategoryScreen(
                    onCategoryButtonClick = {
                        viewModel.setCategory(it)
                        viewModel.setScreenName(MyHobokenScreen.Businesses.name)
                        navController.navigate(MyHobokenScreen.Businesses.name)
                        },
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(dimensionResource(R.dimen.padding_small))
                )
            }

           /*
           * Routes to different business categories
           * */
            composable(route = MyHobokenScreen.Businesses.name)
            {
                BusinessScreen(
                    appUiState = uiState,
                    onBusinessSelection = {
                        viewModel.setBusiness(it)
                        viewModel.setScreenName(MyHobokenScreen.BusinessDetails.name)
                        navController.navigate(MyHobokenScreen.BusinessDetails.name)
                    },
                    modifier = Modifier
                        .fillMaxSize())
            }

            /*
           * Routes to different business details
           * */
            composable(route = MyHobokenScreen.BusinessDetails.name)
            {
                BusinessDetailsScreen(
                    appUiState = uiState,
                    modifier = Modifier
                        .fillMaxSize())
            }
        }
    }
}

