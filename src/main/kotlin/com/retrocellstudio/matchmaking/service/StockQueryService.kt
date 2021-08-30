package com.retrocellstudio.matchmaking.service

import com.retrocellstudio.matchmaking.entity.StockEntity
import com.retrocellstudio.matchmaking.repository.StockRepository
import org.springframework.stereotype.Service

@Service
class StockQueryService(private val stockRepository: StockRepository) {
    fun getStocks(): List<StockEntity> {
        return stockRepository.findAll()
    }
}
