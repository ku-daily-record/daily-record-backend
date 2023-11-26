package io.ku.dailyrecord.core.api.domain.service

import io.ku.dailyrecord.core.api.domain.vo.FriendshipVo
import io.ku.dailyrecord.core.api.domain.vo.request.CreateFriendshipRequestVo
import io.ku.dailyrecord.core.api.support.error.CoreApiException
import io.ku.dailyrecord.core.api.support.error.ErrorType
import org.springframework.stereotype.Service

@Service
class CreateFriendshipService(
    private val friendshipService: FriendshipService,
) {
    fun createFriendship(createFriendshipRequestVo: CreateFriendshipRequestVo): List<FriendshipVo> {
        with(createFriendshipRequestVo) {
            val friendshipsOfUser = friendshipService.readFriendshipsByUserId(this.userId)

            if (friendshipsOfUser?.any { it.friendId == this.friendId } == true) {
                throw CoreApiException(ErrorType.DUPLICATE_FRIENDSHIP)
            }

            return friendshipService.createFriendship(FriendshipVo(userId = this.userId, friendId = this.friendId))
                .map { FriendshipVo.fromEntity(it) }
        }
    }
}
