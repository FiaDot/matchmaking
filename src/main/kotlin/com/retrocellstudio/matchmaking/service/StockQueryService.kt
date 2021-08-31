package com.retrocellstudio.matchmaking.service

import com.retrocellstudio.matchmaking.entity.toModel
import com.retrocellstudio.matchmaking.model.Stock
import com.retrocellstudio.matchmaking.repository.StockRepository
import org.springframework.stereotype.Service

@Service
class StockQueryService(private val stockRepository: StockRepository) {
    fun getStocks(): List<Stock> {
        return stockRepository.findAll().map { it.toModel() }
    }
}
