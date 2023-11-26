package io.ku.dailyrecord.core.api.controller.v1.response

import io.ku.dailyrecord.core.api.domain.vo.FriendshipVo
import io.swagger.v3.oas.annotations.media.Schema

data class FriendshipDto(
    @field:Schema(description = "친구 관계 아이디")
    val id: Long? = null,

    @field:Schema(description = "user 아이디")
    val userId: Long,

    @field:Schema(description = "친구 아이디")
    val friendId: Long,
) {
    companion object {
        fun fromVo(vo: FriendshipVo): FriendshipDto {
            with(vo) {
                return FriendshipDto(
                    id = id,
                    userId = userId,
                    friendId = friendId,
                )
            }
        }
    }
}
