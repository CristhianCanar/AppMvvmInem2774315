package com.cristhian.fichainem.data.network

import com.cristhian.fichainem.core.RetrofitHelper
import com.cristhian.fichainem.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit

class QuoteService {
    private val retrofit:Retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes(): List<QuoteModel> {
        // Cambio a hilo secundario para la llamada a la API
        return withContext(Dispatchers.IO){
            // Llamada a la API
            val response = retrofit.create(QuoteApiClient::class.java).getAllQuotes()
            response.body() ?: emptyList()
        }
    }

}