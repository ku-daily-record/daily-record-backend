package io.ku.dailyrecord.client.example

import io.ku.dailyrecord.client.example.model.ExampleClientResult

internal data class ExampleResponseDto(
    val exampleResponseValue: String,
) {
    fun toResult(): ExampleClientResult {
        return ExampleClientResult(exampleResponseValue)
    }
}
