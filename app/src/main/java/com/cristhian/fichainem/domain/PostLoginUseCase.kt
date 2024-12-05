package com.cristhian.fichainem.domain

import com.cristhian.fichainem.data.model.DataResponse
import com.cristhian.fichainem.data.model.LoginDTO
import com.cristhian.fichainem.data.model.UserModel
import com.cristhian.fichainem.data.repositories.LoginRepository

class PostLoginUseCase {
    private val loginRepository = LoginRepository()
    suspend operator fun invoke(loginDTO: LoginDTO): DataResponse<UserModel> {
        return loginRepository.login(loginDTO)
    }

}