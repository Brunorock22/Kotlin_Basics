fun main(){

    //Array List
    val frutas1 = ArrayList<String>()
    frutas1.add("Maça");
    frutas1.add("Banana")

    val frutas2 = arrayListOf<String>("Maça", "Banana")

    println(frutas2.last())

    val numeros = setOf(1,22,3)

    println(numeros.maxOrNull())
}