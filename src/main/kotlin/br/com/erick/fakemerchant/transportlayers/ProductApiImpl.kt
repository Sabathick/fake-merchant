package br.com.erick.fakemerchant.transportlayers

import br.com.erick.fakemerchant.datasource.entity.Products
import br.com.erick.fakemerchant.service.ProductService
import com.br.com.erick.fakemerchant.openapi.api.ProductApi
import com.br.com.erick.fakemerchant.openapi.model.CreateProduct
import com.br.com.erick.fakemerchant.openapi.model.Findproduct
import com.br.com.erick.fakemerchant.openapi.model.Product
import io.swagger.annotations.ApiParam
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductApiImpl(
    val productService: ProductService
):ProductApi{
    override fun create(
        createProduct: CreateProduct?
    ): ResponseEntity<Product?>? {
        this.productService.save(createProduct)
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun findById(findproduct: Findproduct?): ResponseEntity<Product> {
        this.productService.find(findProduct)
        return ResponseEntity<Product>(HttpStatus.NOT_IMPLEMENTED)
    }

        override fun deleteById(
        @ApiParam(required = true, value = "") @RequestHeader(
            required = true,
            value = "DeleteId"
        ) deleteId: Int?
    ): ResponseEntity<Void>? {
        return ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED)
    }

    override fun updateById(updateProduct: Products?): ResponseEntity<Product> {
        this.productService.update(updateProduct)
        return ResponseEntity<Product>(HttpStatus.NOT_IMPLEMENTED)
    }
}