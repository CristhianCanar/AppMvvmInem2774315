package com.cristhian.fichainem.data.network

import com.cristhian.fichainem.data.model.DataResponse
import com.cristhian.fichainem.data.model.LoginDTO
import com.cristhian.fichainem.data.model.UserModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApiClient {
    @POST("sign_in")
    suspend fun login(
        @Body loginDTO: LoginDTO
    ): Response<DataResponse<UserModel>>
}