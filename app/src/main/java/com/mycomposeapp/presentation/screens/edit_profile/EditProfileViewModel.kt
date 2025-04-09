package com.mycomposeapp.presentation.screens.edit_profile

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class EditProfileViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(/*MyProfileUiState()*/"")
    val uiState: StateFlow</*MyProfileUiState*/String> = _uiState.asStateFlow()

    fun loadData() { /* Call API */
    }
}