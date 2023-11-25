package io.ku.dailyrecord.storage.db.core.repository

import io.ku.dailyrecord.storage.db.core.entity.LikeEntity
import org.springframework.data.jpa.repository.JpaRepository

interface LikeRepository : JpaRepository<LikeEntity, Long>
