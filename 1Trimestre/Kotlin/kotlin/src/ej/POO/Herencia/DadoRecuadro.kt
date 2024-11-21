package ej.POO.Herencia

class DadoRecuadro: Dado() {

    override fun imprimir() {
        super.imprimir()
        println("***")
        println("*$valor*")
        println("***")
    }
}