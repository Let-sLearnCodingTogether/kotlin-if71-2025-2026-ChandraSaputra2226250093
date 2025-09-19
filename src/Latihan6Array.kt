fun main() {
    val hari: Array<String> = arrayOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu")

    println("=====================")
    println("Jumlah Hari : ${hari.size}")

    println("Hari pertama:" +hari[0])
    println("Hari terakhri: "+hari[hari.size-1])

    hari[4] = "Jum'at Barokah"
    println(hari[4])
    println("=====================")
}