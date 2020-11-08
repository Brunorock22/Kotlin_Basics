fun main() {
    println(max(25, 1))
    println(maxExpressao(25, 100))
}
// Corpo de expressao
fun maxExpressao(a: Int, b: Int): Int = if (a > b) a else b

// Corpo de blocl
fun max(a: Int,b: Int): Int{
    return if (a > b) a else b
}

