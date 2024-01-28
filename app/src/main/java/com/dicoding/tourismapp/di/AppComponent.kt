package com.dicoding.tourismapp.di

import com.dicoding.tourismapp.core.di.*
import com.dicoding.tourismapp.detail.*
import com.dicoding.tourismapp.favorite.*
import com.dicoding.tourismapp.home.*
import dagger.Component


@AppScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [AppModule::class, ViewModelModule::class]
)

interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): AppComponent
    }

    fun inject(fragment: FavoriteFragment)
    fun inject(fragment: HomeFragment)
    fun inject(activity: DetailTourismActivity)
}