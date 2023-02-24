package br.com.erick.fakemerchant.datasource.entity.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Products(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int?=null,
    val name: String,
    val price: Double
)
