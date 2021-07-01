package sandeep.kumar.newsapp.repository

import sandeep.kumar.newsapp.api.RetrofitInstance
import sandeep.kumar.newsapp.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}