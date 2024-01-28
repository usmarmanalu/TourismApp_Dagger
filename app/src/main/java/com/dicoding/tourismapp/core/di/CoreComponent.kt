package com.dicoding.tourismapp.core.di

import android.content.*
import com.dicoding.tourismapp.core.domain.repository.*
import dagger.*
import javax.inject.*


@Singleton
@Component(modules = [RepositoryModule::class])

interface CoreComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): CoreComponent
    }

    fun provideRepository(): ITourismRepository
}