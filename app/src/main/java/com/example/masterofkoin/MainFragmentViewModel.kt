package com.example.masterofkoin

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.example.masterofkoin.repository.Repository

class MainFragmentViewModel(val repository: Repository) : ViewModel() {

    fun onClick(view: View) {
        val action = MainFragmentDirections.actionMainFragmentToSubFragment(10)
        view.findNavController().navigate(action)
    }
}
