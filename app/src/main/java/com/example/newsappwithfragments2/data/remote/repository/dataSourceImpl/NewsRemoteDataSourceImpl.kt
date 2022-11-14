package com.example.newsappwithfragments2.data.remote.repository.dataSourceImpl

import com.example.newsappwithfragments2.data.model.ApiResponse
import com.example.newsappwithfragments2.data.remote.api.NewsApiService
import com.example.newsappwithfragments2.data.remote.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val ApiService : NewsApiService,
    private val country : String,
    private val page : Int
) : NewsRemoteDataSource {

    override suspend fun getTopHeadlines(): Response<ApiResponse> {
        return ApiService.getAllNews(country, page)
    }


}