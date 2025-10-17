package OOP

class MahasiswaThisKeyword (val nama:String){
    fun sayGoodBye(nama:String){
        println("$nama : ${this.nama}") //this untuk merujuk ke constructor yang ada di class
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaThisKeyword("Mahasiswa Pertama")

    mahasiswaPertama.sayGoodBye("Mahasiswa1")
}