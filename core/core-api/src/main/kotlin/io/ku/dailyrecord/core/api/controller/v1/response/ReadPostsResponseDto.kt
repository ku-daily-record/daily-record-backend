package io.ku.dailyrecord.core.api.controller.v1.response

import io.ku.dailyrecord.core.api.domain.vo.PostVo
import io.swagger.v3.oas.annotations.media.Schema

data class ReadPostsResponseDto(
    @field:Schema(description = "게시물 목록")
    val posts: List<PostDto>? = listOf(),
) {
    companion object {
        fun fromVo(vo: List<PostVo>?): ReadPostsResponseDto {
            with(vo) {
                return ReadPostsResponseDto(
                    posts = vo?.map { PostDto.fromVo(it) },
                )
            }
        }
    }
}
