package com.example.newsappwithfragments2.data.remote.repository.dataSource

import com.example.newsappwithfragments2.data.model.ApiResponse
import retrofit2.Response

interface NewsRemoteDataSource {

    suspend fun getTopHeadlines() : Response<ApiResponse>
}