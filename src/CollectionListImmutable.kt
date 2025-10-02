fun main() {
    val mataKuliahWajib : List<String> = listOf("Kotlin", "Kalkulus", "Algoritma dan Struktur Data")

    println("List matakuliah wajib : $mataKuliahWajib")
    println("Ukuran List matakuliah wajib : ${mataKuliahWajib.size}")

    println("Index pertama matakuliah wajib : ${mataKuliahWajib[0]}")

    val matakuliahUppercase = mataKuliahWajib.map {
        it.uppercase()
    }
    println("List matakuliah uppercase : $matakuliahUppercase")

    val matakuliahLebihDariNKarakter = mataKuliahWajib.filter {
        it.length > 10
    }
    println("Matakulaiah lebih dari 10 karakter : $matakuliahLebihDariNKarakter")
}