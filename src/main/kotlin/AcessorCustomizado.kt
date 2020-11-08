class AcessorCustomizado(val altura: Int, val largura: Int) {
    val isQuadrado: Boolean
        get() =  altura == largura


}

fun main() {
    var acessorCustomizad: AcessorCustomizado = AcessorCustomizado(20, 20)
    print(acessorCustomizad.isQuadrado)
}