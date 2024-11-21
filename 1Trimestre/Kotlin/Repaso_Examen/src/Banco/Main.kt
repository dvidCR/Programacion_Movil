package Banco

fun main() {
    val ahorro = cajaAhorro("pacoAhorro", 100000.0)
    val plazos = plazoFijo("pacoAPlazos", 100000.0)

    ahorro.depositar(100.0)
    ahorro.retirar(5.0)

    println(plazos.titular + ": " + plazos.monto)

    plazos.depositar(800.0)
    plazos.retirar(9999999.0)

    println(plazos.titular + ": " + plazos.monto)
}