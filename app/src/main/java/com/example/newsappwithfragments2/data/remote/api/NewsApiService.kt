package com.example.newsappwithfragments2.data.remote.api



import com.example.newsappwithfragments2.BuildConfig
import com.example.newsappwithfragments2.data.model.ApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    @GET("v2/top-headlines")
    suspend fun getAllNews(
        @Query("country") country : String,
        @Query("page") page : Int,
        @Query("api_key") api_key : String = BuildConfig.API_KEY
    ) : Response<ApiResponse>
}