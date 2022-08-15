package com.kursor.chroniclesofww2.features

import kotlinx.serialization.Serializable

@Serializable
data class RegisterReceiveDTO(
    val login: String,
    val username: String,
    val password: String
)

@Serializable
data class RegisterResponseDTO(
    val token: String?,
    val message: String
)

object RegisterErrorMessages {
    const val SUCCESS = "Success"
    const val USER_ALREADY_REGISTERED = "User already registered"
}

