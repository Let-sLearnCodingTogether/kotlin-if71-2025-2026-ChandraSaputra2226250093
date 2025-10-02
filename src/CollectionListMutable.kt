fun main() {
    val mataKuliahWajib : List<String> = listOf("Kotlin", "Kalkulus", "Algoritma dan Struktur Data")
    val mataKuliahPilihan  : MutableList<String> = mutableListOf("Kotlin", "Logika Fuzzy")

    //tambah data
    mataKuliahPilihan.add("Web 2")
    println(mataKuliahPilihan[0])
    println(mataKuliahPilihan[1])
    println(mataKuliahPilihan[2])

    //tambah data ke index tertentu
    mataKuliahPilihan.add(1, "Web 1")
    println(mataKuliahPilihan[1])

    //hapus index ke
    mataKuliahPilihan.removeAt(1)
    println(mataKuliahPilihan)

    val matakuliah = mataKuliahPilihan + mataKuliahWajib
    println(matakuliah)

    println("================================")
    println("List matakuliah wajib : $mataKuliahPilihan")
    println("Ukuran List matakuliah wajib : ${mataKuliahPilihan.size}")

    println("Index pertama matakuliah wajib : ${mataKuliahPilihan[0]}")

    val matakuliahUppercase = mataKuliahPilihan.map {
        it.uppercase()
    }
    println("List matakuliah uppercase : $matakuliahUppercase")

    val matakuliahLebihDariNKarakter = mataKuliahPilihan.filter {
        it.length > 10
    }
    println("Matakulaiah lebih dari 10 karakter : $matakuliahLebihDariNKarakter")
}