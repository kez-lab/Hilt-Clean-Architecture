package com.example.hilt_mvvm_android_architecture.di

import com.example.hilt_mvvm_android_architecture.domain.repository.EuijinRepository
import com.example.hilt_mvvm_android_architecture.domain.usecase.EuijinGetDataUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

    @Provides
    @Singleton
    fun provideGetSomeDataUseCase(euijinRepository: EuijinRepository): EuijinGetDataUseCase {
        return EuijinGetDataUseCase(euijinRepository)
    }
}