package NextOOP

enum class DayOfTheWeek3(val isWeekend: Boolean = false) {
    Senin,
    Selasa,
    Rabu,
    Kamis,
    Jumat,
    Sabtu(true),
    Minggu(true);

    //hari ini senin
    //target hari adalah jumat
    fun daysUntil(targetHari: DayOfTheWeek3): Int {
        return if (this.ordinal < targetHari.ordinal) {
            //4-0
            targetHari.ordinal - this.ordinal
        } else {
            //4-0+7
            targetHari.ordinal - this.ordinal + DayOfTheWeek3.values().count()
        }
    }

    companion object {
        fun today(): DayOfTheWeek3 {
            val today = 0
            return DayOfTheWeek3.values().first { it.ordinal == today }
        }
    }
}

fun main() {
    val today = DayOfTheWeek3.Senin
    val targetHari = DayOfTheWeek3.Jumat

    val sisaHari = today.daysUntil(targetHari)
    println(sisaHari)

    println(DayOfTheWeek3.today())
}