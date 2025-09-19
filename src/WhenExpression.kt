fun main() {
    val finalExam='A'
    val nilaiLulus = arrayOf('A','B')

    when(finalExam){
        'A' -> println("Lulus")
        'B' -> println("Lulus juga")
        'C' -> println("Ya bisa lulus")
        //bisa pakai kurung kurawal
        else -> {
            println("Tidak lulus")
        }
    }

    when(finalExam){
        'A', 'B' -> println("Lulus")
        'C' -> println("Ya bisa lulus")
        //bisa pakai kurung kurawal
        else -> {
            println("Tidak lulus")
        }
    }

    when{
        finalExam == 'A' || finalExam == 'B' -> println("Lulus")
        finalExam == 'C' ->println("Ya bisa lulus")
        else -> println("Tidak lulus")
    }

    var nilai= 70
    when{
        nilai ==70 -> nilai=90
    }
    println(nilai)

    var status1 = false
    when(finalExam){
        'A','B' -> status1= true
        else -> status1=false
    }
    var status = when(finalExam){
        'A','B' -> true
        else -> false
    }
    println(status)

    when(finalExam){
        in nilaiLulus ->println("Lulus")
        !in nilaiLulus -> println("Tidak lulus")
    }

    when(finalExam){
        is Char -> println("Ya, ini char")
        is String -> println("Ini string")
        !is Char -> println("Bukan char")
    }
}