package Banco

class plazoFijo(val titular: String, var monto: Double): Cuenta() {

    override fun depositar(cantidad: Double) {
        if (cantidad > 0) {
            monto += cantidad
            val interes = intereses(10.0, cantidad)
            val plazo = plazoImposicion(interes)
            println("Has depositados $cantidad€, con un interes del ${10.0}, a devolver en un plazo de $plazo")
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

    fun plazoImposicion(cantidad: Double): String? {
        var dias: String? = null
        when {
            cantidad <= 100 -> dias = "1 mes"
            cantidad > 100 && cantidad <= 400 -> dias = "4 meses"
            cantidad > 400 -> dias = "2 años"
        }

        return dias
    }

    fun intereses(interes: Double, cantidad: Double): Double {
        return (cantidad * interes / 100) + cantidad
    }
}