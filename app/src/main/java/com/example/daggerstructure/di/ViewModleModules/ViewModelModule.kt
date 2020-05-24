package com.example.daggerstructure.di.ViewModleModules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.daggerstructure.di.ViewModelFactory
import com.example.daggerstructure.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

   /* @Binds
    @IntoMap
    @ViewModelKey(ViewModelName::class)
    fun bindLocalViewModelName(viewmodel:ViewModelName):ViewModel*/


}