package br.com.erick.fakemerchant.datasource.repositories

import org.springframework.data.jpa.repository.JpaRepository
import br.com.erick.fakemerchant.datasource.entity.model.Products as Product

interface ProductRepository:JpaRepository<Product, Int> {
    fun save(products: Product): Product
    fun update(products: Product)
    fun delete(id: Int)
    fun find(products: Product)
}