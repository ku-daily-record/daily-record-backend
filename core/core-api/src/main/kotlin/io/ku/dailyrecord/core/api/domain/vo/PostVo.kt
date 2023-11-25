package io.ku.dailyrecord.core.api.domain.vo

import io.ku.dailyrecord.storage.db.core.entity.PostEntity
import java.time.format.DateTimeFormatter

data class PostVo(
    val id: Long,
    val userId: Long,
    val isFavorite: Boolean,
    val imageUrl: String,
    val songName: String,
    val singerName: String,
    val comment: String? = null,
    val createdAt: String,
) {
    companion object {
        fun fromEntity(entity: PostEntity): PostVo {
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")

            with(entity) {
                return PostVo(
                    id = id!!,
                    userId = userId,
                    isFavorite = isFavorite,
                    imageUrl = imageUrl,
                    songName = songName,
                    singerName = singerName,
                    comment = comment,
                    createdAt = createdAt!!.format(formatter),
                )
            }
        }
    }
}
