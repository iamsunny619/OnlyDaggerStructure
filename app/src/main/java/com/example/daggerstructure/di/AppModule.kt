package com.example.daggerstructure.di

import android.app.Application
import com.example.daggerstructure.BaseApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideApplication(app: BaseApp): Application = app

}