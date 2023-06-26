package com.example.hilt_mvvm_android_architecture.data.api.response


import com.example.hilt_mvvm_android_architecture.domain.entity.Euijin
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EuijinResponse(
    @SerialName("id")
    val id: String? = null,
    @SerialName("array")
    val array: List<Int?>? = null,
    @SerialName("boolean")
    val boolean: Boolean? = null,
    @SerialName("color")
    val color: String? = null,
    @SerialName("null")
    val nullValue: String? = null,
    @SerialName("number")
    val number: Int? = null,
    @SerialName("euijin")
    val euijin: Euijin? = null,
    @SerialName("string")
    val string: String? = null
) {
    @Serializable
    data class Euijin(
        @SerialName("name")
        val name: String? = null,
        @SerialName("skill")
        val skill: String? = null
    )
}

fun EuijinResponse.toEuijinEntity() = Euijin(
    array = array?.filterNotNull() ?: listOf(),
    boolean = boolean ?: false,
    color = color ?: "",
    nullValue = nullValue,
    number = number ?: 0,
    name = euijin?.name ?: "",
    skill = euijin?.skill ?: "",
    string = string ?: ""
)