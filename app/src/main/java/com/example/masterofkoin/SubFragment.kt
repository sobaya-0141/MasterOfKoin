package com.example.masterofkoin

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class SubFragment : Fragment() {

    private val args by navArgs<SubFragmentArgs>()
    private val viewModel: SubFragmentViewModel by viewModel{ parametersOf(args.id) }
    private val activityViewModel by sharedViewModel<MainActivityViewModel>()
    private val factory: Factory by inject { parametersOf((args.id)) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.setMessage("TEST")
        viewModel.setMessage("TEST2")
        viewModel.setMessage("TEST3")
        viewModel.loadMessage()
        viewModel.loadMessage2()
        viewModel.loadMessage3()
        viewModel.setMessage("TEST4")
        viewModel.setMessage("TEST5")
    }
}
