package com.dicoding.tourismapp.core.di

import android.content.*
import androidx.room.*
import com.dicoding.tourismapp.core.data.source.local.room.*
import dagger.*
import javax.inject.*

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun providesDatabase(context: Context): TourismDatabase = Room.databaseBuilder(
        context,
        TourismDatabase::class.java, "Tourism.db"
    ).fallbackToDestructiveMigration().build()

    @Provides
    fun provideTourismDao(database: TourismDatabase): TourismDao = database.tourismDao()
}