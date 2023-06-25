package com.example.hilt_mvvm_android_architecture.di

import com.example.hilt_mvvm_android_architecture.data.datasource.EuijinDataSource
import com.example.hilt_mvvm_android_architecture.data.datasource.EuijinDataSourceImpl
import com.example.hilt_mvvm_android_architecture.domain.repository.EuijinRepository
import com.example.hilt_mvvm_android_architecture.data.repository.EuijinRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface BindModule {

    @Binds
    @Singleton
    fun bindEuijinDataSource(euijinDataSourceImpl: EuijinDataSourceImpl): EuijinDataSource

    @Binds
    @Singleton
    fun bindEuijinRepository(euijinRepositoryImpl: EuijinRepositoryImpl): EuijinRepository
}