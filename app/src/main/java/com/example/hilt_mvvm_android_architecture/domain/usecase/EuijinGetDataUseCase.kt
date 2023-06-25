package com.example.hilt_mvvm_android_architecture.domain.usecase

import com.example.hilt_mvvm_android_architecture.domain.entity.EuijinEntity
import com.example.hilt_mvvm_android_architecture.domain.repository.EuijinRepository
import javax.inject.Inject

class EuijinGetDataUseCase @Inject constructor(
    private val euijinRepository: EuijinRepository
) : UseCase {

    suspend operator fun invoke(): Result<EuijinEntity> {
        return euijinRepository.getData()
    }
}