package io.ku.dailyrecord.core.api.domain.vo

import io.ku.dailyrecord.storage.db.core.entity.UserEntity

data class UserVo(
    val id: Long,
    val email: String,
    val password: String,
    val nickname: String?,
    val profileImageUrl: String?,
) {
    companion object {
        fun fromEntity(entity: UserEntity): UserVo {
            with(entity) {
                return UserVo(
                    id = id!!,
                    email = email,
                    password = password,
                    nickname = nickname,
                    profileImageUrl = profileImageUrl,
                )
            }
        }
    }
}
