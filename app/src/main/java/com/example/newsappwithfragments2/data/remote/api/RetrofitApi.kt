package com.example.newsappwithfragments2.data.remote.api

import com.example.newsappwithfragments2.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitApi {

    var retrofit: NewsApiService = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(NewsApiService::class.java)
}