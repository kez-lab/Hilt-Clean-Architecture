package com.example.hilt_mvvm_android_architecture.data.repository

import com.example.hilt_mvvm_android_architecture.data.api.response.toEuijinEntity
import com.example.hilt_mvvm_android_architecture.data.datasource.EuijinRemoteDataSource
import com.example.hilt_mvvm_android_architecture.domain.entity.Euijin
import com.example.hilt_mvvm_android_architecture.domain.repository.EuijinRepository
import javax.inject.Inject

class EuijinRepositoryImpl @Inject constructor(private val euijinRemoteDataSource: EuijinRemoteDataSource) : EuijinRepository {

    override suspend fun getData(): Euijin {
        return euijinRemoteDataSource.getData().toEuijinEntity()
    }
}