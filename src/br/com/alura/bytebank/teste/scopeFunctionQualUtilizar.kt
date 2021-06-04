package br.com.alura.bytebank.teste




fun main() {

    /*
    Doc oficial: https://kotlinlang.org/docs/scope-functions.html#function-selection
    - Na hora de aplicar a Scope Functions - Qual escolher? -

    -Let ->  Objeto de contexto = Lambda Argumento (chamamos tb de Argumento); Valor de Retorno = Resultado Lambda (chamamos tb como Lambda)
     Ex de uso:
               1)Dar um print após utilizar as operações do tipo map, filter...".let(::println)"
               2)Fazer safe call, onde objeto é do tipo que pode ser null, mas dentro do let só executa se ele não for null
               3)Quando queremos fazer diversas modificações (operações) em um escopo limitidao e depois retornar esse valor! "mexer nas variaveis"


     -With ->  Objeto de contexto = Reciver/receptor (Objeto que chama é o objeto jogado para o bloco); Valor de Retorno = Resultado Lambda (chamamos tb como Lambda)
     Obs: É a única função que não é extendia (É USADA SOMENTE DESSA MANEIRA), logo não a chamamos com '.'
     Ex de uso:
                1)A frase que ajuda quando usar essa função é: Com esse objeto (Objeto de Contexto) faça as operações a seguir. Retorno pode ter computação (alteração) ou não retonrar nada!


     -Run ->  Objeto de contexto = Reciver/receptor (Objeto que chama é o objeto jogado para o bloco); Valor de Retorno = Resultado Lambda (chamamos tb como Lambda)
     Obs: podemos executar o RUN sem utilizar a extensão, ou seja, podemos chamá-lo sem o '.'
                Ex de uso:
                1) Muito parecido com let e com with (só que extendido - usamos o '.')
                Seu uso é indicado para inicializar valores das properties de um objeto e no fim para computar mudança (fazer operações)


     -Apply ->  Objeto de contexto = Reciver/receptor (Objeto que chama é o objeto jogado para o bloco); Valor de Retorno = Objeto de contexto (o próprio Reciver)
                Ex de uso:
                1)A frase que ajuda quando usar essa função é: Aplique nesse objeto essas atribuições/valores. É usado para preencher as properties de um objeto!


    -Also ->  Objeto de contexto = Lambda Argumento (chamamos tb de Argumento); Valor de Retorno = Objeto de contexto (o próprio Reciver)
              Ex de uso:
              1)Quando retiramos o seu uso a aplicação deve continuar funcionando, logo seu uso é mais para printar informação, log,
     */



}

