//Cada parâmetro deve ter um tipo, e múltiplos parâmetros devem ser separados por vírgulas
//O tipo de retorno é escrito após os parênteses da função (), separados por dois pontos

fun main(){
    println(soma(1,2))

    imprimirMessagemComPrefixo(prefixo = "Log", menssagem = "Olá")
    imprimirMessagemComPrefixo( "Olá", "Log")
    imprimirMessagemComPrefixo("Olá")

    imprimirMenssagem("Olá")
}

//começo de funções
//expressão única ≥ não precisa especificar o tipo, mas pode se precisar
fun soma (x:Int,y:Int) = x + y
//argumentos nomeados ≥ permite colocar os argumentos na ordem que quiser
//valores padrão dos parâmetros ≥ para omitir o valor padrão da chamada da função defina o valor dela depois do tipo com o sinal (=)
fun imprimirMessagemComPrefixo(menssagem : String, prefixo : String = "Info"){
    println("´[$prefixo] $menssagem")
}
//funções sem retorno
fun imprimirMenssagem(menssagem: String){
    println(menssagem)
}

//retornos iniciais

