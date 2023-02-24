package br.com.erick.fakemerchant.port

import br.com.erick.fakemerchant.datasource.entity.model.Products
import br.com.erick.fakemerchant.domain.entity.Products as Product

interface ProductPort {
    fun save(products: Product): Product
    fun find(findProduct: Products?): Products
    fun delete(deleteProduct: Int)
    fun findAll()
    fun update(updateProduct: Products?)
}