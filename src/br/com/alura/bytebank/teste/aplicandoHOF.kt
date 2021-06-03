package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco


fun main() {

    //Aplicando o HOF

    //Quero deixar o Logradouro de um endereço em maiusculo, sem o HOF ficaria:
    val endereco = Endereco(logradouro = "Rua Mariana", numero = 3185)
    val enderecoMaiusculo = endereco.logradouro.toUpperCase()
    println(enderecoMaiusculo)

    //Com HOF quero deixar o Logradouro de um endereço em maiusculo:
    //O retorno do LET é generico, vamos retorar uma string com texto em maiusculo
    val enderecoMaiusculoString = Endereco(logradouro = "Rua Miguel", numero = 1)
        .let {
        it.logradouro.toUpperCase()
    }
    println(enderecoMaiusculoString)

    //O instrutor recomenda usarmos apelidos para os parâmetros, então o mesmo condigo anterior vai ficar:
    val enderecoMaiusculoString2 = Endereco(logradouro = "Rua Miguel", numero = 1)
        .let { endereco ->
            endereco.logradouro.toUpperCase()
        }
    println(enderecoMaiusculoString2)


    //Como o retorno é generic, podemos fazer qualquer tipo de retorno e podemos ir chamando outros let
    Endereco(logradouro = "Rua São João", numero = 753)
        .let { endereco ->
            endereco.logradouro.toUpperCase()
    }.let { endereco->
        println(endereco)
    }

    //O exemplo anterior, (let com println) pode ser ainda mais simplificado:
    Endereco(logradouro = "Rua São João", numero = 753)
        .let { endereco ->
            endereco.logradouro.toUpperCase()
        }.let (::println)


    //Outro exemplo de uso do HOF é com as funções FILTER, elas precisam receber uma função como parâmetro
    //Vamos Criar uma lista de endereços e depois
    //Aplicar um filtro, vamos pegar apenas enderecos com complemento (temos 2),
    //Por fim pegar a nova lista com o filtro aplicado
    val enderecoComComplemento = listOf(Endereco(complemento = "Casa"), Endereco(complemento = "Trabalho"), Endereco())
        .filter {
        endereco ->  endereco.complemento.isNotEmpty()
    }
    println(enderecoComComplemento)

}

