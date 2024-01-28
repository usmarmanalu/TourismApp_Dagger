package com.dicoding.tourismapp.core.di

import android.content.*
import androidx.room.*
import com.dicoding.tourismapp.core.data.source.local.room.*
import dagger.*
import dagger.hilt.*
import dagger.hilt.android.qualifiers.*
import dagger.hilt.components.*
import javax.inject.*

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides
    fun providesDatabase(@ApplicationContext context: Context): TourismDatabase =
        Room.databaseBuilder(
            context,
            TourismDatabase::class.java, "Tourism.db"
        ).fallbackToDestructiveMigration().build()

    @Provides
    fun provideTourismDao(database: TourismDatabase): TourismDao = database.tourismDao()
}