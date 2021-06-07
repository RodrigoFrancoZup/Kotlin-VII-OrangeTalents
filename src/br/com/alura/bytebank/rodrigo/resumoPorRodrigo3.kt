package br.com.alura.bytebank.rodrigo



/*
    - Agora sabemos que existe o tipo função;
    - Que uma função pode receber parâmetros ou retornar om valor do tipo função. Esse é o HOF - Higher Order Function.

    Agora vamos falar sobre as Funções de Escopo (Function Scope);
    Na biblioteca padrão do Kotlin, há diversas funções prontas que são Higher Order Function (HOF), ou seja, funções que recebem funções,
    nós podemos utilizar essas funções prontas, basta invocarmos as mesmas e passarmos os parâmetros (isso inclui a função).
    São elas: let, run, with, apply, also.

    Exemplo de uso com Let. Neste exemplo através da variavel 'nome' que é String vou chamar a função de escopo let e já vou passar como parâmetro uma função lambda,
    esse parâmetro do tipo funcção pode ficar fora dos '()', é muito comum vermos fora do '()'. A função lambda que passei pega através do argumento 'aux' o valor da variável 'nome' e irá retornar o valor de 'nome' em maiusculo, pois usei o método toUpperCase.

    Exemplo:
    val nome = "Rodrigo"
    val nomeEmMaisculo = nome.let ({ aux ->
        aux.toUpperCase()
    })

    Exemplo 2 - Nesse segundo exemplo tivemos o mesmo resultado, apenas fiz para mostrar que podemos retirar dos '()' a função enviada como parâmetro e que não precisamos declarar o parâmetro na função lambda, quando for só um podemos o chamar direto com operador 'it':
    val nome = "Rodrigo"
    val nomeEmMaisculo = nome.let {
        it.toUpperCase()
    }

    Nas funções de escopo e nas funções Lambda sempre que abrimos o bloco '{}' estamos abrindo um escopo temporário, e sempre vamos passar para esse escopo os parâmetros, que serão chamados de Objeto de Contexto.
    Temos duas formas de passar os Objetos de Contexto ao escopo temporario:

    1)Através do Argumento Lambda (poderemos acessá-lo com a palavra 'it');
    A assinatura desse tipo de função é:
    block: (T) -> R, ou seja, a função que aqui chamamos de block terá um argumento/parametro que foi chamnado de T

    2)Através de um receiver ou receptor em portugues (nesse caso o próprio objeto que chamou a função é enviado para o escopo e por isso podemos acessá-lo com a palavra 'this' )
    A assinatura desse tipo de função é:
    block: T.() -> R, ou seja,  a função que aqui chamamos de block não recebe nenhum argumento/parametro, veja que os '()' estão vazios, mas veja que quem vai chamar a função é o Objeto que nesse caso foi chamado de T.


    Nas funções de escopo é comum utilizarmos diversas chamadas, por exemplo: .let{}.let{}.let{} e assim por diante, é comum até usarmos funções diferentes! E quando isso ocorre estamos sempre pegando o resultado da função anterior e reutilizando, ou seja, a operação vai pegar sempre
    o retorno anterior para fazer sua operação, por isso é importante sabermos que nessas funções há dois tipos de retorno:

   1)Retorno do tipo Objeto de Contexto
   Nesse tipo o retorno do bloco é sempre o objeto que chamou a função de escopo. Não importa as operações realizadas. No exemplo dado lá em cima, com a String 'nome' chamando let o retorno sempre seria uma String, mesmo se usássemos uma função para mudar seu tipo para int o retorno é String
   A assinatura desse tipo de função é (aqui peguei a assinatura completa da função de escopo mais assinatura do seus parâmetros): T.apply(block: T.() -> Unit): T, veja que na função de parâmetro o retorno é Unit, mas que na função apply o retorno é T e quem chamou a função também foi T!
   note que nesse exemplo apply é recebe parâmetro através do receiver e seu retorno é do tipo objeto de contexto! Isso não é regra, tem de todos os tipos,ou seja, o jeito que uma função recebe o parâmetro não define o seu tipo de retorno!

   2)Retorno do tipo Resultado da Função Lambda
   Nesse tipo o retorno do bloco é sempre definido pela a operação realizada. No exemplo dado lá em cima, com a String 'nome' chamando let o retorno poderia ser um Inteiro, caso usasemos o método toInt(), pois esse trasforma se possivel uma String em Int.
   A assinatura desse tipo de função é: block: (T) -> R, veja que estamos recebendo um tipo T e retornando R, logo podem ser diferentes! Veja a assinatura completa desse exemplo: T.let(block: (T) -> R): R, veja que a função de parâmetro vai receber T e devolver R e que a função let que é a
   função de escopo também vai devolver R, e R é o resultado da operação feita no bloco! Ou seja, o que for feito lá vai interferir no resultado!

   LEMBRE-SE: o jeito que uma função recebe o parâmetro não define o seu tipo de retorno!

 */

fun main() {

    //Exemplo de uso de uma Função de Escopo!
    var nome = "Rodrigo Franco de Lima"
    val nomeModificado = nome.let {
        val nomeMaiusculo = it.toUpperCase()
        nomeMaiusculo.split(" ")
    }
    print(nomeModificado)

}