package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco


fun main() {

    /*
    Doc oficial: https://kotlinlang.org/docs/scope-functions.html#function-selection
    - Scope Functions - Retorno! -

    Toda função de escopo terá um retorno.
    Há dois tipos de retorno: 1) resultado da função lambda 2) o objeto de contexto.
    Qual função terá o tipo de retorno?
    As funções: apply e also vão retornar o contexto de objeto
    As funções: let, run e with vão retornar o resultado da lambda

     */

    //Exemplificando um retorno do tipo Contexto de Objeto
    //A primeira função de escopo executada foi o  apply, ela é recomendavel quando queremos preencher um objeto "settar"
    //A segunda função foi o let e veja que seu 'it' é do tipo Endereco, mesmo a função anterior tendo usado o metodo toString
    //O retorno de uma função do tipo Contexto de Objeto retorna sempre o objeto que chamou! Não importa o que fazemos!
    val endereco = Endereco(logradouro = "Mariana Jacinta da Silva")
    endereco.apply {
        numero = 30
        bairro = "Esplanada"
        cidade = "Pouso Alegre"
        toString()
    }.let {
        println(it)
    }


    //Exemplificando um retorno do tipo Resultado Lambda
    //A primeira função de escopo executada foi o  run, seu retorno é do tipo resultado lambda,
    // logo o que eu fizer no bloco vai definir o retorno!
    //A segunda função foi o let e veja que seu 'it' é do tipo String, pois na função anterior eu usei o metodo toString
    //O retorno de uma função do tipo Resultado Lambda vai depender do que foi feito no escopo da função!
    val endereco2 = Endereco(logradouro = "Miguel Saponara")
    endereco2.run{
        numero = 80
        bairro = "Centro"
        cidade = "Pouso Alegre"
        toString()
    }.let {
        println(it)
    }
    
}

