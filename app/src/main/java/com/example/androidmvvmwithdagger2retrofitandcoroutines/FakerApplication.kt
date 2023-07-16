package com.example.androidmvvmwithdagger2retrofitandcoroutines

import android.app.Application
import com.example.androidmvvmwithdagger2retrofitandcoroutines.di.ApplicationComponent
import com.example.androidmvvmwithdagger2retrofitandcoroutines.di.DaggerApplicationComponent

class FakerApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}