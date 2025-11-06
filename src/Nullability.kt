fun main() {
    //Null
    var student: String = "Budi"
    println(student)

//    student = null

    var prodiIf: String? = "IF" //kalau null tidak akan mengerjakan println, tetapi menampilkan null
//    var prodiIf: String? = null
    println(prodiIf?.length)

    var prodiSi: String? = "Sistem Informasi" //kalau null, akan print yg kanan
    println(prodiSi ?: "tanpa Prodi")

    var token: String? = "oke" //kalau null, akan error
    println(token!!.length)

    val email: String? = "email"
    if (email != null){
        println(email.length)
    }
}