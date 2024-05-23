package com.example.hiltpractice.data.repository

import com.example.hiltpractice.data.model.CriminalsModel

interface Repository {
    suspend fun getCriminals(): CriminalsModel
}