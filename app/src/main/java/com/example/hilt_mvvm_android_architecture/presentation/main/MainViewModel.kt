package com.example.hilt_mvvm_android_architecture.presentation.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hilt_mvvm_android_architecture.domain.usecase.EuijinGetDataUseCase
import com.example.hilt_mvvm_android_architecture.presentation.model.EuijinModel
import com.example.hilt_mvvm_android_architecture.presentation.model.toEuijinModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.HttpException
import javax.inject.Inject

@HiltViewModel class MainViewModel @Inject constructor(
    private val euijinGetDataUseCase: EuijinGetDataUseCase
) : ViewModel() {

    private val _euijinLiveData = MutableLiveData<EuijinModel>()
    val euijinLiveData: LiveData<EuijinModel> get() = _euijinLiveData


    fun getData() {
        viewModelScope.launch {
            euijinGetDataUseCase().fold(onSuccess = {
                _euijinLiveData.value = it.toEuijinModel()
            }, onFailure = {
                if (it is HttpException) {
                    Log.e("MainViewModel", "getData() error: ${it.code()}")
                } else {
                    Log.e("MainViewModel", "getData() error: $it")
                }
            })
        }
    }
}