package Coroutine

import java.util.Date

fun main() {
    val runnable0 = Runnable{
        println(Date())
        Thread.sleep(2_000)
        println("hello runnable 0")
    }

    val runnable1 = Runnable{
        println(Date())
        Thread.sleep(2_000)
        println("hello runnable 1")
    }

    val thread0 = Thread(runnable0)
    val thread1 = Thread(runnable1)

    thread0.start()
    thread1.start()

    println("program selesai")
}