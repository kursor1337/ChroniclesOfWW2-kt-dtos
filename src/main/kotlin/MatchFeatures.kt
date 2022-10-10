package com.kursor.chroniclesofww2.features

import kotlinx.serialization.Serializable

@Serializable
data class MatchingGameMessageDTO(
    val type: MatchingGameMessageType,
    val message: String
)

enum class MatchingGameMessageType {
    MESSAGE, GAME_DATA, TIMEOUT, ACCEPT, REJECT, INIT
}