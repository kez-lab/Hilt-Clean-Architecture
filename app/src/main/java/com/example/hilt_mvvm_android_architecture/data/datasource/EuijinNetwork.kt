package com.example.hilt_mvvm_android_architecture.data.datasource

import com.example.hilt_mvvm_android_architecture.data.api.response.EuijinResponse
import com.example.hilt_mvvm_android_architecture.data.api.service.EuijinService
import javax.inject.Inject

class EuijinNetwork @Inject constructor(private val euijinService: EuijinService) : EuijinRemoteDataSource {
    override suspend fun getData(): EuijinResponse {
        return euijinService.getData()
    }
}