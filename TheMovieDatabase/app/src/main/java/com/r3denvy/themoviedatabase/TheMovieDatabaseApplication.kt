package com.r3denvy.themoviedatabase

import android.app.Application
import timber.log.Timber

class TheMovieDatabaseApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}