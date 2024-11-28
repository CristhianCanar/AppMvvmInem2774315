package com.cristhian.fichainem.domain

import com.cristhian.fichainem.data.model.QuoteModel
import com.cristhian.fichainem.data.repositories.QuoteRepository

class GetQuotesUseCase {
    private val quoteRepository = QuoteRepository()
//    suspend operator fun invoke(): List<QuoteModel>? {
//        return quoteRepository.getAllQuotes()
//    }
    suspend operator fun invoke(): List<QuoteModel>? = quoteRepository.getAllQuotes()
}