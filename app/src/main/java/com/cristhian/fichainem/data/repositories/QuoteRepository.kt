package com.cristhian.fichainem.data.repositories

import com.cristhian.fichainem.data.model.QuoteModel
import com.cristhian.fichainem.data.model.QuoteProvider
import com.cristhian.fichainem.data.network.QuoteService

class QuoteRepository {
    private val quoteService = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel> {
        val response = quoteService.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}