package com.example.hilt_mvvm_android_architecture.data.datasource

import com.example.hilt_mvvm_android_architecture.data.api.response.EuijinResponse

interface EuijinRemoteDataSource {
    suspend fun getData(): EuijinResponse
}