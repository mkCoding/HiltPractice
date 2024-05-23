package com.example.hiltpractice.data.repository

import com.example.hiltpractice.data.api.ApiEndpoints
import com.example.hiltpractice.data.model.CriminalsModel
import javax.inject.Inject

//Inject ApiEndPointData dependency from outside the class
class RepositoryImpl  @Inject constructor(private val apiEndpointData: ApiEndpoints):Repository {
    //calling this method from anywhere in the application will give me direct access to all data at the endpoint
    override suspend fun getCriminals(): CriminalsModel = apiEndpointData.getCriminals()
}