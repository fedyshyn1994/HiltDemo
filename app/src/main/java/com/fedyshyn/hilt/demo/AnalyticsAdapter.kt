package com.fedyshyn.hilt.demo

import android.util.Log
import javax.inject.Inject

class AnalyticsAdapter @Inject constructor() {

    fun logEvent(event: String) {
        Log.d("test_test", event)
    }
}