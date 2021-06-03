package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno

fun main() {

    //Criar nosso primeiro código utilizando HOF

    //Aqui vou chamar a função soma, e um do seus parâmetros e outra função!
    soma(1, 5, {
        println(it)
    })

    //Exemplo 2, usando a classe SistemaInterno

    //Criando um objeto que implementa interface autenticavel
    val autenticavel = object : Autenticavel {
        val  senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    //Vou chamar a função entra do objeto SistemaInterno,
    // a função entra pede uma função como parâmetro,
    // e por isso mandei uma função lambda, que é o  '{}' - dei um label de autenticado para ele,
    // lá no metodo entra, só será executado a função que mandei, se a pessoa se autenticar!
    SistemaInterno().entra(autenticavel, 1234, autenticado ={
        println("Realizar pagamento!")
    })

}

//Essa é a declaração da função soma, note que um do seus parametros é uma função
//O código que chamar essa função, ao utilizar o 'it' ou 'apelido para o it' só terá o restulado de fato,
// devido a linha que faz 'resultado(a+b)', pois é essa linha que executa a função!
fun soma(a:Int, b: Int, resultado: (Int) -> Unit){
    println("Iniciando conta")
    resultado(a+b)
    println("Finalizando conta")
}
