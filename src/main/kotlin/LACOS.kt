fun main(){
    //Intervalos
    /*
    //para criar um intervalo use '..'
    val faces = 1..6
    //se o intervalo não incluir o valor final usar '..<'
    val unidades = 1..<4
    //para uma ordem inversa usar o downTo
    val caixas = 4 downTo 1
    //para incrementar um valor ao intervalo usar o step
    val pulos = 1..5 step 2 //vai de 1 a 5 pulando a cada 2
    // também ser com o char - no caso para letras
    */
    //Laços
    //For
    for (num in 1..10){
        print("$num\n")
    }
    val sabores = listOf("cenoura", "chocolate", "maça")
    for (sabores in sabores){
        println("Que delicia, é um bolo de $sabores\n")
    }
    //While
    var bolosComidos = 0
    while (bolosComidos < 3){
        println("Coma um bolo")
        bolosComidos++
    }
}