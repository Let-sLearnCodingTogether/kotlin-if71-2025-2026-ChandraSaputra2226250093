package Exception

fun validasiUmur(umur: Int){
    if (umur < 0){
        throw IllegalArgumentException("Umur tidak boleh negatif")
    }
    println("Umur valid $umur")
}

fun main() {
    println("start")
    validasiUmur(20)
    validasiUmur(-2)
    println("Finish")
}