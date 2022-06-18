package src.main.kotlin.one.digitalinnovation.digionebank.testes

import src.main.kotlin.one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main(){
    val joao = Funcionario(nome = "João de Deus", cpf = "123456789", salario = BigDecimal(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}