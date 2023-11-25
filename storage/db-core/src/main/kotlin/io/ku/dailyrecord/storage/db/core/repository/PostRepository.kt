package io.ku.dailyrecord.storage.db.core.repository


import io.ku.dailyrecord.storage.db.core.entity.PostEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<PostEntity, Long> {
    fun findByUserId(userId: Long): List<PostEntity>?
}
