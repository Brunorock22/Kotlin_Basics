import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

fun main() {
    try{

    porcentagem(150)
    }catch (e: IllegalArgumentException){
        println(e.message)
    }
    print(lerIdade())
}

fun porcentagem(numero: Int): String {
    return if (numero in 1..100) {
        "$numero"
    } else {
        throw IllegalArgumentException("Numero fora do range 1 a 100")
    }
}

fun lerIdade(): Int? {
    val reader = FileReader(File("D:\\Multimidia\\Projetos\\microservices-spring-boot\\Kotlin-Basics\\src\\main\\kotlin\\arquivos\\idades.txt"))
    var buffer = BufferedReader(reader)

    try {
        var numero = buffer.readLine()
        return Integer.parseInt(numero)
    } catch (e: NumberFormatException) {
        return null;
    }finally {
        buffer.close()
    }
}