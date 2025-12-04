package Coroutine

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Aplikasi dimulai")

    val job : Job = launch {
        updateVersion1()
    }

    println("Apakah job ini selesai? ${job.isCompleted}")
    println("Apakah job ini aktif? ${job.isActive}")
    println("Apakah job ini dibatalkan ${job.isCancelled}")

    println("Aplikasi sedang digunakan")
}

suspend fun updateVersion1(){
    delay(5_000)
    println("Update selesai.")
}