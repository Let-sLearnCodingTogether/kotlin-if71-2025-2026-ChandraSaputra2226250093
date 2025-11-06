package NextOOP

//super supaya bisa mengambil/mengakses semua ynag ada di parent nya
open class HewanBaru{
    open fun suara(){
        println("Suara Hewan")
    }
}

class Bebek(): HewanBaru(){
    override fun suara() {
        super.suara()
        println("Suara bebek: Kwek Kwek")
    }
}

fun main() {
    val duck = Bebek()
    duck.suara()
}