package NextOOP

//abstrak tidak bisa dibuat objek, hanya bisa diturunkan
abstract class Printer(){
    abstract fun cetak()

    fun info(){
        println("Info Printer")
    }
}

class PrinterLaser() : Printer(){
    override fun cetak() {
        println("Print dengan menggunakan laser")
    }
}

fun main() {
    val printerLaser = PrinterLaser()
    printerLaser.cetak()
    printerLaser.info()
}