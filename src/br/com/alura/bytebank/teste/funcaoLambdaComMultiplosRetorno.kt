package br.com.alura.bytebank


fun main() {

    //Para entender melhor, talvez seja legal você ler primeiro os coments da classe variaveisDeFuncao e variaveilDeFuncaoComParametro
    //A grande diferença é que utilizando lambda ou função anonima a função a ser executada fica vinculada somente a uma "variável", nao poderemos atribuí-la em outra "variavel"


    //Vamos criar agora uma "variável de função" através do Lambda!
    //A função Lambda agora poderá ter mais de uma linha de retorno!
    //Vamos criar uma função lambda que calcula bonificacao de acordo com o salario passado!
    //Quando a função recebe apenas um parâmetro o Kotlin já dá o apelido IT para ele, logo não precisamos dar um apelido
    //Aqui vamos aplicar uma boa pratica, apelidos que ajudam o  programador,
    // pois quem chamar essa função vai passar um parametro Double, mas ele representa o que? Nesse caso salario
    //Agora quem chamar a função terá a dica que tem que enviar salario
    //Aqui não podemos usar o retur, pois esse nós leva para a função superior (função que chamou essa, nesse caso o main)
    //Para termos mais de uma opção de retorno temos que dar um label para retorno, vou chamar de label nesse exemplo 'label@'
/*
    val calculaBonificacao: (salario: Double) -> Double = label@{
        if(it > 1000.0){
            return@label it + 100
        }
        return@label it+200
    }

    println(calculaBonificacao(100.0))
*/
    //Código igual o anterior
    //Aqui só paramos de usar o It e demos o apelido salario para a implementação da lambda
    // pois veremos que uma função pode chamar outra e podemos ter vários it's e gerar confusao
    val calculaBonificacao: (salario: Double) -> Double = label@{ salario ->
        if(salario > 1000.0){
            return@label salario + 100
        }
        return@label salario+200
    }

    println(calculaBonificacao(100.0))

    //Executando a mesma coisa com função anonima:
    val calculaBonificacaoAnonima: (Double) -> Double = fun(salario) : Double{
        if(salario > 1000.0){
            return salario + 100
        }else{
            return salario + 200
        }
    }

    val resultado = calculaBonificacaoAnonima(1000.0)
    println(resultado)

}

