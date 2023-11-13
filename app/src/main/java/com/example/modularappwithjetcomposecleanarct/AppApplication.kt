package com.example.modularappwithjetcomposecleanarct

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class AppApplication: Application() {

    companion object{
        const val TAG="AppApplication"
    }

    override fun onCreate() {
        super.onCreate()
    }
}