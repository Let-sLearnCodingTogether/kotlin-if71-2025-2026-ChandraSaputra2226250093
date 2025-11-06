package NextOOP

sealed class HasilOperasi(){
    data class Success(val message: String) : HasilOperasi()
    data class Error(val message: String): HasilOperasi()
    object Loading : HasilOperasi()
}

fun prosesHasil(hasilOperasi: HasilOperasi){
    when(hasilOperasi){
        is HasilOperasi.Loading -> println("Sistem Loading")
        is HasilOperasi.Success -> println(hasilOperasi.message)
        is HasilOperasi.Error -> println(hasilOperasi.message)
    }
}

fun main() {
    prosesHasil(HasilOperasi.Loading)
    prosesHasil(HasilOperasi.Success("Success message"))
    prosesHasil(HasilOperasi.Error("Error message"))

}