fun main(){
    var tempetura: Int =0
    var somatorio: Int = 0
    var quantidade: Int = 0

    while (tempetura != 100){
        println("Digite uma temperatura ou 100 para sair !")

        tempetura = readLine()!!.toInt()
        if (tempetura != 100){
            somatorio += tempetura
            quantidade++
        }

    }

    println(mediaTemperatura(quantidade, somatorio))



}

fun mediaTemperatura(quantidade: Int, somatorio: Int): Int{
    return somatorio / quantidade
}