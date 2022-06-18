package src.main.kotlin.one.digitalinnovation.digionebank.testes

import src.main.kotlin.one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach {elemento ->
        println("${elemento.name} - ${elemento.Descricao}")
    }

    val PF = ClienteTipo.PF
    println(">> ${PF.name} - ${PF.Descricao}")

    val PJ = ClienteTipo.PJ
    println(">> ${PJ.name} - ${PJ.Descricao}")
}