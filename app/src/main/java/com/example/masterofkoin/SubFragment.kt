package com.example.masterofkoin

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class SubFragment : Fragment() {

    private val args by navArgs<SubFragmentArgs>()
    private val viewModel: SubFragmentViewModel by viewModel{ parametersOf(args.id) }
}
