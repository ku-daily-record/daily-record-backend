package io.ku.dailyrecord.core.api.domain.service

import io.ku.dailyrecord.core.api.domain.vo.UserVo
import io.ku.dailyrecord.core.api.domain.vo.request.SignInRequestVo
import io.ku.dailyrecord.core.api.support.error.CoreApiException
import io.ku.dailyrecord.core.api.support.error.ErrorType
import org.springframework.stereotype.Service

@Service
class SignInService(
    private val userService: UserService,
) {
    fun signIn(signInRequestVo: SignInRequestVo): UserVo {
        val user = userService.readUserByEmail(signInRequestVo.email)

        return user?.let {
            if (isCorrectPassword(signInRequestVo.password, it.password)) {
                UserVo.fromEntity(it)
            } else {
                throw CoreApiException(ErrorType.AUTHENTICATION_FAILED)
            }
        } ?: throw CoreApiException(ErrorType.NOT_FOUND_USER)
    }

    fun isCorrectPassword(inputPassword: String, originPassword: String): Boolean {
        return inputPassword == originPassword
    }
}
