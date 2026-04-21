import kotlin.math.PI
//Cada parâmetro deve ter um tipo, e múltiplos parâmetros devem ser separados por vírgulas
//O tipo de retorno é escrito após os parênteses da função (), separados por dois pontos

fun main(){
    /*
    println(soma(1,2))

    imprimirMessageComPrefixo(prefixo = "Log", message = "Olá")
    imprimirMessageComPrefixo( "Olá", "Log")
    imprimirMessageComPrefixo("Olá")

    imprimirMessage("Olá")

    println(resgistrarUsuario("Maru_442", "Maru442@exemple.com"))
    */
    //println(areaCirculo(2))
    //println(areaCirculo2(2))
    //println(intervaloSegundos(2))

    //val uppercaseString = {text: String -> text.uppercase()}
    //println(uppercaseString("vaca amarela"))

    val numeros = listOf(1, -2, 3, -4, 5, -6)
    val positivos = numeros.filter ({ x -> x > 0 })
    val isNegativo = {x: Int -> x < 0}
    val negativo = numeros.filter (isNegativo)
    println(positivos)
    println(negativo)

    val tempoMinutos = listOf(2, 10, 15, 1) //valores em minutos
    val minSec = paraSegundos("minutos") //especifico o tipo de tempo
    val totalTempoEmSegundos = tempoMinutos.map(minSec).sum()//vai pegar os valores gerados em minSec e vai somar os valores totais
    println("Total de tempo em $totalTempoEmSegundos segundos")


}

//começo de funções
//expressão única ≥ não precisa especificar o tipo, mas pode se precisar
fun soma (x:Int,y:Int) = x + y
//argumentos nomeados ≥ permite colocar os argumentos na ordem que quiser
//valores padrão dos parâmetros ≥ para omitir o valor padrão da chamada da função defina o valor dela depois do tipo com o sinal (=)
fun imprimirMessagemComPrefixo(message : String, prefixo : String = "Info"){
    println("´[$prefixo] $message")
}
//funções sem retorno
fun imprimirMenssagem(message: String){
    println(message)
}

//retornos iniciais
val registrarNomesUsuarios = mutableListOf("john_doe", "jane_smith")
val registrarEmailUsuarios = mutableListOf("john@example.com", "jane@example.com")
fun resgistrarUsuario (username : String, email: String): String{
    if (username in registrarNomesUsuarios){
        return "Nome de usuário já em uso. Por favor escolha um nome de usuário"
    }
    if (email in registrarEmailUsuarios){
        return "Email já cadastrado. Por favor escolha um email diferente"
    }
    registrarNomesUsuarios.add(username)
    registrarEmailUsuarios.add(email)
    return "Usuário registrado com sucesso: $username"
}

//ex01
fun areaCirculo(area: Int): Double{
        return PI * area * area
}
//ex02
fun areaCirculo2(area: Int): Double = PI * area * area
//ex 03
fun intervaloSegundos(horas: Int = 0, minutos: Int = 0, segundos: Int  = 0) = ((horas * 60) + minutos) * 60 + segundos


//Funções lambda
//as expressões são escritas entre chaves
//os parâmetros seguidos por um ->
//pode ser usada para ser um parâmetro de outra função
//retorna uma expressão de outro função
//invocar uma expressão por conta propria

fun paraSegundos(tempo: String): (Int) -> Int = when (tempo){
    "hora" -> {valor -> valor * 60 * 60}
    "minutos" -> {valor -> valor * 60}
    "segundos" -> {valor -> valor}
    else -> {valor -> valor}
}