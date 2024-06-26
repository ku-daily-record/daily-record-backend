package io.ku.dailyrecord.core.api.controller.v1

import io.ku.dailyrecord.core.api.controller.v1.request.CreateFriendshipRequestDto
import io.ku.dailyrecord.core.api.controller.v1.response.CreateFriendshipResponseDto
import io.ku.dailyrecord.core.api.controller.v1.response.ReadFriendsResponseDto
import io.ku.dailyrecord.core.api.domain.service.CreateFriendshipService
import io.ku.dailyrecord.core.api.domain.service.ReadFriendsService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Tag(name = "친구 관계")
@RestController
@RequestMapping("/daily-record/api/v1/friendship")
class FriendshipController(
    private val readFriendsService: ReadFriendsService,
    private val createFriendshipService: CreateFriendshipService,
) {
    @Operation(summary = "특정 user의 친구 목록 조회")
    @GetMapping("/{userId}")
    fun readFriends(@PathVariable userId: Long): ReadFriendsResponseDto {
        return ReadFriendsResponseDto.fromVo(readFriendsService.readFriends(userId))
    }

    @Operation(summary = "친구 관계 추가")
    @PostMapping("/")
    fun createFriendship(@RequestBody createFriendshipRequestDto: CreateFriendshipRequestDto): CreateFriendshipResponseDto {
        return CreateFriendshipResponseDto.fromVo(createFriendshipService.createFriendship(createFriendshipRequestDto.toVo()))
    }
}
