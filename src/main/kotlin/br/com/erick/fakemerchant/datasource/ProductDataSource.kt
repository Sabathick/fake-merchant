package br.com.erick.fakemerchant.datasource

import br.com.erick.fakemerchant.datasource.entity.Products
import br.com.erick.fakemerchant.datasource.repositories.ProductRepository
import br.com.erick.fakemerchant.port.ProductPort
import com.br.com.erick.fakemerchant.openapi.model.CreateProduct
import org.springframework.stereotype.Component

@Component
class ProductDataSource(
    val productRepository: ProductRepository
):ProductPort {
    override fun save(createProduct: CreateProduct?) {
        this.productRepository.save(
            Products(
                id = null,
                name = createProduct!!.name,
                price = createProduct.price
            )
        )
    }

    override fun find(findProduct: Products?) {
        this.productRepository.find(Products)
    }

    override fun delete(deleteProduct: Int) {
        this.productRepository.delete(deleteProduct)
    }

    override fun findAll() {
        TODO("Not yet implemented")
    }

    override fun update(updateProduct: Products?) {
        this.productRepository.update(updateProduct)
    }

}
