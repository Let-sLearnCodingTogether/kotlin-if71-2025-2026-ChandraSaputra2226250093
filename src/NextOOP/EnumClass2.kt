package NextOOP

enum class DayOfTheWeek2 (val isWeekend : Boolean = false){
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu(true),
    Minggu(true)
}

fun main() {
    val today = DayOfTheWeek2.Jumat
    println("Hari ini hari : ${today.name}, hari ini weekend : ${today.isWeekend}")
}