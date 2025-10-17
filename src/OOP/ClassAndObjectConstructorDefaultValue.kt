package OOP

class MahasiswaConstructorDefaultValue(val npm: String, val nama: String, var ipk: Float = 0.0f){
    init {
        println("Ini blok init")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaConstructorDefaultValue("2226250090", "Mahasiswa Pertama")

    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    val mahasiswaKedua = MahasiswaConstructorDefaultValue("2226250091", "Mahasiswa Kedua", 3.0f)

    println(mahasiswaKedua.npm)
    println(mahasiswaKedua.nama)
    println(mahasiswaKedua.ipk)
}