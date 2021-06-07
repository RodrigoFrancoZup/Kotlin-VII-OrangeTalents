package br.com.alura.bytebank.teste

//Para uilizar esse recursos é bom ativar as dicas de tipo "hints" da IDE IntelliJ: File -> Settings -> Pesquisar por "Inlay Hints" -> Em lambda marcar tudo e em Typers marcar tudo (exceto o property, mas pode marcar se quiser...)

//Aprendemos que existe o tipo função, ou seja, assim como uma variável pode ser String, Int, etc, ela também pode ser função

//Criando uma variável do tipo função:
//val variavelFuncao: () -> Unit
//Dentro do '()' colocamos os parâmetros da função, e após o '->' o retorno da função.

//No kotlin, toda variável tem que ser inicializada.
//Independente de como vamos fazer isso, a assinatura da variável tem que ser a mesma da assinatura da função, sempre!
//Como iniciar um tipo função? Há diversar maneiras!


//Será referencia para a variavel variavelFuncaoMultiplicacao
fun multiplicacao(a: Int, b: Int): Int {
    return a * b
}

//Essa classe será a referencia para variavelFuncaoMultiplicacaoClass
//Basta a classe implementar uma função do mesmo tipo e implmentar o método invoke!
class multiplicacao : (Int, Int) -> Int {

    override fun invoke(a: Int, b: Int): Int {
        return a * b
    }

}

fun main() {

    // 1)Inicializando com a referencia de uma função:

    //Poderiamos omitir o tipo função: val variavelFuncaoMultiplicacao = ::multiplicacao ou então escrever completo:
    val variavelFuncaoMultiplicacao: (Int, Int) -> Int = ::multiplicacao
    //Executando a função através da variável:
    val resultadoFuncao = variavelFuncaoMultiplicacao(5, 4)
    println(resultadoFuncao)

    // 2)Inicializando com a referencia de uma classe/objeto que implementa a função:
    val variavelFuncaoMultiplicacaoClass = multiplicacao()
    //Executando a função através do objeto/classe:
    val resultadoClasse = variavelFuncaoMultiplicacaoClass(10, 10)
    println(resultadoClasse)

    // 3) Inicializando com função anonima:
    val variavelFuncaoMultiplicacaoAnonima = fun(a: Int, b: Int): Int {
        return a * b
    }
    //Executando a função através de função anonima:
    val resultadoAnonima = variavelFuncaoMultiplicacaoAnonima(7, 5)
    println(resultadoAnonima)

    //4) Incializando com função Lambda - é a mais utilizada:
    // Em uma lambda, a última linha é o retorno
    // Se usarmos a palavra return, vamos voltar para a função que a chamaou, neste caso seria a função main()
    val variavelFuncaoMultiplicacaoLambda = { a: Int, b: Int ->
        a * b
    }
    //Executando a função através de lambda:
    val resultadoLambda = variavelFuncaoMultiplicacaoLambda(9, 8)
    println(resultadoLambda)
}

