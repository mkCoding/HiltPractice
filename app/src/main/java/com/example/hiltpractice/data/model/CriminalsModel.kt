package com.example.hiltpractice.data.model


import com.google.gson.annotations.SerializedName

data class CriminalsModel(
    @SerializedName("items")
    val items: List<ItemModel?>? = listOf(),
    @SerializedName("page")
    val page: Int? = 0,
    @SerializedName("total")
    val total: Int? = 0
)