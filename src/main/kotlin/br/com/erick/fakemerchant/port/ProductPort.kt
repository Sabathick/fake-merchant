package br.com.erick.fakemerchant.port

interface ProductPort {
    fun save()
    fun findById()

    fun deleteById()
    fun findAll()
    fun updateProduct()
}