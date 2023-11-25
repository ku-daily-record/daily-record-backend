package io.ku.dailyrecord.core.api.controller.v1.request

import io.ku.dailyrecord.core.api.domain.vo.request.SignInRequestVo
import io.swagger.v3.oas.annotations.media.Schema

data class SignInRequestDto(
    @field:Schema(description = "이메일", required = true)
    val email: String,

    @field:Schema(description = "비밀번호", required = true)
    val password: String,
) {
    fun toVo(): SignInRequestVo =
        SignInRequestVo(
            email = email,
            password = password,
        )
}
