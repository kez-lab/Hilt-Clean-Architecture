package com.example.hilt_mvvm_android_architecture.presentation.model

import com.example.hilt_mvvm_android_architecture.domain.entity.EuijinEntity

data class EuijinModel(
    val array: List<Int>,
    val boolean: Boolean,
    val color: String,
    val nullValue: String?,
    val number: Int,
    val name: String,
    val skill: String,
    val string: String
)

fun EuijinEntity.toEuijinModel() = EuijinModel(
    array = array,
    boolean = boolean,
    color = color,
    nullValue = nullValue,
    number = number,
    name = name,
    skill = skill,
    string = string
)