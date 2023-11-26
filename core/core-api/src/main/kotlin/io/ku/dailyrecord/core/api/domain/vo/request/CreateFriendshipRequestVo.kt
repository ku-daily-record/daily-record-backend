package io.ku.dailyrecord.core.api.domain.vo.request

data class CreateFriendshipRequestVo(
    val userId: Long,
    val friendId: Long,
)
