fun main() {
    val animals : Set<String> = setOf("Zebra", "Kucing")
    println(animals)

    println("Size : ${animals.size}")
    println("Is Empty : ${animals.isEmpty()}")
    println("Contains : ${animals.contains("Kucing")}")
    println("Contains All : ${animals.containsAll(listOf("Zebra", "Kucing"))}")

    //iterator untuk looping
    val animalIterator = animals.iterator()
    while (animalIterator.hasNext()) { //kalau hasnext = true maka looping berjalan
        println("Animal : ${animalIterator.next()}")
    }
}