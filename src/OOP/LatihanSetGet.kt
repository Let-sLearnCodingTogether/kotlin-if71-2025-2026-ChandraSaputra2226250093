package OOP

class PersegiPanjang(val panjang: Double, val lebar: Double) {
    val luas: Double
        get() = panjang * lebar
}

class Mahasiswa() {
    var ipkKum: Double = 0.0
        set(value) {
            field = when {
                value < 0.0 -> 0.0
                value > 4.0 -> 4.0
                else -> value
            }
        }
}

fun main() {
    val luasPersegiPanjang = PersegiPanjang(2.0, 4.0)
    println(luasPersegiPanjang.luas)

    val ipkKumulatif = Mahasiswa()
    ipkKumulatif.ipkKum = 4.5
    println(ipkKumulatif.ipkKum)

    ipkKumulatif.ipkKum = -4.5
    println(ipkKumulatif.ipkKum)

    ipkKumulatif.ipkKum = 3.5
    println(ipkKumulatif.ipkKum)
}