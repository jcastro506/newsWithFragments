package com.example.newsappwithfragments2.domain.repository

import com.example.newsappwithfragments2.data.model.ApiResponse
import com.example.newsappwithfragments2.data.model.Article
import com.example.newsappwithfragments2.data.remote.api.NewsApiService
import com.example.newsappwithfragments2.data.remote.repository.dataSource.NewsRemoteDataSource
import com.example.newsappwithfragments2.util.Resource
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

class RepositoryImpl(val remoteDataSource: NewsRemoteDataSource) : RepositoryInterface {
    override suspend fun getAllArticles(): Resource<ApiResponse> {
        return responseToResource(remoteDataSource.getTopHeadlines())
    }

    override suspend fun getSearchedNews(searchQuery: String): Resource<ApiResponse> {
        TODO("Not yet implemented")
    }

    override fun getSavedArticles(): Flow<Resource<List<Article>>> {
        TODO("Not yet implemented")
    }

    override suspend fun saveNews(article: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNews(article: Article) {
        TODO("Not yet implemented")
    }

    private fun responseToResource(response: Response<ApiResponse>) : Resource<ApiResponse> {
        if(response.isSuccessful) {
            response.body()?.let { response ->
                return Resource.Success(response)
            }
        } else {
           return Resource.Error("Null")
        }
    }

}