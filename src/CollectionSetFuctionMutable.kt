fun main() {
    val animals : MutableSet<String> = mutableSetOf()
    // tambah data untuk data mutable
    animals.add("Kucing")
    animals.add("Zebra")
    println(animals)

    animals.remove("Kucing")
    println(animals)

    animals.addAll(listOf("Kambing", "Monyet", "Kerbau"))
    println(animals)

    animals.removeAll(listOf("Kambing", "Monyet", "Kerbau"))
    println(animals)

    //untuk mempertahankan isi, misal isi ada "Kambing", "Monyet", "Kerbau", "Zebra", maka seluruh data
    //akan dihapus dan sisakan zebra
    animals.retainAll(listOf("Zebra"))
    println(animals)

    animals.clear()
    println(animals)
}