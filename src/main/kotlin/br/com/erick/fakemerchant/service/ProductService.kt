package br.com.erick.fakemerchant.service

import br.com.erick.fakemerchant.port.ProductPort
import org.springframework.stereotype.Service

@Service
class ProductService(
    val productPort:ProductPort
) {
    fun save(){
        this.productPort.save()
    }
    fun find(){
        this.productPort.findById()
    }
    fun findAll(){
        this.productPort.findAll()
    }
    fun deleteById(){
        this.productPort.deleteById()
    }

    fun updateProduct(){
        this.productPort.updateProduct()
    }
}