package NextOOP

class Gedung2(val nama: String){
    private val alamat: String = "Jln. Sudirman"

    inner class RuanganRapat{
        fun mulaiRapat(){
            println("Rapat di mulai")
            println("Rapat di gedung $nama di alamat $alamat")
        }
    }
}

fun main() {
    val gedungA = Gedung2("Universitas MDP")
    val ruanganRapat = gedungA.RuanganRapat()

    ruanganRapat.mulaiRapat()
}