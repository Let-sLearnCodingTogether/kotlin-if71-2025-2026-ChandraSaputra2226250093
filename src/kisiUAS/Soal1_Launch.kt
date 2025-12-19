package kisiUAS

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Mulai")

    launch { //pakai launch, launch akan jalan namun karena dia sifatnya delay maka ia akan skip dulu sambil nunggu delay itu
        download1()
    }

    println("Selesai")
}

suspend fun download1(){
    println("Download data")
    delay(3_000)
}