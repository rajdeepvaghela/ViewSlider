package com.rdapps.viewslider

enum class Platform {
    Android,
    IOS,
    Web,
    Desktop
}

expect fun getPlatform(): Platform