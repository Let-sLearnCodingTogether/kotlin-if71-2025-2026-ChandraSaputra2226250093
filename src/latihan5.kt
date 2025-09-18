fun main() {
    var totalBelanja: Double = 0.0
    println("Status Awal -> Total Belanja: Rp$totalBelanja")

    totalBelanja += 3 * 25000
    println("Setelah Item A -> Total Belanja: Rp$totalBelanja")

    totalBelanja += 2 * 15000
    println("Setelah Item B -> Total Belanja: Rp$totalBelanja")

    totalBelanja -= 10000
    println("Setelah Diskon -> Total Belanja: Rp$totalBelanja")

    val biayaLayanan = totalBelanja/100
    totalBelanja += biayaLayanan
    println("Ditambah Biaya Layanan (Rp$biayaLayanan) -> Total Belanja: Rp$totalBelanja")
    
    println("")
    println("===================================")
    println("Total Akhir yang Harus Dibayar: Rp$totalBelanja")
    println("===================================")
}