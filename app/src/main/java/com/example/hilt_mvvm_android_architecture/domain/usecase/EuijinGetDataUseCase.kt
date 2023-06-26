package com.example.hilt_mvvm_android_architecture.domain.usecase

import com.example.hilt_mvvm_android_architecture.domain.entity.Euijin
import com.example.hilt_mvvm_android_architecture.domain.repository.EuijinRepository
import javax.inject.Inject

class EuijinGetDataUseCase @Inject constructor(private val euijinRepository: EuijinRepository) {

    suspend operator fun invoke(): Result<Euijin> {
        return runCatching { euijinRepository.getData() }
    }
}