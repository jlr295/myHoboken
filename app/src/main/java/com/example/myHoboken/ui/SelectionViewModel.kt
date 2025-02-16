package com.example.myHoboken.ui


import androidx.lifecycle.ViewModel
import com.example.myHoboken.data.AppUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SelectionViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(AppUiState())
    val uiState: StateFlow<AppUiState> = _uiState.asStateFlow()

    fun setCategoryName(category: String) {
        _uiState.update { currentState ->
            currentState.copy(
                categoryName = category
            )
        }
    }


    fun setBusiness(business: Int) {
        _uiState.update { currentState ->
            currentState.copy(
                businessID = business
            )
        }
    }


}