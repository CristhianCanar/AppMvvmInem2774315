package com.cristhian.fichainem.data.network

import com.cristhian.fichainem.core.RetrofitHelper
import com.cristhian.fichainem.data.model.DataResponse
import com.cristhian.fichainem.data.model.LoginDTO
import com.cristhian.fichainem.data.model.UserModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginService {
    private val retrofitTwo = RetrofitHelper.getRetrofitTwo()
    suspend fun login(loginDTO: LoginDTO): DataResponse<UserModel>{
        return withContext(Dispatchers.IO){
            // Llamada al API
            val response = retrofitTwo.create(LoginApiClient::class.java).login(loginDTO)
            response.body() ?:
            DataResponse(UserModel("",""), "error", "error")
        }
    }
}