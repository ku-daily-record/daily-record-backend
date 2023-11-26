package io.ku.dailyrecord.core.api.domain.service

import io.ku.dailyrecord.core.api.domain.vo.FriendVo
import io.ku.dailyrecord.core.api.support.error.CoreApiException
import io.ku.dailyrecord.core.api.support.error.ErrorType
import org.springframework.stereotype.Service

@Service
class ReadFriendsService(
    private val userService: UserService,
    private val friendshipService: FriendshipService,
) {
    fun readFriends(userId: Long): List<FriendVo>? {
        userService.readUserById(userId) ?: throw CoreApiException(ErrorType.NOT_FOUND_USER)

        val friendships = friendshipService.readFriendshipsByUserId(userId)

        return friendships?.map {
            val friend = userService.readUserById(it.friendId)

            FriendVo(id = it.friendId, profileImageUrl = friend?.profileImageUrl)
        }
    }
}
