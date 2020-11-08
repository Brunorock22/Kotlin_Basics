import java.lang.IllegalArgumentException

interface Expressao
class Numero(val valor: Int): Expressao
class Soma(val esquerdo: Expressao, val direito: Expressao): Expressao

fun avaliacao(expressao: Expressao): Int =
    when(expressao){
        is Numero -> {
            println("RAMIFICAÇÂO VOID : ${expressao.valor}")
            expressao.valor
        }
        is Soma -> avaliacao(expressao.direito) + avaliacao(expressao.esquerdo)
        else -> throw  IllegalArgumentException("Um Momento Amigo")
    }
fun main(){
    //((1+2)+4)

    val resultado = avaliacao(Soma(Soma(Numero(1), Numero(2)),Numero(4)))
    println(resultado)

}