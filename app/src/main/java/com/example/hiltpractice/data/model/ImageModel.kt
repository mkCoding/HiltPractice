package com.example.hiltpractice.data.model


import com.google.gson.annotations.SerializedName

data class ImageModel(
    @SerializedName("caption")
    val caption: String? = "",
    @SerializedName("large")
    val large: String? = "",
    @SerializedName("original")
    val original: String? = "",
    @SerializedName("thumb")
    val thumb: String? = ""
)