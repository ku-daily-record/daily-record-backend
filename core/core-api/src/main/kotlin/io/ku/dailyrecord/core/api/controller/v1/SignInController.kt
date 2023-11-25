package io.ku.dailyrecord.core.api.controller.v1

import io.ku.dailyrecord.core.api.controller.v1.request.SignInRequestDto
import io.ku.dailyrecord.core.api.controller.v1.response.SignInResponseDto
import io.ku.dailyrecord.core.api.domain.service.SignInService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "로그인")
@RestController
@RequestMapping("/daily-record/api/v1/signin")
class SignInController(
    private val signInService: SignInService,
) {
    @Operation(summary = "로그인")
    @PostMapping("/")
    fun signIn(@RequestBody requestDto: SignInRequestDto): SignInResponseDto {
        return SignInResponseDto.fromUserVo(signInService.signIn(requestDto.toVo()))
    }
}
