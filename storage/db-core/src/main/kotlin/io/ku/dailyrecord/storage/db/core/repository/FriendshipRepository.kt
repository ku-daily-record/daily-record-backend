package io.ku.dailyrecord.storage.db.core.repository

import io.ku.dailyrecord.storage.db.core.entity.FriendshipEntity
import org.springframework.data.jpa.repository.JpaRepository

interface FriendshipRepository : JpaRepository<FriendshipEntity, Long>
