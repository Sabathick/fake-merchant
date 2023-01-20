package br.com.erick.fakemerchant.datasource.repositories


import br.com.erick.fakemerchant.datasource.entity.Products
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository:JpaRepository<Products, Int> {
    abstract fun findById(products: Products)
}