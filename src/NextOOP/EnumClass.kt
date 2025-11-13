package NextOOP

enum class DayOfTheWeek{
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu,
    Minggu
}

fun main() {
    val days = DayOfTheWeek.values()

    days.forEach {
        println("${it.ordinal}. ${it.name}")
    }

    //valueOf bersifat case-sensitif
    println(DayOfTheWeek.valueOf("Senin"))
//    println(DayOfTheWeek.valueOf("senin")) //return nya error

    val today = DayOfTheWeek.valueOf("Senin")
    when(today){
        DayOfTheWeek.Senin -> println("Yah, senin lagi")
        DayOfTheWeek.Selasa -> println("Hari selasa")
        DayOfTheWeek.Sabtu, DayOfTheWeek.Minggu -> println("Hari libur")
        else -> println("Hari lain")
    }
}