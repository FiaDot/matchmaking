package com.retrocellstudio.matchmaking.entity

import com.retrocellstudio.matchmaking.model.Stock
import java.time.LocalDateTime
import javax.persistence.*

// Entity : DB에서 읽은 레코드
@Entity
@Table(name = "stocks")
class StockEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "id", nullable = false, updatable = false)
    val id: String,
    var type: String,
    var name: String,
    var code: String,
    var ticker: String,
    var updatedDate: LocalDateTime,
    var createdDate: LocalDateTime,
)

fun StockEntity.toModel(): Stock {
    return Stock(
        id = this.id,
        type = this.type
    )
}

