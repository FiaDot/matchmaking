package com.retrocellstudio.matchmaking

import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.annotation.PostConstruct

private val logger = KotlinLogging.logger {}

@SpringBootApplication
class MatchmakingApplication {
    @Value("\${matchmaking.title-message}")
    val titleMessage: String = ""

    @PostConstruct
    fun printTitleMessage() {
        println(titleMessage);
    }
}

fun main(args: Array<String>) {
    runApplication<MatchmakingApplication>(*args)

    logger.trace("trace test")
    logger.debug { "debug test" }
    logger.info { "info test" }
    logger.warn ("warn test")
    logger.error { "error test" }
}
