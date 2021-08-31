package com.retrocellstudio.matchmaking.controller

import com.retrocellstudio.matchmaking.model.Stock
import com.retrocellstudio.matchmaking.service.StockQueryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StockController (
    private val stockQueryService: StockQueryService
) {
    @GetMapping("/list")
    fun listStocks() : List<Stock> {
        return stockQueryService.getStocks()
    }
}