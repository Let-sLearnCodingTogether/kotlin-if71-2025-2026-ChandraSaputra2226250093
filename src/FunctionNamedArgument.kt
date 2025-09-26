fun calculate(
    kuis1: Double,
    kuis2: Double,
    tugas1: Double,
    tugas2: Double,
    uts: Double,
    uas: Double
) {
    println(kuis1 + kuis2 + tugas1 + tugas2 + uts + uas)
}

fun main() {
    calculate(kuis1 = 10.6, uts = 100.0, uas = 100.0, tugas1 = 10.5, tugas2 = 10.6, kuis2 = 20.6)
}