package src.main.kotlin.one.digitalinnovation.digionebank

import java.math.BigDecimal

class Funcionario(
    nome:String,
    cpf:String,
    val salario:BigDecimal
) : Pessoa(nome, cpf) {
}