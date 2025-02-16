package com.example.myHoboken

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.myHoboken.data.DataSource
import com.example.myHoboken.ui.BusinessScreen
import com.example.myHoboken.ui.SelectionViewModel
import com.example.myHoboken.ui.StartCategoryScreen

/**
 * Displays the top bar and navigation buttons
 */

// ENUM with categories
enum class MyHobokenScreen(@StringRes val title: Int) {
    Start(title = R.string.app_name),
    Bars(title = R.string.bars),
    Restaurants(title = R.string.restaurants),
    Cafes(title = R.string.cafes),
    Parks(title = R.string.parks),
    Shopping(title = R.string.shopping)
}

// ENUM with categories
enum class MyHobokenBusinesses(@StringRes val title: Int) {
    // BARS
    BeloBar(title = R.string.belo_bar),
    CarpeDiem(title = R.string.carpe_diem),
    DearMaud(title = R.string.dear_maud),
    Pier13(title = R.string.pier_13),
    StingRay(title = R.string.string_ray),

    // PARKS
    ChurchSq(title = R.string.church_square_park),
    MaxWell(title = R.string.maxwell_park),
    PierA(title = R.string.pier_a),
    Sinat(title = R.string.sinatra_park),
    Stevens(title = R.string.stevens_park),

    // SHOPPING
    Athleta(title = R.string.athleta),
    Sephora(title = R.string.sephora),
    MadeWell(title = R.string.madewell),
    LuluLemon(title =R.string.lululemon),
    ThriftBox(title = R.string.thriftbox),

    // COFFEE
    Bwe(title = R.string.bwe),
    Mojo(title = R.string.mojo),
    Roost(title = R.string.roost),
    Hive(title = R.string.hive),
    Yukis(title = R.string.yukis),

    // Restuarants
    Augstinos(title = R.string.augustinos),
    Karma(title = R.string.karma_kafe),
    Morelias(title = R.string.morelias),
    Panela(title = R.string.panela),
    Tosti(title = R.string.tosti)
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
    TopAppBar(
        title = { Text(stringResource(currentScreen.title)) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
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
        }

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
                    appUiState = uiState,
                    onCategoryButtonClick = {
                        viewModel.setCategoryName(it)
                        navController.navigate(it)
                        },
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(dimensionResource(R.dimen.padding_small)) // ADD padding
                )
            }

           /*
           * Routes to different business categories
           * */
            composable(route = MyHobokenScreen.Bars.name){
                BusinessScreen(
                    appUiState = uiState,
                    onBusinessSelection = {
                        viewModel.setBusinessName(it)
                        navController.navigate(it)
                    },
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            composable(route = MyHobokenScreen.Restaurants.name){
                BusinessScreen(
                    appUiState = uiState,
                    onBusinessSelection = {
                        viewModel.setBusinessName(it)
                        navController.navigate(it)
                    },
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            composable(route = MyHobokenScreen.Cafes.name){
                BusinessScreen(
                    appUiState = uiState,
                    onBusinessSelection = {
                        viewModel.setBusinessName(it)
                        navController.navigate(it)
                    },
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            composable(route = MyHobokenScreen.Shopping.name){
                BusinessScreen(
                    appUiState = uiState,
                    onBusinessSelection = {
                        viewModel.setBusinessName(it)
                        navController.navigate(it)
                    },
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            composable(route = MyHobokenScreen.Parks.name){
                BusinessScreen(
                    appUiState = uiState,
                    onBusinessSelection = {
                        viewModel.setBusinessName(it)
                        navController.navigate(it)
                    },
                    modifier = Modifier
                        .fillMaxSize()
                )
            }

        }
    }
}

