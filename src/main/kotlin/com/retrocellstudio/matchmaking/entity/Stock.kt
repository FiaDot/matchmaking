package com.retrocellstudio.matchmaking.entity

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "stocks")
class Stock (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: String,
    val type: String,
    val name: String,
    val code: String,
    val ticker: String,
    val updatedDate: LocalDateTime,
    val createdDate: LocalDateTime
)