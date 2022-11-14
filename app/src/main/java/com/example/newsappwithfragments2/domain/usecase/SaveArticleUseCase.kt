package com.example.newsappwithfragments2.domain.usecase

import com.example.newsappwithfragments2.data.model.Article
import com.example.newsappwithfragments2.domain.repository.RepositoryInterface

class SaveArticleUseCase(val repository : RepositoryInterface) {

    suspend fun saveArticle(article:Article) {
        repository.saveNews(article)
    }
}