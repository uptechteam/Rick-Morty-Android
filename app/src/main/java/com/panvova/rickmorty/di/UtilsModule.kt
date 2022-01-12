package com.panvova.rickmorty.di

import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import javax.inject.Named

@Module
class UtilsModule {
    @Provides
    @Named("IO")
    fun provideCoroutineDispatcherIO(): CoroutineDispatcher {
        return Dispatchers.IO
    }

    @Provides
    @Named("Main")
    fun provideCoroutineDispatcherMain(): CoroutineDispatcher {
        return Dispatchers.Main
    }
}