fun main() {
    val firstUser: Pair<String, Int> = Pair("user 1", 20)

    //destructuring
    val (username, age) = firstUser

    println(username)
    println(age)
}