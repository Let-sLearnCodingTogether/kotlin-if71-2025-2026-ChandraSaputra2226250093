package OOP

data class Kendaraan(val merek:String, val tahun:Int)

fun main() {
    val tayo = Kendaraan("Tayo", 2015)
//    println(tayo.merek) //kalau tulis seperti ini akan panjang kebawah, jd di ubah seperti dibawah
    val (merek, tahun) = tayo
    println(merek)
    println(tahun)
}