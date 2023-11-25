package io.ku.dailyrecord.core.api.domain.service

import io.ku.dailyrecord.core.api.domain.vo.PostVo
import io.ku.dailyrecord.core.api.support.error.CoreApiException
import io.ku.dailyrecord.core.api.support.error.ErrorType
import org.springframework.stereotype.Service

@Service
class ReadPostsService(
    private val userService: UserService,
    private val postService: PostService,
) {
    fun readPostsByUserId(userId: Long): List<PostVo>? {
        userService.readUserById(userId) ?: throw CoreApiException(ErrorType.NOT_FOUND_USER)

        return postService.readPostsByUserId(userId)?.map {
            PostVo.fromEntity(it)
        }
    }
}
