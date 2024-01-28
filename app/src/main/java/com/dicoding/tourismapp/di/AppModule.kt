package com.dicoding.tourismapp.di

import com.dicoding.tourismapp.core.domain.usecase.*
import dagger.Binds
import dagger.Module


@Module
abstract class AppModule {

    @Binds
    abstract fun provideTourismUseCase(tourismInteractor: TourismInteractor): TourismUseCase
}