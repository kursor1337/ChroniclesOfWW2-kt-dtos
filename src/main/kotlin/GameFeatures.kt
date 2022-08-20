package com.kursor.chroniclesofww2.features

import com.kursor.chroniclesofww2.model.serializable.Battle
import com.kursor.chroniclesofww2.model.serializable.GameData
import kotlinx.serialization.Serializable

@Serializable
data class CreateGameReceiveDTO(
    val initiatorLogin: String,
    val password: String,
    val battle: Battle,
    val boardHeight: Int,
    val boardWidth: Int,
    val invertNations: Boolean
)

@Serializable
data class CreateGameResponseDTO(
    val gameId: Int
)

@Serializable
data class JoinGameReceiveDTO(
    val connectedUserLogin: String,
    val gameId: Int,
    val password: String?
)

@Serializable
data class JoinGameResponseDTO(
    val message: String,
    val gameData: GameData?
)


@Serializable
data class WaitingGameInfoDTO(
    val id: Int,
    val initiatorLogin: String
) {

}

object GameFeaturesMessages {
    const val SUCCESS = "Success"
    const val NO_GAME_WITH_SUCH_ID = "No game with such id"
    const val CONNECT = "Connect"
    const val WAITING_FOR_CONNECTIONS = "Waiting for connections"
    const val USER_CONNECTED = "User connected"
    const val INVALID_MOVE = "Invalid move"
    const val NO_SUCH_PLAYER = "No such player"
    const val GAME_STARTED = "game_started"
    const val OTHER_PLAYER_DISCONNECTED = "Other player disconnected"
    const val INVALID_PASSWORD = "Invalid password"
    const val SESSION_TIMED_OUT = "Session timed out"
    const val REQUEST_FOR_ACCEPT = "request_for_accept"
    const val REQUEST_GAME_DATA = "request_mission_info"
    const val REJECTED = "rejected"
    const val ACCEPTED = "accepted"
    const val CANCEL_CONNECTION = "cancel_connection"
    const val NOT_RECEIVED = "not received"
    const val INVALID_JSON = "invalid json"
}



@Serializable
data class GameSessionDTO(
    val type: GameSessionMessageType,
    val message: String
)


enum class GameSessionMessageType {

    CONNECT,
    DISCONNECT,
    GAME_EVENT,
    MOVE,
    ERROR,

}
