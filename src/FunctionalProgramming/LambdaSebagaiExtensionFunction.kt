package FunctionalProgramming

val repeatFun : String.(Int) -> String = {times -> this.repeat(times)}

fun main() {
    println("Hi".repeatFun(3)) //HiHiHi
}