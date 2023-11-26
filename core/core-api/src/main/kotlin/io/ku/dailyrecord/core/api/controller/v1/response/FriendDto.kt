package io.ku.dailyrecord.core.api.controller.v1.response

import io.swagger.v3.oas.annotations.media.Schema

data class FriendDto(
    @field:Schema(description = "친구 user의 아이디")
    val id: Long,

    @field:Schema(description = "친구 프로필 이미지")
    val profileImageUrl: String?,
)
