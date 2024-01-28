package com.dicoding.tourismapp.core.di

import com.dicoding.tourismapp.core.data.*
import com.dicoding.tourismapp.core.domain.repository.*
import dagger.*
import dagger.hilt.*
import dagger.hilt.components.*

@Module(includes = [NetworkModule::class, DatabaseModule::class])
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(tourismRepository: TourismRepository): ITourismRepository
}