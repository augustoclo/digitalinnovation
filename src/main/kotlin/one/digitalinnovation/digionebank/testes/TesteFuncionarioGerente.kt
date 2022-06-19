package src.main.kotlin.one.digitalinnovation.digionebank.testes

import src.main.kotlin.one.digitalinnovation.digionebank.Gerente

fun main(){
    val maria = Gerente(nome = "Maria do Rosario", cpf = "1234567899", salario = 5000.00, senha = "senha123")
    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}