package me.vavra.dependencybugreproduction

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform