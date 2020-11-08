//Divisiveis por 15 = Fizz Buzz
//Divisiveis por 3 = Fizz
//Divisiveis por 5 = Buzz
//Caso contrtatio imprime numero

fun fizzBuzz(numero: Int) = when {
    numero % 5 == 0 -> println("Fizz Buzz")
    numero % 3 == 0 -> println("Fizz")
    numero % 5 == 0 -> println("Buzz")
    else -> println(numero)
}

fun main(){
    for (numero in 1..150){

    fizzBuzz(numero)
    }
}