package com.example.newsappwithfragments2.domain.usecase

import com.example.newsappwithfragments2.data.model.ApiResponse
import com.example.newsappwithfragments2.domain.repository.RepositoryInterface
import com.example.newsappwithfragments2.util.Resource

class GetListOfArticlesUseCase(val repositoryInterface : RepositoryInterface) {

    suspend fun getListOfArticles() : Resource<ApiResponse> {
        return repositoryInterface.getAllArticles()
    }

}