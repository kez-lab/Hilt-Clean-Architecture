package com.example.hilt_mvvm_android_architecture.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.hilt_mvvm_android_architecture.R
import com.example.hilt_mvvm_android_architecture.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel>()
    private val binding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel.getData()
        initObserve()
    }

    private fun initObserve() {
        viewModel.euijinLiveData.observe(this) {
            Log.d("MainActivity", "initObserve() it: $it")
        }
    }
}