package com.example.masterofkoin.repository

import org.koin.core.KoinComponent
import org.koin.core.inject

class NetWork : KoinComponent {
    val database: Database by inject()
}
