package com.example.hilt_mvvm_android_architecture.di

import com.example.hilt_mvvm_android_architecture.data.datasource.EuijinRemoteDataSource
import com.example.hilt_mvvm_android_architecture.data.datasource.EuijinNetwork
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
    fun bindEuijinDataSource(euijinDataSourceImpl: EuijinNetwork): EuijinRemoteDataSource

    @Binds
    @Singleton
    fun bindEuijinRepository(euijinRepositoryImpl: EuijinRepositoryImpl): EuijinRepository
}