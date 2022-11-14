package com.example.newsappwithfragments2.domain.usecase

import com.example.newsappwithfragments2.domain.repository.RepositoryInterface

class GetSearchedNewsUseCase(val repository : RepositoryInterface) {

    suspend fun getSearchedNews(searchQuery : String) {
        repository.getSearchedNews(searchQuery)
    }
}