package NextOOP

interface Electronic{
    val brand : String

    fun trunOn()
    fun turnOff()

    fun cleanDrive(){
        println("Membersihkan debu dari perangkang $brand")
    }
}

class Fan (override val brand :String) : Electronic{
    override fun trunOn() {
        println("Kipas angin merek $brand berputar")
    }

    override fun turnOff() {
        println("Kipas angin merek $brand berhenti")
    }
}

class SmartLight(override val brand: String) : Electronic {
    override fun trunOn() {
        println("Lampu pintar merek $brand berputar")
    }

    override fun turnOff() {
        println("Lampu pintar merek $brand berhenti")
    }

}

fun main() {
    val kipas = Fan("Maspion")
    kipas.trunOn()
    kipas.turnOff()

    val kipas1 = Fan("LG")
    kipas1.trunOn()
    kipas1.turnOff()

    val lampu = SmartLight("L")
    lampu.trunOn()
    lampu.cleanDrive()
    lampu.turnOff()
}