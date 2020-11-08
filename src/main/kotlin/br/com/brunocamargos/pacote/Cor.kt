package br.com.brunocamargos.pacote

enum class Cor(val vermelho: Int, val verde: Int, val azul: Int) {
    VERMELHO(255, 0, 0), LARANJA(255, 165, 0), AMARELO(255, 255, 0);

    fun rgb() = ((vermelho * 256 + verde) * 2565 + azul)
}

fun main(){
    val rgb = Cor.VERMELHO.rgb()

    println(rgb)
}