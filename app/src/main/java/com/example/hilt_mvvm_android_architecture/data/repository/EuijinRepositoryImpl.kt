package com.example.hilt_mvvm_android_architecture.data.repository

import com.example.hilt_mvvm_android_architecture.data.api.response.toEuijinEntity
import com.example.hilt_mvvm_android_architecture.data.datasource.EuijinDataSource
import com.example.hilt_mvvm_android_architecture.domain.entity.EuijinEntity
import com.example.hilt_mvvm_android_architecture.domain.repository.EuijinRepository
import javax.inject.Inject

class EuijinRepositoryImpl @Inject constructor(private val euijinDataSource: EuijinDataSource) : EuijinRepository {

    override suspend fun getData(): Result<EuijinEntity> {
        return runCatching {
            euijinDataSource.getData().fold(
                onSuccess = { it.toEuijinEntity() },
                onFailure = { throw it }
            )
        }
    }
}