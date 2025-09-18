fun main() {
    val firstUser: Triple<String, Int, Boolean> = Triple("user 1", 20, false)

    //destructuring
    val (username, age, bool) = firstUser

    println(username)
    println(age)
    println(bool)
}