package com.retrocellstudio.matchmaking

import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.annotation.PostConstruct

private val logger = KotlinLogging.logger {}

@SpringBootApplication
class MatchmakingApplication

fun main(args: Array<String>) {
    runApplication<MatchmakingApplication>(*args)
}
