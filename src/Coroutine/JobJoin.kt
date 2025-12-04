package Coroutine

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Aplikasi dimulai")

    val job : Job = launch {
        updateVersion2()
    }

    println("Apakah job ini selesai? ${job.isCompleted}")
    println("Apakah job ini aktif? ${job.isActive}")
    println("Apakah job ini dibatalkan ${job.isCancelled}")

    job.join() //akan menunggu sampai dengan job selesai

    println("Aplikasi sedang digunakan")

    println("Apakah job ini selesai? ${job.isCompleted}")
    println("Apakah job ini aktif? ${job.isActive}")
    println("Apakah job ini dibatalkan ${job.isCancelled}")
}

suspend fun updateVersion2(){
    delay(7_000)
    println("Update selesai.")
}