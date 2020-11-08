import java.util.*

// De A a F em binarios

fun main(){
    val binaryRepresentation = TreeMap<Any, Any>()
    //Adicinonando valores ao map
    for (c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())

        binaryRepresentation[c] = binary
    }
    println("${binaryRepresentation}")

    for ((key, value) in binaryRepresentation){
        println("Chave: $key e valor $value")
    }
}