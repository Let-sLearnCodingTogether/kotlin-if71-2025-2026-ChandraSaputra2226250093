fun main() {
    val users : Array<String> = arrayOf("User 1", "User 2")

    users.forEach {
        println("Foreach : $it")
    }

    println("======================")

    users.forEach { user ->
        println("Foreach2 : $user")
    }

    println("======================")

    users.forEachIndexed { index, user ->
        println("Foreach index: $index : $user")
    }

    println("======================")

    users.forEachIndexed { index, user ->
        println("Foreach index: ${index+1} : $user")
    }
}