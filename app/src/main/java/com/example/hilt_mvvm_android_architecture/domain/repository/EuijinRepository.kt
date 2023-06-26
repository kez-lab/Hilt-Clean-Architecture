package com.example.hilt_mvvm_android_architecture.domain.repository

import com.example.hilt_mvvm_android_architecture.domain.entity.Euijin

interface EuijinRepository {
    suspend fun getData(): Euijin
}