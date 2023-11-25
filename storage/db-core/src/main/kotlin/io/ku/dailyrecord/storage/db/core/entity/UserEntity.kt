package io.ku.dailyrecord.storage.db.core.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "user")
class UserEntity(
    @Column(length = 100, unique = true)
    val email: String,

    @Column(length = 50)
    val password: String,

    @Column(length = 20)
    val nickname: String?,

    @Column(length = 255)
    val profileImageUrl: String?,
) : BaseEntity()
