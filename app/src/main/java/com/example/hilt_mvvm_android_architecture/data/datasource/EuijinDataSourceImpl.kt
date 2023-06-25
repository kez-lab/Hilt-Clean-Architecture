package com.example.hilt_mvvm_android_architecture.data.datasource

import com.example.hilt_mvvm_android_architecture.data.api.response.EuijinResponse
import com.example.hilt_mvvm_android_architecture.data.api.service.EuijinService
import javax.inject.Inject

class EuijinDataSourceImpl @Inject constructor(private val euijinService: EuijinService) : EuijinDataSource {
    override suspend fun getData(): Result<EuijinResponse> {
        return runCatching { euijinService.getData() }
    }
}