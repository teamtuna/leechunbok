package dev.tuna.leechunbok

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SplashViewModel: ViewModel() {

    private val _splashLoadingState = MutableStateFlow(true)
    val splashLoadingState = _splashLoadingState.asStateFlow()

    init {
        viewModelScope.launch {
            delay(2000)
            _splashLoadingState.value = false
        }
    }
}