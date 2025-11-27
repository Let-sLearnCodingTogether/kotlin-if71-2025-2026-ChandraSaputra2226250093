package Exception

fun validasiUmur3(umur: Int): Int{
    if (umur < 0){
        throw IllegalArgumentException("Umur tidak boleh negatif")
    }

    return umur
}

fun main() {
    println("start")
    try {
        println(validasiUmur3(20))
        println(validasiUmur3(-2))
    }catch (error: IllegalArgumentException){
        println("Error dengan message ${error.message}")
    }catch (error: ArithmeticException){
        println("Error pembagian dengan nol ${error.message}")
    }catch (error: Exception){
        println("Error tidak diketahui ${error.message}")
    }finally {
        println("Message dari block finally")
    }
    println("Finish")
}