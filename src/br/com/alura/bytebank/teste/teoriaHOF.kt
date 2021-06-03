package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco


fun main() {

    /*
    Nos capitulos anteriores aprendemos a criar uma variavel de função, ou seja, o tipo da variavel era uma função e
    representamos isso através do: " () -> Unit" onde passamos os parâmetros entre os "()" e
    o tipo de retorno vem depois do " -> ";

    Tendo conhecimento que existe o tipo função, agora vamos aprender que um parâmetro ou o retorno de uma função
    pode ser do tipo função e quando isso ocorre
    (função que recebe outra função, ou então, funçao que retorna outra função) estamos fazendo uso do HOF - Higher Order Function.
    Chegamos usar isso antes mesmo de conhecer, que é o caso da função LET

    Outra coisa que tem que ficar claro, a função a ser passada por parâmetro  para outra função pode ser implementada por classe,
    por lambda, por função anonima ou então ser a variavel de função!

     */

    //O let não pode ser chamado do nada, precisamos de um objeto e através do objeto chamamos let
    //Isso ocorre porque a assinatura desse método usa a tecnica de função extensão "Objeto.Funcao" e
    // nesse caso é uma extensão de Objeto de qualquer tipo (Generic)
    //Na assinatura do LET foi usado generic e não o tipo any, sabe o motivo? Com generic podemos garantir que
    // o mesmo tipo que chamou será o tipo enviado para dentro do bloco de implementação sem CAST, com any poderia ser qualquer tipo!


   /* Exemplo de chamadas do let - note que para dento do bloco vai o it:
      E o it é sempre do mesmo tipo do objeto que chamou! Graças o uso do generic que foi explicado anteriormente.

    "".let { it  }
    1.let { it }
    Endereco().let { it }

    */

    /*
    Entao agora sabemos que o LET é uma função que recebe outra função como parâmetro.
    Só que a função passada como parâmetro obrigatóriamente tem que ter um parâmetro do mesmo tipo do objeto que está chamando o let
    Vou exemplificar no código a seguir
     */

    //Através de um objeto String vou chamar o let
    //Sabeos que  let exige um parametro do tipo funçao
    //Se quem ta chamando o let é String o parâmetro da função a ser passada como parametro do let, também deve ser de string
    //Vai ficar assim:

    //Vou criar uma função que recebe como parametro uma string
    fun funcaoQueRecebeString(string: String){

    }

    //Agora vou chamar o let de modo alternativo:
    "".let(::funcaoQueRecebeString)

    //Mas o mais comum/usual seria chamar assim:
    //Quando o parametro de uma função é outra função não somos obrigados a usar '()'
    //Se tivesse mais parametros teriamos que passar dentro do '()'
    //E se tivesse mai parametros, mas na assinatura o tipo função fosse o ultimo poderiamos passar: '(){}'
    "".let {  }

}

