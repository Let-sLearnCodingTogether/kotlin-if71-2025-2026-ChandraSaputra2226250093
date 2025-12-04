package Coroutine

import java.util.concurrent.Executors

fun main() {
//    val executor = Executors.newFixedThreadPool(3) //sekali jalan 3, ganti-ganti
//    val executor = Executors.newCachedThreadPool() //bakal buat thread baru terus
    val executor = Executors.newSingleThreadExecutor() //jalan satu-satu, sama seperti .newFixedThreadPool(1)

    for (i in 1..10){
        executor.submit {
            val threadName = Thread.currentThread().name

            println("Tugas $i berjalan di thread $threadName")

            Thread.sleep(1_000)
        }
    }

    executor.shutdown()
}