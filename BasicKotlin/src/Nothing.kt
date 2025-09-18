fun fail(message: String){
    throw IllegalArgumentException(message)
}
fun main() {
    //Program akan berhenti disini dengan error
    fail("terjadi kesalahan fatal")
}