fun main() {
    //mutable jika ada perubahan data
    val daftarJudulBuku : MutableList<String> = mutableListOf("Laskar Pelangi", "Bumi Manusia", "Filosofi Teras", "Laskar Pelangi")

    val koleksiGenre : Set<String> = setOf("Novel", "Filsafat", "Sejarah")

    val inventarisBuku : MutableMap<String, String> = mutableMapOf(
        "978-602-03-8591-6" to "Laskar Pelangi",
        "978-979-3062-79-2" to "Bumi Manusia",
        "978-602-06-3534-7" to "Filosofi Teras"
    )

    println("--- 1. Inisialisasi Data ---")
    println("List judul buku berhasil dibuat: $daftarJudulBuku")
    println("Set genre berhasil dibuat: $koleksiGenre")
    println("Map inventaris buku berhasil dibuat: $inventarisBuku")

    println("")
    println("--- 2. Manipulasi dan Analisis Data ---")
    println("Judul buku dengan ISBN 978-979-3062-79-2 adalah ${inventarisBuku.get("978-979-3062-79-2")}")

    inventarisBuku["978-623-91289-8-2"] = "Atomic Habits"
    println("Buku baru 'Atomic Habits' berhasil ditambahkan.")

    inventarisBuku.entries.forEach { (key, value) ->
        println("Key: $key, value: $value")
    }
    println("Jumlah genre unik yang ada di toko: ${koleksiGenre.size}")

    println("")
    println("Daftar semua judul buku yang tercatat:")
    println(daftarJudulBuku)

}