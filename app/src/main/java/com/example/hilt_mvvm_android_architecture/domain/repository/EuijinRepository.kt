package com.example.hilt_mvvm_android_architecture.domain.repository

import com.example.hilt_mvvm_android_architecture.domain.entity.EuijinEntity

interface EuijinRepository {
    suspend fun getData(): Result<EuijinEntity>
}