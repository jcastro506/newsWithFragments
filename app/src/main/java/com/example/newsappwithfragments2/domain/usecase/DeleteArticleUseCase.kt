package com.example.newsappwithfragments2.domain.usecase

import com.example.newsappwithfragments2.data.model.Article
import com.example.newsappwithfragments2.domain.repository.RepositoryInterface

class DeleteArticleUseCase(val repository : RepositoryInterface) {

    suspend fun deleteArticle(article:Article) {
        repository.deleteNews(article)
    }
}