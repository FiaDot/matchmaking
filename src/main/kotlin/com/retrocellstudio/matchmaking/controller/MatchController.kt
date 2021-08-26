package com.retrocellstudio.matchmaking.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class MatchController {
    @GetMapping("/join")
    fun join() : String {
        return "called join"
    }

    @GetMapping("/join/param")
    fun join(@RequestParam p1: String, @RequestParam p2: String) : String {
        return "called join with ${p1}, ${p2}"
    }
}