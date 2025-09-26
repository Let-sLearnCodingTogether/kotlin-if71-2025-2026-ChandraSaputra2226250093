fun printUser(firstname: String, vararg users: String){
    println(firstname)
    for (user in users){
        println(user)
    }
}

fun main() {
    printUser("TEST","User1", "User2")
}
