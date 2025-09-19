fun main() {
    val isLoggedIn = false

    //&&  operan kedua akan dievaluasi jika operan pertama bernilai true
    //||  operan kedua akan dievaluasi jika operan pertama bernilai False
    if (isLoggedIn || (5/0 == 0)){
        println("User has access")
    }
    else{
        println("Access denied")
    }
}