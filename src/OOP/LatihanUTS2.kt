package OOP

class Karyawan(val nama: String, val id:String, var gajiPokok: Double){
    fun tampilkanProfil() : Unit {
        println("$nama, $id, $gajiPokok")
    }

    fun hitungGajiKaryawan(jumlahHariMasuk: Int): Double {
        return (jumlahHariMasuk/22.0)* gajiPokok
    }
}

fun main() {
    val KaryawanA = Karyawan("Chandra", "12345678", 8.0)
    val KaryawanB = Karyawan("Saputra", "87654321", 5.0)

    KaryawanA.tampilkanProfil()
    println("Gaji Yang Diterima : ${KaryawanA.hitungGajiKaryawan(11)}")
    println()

    KaryawanB.tampilkanProfil()
    println("Gaji Yang Diterima : ${KaryawanB.hitungGajiKaryawan(11)}")

}
