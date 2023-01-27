package br.com.erick.fakemerchant.service

import br.com.erick.fakemerchant.port.ProductPort
import com.br.com.erick.fakemerchant.openapi.model.CreateProduct
import com.br.com.erick.fakemerchant.openapi.model.Findproduct
import org.springframework.stereotype.Service

@Service
class ProductService(
    val productPort:ProductPort
) {
    fun save(createProduct: CreateProduct?) {
        this.productPort.save(createProduct)
    }

    fun findById(findProducts: Findproduct?) {
        this.productPort.findById(findProducts)
    }

    fun findAll() {
        this.productPort.findAll()
    }

    fun deleteById(deleteProduct: DeleteProduct?) {
        this.productPort.deleteById(deleteProduct)
    }

    fun updateProduct() {
        this.productPort.updateProduct()
    }
}