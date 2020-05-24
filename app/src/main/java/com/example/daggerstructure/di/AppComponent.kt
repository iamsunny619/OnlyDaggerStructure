package com.example.daggerstructure.di

import com.example.daggerstructure.BaseApp
import com.example.daggerstructure.di.ActivityModules.ActivityModule
import com.example.daggerstructure.di.ViewModleModules.ViewModelModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent : AndroidInjector<BaseApp> {

    @Component.Factory
    interface Factory : AndroidInjector.Factory<BaseApp>
}

