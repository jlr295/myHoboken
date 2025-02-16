package com.example.myHoboken.ui


import androidx.lifecycle.ViewModel
import com.example.myHoboken.data.AppUiState
import com.example.myHoboken.data.DataSource
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SelectionViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(AppUiState(categories = initializeCategories()))
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

    private fun initializeCategories(): List<Int> {
        return DataSource.categories.map{it}
        }
    }

