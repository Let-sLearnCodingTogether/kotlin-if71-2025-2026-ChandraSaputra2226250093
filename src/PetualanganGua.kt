fun main() {
    print("Masukkan nama pemain: ")
    val namaPemain = readLine() ?: "Petualang"

    var kesehatanPemain = 100
    var punyaKunciEmas = false
    var jumlahPotion = 2

    var sedangBermain = true

    while (sedangBermain) {
        println("\n============================")
        println("Status Pemain:")
        println("Nama       : $namaPemain")
        println("Kesehatan  : $kesehatanPemain")
        println("Potion     : $jumlahPotion")
        println("============================")

        if (kesehatanPemain <= 0) {
            println("Sayang sekali, $namaPemain telah kalah...")
            break
        }

        println("Didepan kamu terdapat 2 buah jalur:")
        println("1). Jalur gelap dan seram")
        println("2). Jalur tenang dan sunyi")
        print("Pilih jalur (1/2): ")

        val pilihanJalur = readLine()

        if (pilihanJalur == "1") {
            print("Pilih patung (naga/griffin/ular): ")
            val pilihanPatung = readLine()

            when (pilihanPatung?.lowercase()) {
                "naga" -> {
                    println("Patung naga mengeluarkan api! Kamu terbakar!")
                    kesehatanPemain -= 35
                }
                "griffin" -> {
                    println("Patung griffin bersinar... kamu mendapatkan kunci emas!")
                    punyaKunciEmas = true
                }
                "ular" -> {
                    println("Patung ular menggigitmu! Racun menyebar ke tubuhmu!")
                    kesehatanPemain -= 15
                }
                else -> {
                    println("Kamu ragu-ragu, tapi tidak terjadi apa-apa...")
                }
            }

            if (jumlahPotion > 0 && kesehatanPemain > 0) {
                print("Apakah kamu ingin menggunakan potion? (y/n): ")
                val pakaiPotion = readLine()
                if (pakaiPotion?.lowercase() == "y") {
                    jumlahPotion--
                    kesehatanPemain += 10
                    if (kesehatanPemain > 100) kesehatanPemain = 100
                    println("Kamu minum potion. Kesehatanmu sekarang $kesehatanPemain")
                }
            }

        } else if (pilihanJalur == "2") {
            println("Kamu menginjak perangkap! Anak panah mengenai tubuhmu...")
            kesehatanPemain -= 25
        } else {
            println("Kamu kebingungan dan hanya berdiri di tempat...")
        }

        if (punyaKunciEmas) {
            println("Kamu menggunakan kunci emas dan menemukan artefak kuno!")
            sedangBermain = false
        } else {
            println("Kamu harus mencari kunci emas terlebih dahulu!")
        }

        if (kesehatanPemain <= 0) {
            println("Sayang sekali, $namaPemain tidak sanggup melanjutkan...")
            sedangBermain = false
        }
    }
    println("\n=== Permainan selesai ===")
}