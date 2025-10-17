package OOP

data class GameItem(val id: Int, val name:String, val value:Int, val rarity:String)

fun main() {
    val barang : List<GameItem> = listOf(GameItem(1, "Pedang Besi", 100, "Common"),
        GameItem(2, "Ramuan Kesehatan", 50, "Common"),
        GameItem(3, "Jubah Bayangan", 500, "Epic"))


    val cursedSwordName = barang[0].copy(name = "Pedang Besi Terkutuk", value = 250)

    println(barang[0])
    println(cursedSwordName)
}