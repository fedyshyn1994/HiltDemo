package com.fedyshyn.hilt.demo

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel

class MainViewModel @ViewModelInject constructor(
    private val analyticsAdapter: AnalyticsAdapter
) : ViewModel() {

    fun print() {
        analyticsAdapter.logEvent("print")
    }
}