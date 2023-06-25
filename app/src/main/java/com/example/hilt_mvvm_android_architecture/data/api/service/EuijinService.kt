package com.example.hilt_mvvm_android_architecture.data.api.service

import com.example.hilt_mvvm_android_architecture.data.api.response.EuijinResponse
import retrofit2.http.GET

interface EuijinService {
    @GET("sopt_test_euijin/euijin")
    suspend fun getData(): EuijinResponse
}