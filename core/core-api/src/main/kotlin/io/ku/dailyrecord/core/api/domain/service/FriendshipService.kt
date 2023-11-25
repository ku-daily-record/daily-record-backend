package io.ku.dailyrecord.core.api.domain.service

import io.ku.dailyrecord.storage.db.core.entity.FriendshipEntity
import io.ku.dailyrecord.storage.db.core.repository.FriendshipRepository
import org.springframework.stereotype.Service

@Service
class FriendshipService(
    private val friendshipRepository: FriendshipRepository,
) {
    fun readFriendshipsByUserId(userId: Long): List<FriendshipEntity>? {
        return friendshipRepository.readByUserId(userId)
    }
}
