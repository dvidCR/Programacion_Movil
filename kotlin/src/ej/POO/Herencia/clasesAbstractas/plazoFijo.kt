package ej.POO.Herencia.clasesAbstractas

class plazoFijo(titular: String, monto: Double, val plazo: Int, val interes: Double): Cuenta(titular, monto) {

    override fun imprimir() {
        super.imprimir()
        println("Cuenta de plazo fijo")
        println("Plazo en dias: $plazo")
        println("Intereses: $interes")
        val ganancia =  monto * interes / 100
        println("Importe del interes: $ganancia")
    }
}