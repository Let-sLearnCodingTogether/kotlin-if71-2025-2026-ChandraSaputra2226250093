package Exception

import NextOOP.Motor1
class StokHabisException(msg: String) : Exception(msg)

class Barang (val nama: String, var stok: Int){
    fun beliBarang(barang: Barang, jumlahBeli: Int){
        if (jumlahBeli > barang.stok){
            throw StokHabisException("Gagal beli [$nama]. Stok hanya sisa [$stok]")
        }
        stok -= jumlahBeli
        println("Berhasil membeli [$jumlahBeli] [$nama]")
    }
}

fun main() {
    val beli = Barang("laptop", 10)

    beli.beliBarang(beli ,2)
    println(beli.stok)
}