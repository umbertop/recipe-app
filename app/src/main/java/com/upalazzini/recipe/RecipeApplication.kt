package com.upalazzini.recipe

import android.app.Application
import timber.log.Timber

class RecipeApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
    }
}