package com.example.newsappwithfragments2.domain.repository

import com.example.newsappwithfragments2.data.model.ApiResponse
import com.example.newsappwithfragments2.data.model.Article
import com.example.newsappwithfragments2.util.Resource
import kotlinx.coroutines.flow.Flow

interface RepositoryInterface {

    suspend fun getAllArticles() : Resource<ApiResponse>

    suspend fun getSearchedNews(searchQuery : String) : Resource<ApiResponse>

    fun getSavedArticles() : Flow<Resource<List<Article>>>

    suspend fun saveNews(article: Article)

    suspend fun deleteNews(article: Article)

}