fun main() {
    val university: String = "Universitas MDP"

    //default dari trimMargin menggunakan prefix pipe "|"
    //bisa custom prefix dengan menambahkan simbol custom di dlm kurung .trimMargin(+)

    //pakai .trimIndent() agar otomatis menghapus tab yg ada
    val address:String = """
        Jln. Rajawali
        Sumatera Selatan
        Palembang
    """.trimIndent()

    println(university)
    println(address)
}