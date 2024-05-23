package com.example.hiltpractice.data.api

import com.example.hiltpractice.data.model.CriminalsModel
import retrofit2.http.GET

interface ApiEndpoints {
    //GET call that will be made to the api. This must be implemented by
    @GET(ApiDetails.CRIMINAL_ENDPOINT)
    suspend fun getCriminals(): CriminalsModel

}