package io.ku.dailyrecord.core.api.controller.v1.response

import io.ku.dailyrecord.core.api.domain.vo.PostVo
import io.swagger.v3.oas.annotations.media.Schema

data class PostDto(
    @field:Schema(description = "게시물 아이디")
    val id: Long,

    @field:Schema(description = "게시자 user 아이디")
    val userId: Long,

    @field:Schema(description = "오늘의 대표 노래 여부")
    val isFavorite: Boolean,

    @field:Schema(description = "노래 앨범 이미지")
    val imageUrl: String,

    @field:Schema(description = "노래 제목")
    val songName: String,

    @field:Schema(description = "가수 이름")
    val singerName: String,

    @field:Schema(description = "노래에 대한 한줄평")
    val comment: String? = null,

    @field:Schema(description = "게시물 등록일자")
    val createdAt: String,
) {
    companion object {
        fun fromVo(vo: PostVo): PostDto {
            with(vo) {
                return PostDto(
                    id = id,
                    userId = userId,
                    isFavorite = isFavorite,
                    imageUrl = imageUrl,
                    songName = songName,
                    singerName = singerName,
                    comment = comment,
                    createdAt = createdAt,
                )
            }
        }
    }
}
