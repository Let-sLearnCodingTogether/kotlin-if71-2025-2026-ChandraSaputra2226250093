package kisiUAS

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

//launch dan runBlocking

fun main() = runBlocking {
    println("Mulai")

    download()

    println("Selesai")
}

suspend fun download(){
    println("Download data")
    delay(3_000)
}