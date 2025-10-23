package OOP

fun main() {
    val person = object {
        val name = "NAMA"
        fun greet() : String {
            return "Hello $name"
        }
    }

    println(person.greet())
}