package com.example.androidmvvmwithdagger2retrofitandcoroutines.di

import android.content.Context
import androidx.room.Room
import com.example.androidmvvmwithdagger2retrofitandcoroutines.db.FakerDB
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideFakerDB(context: Context): FakerDB {
        return Room.databaseBuilder(context, FakerDB::class.java, "FakerDB").build()
    }
}