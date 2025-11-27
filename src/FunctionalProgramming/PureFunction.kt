package FunctionalProgramming

fun addPureFunction(a: Int, b: Int): Int = a + b

// Contoh impure function
var count = 0 //anggap saja ini global variabel
fun addImpureFunction(a: Int): Int {
    count += 1
    return a + count
}

fun main() {
    println(addPureFunction(1, 2))//3
    println(addPureFunction(1, 2))//3
    println(addPureFunction(1, 2))//3

    println(addImpureFunction(1))//2
    println(addImpureFunction(1))//3
}