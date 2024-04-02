package com.rev.applogincompose

sealed class Routes(val route: String) {
    object Login : Routes("Login")
}