fun main() {
    val firstUser: Pair<String, Int> = Pair("user 1", 20)
    println(firstUser.first)
    println(firstUser.second)

    //Cara singkat
    val secondUser: Pair<String, Int> = "User 2" to 20
    println(secondUser.first)
    println(secondUser.second)
}