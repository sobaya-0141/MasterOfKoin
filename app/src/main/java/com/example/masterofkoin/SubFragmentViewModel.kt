package com.example.masterofkoin

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.masterofkoin.repository.Repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class SubFragmentViewModel(val id: Int, val repository: Repository) : ViewModel() {
    val _message = MutableStateFlow<String?>(null)
    val message: StateFlow<String?> get() = _message
    val flowMessage: Flow<String?> get() = _message

    fun setMessage(message: String?) {
        _message.value = message
    }

    fun loadMessage() {
        Log.d("AAAAAAAAAAAAAA", message.value)
    }

    fun loadMessage2() {
        viewModelScope.launch {
            message.collect {
                Log.d("BBBBBBBBBBBBBBB", it)
            }
        }
    }

    fun loadMessage3() {
        viewModelScope.launch {
            flowMessage.collect {
                Log.d("CCCCCCCCCCCCCCCC", it)
            }
        }
    }
}
