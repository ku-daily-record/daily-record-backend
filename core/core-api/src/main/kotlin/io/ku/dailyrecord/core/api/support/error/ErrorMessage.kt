package io.ku.dailyrecord.core.api.support.error

data class ErrorMessage private constructor(
    val message: String,
    val data: Any? = null,
) {
    constructor(errorType: ErrorType, data: Any? = null) : this(
        message = errorType.message,
        data = data,
    )
}
