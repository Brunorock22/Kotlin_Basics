fun main() {
    //val é imutavel
    val nome: String = "Bruno Camargos"
    val dataNascimento : Int = 1997
    var anoAtual = 2020
    println("Meu nome é $nome tenho ${ calculaIdade(anoAtual, dataNascimento)}")


}

private fun calculaIdade(anoAtual: Int, dataNascimento: Int) = anoAtual - dataNascimento