package OOP

fun main() {
    val stokBarang = mapOf(
        "Buku" to 45,
        "Pena" to 78,
        "Indomie" to 120,
        "Teh" to 30,
        "Binder" to 12,
        "Kopi" to 55
    )

//    var sisaDikit =stokBarang.minOf{it.value}
//    println(stokBarang.minOf{it.value})

    println("Barang yang perlu segera di re-stock adalah: ${stokBarang.minOf{it.key}} sisa " + stokBarang.minOf{it.value})

}


