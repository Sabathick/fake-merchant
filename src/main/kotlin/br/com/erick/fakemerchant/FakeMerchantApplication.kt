package br.com.erick.fakemerchant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FakeMerchantApplication

fun main(args: Array<String>) {
	runApplication<FakeMerchantApplication>(*args)
}
