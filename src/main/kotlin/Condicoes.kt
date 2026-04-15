import kotlin.random.Random

//IF e ELSE já aprendidos
//When (é o Switch da linguagem) - quando tiver uma expressão condicional com múltiplas ramificações
//Pode ser usado tanto como declaração (não retorna um valor) quanto para uma expressão
fun main(){
    /*
    //declaração
    val obj = "casa"
    when (obj){
        "1" -> println("um")
        "Olá" -> println("Saudação")
        else -> println("Desconhecido")
    }
    //expressão
    val resultado = when (obj) {
        "1" -> "Um"
        "Olá" -> "Saudação"
        else -> "Desconhecido"
    }
    println(resultado)
    //sem uso do sujeito
    val trafegoDeLuzesAtual = "Roxo"
    val trafegoDeLuz = when{
        trafegoDeLuzesAtual == "Verde" -> "Siga"
        trafegoDeLuzesAtual == "Amarelo" -> "Reduza a velocidade"
        trafegoDeLuzesAtual == "Vermelho" -> "Pare"
        else -> "Desconhecido"
    }
    println(trafegoDeLuz)
    */
    val button = "X"
    println(
        when{
            button == "UM" -> "SIM"
            button == "B" -> "NÂO"
            button == "X" -> "MENU"
            button == "Y" -> "NADA"
            else -> "Não existe tal botão"
        }
    )

    val primeiroValor = Random.nextInt(6)
    val segundoValor = Random.nextInt(6)
    if (segundoValor == primeiroValor){
        println("Você venceu")
    } else {
        println("Você perdeu")
    }
}

