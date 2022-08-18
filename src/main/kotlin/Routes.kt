package com.kursor.chroniclesofww2.features

sealed class Routes(
    val node: String,
    val parent: Routes? = null
) {

    fun absolutePath(baseUrl: String) = "baseUrl$relativePath"

    val relativePath: String = (parent?.relativePath ?: "") + "/$node"

    object Battles : Routes("battles") {

        object GET_ALL            : Routes(node = "list",     parent = Battles)
        class  GET_BY_ID(id: Int) : Routes(node = "list/$id", parent = Battles)
        object MY                 : Routes(node = "my",       parent = Battles)
        object SAVE               : Routes(node = "save",     parent = Battles)
        object UPDATE             : Routes(node = "update",   parent = Battles)
        object DELETE             : Routes(node = "delete",   parent = Battles)
    }

    object Users : Routes("users") {
        object GET_ALL                     : Routes(node = "list",             parent = Users)
        class  GET_BY_LOGIN(login: String) : Routes(node = "list/${login}",    parent = Users)
        object REGISTER                    : Routes(node = "register",         parent = Users)
        object LOGIN                       : Routes(node = "login",            parent = Users)
    }

    object Account : Routes("account") {
        object CHANGE_PASSWORD             : Routes(node = "change_password)", parent = Users)
        object UPDATE_USER_INFO            : Routes(node = "update_userinfo",  parent = Users)
        object AUTH                        : Routes(node = "auth",             parent = Users)
    }

    object Game : Routes("game") {
        object WAITING_ROOM : Routes(node = "waiting_room", parent = Game)
        object SESSION      : Routes(node = "session", parent = Game)
        object CREATE       : Routes(node = "create", parent = Game)
        object JOIN         : Routes(node = "join", parent = Game)


    }


}