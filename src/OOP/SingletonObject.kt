package OOP

object DatabaseConnection{
    fun connect(){
        println("Connection to databse...")
    }
    fun disconnect(){
        println("Disconnect from database...")
    }
}

fun main() {
    DatabaseConnection.connect()
    DatabaseConnection.disconnect()
}