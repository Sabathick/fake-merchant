package br.com.erick.fakemerchant.port

import br.com.erick.fakemerchant.datasource.entity.Products
import com.br.com.erick.fakemerchant.openapi.model.CreateProduct

interface ProductPort {
    fun save(createProduct: CreateProduct?)
    fun find(findProduct: Products?)
    fun delete(deleteProduct: Int)
    fun findAll()
    fun update(updateProduct: Products?)
}