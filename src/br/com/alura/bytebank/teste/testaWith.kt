package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    //Testando o With:
    with(Endereco()){
        logradouro = "rua vergueiro"
        numero = 3185
        bairro =  "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "82318-863"
        complemento = "Apartamento"
        completo()
    }.let { enderecoCompleto ->
        println(enderecoCompleto)
    }

}