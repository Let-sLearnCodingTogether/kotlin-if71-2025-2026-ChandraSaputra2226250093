package FunctionalProgramming

fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    println(operateOnNumbers(1, 3) { x, y -> x + y }.toInt())
    val result1 = operateOnNumbers(1, 3) { x, y -> x * y }
    println(result1)
    operateOnNumbers(1, 3) { x, y -> x - y }
}