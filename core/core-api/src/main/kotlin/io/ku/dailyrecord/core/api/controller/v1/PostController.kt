package io.ku.dailyrecord.core.api.controller.v1

import io.ku.dailyrecord.core.api.controller.v1.response.ReadPostsResponseDto
import io.ku.dailyrecord.core.api.domain.service.ReadPostsService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "게시물")
@RestController
@RequestMapping("/daily-record/api/v1/post")
class PostController(
    private val readPostsService: ReadPostsService,
) {
    @Operation(summary = "특정 user의 모든 post 조회")
    @GetMapping("/{userId}")
    fun readPosts(@PathVariable userId: Long): ReadPostsResponseDto {
        return ReadPostsResponseDto.fromVo(readPostsService.readPostsByUserId(userId))
    }
}
