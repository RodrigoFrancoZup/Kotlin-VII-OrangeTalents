package br.com.alura.bytebank.teste

fun main() {

    //Para entender melhor, talvez seja legal você ler primeiro os coments da classe variaveisDeFuncao
    //A grande diferença é que utilizando lambda ou função anonima a função a ser executada fica vinculada somente a uma "variável", nao poderemos atribuí-la em outra "variavel"
    //Lembrando, que estamos deixando EXPLICITO O TIPO FUNÇÃO ' () -> Unit' apenas para entendimento, podemos omitir esse trecho!

    //Vamos criar agora uma "variável de função" através do Lambda!
    //Criamos a variável minhaFuncaoLambda, sendo do tipo FUNÇÃO
    //Inicializamos a variável com '{}'
    //Note que detro do '{}' não recebemos parâmetros e só podemos retornar UNIT, pois a assinatura do lambda tem que ser igual a da variavel de função
    val minhaFuncaoLambda: () -> Unit = {
        println("Executando variável de função com LAMBDA")
    }

    //Executando a função lambda
    minhaFuncaoLambda()

    //Vamos criar agora uma "variável de função" através de uma FUNÇÃO ANONIMA!
    //Criamos a variável minhaFuncaoAnonima, sendo do tipo FUNÇÃO
    //Inicializamos a variável com 'fun () {}'
    //Note que detro do 'fun()' não recebemos parâmetros e só podemos retornar UNIT no corpo '{},
    // pois a assinatura da função anonima tem que ser igual a da variavel de função
    val minhaFuncaoAnonima: () -> Unit = fun (){
        println("Executando variável de função, com FUNÇÃO ANONIMA")
    }

    //Executando a função anonima
    minhaFuncaoAnonima()

}

