package br.com.erick.fakemerchant.transportlayers

import br.com.erick.fakemerchant.service.ProductService
import com.br.com.erick.fakemerchant.openapi.api.ProductApi
import com.br.com.erick.fakemerchant.openapi.model.CreateProduct
import com.br.com.erick.fakemerchant.openapi.model.Product
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductApiImpl( val productService: ProductService
):ProductApi{

    override fun create(
        createProduct: CreateProduct?
    ): ResponseEntity<Product?>? {
        this.productService.save(createProduct)
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}