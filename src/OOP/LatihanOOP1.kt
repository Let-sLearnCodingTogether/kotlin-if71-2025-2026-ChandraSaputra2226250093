package OOP

data class GameItem(val id: Int, val name: String, val value: Int, val rarity: String)
class Player(val name: String, var health: Int = 100, var level: Int = 1){
    fun takeDamage(damage: Int){
        health -= damage
        if (health <= 0){
            health = 0
        }

    }
    fun levelUp(){
        level += 1
        health = 100
    }
    fun showStatus(){
        println("Nama: $name, Level: $level, Healt: $health")
    }
}

fun main() {
    val barang: List<GameItem> = listOf(
        GameItem(1, "Pedang Besi", 100, "Common"),
        GameItem(2, "Ramuan Kesehatan", 50, "Common"),
        GameItem(3, "Jubah Bayangan", 500, "Epic")
    )


    val cursedSwordName = barang[0].copy(name = "Pedang Besi Terkutuk", value = 250)

    println(barang[0])
    println(cursedSwordName)

    val chandra = Player("Chandra")
    chandra.showStatus()
    chandra.takeDamage(30)
    chandra.showStatus()
    chandra.levelUp()
    chandra.showStatus()

}