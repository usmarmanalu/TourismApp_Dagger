package com.dicoding.tourismapp

import android.app.*
import com.dicoding.tourismapp.core.di.*
import com.dicoding.tourismapp.di.*

open class MyApplication : Application() {

    private val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.factory().create(applicationContext)
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(coreComponent)
    }
}