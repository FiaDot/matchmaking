package com.retrocellstudio.matchmaking.repository

import com.retrocellstudio.matchmaking.entity.Stock
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StockRepository : JpaRepository<Stock, String>