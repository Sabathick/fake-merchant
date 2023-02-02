package br.com.erick.fakemerchant.service

import br.com.erick.fakemerchant.datasource.entity.Products
import br.com.erick.fakemerchant.port.ProductPort
import com.br.com.erick.fakemerchant.openapi.model.CreateProduct
import org.springframework.stereotype.Service

@Service
class ProductService(
    val productPort:ProductPort
) {
    fun save(createProduct: CreateProduct?) {
        this.productPort.save(createProduct)
    }

    fun find(findProduct: Products?) {
        this.productPort.find(findProduct)
    }

    fun findAll() {
        this.productPort.findAll()
    }

    fun delete(deleteProduct: Int) {
        this.productPort.delete(deleteProduct)
    }

    fun update(updateProduct: Products?) {
        this.productPort.update(updateProduct)
    }
}