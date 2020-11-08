fun main(){
    println(isLetter( 'f'))
    println(isNotDigit( '8'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'