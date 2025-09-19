fun main() {
    val users: Array<String> = arrayOf("User1", "User2", "User3")

    println(users[0])
    println(users.get(1))

    users.set(2, "User 3 update")
    println(users[2])

    users[2] = "User 3 Update user"
    println(users[2])

    println("Size : ${users.size}")
}