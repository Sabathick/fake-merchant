package br.com.erick.fakemerchant.datasource

import br.com.erick.fakemerchant.datasource.entity.model.Products
import br.com.erick.fakemerchant.datasource.repositories.ProductRepository
import br.com.erick.fakemerchant.port.ProductPort
import org.springframework.stereotype.Component
import br.com.erick.fakemerchant.domain.entity.Products as Product

@Component
class ProductDataSource(
    val productRepository: ProductRepository
):ProductPort {
    override fun save(product: Product): Product {
        val saved = this.productRepository.save(
            Products(
                id = null,
                name = product.name,
                price = product.price
            )
        )
        return Product(saved.id, saved.name, saved.price)
    }

    override fun find(findProduct: Products?): Products {
        //return productRepository.find(findProduct)
        TODO("Not yet implemented")
    }


    override fun delete(deleteProduct: Int) {
        this.productRepository.delete(deleteProduct)
    }

    override fun findAll() {
        TODO("Not yet implemented")
    }

    override fun update(updateProduct: Products?) {
        //if (updateProduct != null) {
            //this.productRepository.update(updateProduct)
        //}
        TODO("Not yet implemented")
    }

}
