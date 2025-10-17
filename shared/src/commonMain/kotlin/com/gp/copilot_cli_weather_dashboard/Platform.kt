package com.gp.copilot_cli_weather_dashboard

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform