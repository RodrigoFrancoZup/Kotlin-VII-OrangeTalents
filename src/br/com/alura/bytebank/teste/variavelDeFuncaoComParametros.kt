package br.com.alura.bytebank.teste


fun main() {

    //Agora mudamos a assinatura do tipo de função. A função agora tem parâmetros e retorno do tipo Int
    //Colocamos apenas o tipo
    val minhaFuncao: (Int, Int) -> Int = ::soma
    val resultado = minhaFuncao(5, 10)
    println(resultado)

    //Agora a função da classe que vamos ter a referencia passou a ter parâmetros e retorno, logo a assinatura da variável também teve que mudar!
    //Colocamos apenas o tipo
    //Só que não precisamos passar na classe de implementação esses parametros,
    // Devemos pasar os parâmetros, somente na execução, no caso: minhaFuncaoClass()
    val minhaFuncaoClass: (Int, Int) -> Int = Soma()
    val resultadoClasse = minhaFuncaoClass(10,10)
    println(resultadoClasse)

}

//A função agora tem parâmetros e retorno do tipo Int. Logo a variável de função terá que ter essa mesma assinatura
fun soma(a: Int, b: Int): Int {
    return a + b
}

//A função que a classe vai implementar ganhou parâmetros e retorno (colocamos apenas o tipo)
// O metodo invoke também passará a ter esses parâmetros
//Podemos fazer a execução no método invoke dentro de '{}', ou do jeito que já fizemos 'inline'
//Somente quando executam o método invoke é que terão que passar os valores dos parâmetros
class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}

