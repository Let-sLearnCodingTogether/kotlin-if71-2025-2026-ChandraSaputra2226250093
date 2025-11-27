package Exception

fun validasiUmur1(umur: Int){
    if (umur < 0){
        throw IllegalArgumentException("Umur tidak boleh negatif")
    }
    println("Umur valid $umur")
}

fun main() {
    println("start")
    try {
        validasiUmur1(20)
        validasiUmur1(-2)
    }catch (error: IllegalArgumentException){
        println("Error dengan message ${error.message}")
    }
    println("Finish")
}