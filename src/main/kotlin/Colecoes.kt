//List - armazenam os itens na ordem em que são adicionados e permitem itens duplicados
//para criar uma lista somente de leitura -> listOf()
//para criar uma lista mutável -> mutableListOf()

//Set - não são ordenados e permitem apenas itens únicos
//para criar um conjunto somente de leitura -> setOf()
//para criar um conjunto mutável -> mutableSetOf()

//Map - armazenam itens como pares chave-valor
//para criar um mapa mutável somente leitura -> mapOf()
//para criar uma lista mutável -> mutableMapOf()
//as chaves tem tipo String (chave) e os valores tipo Int (valor)

fun main() {
    /*
    //List
    //somente leitura
    val leituraDeFiguras = listOf("triângulo", "quadrado", "circulo")
    println(leituraDeFiguras)
    //mutável
    val formatos = mutableListOf<String>("triângulo", "quadrado", "circulo")
    println(formatos)

    //first e last -> funções de extensão
    println("O primeiro item da lista é ${leituraDeFiguras.first()}")
    println("O ultimo item da lista é ${leituraDeFiguras.last()}")

    //para obter o número de itens em uma lista usar o count()
    println("Está lista tem ${leituraDeFiguras.count()} itens")

    //para adicionar e remover itens da lista
    formatos.add("pentágono")
    println(formatos)
    formatos.remove("pentágono")
    println(formatos)

    //para verificar se o item está na lista
    println("circulo" in leituraDeFiguras)

    //para buscar pelo índice
    println(leituraDeFiguras[0])

    //Set - as mesmas funções de extensão se aplicam aqui (.add(), .remove(), .in, .count())
    //somente leitura
    val leituraDeFrutas = setOf("maça", "banana", "cereja", "banana") //não vai aparecer o segundo "banana"
    //mutável
    val frutas = mutableSetOf<String>("maça", "banana", "cereja")

    //Map
    //somente leitura
    val leituraMenu = mapOf("carne" to 100, "frutas" to 50, "vegetais" to 75)
    //mutável
    val menu = mutableMapOf<String, Int>("carne" to 100, "frutas" to 50, "vegetais" to 75)
    println(menu)
    //para acessar um valor em um mapa, use o operador de acesso de index [] com a sua chave
    println("O valor do item da carne no menu é de: R$${leituraMenu["carne"]}")

    //adicionando valor
    menu["temperos"] = 120
    println(menu)
    //removendo valores -> precisa ser a chave
    menu.remove("temperos")

    //para verificar se uma chave especifica já está incluída em um map -> .containsKey()
    println(menu.containsKey("temperos"))

    //para obter uma coleção com os valores específicos use.keys ou.values
    println(leituraMenu.values)
    println(leituraMenu.keys)

    //para verificar se o valor está dentro do map
    val valorBuscado = 120
    val result = if(leituraMenu.containsValue(valorBuscado)){
        println("Valor encontrado: $valorBuscado")
    } else{
        println("Valor não encontrado")
    }
    println(result)
    */
    val numVerdes = listOf(2,14,25)
    val numVermelhos = listOf(2,4)
    println("A soma das listas verdes e vermelha é ${numVerdes.count() + numVermelhos.count()}")

    val suporte = setOf("HTTP", "HTTPS", "FTP")
    val suporteSolicitado = "https"
    val isSuporte = suporte.contains(suporteSolicitado.uppercase())
    println("suporte para $suporteSolicitado: $isSuporte")

    val num2Palavra = mutableMapOf(1 to "um", 2 to "dois", 3 to "três")
    val num = 2
    println("$num é escrito como ${num2Palavra[num]}")
}