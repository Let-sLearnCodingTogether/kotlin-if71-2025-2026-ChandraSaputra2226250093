package Exception

fun validasiUmur2(umur: Int): Int{
    if (umur < 0){
        throw IllegalArgumentException("Umur tidak boleh negatif")
    }

    return umur/0
}

fun main() {
    println("start")
    try {
        validasiUmur2(20)
        validasiUmur2(-2)
    }catch (error: IllegalArgumentException){
        println("Error dengan message ${error.message}")
    }catch (error: ArithmeticException){
        println("Error pembagian dengan nol ${error.message}")
    }catch (error: Exception){
        println("Error tidak diketahui ${error.message}")
    }
    println("Finish")
}