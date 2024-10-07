package ej.POO.Herencia.clasesAbstractas

class cajaAhorro(titular: String, monto: Double): Cuenta(titular, monto) {

    override fun imprimir() {
        super.imprimir()
        println("Cuenta de caja de ahorro")
    }
}