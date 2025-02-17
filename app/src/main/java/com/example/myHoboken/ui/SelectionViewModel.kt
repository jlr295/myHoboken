package com.example.myHoboken.ui


import android.provider.ContactsContract.Data
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.ViewModel
import com.example.myHoboken.R
import com.example.myHoboken.data.AppUiState
import com.example.myHoboken.data.DataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SelectionViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(
        AppUiState(
            categories = initializeCategories(),
            currentScreen = initializeStartScreen(),
            businessPhoto = initializePhoto()
        ))

    val uiState: StateFlow<AppUiState> = _uiState.asStateFlow()


    fun setCategoryName(category: String) {
        _uiState.update { currentState ->
            currentState.copy(
                categoryName = category,
                businesses = DataSource.businessMap.getValue(category)
            )
        }
    }

    fun setBusinessName(business: String) {
        _uiState.update { currentState ->
            currentState.copy(
                businessName = business,

                )
        }
    }

    fun setPhoto(business: Int){
        _uiState.update { currentState ->
            currentState.copy(
                businessPhoto = DataSource.PhotoMap.getValue(business)
            )
        }
    }

    fun setScreenName(screen: String) {
        _uiState.update { currentState ->
            currentState.copy(
                currentScreen = screen,

                )

        }
    }

    private fun initializeCategories(): List<Int> {
        return DataSource.categories.map{it}
        }

    private fun initializeStartScreen(): String {
        return "MyHoboken"
    }

    private fun initializePhoto(): Int {
        return R.drawable.pier_a_mumford_and_sons_concert_1024x678
    }

}




