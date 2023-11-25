package io.ku.dailyrecord.core.api.domain.service

import io.ku.dailyrecord.storage.db.core.entity.PostEntity
import io.ku.dailyrecord.storage.db.core.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRepository: PostRepository,
) {
    fun readPostsByUserId(userId: Long): List<PostEntity>? {
        return postRepository.findByUserId(userId)
    }
}
