package FunctionalProgramming

fun String.isPalindrome(): Boolean{
    return this == this.reversed()
}

fun main() {
    println("katak".isPalindrome())
}