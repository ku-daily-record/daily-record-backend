package io.ku.dailyrecord.core.api.controller.v1.request

import io.ku.dailyrecord.core.api.domain.vo.request.CreateFriendshipRequestVo
import io.swagger.v3.oas.annotations.media.Schema

data class CreateFriendshipRequestDto(
    @field:Schema(description = "user 아이디", required = true)
    val userId: Long,

    @field:Schema(description = "user의 친구 아이디", required = true)
    val friendId: Long,
) {
    fun toVo(): CreateFriendshipRequestVo {
        return CreateFriendshipRequestVo(
            userId = userId,
            friendId = friendId,
        )
    }
}
