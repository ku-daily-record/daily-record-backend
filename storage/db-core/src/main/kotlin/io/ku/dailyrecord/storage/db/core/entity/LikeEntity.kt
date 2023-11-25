package io.ku.dailyrecord.storage.db.core.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "like")
class LikeEntity(
    @Column
    val userId: Long,

    @Column
    val postId: Long,
) : CreationOnlyBaseEntity()

