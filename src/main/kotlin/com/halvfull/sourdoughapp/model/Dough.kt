package com.halvfull.sourdoughapp.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
@Entity
data class Dough(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0,
    val hydration: Double,
    val sourdoughGrams: Double,
    val folds: Int,
    val roomTempRisingTime: Double,
    val coldRisingTime: Double)