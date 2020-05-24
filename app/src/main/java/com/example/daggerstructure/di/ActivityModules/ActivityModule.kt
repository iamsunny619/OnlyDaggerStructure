package com.example.daggerstructure.di.ActivityModules

import com.example.daggerstructure.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityModule {

    @ContributesAndroidInjector
    fun contributeSplashActivity(): SplashActivity

}