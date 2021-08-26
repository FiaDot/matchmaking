package com.retrocellstudio.matchmaking

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.annotation.PostConstruct

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
}
