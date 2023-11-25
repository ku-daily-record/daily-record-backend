package io.ku.dailyrecord.core.api.domain.service

import io.ku.dailyrecord.storage.db.core.entity.UserEntity
import io.ku.dailyrecord.storage.db.core.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
) {
    fun readUserById(id: Long): UserEntity? {
        return userRepository.findById(id).orElse(null)
    }

    fun readUserByEmail(email: String): UserEntity? {
        return userRepository.findByEmail(email)
    }
}
