package io.ku.dailyrecord.core.api.controller.v1.response

import io.ku.dailyrecord.core.api.domain.vo.UserVo
import io.swagger.v3.oas.annotations.media.Schema

data class SignInResponseDto(
    @field:Schema(description = "아이디")
    val id: Long,

    @field:Schema(description = "이메일")
    val email: String,

    @field:Schema(description = "닉네임")
    val nickname: String?,

    @field:Schema(description = "프로필 이미지 url")
    val profileImageUrl: String?,
) {
    companion object {
        fun fromUserVo(vo: UserVo): SignInResponseDto {
            with(vo) {
                return SignInResponseDto(
                    id = id,
                    email = email,
                    nickname = nickname,
                    profileImageUrl = profileImageUrl,
                )
            }
        }
    }
}
