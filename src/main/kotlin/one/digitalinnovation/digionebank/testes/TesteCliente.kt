package src.main.kotlin.one.digitalinnovation.digionebank.testes

import src.main.kotlin.one.digitalinnovation.digionebank.Cliente
import src.main.kotlin.one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf= "1234567899",
        clienteTipo = ClienteTipo.PF,
        senha = "senhadojose"
    )
    println(jose)
    TesteAutenticacao().autentica(jose)
}