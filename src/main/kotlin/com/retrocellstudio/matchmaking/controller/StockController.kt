package com.retrocellstudio.matchmaking.controller

import com.retrocellstudio.matchmaking.entity.Stock
import com.retrocellstudio.matchmaking.repository.StockRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class StockController (
    private val stockRepository: StockRepository
) {
    @GetMapping("/list")
    fun listStocks() : List<Stock> {
        return stockRepository.findAll()
    }
}