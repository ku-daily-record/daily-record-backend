package io.ku.dailyrecord.core.api.support.error

import org.springframework.boot.logging.LogLevel
import org.springframework.http.HttpStatus

enum class ErrorType(val status: HttpStatus, val message: String, val logLevel: LogLevel) {
    DEFAULT_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "An unexpected error has occurred.", LogLevel.ERROR),
    NOT_FOUND_USER(HttpStatus.NOT_FOUND, "존재하지 않은 유저입니다.", LogLevel.ERROR),
    AUTHENTICATION_FAILED(HttpStatus.UNAUTHORIZED, "비밀번호가 일치하지 않습니다.", LogLevel.ERROR),
}
