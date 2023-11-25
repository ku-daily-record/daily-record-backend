package io.ku.dailyrecord.client.example

import io.ku.dailyrecord.client.example.model.ExampleClientResult
import org.springframework.stereotype.Component

@Component
class ExampleClient internal constructor(
    private val exampleApi: ExampleApi,
) {
    fun example(
        exampleParameter: String,
    ): ExampleClientResult {
        val request = ExampleRequestDto(exampleParameter)
        return exampleApi.example(request).toResult()
    }
}
