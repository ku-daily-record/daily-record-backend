package io.ku.dailyrecord.core.api.controller.v1.request

import io.ku.dailyrecord.core.api.domain.ExampleData

data class ExampleRequestDto(
    val data: String,
) {
    fun toExampleData(): ExampleData {
        return ExampleData(data, data)
    }
}
