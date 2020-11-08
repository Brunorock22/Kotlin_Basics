import br.com.brunocamargos.pacote.Cor

fun obterMnemonica(cor: Cor) =
    when (cor){
        Cor.VERMELHO -> "Ver"
        Cor.AMARELO -> "Alguém"
        Cor.LARANJA -> "Legal"

    }

fun main(){
    val mnemonica = obterMnemonica(Cor.LARANJA)
    print(mnemonica)
}