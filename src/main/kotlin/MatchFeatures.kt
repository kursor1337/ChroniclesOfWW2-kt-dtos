package com.kursor.chroniclesofww2.features

import kotlinx.serialization.Serializable

@Serializable
data class MatchingGameMessageDTO(
    val type: MatchingGameMessageType,
    val message: String
)

@Serializable
data class MatchingUserInfoDTO(
    val login: String,
    val score: Int
)

enum class MatchingGameMessageType {
    MESSAGE, GAME_DATA, TIMEOUT, ACCEPT, REJECT, INIT, GAME_ID
}