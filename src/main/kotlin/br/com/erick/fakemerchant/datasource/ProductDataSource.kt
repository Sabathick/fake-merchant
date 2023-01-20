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

    override fun findById(findProduct: Products?) {
       this.productRepository.findById(
           Products(
               id= null,
               name = findProduct!!.name,
               price = findProduct.price
           )
       )
    }

    override fun deleteById() {
        TODO("Not yet implemented")
    }

    override fun findAll() {
        TODO("Not yet implemented")
    }

    override fun updateProduct() {
        TODO("Not yet implemented")
    }

}