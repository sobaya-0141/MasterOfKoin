package com.example.masterofkoin

import androidx.fragment.app.Fragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : Fragment() {

    private val viewModel by viewModel<MainFragmentViewModel>()
}
