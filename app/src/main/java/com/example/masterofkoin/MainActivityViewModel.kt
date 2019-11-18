package com.example.masterofkoin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.masterofkoin.repository.Repository

class MainActivityViewModel(val repository: Repository) : ViewModel() {

    val test = MutableLiveData<String>()
}
