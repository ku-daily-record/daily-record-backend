package io.ku.dailyrecord.core.api.domain.vo

import io.ku.dailyrecord.storage.db.core.entity.FriendshipEntity

data class FriendshipVo(
    val id: Long? = null,
    val userId: Long,
    val friendId: Long,
) {
    companion object {
        fun fromEntity(entity: FriendshipEntity): FriendshipVo {
            with(entity) {
                return FriendshipVo(
                    id = id,
                    userId = userId,
                    friendId = friendId,
                )
            }
        }
    }

    fun toEntity(): FriendshipEntity {
        return FriendshipEntity(
            userId = userId,
            friendId = friendId,
        )
    }

    fun toSwitchedEntity(): FriendshipEntity {
        return FriendshipEntity(
            userId = friendId,
            friendId = userId,
        )
    }
}
