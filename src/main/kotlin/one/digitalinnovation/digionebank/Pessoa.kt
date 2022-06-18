package src.main.kotlin.one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Augusto"
    var cpf:String = "106.656.386-12"
        private set

    constructor()

    fun pessoaInfo() = "$nome $cpf"

}

fun main(){
    val augusto = Pessoa()
    println(augusto.pessoaInfo())
}