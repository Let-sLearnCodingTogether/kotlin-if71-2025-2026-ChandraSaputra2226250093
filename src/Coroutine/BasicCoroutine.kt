package Coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

//suspend
//Login Page -> Menunggu Login -> Home
fun main() = runBlocking {
    println("Aplikasi dimulai")

    login()

    println("Pindah halaman dari login, ke home")
}

suspend fun login(){
    println("Melakukan validasi Email & Password")
    delay(2_000)
    println("Validasi sukses")
}