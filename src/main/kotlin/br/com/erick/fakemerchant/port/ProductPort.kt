package br.com.erick.fakemerchant.port

import com.br.com.erick.fakemerchant.openapi.model.CreateProduct
import com.br.com.erick.fakemerchant.openapi.model.Findproduct

interface ProductPort {
    fun save(createProduct: CreateProduct?)
    fun findById(findProduct: Findproduct?)

    fun deleteById()
    fun findAll()
    fun updateProduct()
}