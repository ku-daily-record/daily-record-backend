package io.ku.dailyrecord.storage.db.core.repository

import io.ku.dailyrecord.storage.db.core.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Long> {
    fun findByEmail(email: String): UserEntity?
}
