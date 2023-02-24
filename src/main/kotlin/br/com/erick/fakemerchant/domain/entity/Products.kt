package br.com.erick.fakemerchant.domain.entity

data class Products(
    var id: Int?=null,
    val name: String,
    val price: Double
)