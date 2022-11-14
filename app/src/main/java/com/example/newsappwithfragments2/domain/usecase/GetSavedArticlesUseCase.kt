package com.example.newsappwithfragments2.domain.usecase

import com.example.newsappwithfragments2.data.model.Article
import com.example.newsappwithfragments2.domain.repository.RepositoryInterface
import com.example.newsappwithfragments2.util.Resource
import kotlinx.coroutines.flow.Flow

class GetSavedArticlesUseCase(val repository:RepositoryInterface) {

    suspend fun getSavedArticles() : Flow<Resource<List<Article>>> {
        return repository.getSavedArticles()
    }
}