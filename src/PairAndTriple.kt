fun main() {
    val pair: Pair<String, String> = Pair("First name", "last name")
    println(pair.first)
    println(pair.second)

    val triple: Triple<String, String, String> = Triple("First name", "last name", "child name")
    println(triple.first)
    println(triple.second)
    println(triple.third )
}