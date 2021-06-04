package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca


fun main() {

    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12

    //Testando o Run:
    val contaPoupanca = ContaPoupanca(Cliente(nome = "Rodrigo", cpf = "123456789", senha = 1234), numero = 14725)
    contaPoupanca.run {
            deposita(1000.00)
            saldo * taxaMensal
        }.let(::println)

    val rendimentoAnual = run{
        var saldo = contaPoupanca.saldo
        repeat(12){
            saldo += saldo * taxaMensal
        }
        saldo
    }

    println(rendimentoAnual)
}

