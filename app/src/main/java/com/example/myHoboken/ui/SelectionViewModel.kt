package com.example.myHoboken.ui


import androidx.lifecycle.ViewModel
import com.example.myHoboken.model.Business
import com.example.myHoboken.model.Category
import com.example.myHoboken.data.AppUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SelectionViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(
        AppUiState(currentScreen= initializeStartScreen())
    )

    val uiState: StateFlow<AppUiState> = _uiState.asStateFlow()


    fun setCategory(category: Category) {
        _uiState.update { currentState ->
            currentState.copy(
                category = category
            )
        }
    }

    fun setBusiness(business: Business) {
        _uiState.update { currentState ->
            currentState.copy(
                business = business
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

    private fun initializeStartScreen(): String {
        return "MyHoboken"
    }


}




