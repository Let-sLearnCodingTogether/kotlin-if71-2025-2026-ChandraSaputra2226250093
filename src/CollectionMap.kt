fun main() {
    //immutable
    val buah : Map<String, Int> = mapOf(
        "jeruk" to 10,
        "apel" to 3
    )
    println(buah["jeruk"])

    //mutable
    val buah2 : MutableMap<String, Int> = mutableMapOf(
        "jeruk" to 10,
        "apel" to 3
    )
    println(buah["apel"])
}