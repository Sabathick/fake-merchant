package br.com.erick.fakemerchant.datasource.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "product")
data class Products(
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Int?=null,
    val name: String,
    val price: Double
)