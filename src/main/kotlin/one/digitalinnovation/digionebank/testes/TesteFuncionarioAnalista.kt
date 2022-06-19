package src.main.kotlin.one.digitalinnovation.digionebank.testes

import src.main.kotlin.one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista(nome = "Joao de Deus", cpf = "123456789", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}