package NextOOP

interface Vehicle { //kedua method termasuk abstrak karena tidak ada body, sehingga harus di overide keduanya
    fun accelerate()
    fun stop()
}

class Motor1 : Vehicle{
    override fun accelerate() {
        println("accelerate")
    }

    override fun stop() {
        println("stop")
    }

}

fun main() {
    val motor1 = Motor1()

    motor1.accelerate()
    motor1.stop()
}