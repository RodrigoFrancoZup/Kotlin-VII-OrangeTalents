package br.com.alura.bytebank.teste


fun main() {

    //Criamos a váriavel com nome minhaFuncao
    //Após o ":" colocamos o seu tipo, não é obrigatório. O tipo colocado indica que é FUNÇÃO
    //O  tipo FUNCAO é escrito com "()" que é onde passamos os parâmetros, e apoós o "->" vem o tipo do retorno da função.
    //Unit é o tipo padrão de retorno do Kotlin, poderia ser nesse caso um String, Double, etc...
    //No Kotlin temos que inicializar toda variável. O valor de um tipo FUNCAO tem que ser a referencia de uma função com a mesma assinatura
    //Após o "=" eu vou inicializar a variável. O valor usado será a referencia da função teste
    //A referencia da variável que vou usar para inicializar tem que ter a mesma assinatura do tipo de minha variável,
    //note que a variável é do tipo função sem atributo e com retorno Unit, a função teste é a mesma coisa.
    //Após o "=" vamos atribuir o valor, e o mesmo vem com "::" pois indica que queremos apenas a referencia,
    //sem os "::" indicaria que queriamos o retorno da execução da função teste, e até por isso não colocamos "()" após o nome teste
    val minhaFuncao: () -> Unit = ::teste

    //Executando a função através da variável:
    minhaFuncao()

    //Podemos criar uma variável de função, cuja a implementação será através de classe/Objeto.
    //Teremos que criar a classe Teste, e a variável será inicializada com o nome da classe com "()", pois agora queremos a referencia de uma classe!
    //A classe terá que implementar um método do mesmo tipo (assinatura) que a variável minhaFuncaoClass
    val minhaFuncaoClass:() -> Unit = Teste()

    //Executando a função através da variável implementada via classe
    minhaFuncaoClass()
    
}

//A referencia dessa função será usada para inicializar uma variavel de função
//Quando executar a variável será a funçao desta aqui que executará!
fun teste(){
    println("Rodou a função teste!")
}

//Essa classe que implementa uma funçao será usada para inicializar uma variavel de função
//Quando executar a variável será a funçao invoke desta classe que executará!
class Teste : () -> Unit{
    override fun invoke() {
        println("Executando a classe Teste e seu método invoke!")
    }
}

