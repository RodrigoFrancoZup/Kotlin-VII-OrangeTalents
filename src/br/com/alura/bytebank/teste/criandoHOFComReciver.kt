package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.SistemaInterno


fun main() {

    //Criar nosso primeiro código utilizando o RECIVER!

    //Usando a função somaReciver;
    //Um dos parametros da função que vamos usar exige uma outra função como parâmetro
    // a função que vamos passar como parâmetro terá o retorno do tipo Objeto de Contexto
    somaReciver(1, 5, {
        println(this)
    })

    //Criando um objeto do tipo Autenticavel!
    val autenticavel = object : Autenticavel{
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    //Essa função agora receberá via parâmetro uma outra função
    //  e o objeto de contexto da função passada por parametro será RECIVER
    val sistema = SistemaInterno()
    sistema.entraReciver(autenticavel, 1234, {
        this.pagamento("Paguei!")
    })

}

//Essa função agora receberá via parâmetro uma outra função
//  e o objeto de contexto da função passada por parametro será RECIVER
fun somaReciver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("Iniciando conta reciver")
    //Poderia continuar usando: resultado(a+b)
    val total = a + b
    total.resultado()
    println("Finalizando conta reciver")
}


