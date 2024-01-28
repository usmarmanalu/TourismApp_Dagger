package com.dicoding.tourismapp.core.di

import com.dicoding.tourismapp.core.data.*
import com.dicoding.tourismapp.core.domain.repository.*
import dagger.Binds
import dagger.Module

@Module(includes = [NetworkModule::class, DatabaseModule::class])
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository
}