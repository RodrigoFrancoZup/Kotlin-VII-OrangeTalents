package br.com.alura.bytebank.teste


fun main() {

    /*
     Doc oficial: https://kotlinlang.org/docs/scope-functions.html#function-selection
    - Scope Functions -

    As funções de escopo já estão na biblioteca padrão do Kotlin, só temos que entendê-las e usá-las. São elas: let, run, with, apply, also;

    Quando chamamos uma função lambda ou as funções de escopo nós ganhamos um escopo temporário para fazer alguma coisa (é o que fica dentro do '{}'), e precisamos mandar para esse escopo um objeto de contexto. As diferenças das funções mencionadas anteriormente são: o que vamos ter de objeto de contexto acessível (pode ser o 'this' ou 'it') e o retorno da função;

    Primeiro vamos abordar a diferença: o que vamos ter de objeto de contexto acessível (pode ser o 'this' ou 'it') :
	Quando falamos de 'it', estamos falando de um objeto de contexto que vai ser acessível como um argumento do lambda.
	Quando falamos do 'this', estamos falando que esse é um receptor ou receiver do lambda.
	Na prática, qual é a diferença? Que quando estamos usando um receiver a palavra 'this' pode ser omitida, já com argumento do lambda temos que usar o 'it' ou um apelido.
	No receiver o objeto que chama a função é jogado para dentro do escopo de função! Ja no argumento de lambda esse objeto é passado via argumento!
	Funções do tipo receiver: run, with, apply.
	Funções do tipo argumento do lambda: let, also.
	Quando queremos chamar as properties/membros de um objeto é recomendável usarmos as funções receiver

     */

    // O escopo temporário foi o trecho que que usei o toUpperCase(), ou seja, tudo que fica dentro '{}'
    // Usei o let, logo há argumento do lambda! Por isso sou obrigado a usar o 'it', ou o apelido. Usei o apelido aux.
    // Esse escopo temporário há um retorno, é sempre ultima linha do escopo temporário!
    // Ao chamar let{}.let{}. o argumento de um let é sempre o retorno do anteior! Nesse caso ficou, String, String, Int
    //Usamos o let pra printar, pois o metodo println não é do Objeto String 'nome',
    // se fosse faria sentido usar alguna função do tipo receiver!
    var nome = "Rodrigo Franco"

    nome.let { aux ->
        nome = aux.toUpperCase()
        aux.toUpperCase()
    }.let { aux ->
        aux.length
    }.let { tamanho ->
        println(tamanho)
    }

    println(nome)

    //Exemplo de um Receiver
    //Note que no escopo temporário eu chamei o método toUpperCase sem usar nada!
    //Poderia usar o this, ou não usar nada,
    // pois em funções do tipo receiver vamos manipular sempre uma propertie ou membro do objeto que chamou a função!
    //Note que se eu chamar run{}.run{}.run{} o objeto pode mudar, dependnedo de qual função eu chamar,
    // pois estamos chamando um novo run atraves do retorno do run anterior!
    var carro = "Golf 2.0"
    carro.run {
        carro = toUpperCase()
        toUpperCase()
    }
    println(carro)

    /*
    É importante entender que podemos usar tanto uma função do tipo Receiver ou do tipo parâmetro de Lambda
    para resolver o problema! É mais conceitual quando devemos usar um ou outro! O receiver é sempre que vamos
    manipular apenas properties ou membros do objeto que chamou a função. Já a outra é quando queremos manipular
    propeties e membros da função
     */
}

