package com.example.masterofkoin

import android.app.Application
import com.example.masterofkoin.repository.Database
import com.example.masterofkoin.repository.NetWork
import com.example.masterofkoin.repository.Repository
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        val module = module {
            single { Database() }
            single { NetWork() }
            single { Repository(get(), get()) }
            viewModel { MainActivityViewModel(get()) }
            viewModel { MainFragmentViewModel(get()) }
            viewModel { (id: Int) -> SubFragmentViewModel(id, get()) }
            factory { (id: Int) -> Factory(id) }
        }
        startKoin {
            androidContext(this@App)
            modules(module)
        }
    }
}
