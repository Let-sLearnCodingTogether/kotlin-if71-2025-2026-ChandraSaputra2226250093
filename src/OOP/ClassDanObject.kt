package OOP

//constructor bisa mutable(var) atau imutable(val)
class MahasiswaConstructor(val npm: String, val nama:String, var ipk: Float)

fun main() {
    val mahasiswaPertama = MahasiswaConstructor("2226250090", "mahasiswa 1", 1.3f)

    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    mahasiswaPertama.ipk = 1.2f
    println(mahasiswaPertama.ipk)
}