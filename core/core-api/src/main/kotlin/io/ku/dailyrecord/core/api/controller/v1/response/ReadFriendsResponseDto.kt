package io.ku.dailyrecord.core.api.controller.v1.response

import io.ku.dailyrecord.core.api.domain.vo.FriendVo
import io.swagger.v3.oas.annotations.media.Schema

data class ReadFriendsResponseDto(
    @field:Schema(description = "친구 목록")
    val friends: List<FriendDto>? = listOf(),
) {
    companion object {
        fun fromVo(vo: List<FriendVo>?): ReadFriendsResponseDto {
            with(vo) {
                return ReadFriendsResponseDto(
                    this?.map {
                        FriendDto(
                            id = it.id,
                            profileImageUrl = it.profileImageUrl,
                        )
                    },
                )
            }
        }
    }
}
