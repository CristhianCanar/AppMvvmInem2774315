package com.cristhian.fichainem.data.repositories

import com.cristhian.fichainem.data.model.DataResponse
import com.cristhian.fichainem.data.model.LoginDTO
import com.cristhian.fichainem.data.model.UserModel
import com.cristhian.fichainem.data.model.UserProvider
import com.cristhian.fichainem.data.network.LoginService

class LoginRepository {
    private val loginService = LoginService()
    suspend fun login(loginDTO: LoginDTO): DataResponse<UserModel>{
        val response = loginService.login(loginDTO)
        if (response.status == "success"){
            UserProvider.user = response.data
        }
        return response
    }

}