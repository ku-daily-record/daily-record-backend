package io.ku.dailyrecord.core.api.domain.service

import io.ku.dailyrecord.storage.db.core.entity.UserEntity
import io.ku.dailyrecord.storage.db.core.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
) {
    fun readUser(email: String): UserEntity? {
        return userRepository.findByEmail(email)
    }
}
