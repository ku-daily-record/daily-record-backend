package io.ku.dailyrecord.core.api.controller.v1.response

import io.ku.dailyrecord.core.api.domain.vo.FriendshipVo
import io.swagger.v3.oas.annotations.media.Schema

data class CreateFriendshipResponseDto(
    @field:Schema(description = "생성된 친구 관계 목록")
    val friendships: List<FriendshipDto>,
) {
    companion object {
        fun fromVo(vo: List<FriendshipVo>): CreateFriendshipResponseDto {
            with(vo) {
                return CreateFriendshipResponseDto(
                    friendships = this.map { FriendshipDto.fromVo(it) },
                )
            }
        }
    }
}
