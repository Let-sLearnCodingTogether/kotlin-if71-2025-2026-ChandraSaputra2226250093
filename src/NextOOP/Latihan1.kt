package NextOOP

open class Pegawai(val nama: String, val gajiDasar:Int){
    open fun hitungGaji(){
        println(gajiDasar)
    }
}

class Manager(nama: String, gajiDasar: Int) : Pegawai(nama, gajiDasar){
    override fun hitungGaji() {
        println(gajiDasar*10)
    }
}

class Programmer(nama: String, gajiDasar: Int) : Pegawai(nama, gajiDasar){
    override fun hitungGaji() {
        println(gajiDasar*10)
    }
}

fun main() {
    val pekerja  : MutableList<Pegawai> = mutableListOf()
    val manager = Manager("Andi", 10)
    val programmer = Programmer("Budi", 20)
    pekerja.add(manager)
    pekerja.add(programmer)

    for (i in pekerja){
        i.hitungGaji()
    }


//    manager.hitungGaji()
//    programmer.hitungGaji()
}