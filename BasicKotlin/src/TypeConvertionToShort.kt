fun main() {
    val myInt: Int = 30000
    val myShort: Short = myInt.toShort()

    println(myShort)

    val myInt2: Int = 40000
    val myShort2: Short = myInt2.toShort()

    println(myShort2)
    println(Integer.toBinaryString(myInt2).padStart(length = 32, padChar = '0'))


    //Kalau bit pertama 0 -> POSITIF
    //Kalau bit pertama 1 -> NEGATIF

    //Short : 16bit
    //01100011 10111111  //ubah dari 0 ke 1, 1 ke nol dari hasil integertobinary
    //convert ke desimal
    //25535 hasil conversi ke desimal
    //karena rumus complement harus ditambhakan 1 pada hasil convert desimal dari hasil bilangan biner
    //25536 adalah bilangan desimal
    //karena biner awal dimulai dari 1 maka hasil convert adalah negatif
    //jadi hasil convert int(32bit) menjadi short(16bit) adalah -25536

}