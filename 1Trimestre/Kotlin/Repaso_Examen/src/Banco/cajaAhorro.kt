package Banco

class cajaAhorro(val titular: String, var monto: Double): Cuenta() {

    override fun depositar(cantidad: Double) {
        if (cantidad > 0) {
            monto += cantidad
            println("Has depositado $cantidad€")
        } else {
            println("No puedes añadir una cantidad igual o inferior a 0")
        }
    }

    override fun retirar(cantidad: Double) {
        if (monto > 0 && monto >= cantidad) {
            monto -= cantidad
        } else {
            println("No tienes saldo suficiente")
        }
    }

}