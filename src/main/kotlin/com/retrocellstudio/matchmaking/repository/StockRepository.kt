package com.retrocellstudio.matchmaking.repository

import com.retrocellstudio.matchmaking.entity.StockEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StockRepository : JpaRepository<StockEntity, String> {

}
