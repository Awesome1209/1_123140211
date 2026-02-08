package com.awiseptian.tugas1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
