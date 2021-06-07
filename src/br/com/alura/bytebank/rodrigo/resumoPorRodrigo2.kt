package br.com.alura.bytebank.rodrigo

/*
Agora sabemos que existe o tipo função e que por isso podemos criar uma variável desse tipo,
o que veremos agora, é que em uma função pode receber parâmetros do tipo função e/ou retornar
também um tipo função. Isso se chama HOF - Higher Order Function!
 */

//Criei essa função e o terceiro parâmetro (operacao) é uma função que recebe 2 inteiros e retorna 1 inteiro
fun fazCalculo(a:Int, b:Int, operacao:(Int,Int) -> Int) : Int{
    //A seguir vou executar a função que recebi via parâmetro:
    return operacao(a,b)
}

//A referencia desta função será enviada via parâmetro para a função fazCalculo, note que seus parâmetros e retorno dão match com o tipo de parâmetro função de fazCalculo!
fun subtracao(a:Int, b:Int):Int{
    val resultado = a-b
    return resultado
}

//Aqui começa as execuções para testar!
fun main(){

    //Vou executar a função fazCalculo, só que o último parâmetro dessa função é uma outra função,
    // então eu mandei a referencia de uma função que de match com assinatura da função fazCalculo!
    val resultado = fazCalculo(10,9,::subtracao)
    println(resultado)


    //Outra forma de executar a função fazCalculo! Agora ao inves de mandar uma referencia de função,
    // eu já mandei o código de um função anonima! Note que agora a função anonima faz multiplicação,
    // ou seja, a operação mudou, mas ainda continua recebendo 2 inteiros e retornando Inteiro (isso não pode mudar)
    val resultado2 = fazCalculo(5,5, fun(a,b): Int {
        return a*b
    })
    println(resultado2)

    //Outra forma de executar a função fazCalculo! Agora estou utilizando Lambda! É a mais utilizada,
    // eu já mandei o código de um função, só que agora nem mencionei a palavra fun(), basta abrir: '{}'!
    // Note que agora com a labmda estamos fazendo outra operação, no caso a soma!
    // A operação mudou, mas ainda continua recebendo 2 inteiros e retornando Inteiro (isso não pode mudar)
    // Em lambda antes do operador '->' vem os parâmetros e após vem o retorno!
    // O retorno de Lambda é sempre a última linha do bloco! Se escrevermos return seremos enviado para a função que chamou a lambda, no caso a main()!
    val resultado3 = fazCalculo(7,8, { a,b ->
        a+b
    } )
    println(resultado3)

}

