package br.com.alura.bytebank.modelo

class SistemaInterno {

    //Essa função ganhou o parametro autenticado,
    //Esse parametro é do tipo função. Função que não recebe parâmetros e não retorna nada.
    //Para esse código não quebrar onde ele já foi chamado, vamos deixar um valor padrao, no caso
    // uma expressão lambda que não faz nada '{}'
    //Vamos testar isso na classe criandoPrimeiroHOF
    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
            autenticado()
        } else {
            println("Falha na autenticação")
        }
    }


    fun entraReciver(admin: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
            autenticado(this)
        } else {
            println("Falha na autenticação")
        }
    }

    fun pagamento(mensagem: String){
        println(mensagem)
    }

}