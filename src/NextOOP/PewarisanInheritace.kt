package NextOOP

//open untuk inheritance(biar bisa diwariskan)
//override supaya bisa mewarisi/ ada open harus override
//final supaya class lain tidak bisa mengakses fungsi di parent nya
open class Hewan(val name: String) {
    open fun suara() {
        println("Suara hewan")
    }
}

open class Ayam(name: String) : Hewan(name) {
    final override fun suara() {
        println("Kuku ruyuk")
    }
}

class AnakAyam(name: String) : Ayam(name) {
//    override fun suara() {
//        println("Petok petok")
//    }
}

fun main() {
    val rambo = Ayam(name = "Rambo")
    rambo.suara()
}