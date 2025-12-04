package OperatorOverloadingAndConvention

data class MANA(var current: Int, var max: Int){
    operator fun plus(other: MANA): MANA{
        return MANA(current + other.current, maxOf(max, other.max))
    }

    operator fun inc(): MANA{
//        val newcurrent = (this.current+10).coerceAtMost(this.max)
        return MANA(current+10.coerceAtMost(max), max)
    }

    operator fun minus(angka : Int): MANA{
        return MANA(current - angka.coerceAtLeast(0), max)
    }
}

fun main() {
    var mana1 = MANA(50, 100)
    var mana2 = MANA(20, 50)

    println(mana1+mana2)
    mana1++
    println(mana1)
    println(mana1-30)

}