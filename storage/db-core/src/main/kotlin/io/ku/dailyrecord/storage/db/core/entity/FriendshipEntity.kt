package io.ku.dailyrecord.storage.db.core.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "friendship")
class FriendshipEntity(
    @Column
    val userId: Long,

    @Column
    val friendId: Long,
) : CreationOnlyBaseEntity()
