package com.example.hiltpractice.data.model


import com.google.gson.annotations.SerializedName

data class FileModel(
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("url")
    val url: String? = ""
)