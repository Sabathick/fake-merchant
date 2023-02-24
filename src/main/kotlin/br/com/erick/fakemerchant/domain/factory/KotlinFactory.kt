package br.com.erick.fakemerchant.domain.factory

import br.com.erick.fakemerchant.datasource.entity.model.Products
class KotlinFactory{
    private var id: Int? = null

    private  var name: String? = null

    private var price: Double? = null

    fun id(id:Int?) = apply{ this.id = id}

    fun name(name:String) = apply { this.name= name }

    fun price(price:Double) = apply { this.price= price }

    fun build() = Products(name=name!!, price=price!!)
}