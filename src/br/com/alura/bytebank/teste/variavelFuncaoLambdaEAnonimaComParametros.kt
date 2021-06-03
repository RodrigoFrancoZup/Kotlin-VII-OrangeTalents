package br.com.alura.bytebank


fun main() {

    //Para entender melhor, talvez seja legal você ler primeiro os coments da classe variaveisDeFuncao e variaveilDeFuncaoComParametro
    //A grande diferença é que utilizando lambda ou função anonima a função a ser executada fica vinculada somente a uma "variável", nao poderemos atribuí-la em outra "variavel"


    //Vamos criar agora uma "variável de função" através do Lambda!
    //Agora a função lambda terá 2 parâmetros e um retorno do tipo Int
    //Asisinatura da funcao lambda tem que bater com a assinatura da variavel de função
    //Quem chama a função lambda sempre passa "apelidos" para os parametros,
    //após o '{' colocamos dois apelidos, são eles: 'a' e 'b' e após o '->' veio o retorno
    //A ultima linha do bloco '{}" de lambda é sempre o retorno!
    //Caso optemos por omitir o tipo da função de variavel (minhaFuncaoLambda), teríamos que tipar os apelidos 'a' e 'b'
    //Obs: Caso a variaável de função tenha em sua assiantura 3 parametros, mas na implementação vamos usar apenas 2,
    //podemos colocar '_' no lugar do apelido desse parâmetro, assim não o usaremos e a implementação será possível!
    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
        a + b
    }

    //Executando a função lambda
   val resultadoLambda =  minhaFuncaoLambda(10,10)
    println(resultadoLambda)

    //Vamos criar agora uma "variável de função" através de uma FUNÇÃO ANONIMA!
    //Agora a função anonima terá terá 2 parâmetros e um retorno do tipo Int
    //Asisinatura da funcao anonima tem que bater com a assinatura da variavel de função
    //Caso optemos por omitir o tipo da função de variavel (minhaFuncaoLambda), teríamos que tipar os parametros 'a' e 'b'
    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a,b) : Int {
        return a+b
    }

    //Executando a função anonima
    val resultadoAnonima = minhaFuncaoAnonima(10,40)
    println(resultadoAnonima)

}

